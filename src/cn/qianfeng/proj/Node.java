package cn.qianfeng.proj;

public class Node {
    private static final long serialVersionUID = 1L;
    private String name;
    private String createTime;
    //构造方法
    //全参构造
    public Node(String name, String createTime) {
        this.name = name;
        this.createTime = createTime;
    }
    //空参构造
    public Node() {
    }
    //setXXX和getXXX
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    //方法重写

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
