package com.taras.murzenkov.blockchain.sample.model;

import java.util.ArrayList;
import java.util.List;

public class Block {
    private int index;
    private long timeStamp;
    private long proof;
    private String previousBlockHash;
    private List<Transaction> transactions;

    private Block() {
    }

    private Block(int index, long timeStamp, long proof, String previousBlockHash, List<Transaction> transactions) {
        this.index = index;
        this.timeStamp = timeStamp;
        this.proof = proof;
        this.previousBlockHash = previousBlockHash;
        this.transactions = transactions;
    }

    public static class BlockBuilder{
        private int index;
        private long timeStamp;
        private long proof;
        private String previousHash;
        private List<Transaction> transactions = new ArrayList<>();

        public BlockBuilder index(int index){
            this.index = index;
            return this;
        }

        public BlockBuilder timeStamp(long timeStamp){
            this.timeStamp = timeStamp;
            return this;
        }

        public BlockBuilder proof(long proof){
            this.proof = proof;
            return this;
        }

        public BlockBuilder previousHash(String previousHash){
            this.previousHash = previousHash;
            return this;
        }



        public Block build(){
            return new Block(index, timeStamp, proof, previousHash, transactions);
        }
    }
}
