package trees.balanced;

public class Node {

    private Object value;
    private Node left;
    private Node right;

    public Node(Object value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }

    public Node getLeft(){
        return this.left;
    }

    public void setLeft(Node left){
        this.left = left;
    }


    public Node getRight(){
        return this.right;
    }

    public void setRight(Node right){
        this.right = right;
    }

}
