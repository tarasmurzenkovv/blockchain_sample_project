package com.taras.murzenkov.blockchain.sample.service.impl;

import com.taras.murzenkov.blockchain.sample.model.BlockChain;
import com.taras.murzenkov.blockchain.sample.service.BlockChainInitializer;
import org.springframework.stereotype.Service;

@Service
public class BlockChainInitializerImp implements BlockChainInitializer {
    private final BlockChain blockChain;

    public BlockChainInitializerImp() {
        blockChain = new BlockChain();
    }

    public BlockChain initBlockChain() {
        return this.blockChain;
    }
}
