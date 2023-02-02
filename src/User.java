public class User {
    private int rank;
    private int progress;
    public User(){
        rank = -8;
        progress = 0;
    }
    public int getRank(){
        return rank;
    }
    public int getProgress(){
        return progress;
    }
    public void incProgress(int rankOfActivity){
        if(rankOfActivity == 0 || rankOfActivity < -8 || rankOfActivity > 8){
            throw new IllegalArgumentException("The rank of an activity cannot be less than 8, 0, or greater than 8!");
        }
        if(rank > rankOfActivity){
            progress ++;
        }
        else if(rankOfActivity == rank) {
            progress += 3;
        }
        else{
            int difference = rankOfActivity - rank;
            if(rankOfActivity > 0 && rank < 0){
                difference--;
            }
            progress += 10 * difference * difference;
        }
        addProgress();
    }
    public void addProgress(){
        while (progress >= 100){
            if(rank == -1){
                rank = 1;
            }
            else{
                rank++;
            }
            progress -= 100;
        }
    }
    public String toString(){
        return "User{" + "rank=" + -8 + ", progress=" + 0 + '}';
    }
}




