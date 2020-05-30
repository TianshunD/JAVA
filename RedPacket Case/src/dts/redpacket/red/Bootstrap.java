package dts.redpacket.red;

//普通红包 平均
//手气红包 随机
public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("发红包了！！！");
        red.setOwnerName("Tianshun");

        //普通红包
        //OpenMode normal = new NormalMode();
        //red.setOpenWay(normal); //普通红包

        //手气红包
        OpenMode lucky = new LuckyMode();
        red.setOpenWay(lucky);
    }
}
