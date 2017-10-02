package com.taras.murzenkov.blockchain.sample.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 */
public class BlockChain {
    private List<Block> blocks;

    public BlockChain() {
        this.blocks = new ArrayList<Block>();
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void addBlock(Block block) {
        this.blocks.add(block);
    }
}
