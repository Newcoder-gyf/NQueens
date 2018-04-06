class buildBoard{
    public void initialBoard(int []list){
        for (int i = 0; i < list.length; i++){
            list[i] = i;
        }
    }
    // 随机打乱数组
    public void randomizeArray(int [] list){
        int arrSize = list.length;
        int ranIndex;
        for(int i = 0; i < arrSize; i++){
            ranIndex = (int)(Math.random() * arrSize);
            if(ranIndex != i){
                int temp = list[i];
                list[i] = list[ranIndex];
                list[ranIndex] = temp;
            }
            System.out.print(" | " + list[i]);
        }
        System.out.println(" | ");
    }
}

public class NQueen {
    public static void main(String []args){
        System.out.println("This is a new Nqueen");

        int arrSize = 8;
        int [] list = new int [arrSize];
        buildBoard br = new buildBoard();
        br.initialBoard(list);
        br.randomizeArray(list);
    }
}
