package com.hualala.al.tree.com.hualala.test.al;

import com.hualala.al.tree.MyTree;

public class InitTree {

    public static MyTree initTree() {
        MyTree myTree = new MyTree();
        myTree.setData(20);

        MyTree tmp = new MyTree();
        tmp.setData(10);
        myTree.setLeft(tmp);

        MyTree tmp2 = new MyTree();
        tmp2.setData(5);
        tmp.setLeft(tmp2);

        tmp2 = new MyTree();
        tmp2.setData(15);
        tmp.setRight(tmp2);


        tmp = new MyTree();
        tmp.setData(30);
        myTree.setRight(tmp);

        tmp2 = new MyTree();
        tmp2.setData(25);
        tmp.setLeft(tmp2);

        tmp2 = new MyTree();
        tmp2.setData(35);
        tmp.setRight(tmp2);

        return myTree;
    }

    public static void preTravRecu(MyTree root){
        if(root!=null){
            System.out.println(root.getData());
            preTravRecu(root.getLeft());
            preTravRecu(root.getRight());
        }
    }

    public static void midTravRecu(MyTree root){
        if(root!=null){
            midTravRecu(root.getLeft());
            System.out.println(root.getData());
            midTravRecu(root.getRight());
        }
    }

    public static void postTravRecu(MyTree root){
        if(root!=null){
            postTravRecu(root.getLeft());
            System.out.println(root.getData());
            postTravRecu(root.getRight());
        }
    }
}
