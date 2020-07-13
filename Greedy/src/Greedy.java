public class Greedy {
    public static void main(String args[]){
    int answer = 0;
    int lost1 = 0;
    int count = 0;

    // 도난시 당하면 빌려줄 수 없도록
        for(int i=0; i<lost.length; i++) {
        for(int j=0; j<reserve.length; j++) {
            if(lost[i]==reserve[j]) {
                lost1++;
                lost[i] = -1;
                reserve[j] = -1;
                break;
            }
        }
    }

    //학생에게 빌려주지 않게
        for(int i=0; i<lost.length; i++) {
        for(int j=0; j<reserve.length; j++) {
            if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
                count++;
                reserve[j] = -1;
                break;
            }
        }
    }

    answer = n - lost.length + lost1 + count;

        return answer;
    }
}

