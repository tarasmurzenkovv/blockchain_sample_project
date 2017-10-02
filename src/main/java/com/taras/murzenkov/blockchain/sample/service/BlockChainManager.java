package com.taras.murzenkov.blockchain.sample.service;

import com.taras.murzenkov.blockchain.sample.model.Block;

public interface BlockChainManager {
    void addNewTransaction(Block block);

    void addNewBlock(Block block);
}
