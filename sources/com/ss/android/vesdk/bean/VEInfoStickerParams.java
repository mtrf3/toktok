package com.ss.android.vesdk.bean;

import X.X1D;
import defpackage.b0;

/* loaded from: classes3.dex */
public class VEInfoStickerParams {
    public float alpha;
    public int layer;
    public float positionX;
    public float positionY;
    public float rotate;
    public float scaleX;
    public float scaleY;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEInfoStickerParams{positionX=");
        LIZ.append(this.positionX);
        LIZ.append(", positionY=");
        LIZ.append(this.positionY);
        LIZ.append(", scaleX=");
        LIZ.append(this.scaleX);
        LIZ.append(", scaleY=");
        LIZ.append(this.scaleY);
        LIZ.append(", rotate=");
        LIZ.append(this.rotate);
        LIZ.append(", alpha=");
        LIZ.append(this.alpha);
        LIZ.append(", layer=");
        return b0.LIZJ(LIZ, this.layer, '}', LIZ);
    }

    public float getAlpha() {
        return this.alpha;
    }

    public int getLayer() {
        return this.layer;
    }

    public float getPositionX() {
        return this.positionX;
    }

    public float getPositionY() {
        return this.positionY;
    }

    public float getRotate() {
        return this.rotate;
    }

    public float getScaleX() {
        return this.scaleX;
    }

    public float getScaleY() {
        return this.scaleY;
    }

    public void setAlpha(float f) {
        this.alpha = f;
    }

    public void setLayer(int i) {
        this.layer = i;
    }

    public void setPositionX(float f) {
        this.positionX = f;
    }

    public void setPositionY(float f) {
        this.positionY = f;
    }

    public void setRotate(float f) {
        this.rotate = f;
    }

    public void setScaleX(float f) {
        this.scaleX = f;
    }

    public void setScaleY(float f) {
        this.scaleY = f;
    }

    public VEInfoStickerParams(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        this.positionX = f;
        this.positionY = f2;
        this.scaleX = f3;
        this.scaleY = f4;
        this.rotate = f5;
        this.alpha = f6;
        this.layer = i;
    }
}
