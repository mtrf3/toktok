package com.ss.android.ugc.aweme.live.alphaplayer.model;

import android.graphics.Bitmap;

/* loaded from: classes14.dex */
public class MaskSrc {
    public Bitmap bitmap;
    public int height;
    public boolean isBold;
    public String name;
    public String text;
    public String textColor;
    public int textSize;
    public int type;
    public int width;

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public int getHeight() {
        return this.height;
    }

    public String getName() {
        return this.name;
    }

    public String getText() {
        return this.text;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public int getTextSize() {
        return this.textSize;
    }

    public int getType() {
        return this.type;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isBold() {
        return this.isBold;
    }

    public MaskSrc setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
        return this;
    }

    public MaskSrc setBold(boolean z) {
        this.isBold = z;
        return this;
    }

    public MaskSrc setHeight(int i) {
        this.height = i;
        return this;
    }

    public MaskSrc setName(String str) {
        this.name = str;
        return this;
    }

    public MaskSrc setText(String str) {
        this.text = str;
        return this;
    }

    public MaskSrc setTextColor(String str) {
        this.textColor = str;
        return this;
    }

    public MaskSrc setTextSize(int i) {
        this.textSize = i;
        return this;
    }

    public MaskSrc setType(int i) {
        this.type = i;
        return this;
    }

    public MaskSrc setWidth(int i) {
        this.width = i;
        return this;
    }
}
