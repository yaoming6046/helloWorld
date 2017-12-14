package com.hualala.test.al;

import com.hualala.al.tree.MyTree;
import com.hualala.al.tree.com.hualala.test.al.InitTree;
import org.junit.Test;

public class TestTree {

    @Test
    public void test(){
        MyTree myTree=InitTree.initTree();
        InitTree.postTravRecu(myTree);
    }

}
