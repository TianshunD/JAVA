package dts.redpacket.red;

import java.util.ArrayList;

public class NormalMode implements OpenMode{
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> redList = new ArrayList<>();
        //10元金额为1000分
        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;
        for (int i = 0; i < totalCount - 1; i++) {
            redList.add(avg);
        }
        redList.add(avg + mod);
        return redList;
    }
}
