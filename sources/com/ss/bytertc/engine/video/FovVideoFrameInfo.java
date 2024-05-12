package com.ss.bytertc.engine.video;

import java.util.HashMap;

/* loaded from: classes33.dex */
public class FovVideoFrameInfo {
    public int destColumn;
    public int destRow;
    public int hdColumn;
    public int hdHeight;
    public int hdRow;
    public int hdWidth;
    public int ldColumn;
    public int ldHeight;
    public int ldRow;
    public int ldWidth;
    public int tileHeight;
    public HashMap<Short, Short> tileMap = new HashMap<>();
    public int tileWidth;

    public static FovVideoFrameInfo genFovVideoFrameInfo() {
        return new FovVideoFrameInfo();
    }

    public int getDestColumn() {
        return this.destColumn;
    }

    public int getDestRow() {
        return this.destRow;
    }

    public int getHdColumn() {
        return this.hdColumn;
    }

    public int getHdHeight() {
        return this.hdHeight;
    }

    public int getHdRow() {
        return this.hdRow;
    }

    public int getHdWidth() {
        return this.hdWidth;
    }

    public int getLdColumn() {
        return this.ldColumn;
    }

    public int getLdHeight() {
        return this.ldHeight;
    }

    public int getLdRow() {
        return this.ldRow;
    }

    public int getLdWidth() {
        return this.ldWidth;
    }

    public int getTileHeight() {
        return this.tileHeight;
    }

    public HashMap<Short, Short> getTileMap() {
        return this.tileMap;
    }

    public int getTileWidth() {
        return this.tileWidth;
    }

    private void setDestColumn(int i) {
        this.destColumn = i;
    }

    private void setDestRow(int i) {
        this.destRow = i;
    }

    private void setHdColumn(int i) {
        this.hdColumn = i;
    }

    private void setHdHeight(int i) {
        this.hdHeight = i;
    }

    private void setHdRow(int i) {
        this.hdRow = i;
    }

    private void setHdWidth(int i) {
        this.hdWidth = i;
    }

    private void setLdColumn(int i) {
        this.ldColumn = i;
    }

    private void setLdHeight(int i) {
        this.ldHeight = i;
    }

    private void setLdRow(int i) {
        this.ldRow = i;
    }

    private void setLdWidth(int i) {
        this.ldWidth = i;
    }

    private void setTileHeight(int i) {
        this.tileHeight = i;
    }

    private void setTileWidth(int i) {
        this.tileWidth = i;
    }

    private void putTileMapValue(short s, short s2) {
        this.tileMap.put(Short.valueOf(s), Short.valueOf(s2));
    }
}
