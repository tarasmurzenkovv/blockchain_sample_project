package com.taras.murzenkov.blockchain.sample.service.impl;

import com.taras.murzenkov.blockchain.sample.model.Block;
import com.taras.murzenkov.blockchain.sample.service.BlockChainInitializer;
import com.taras.murzenkov.blockchain.sample.service.BlockChainManager;
import org.springframework.stereotype.Service;

@Service
public class BlockChainManagerImp implements BlockChainManager {
    private final BlockChainInitializer blockChainInitializer;

    public BlockChainManagerImp(BlockChainInitializer blockChainInitializer) {
        this.blockChainInitializer = blockChainInitializer;
    }

    public void addNewTransaction(Block block) {

    }

    public void addNewBlock(Block block) {
        this.blockChainInitializer.initBlockChain().addBlock(block);
    }
}
