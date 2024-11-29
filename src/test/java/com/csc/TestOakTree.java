package com.csc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestOakTree {
    private OakTree root;
    private Squirrel rocky;
    private Squirrel bullwinkle;
    private Squirrel sandy;

    @BeforeEach
    void setUp() {
        rocky = new Squirrel("Rocky");
        bullwinkle = new Squirrel("Bullwinkle");
        sandy = new Squirrel("Sandy");
        root = new OakTree(rocky);
    }

    @Test
    void testCreateNode() {
        assertNotNull(root);
        assertEquals("Rocky", root.getSquirrel().getName());
    }

    @Test
    void testAttachLeft() {
        OakTree leftNode = new OakTree(bullwinkle);
        root.attachLeft(leftNode);
        
        assertNotNull(root.left());
        assertEquals("Bullwinkle", root.left().getSquirrel().getName());
    }

    @Test
    void testAttachRight() {
        OakTree rightNode = new OakTree(sandy);
        root.attachRight(rightNode);
        
        assertNotNull(root.right());
        assertEquals("Sandy", root.right().getSquirrel().getName());
    }

    @Test
    void testCompleteTree() {
        OakTree leftNode = new OakTree(bullwinkle);
        OakTree rightNode = new OakTree(sandy);
        
        root.attachLeft(leftNode);
        root.attachRight(rightNode);
        
        // Test root
        assertEquals("Rocky", root.getSquirrel().getName());
        
        // Test left subtree
        assertNotNull(root.left());
        assertEquals("Bullwinkle", root.left().getSquirrel().getName());
        
        // Test right subtree
        assertNotNull(root.right());
        assertEquals("Sandy", root.right().getSquirrel().getName());
    }

    @Test
    void testInitiallyNullChildren() {
        assertNull(root.left());
        assertNull(root.right());
    }
}
