package dts.redpacket.red;

import java.util.ArrayList;
import java.util.Random;

//随机分配
public class LuckyMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> redList = new ArrayList<>();

        //最多不超过剩下金额平均数的2倍
        Random random = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        //最后一个不随机
        for (int i = 0; i < totalCount - 1; i++) {
            int red = 1 + random.nextInt(leftMoney / leftCount * 2);
            leftMoney -= red;
            leftCount--;
            redList.add(red); //包红包
        }
        redList.add(leftMoney); //最后一个红包

        return redList;
    }
}
