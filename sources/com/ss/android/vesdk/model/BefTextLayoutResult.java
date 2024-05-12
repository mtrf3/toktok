package com.ss.android.vesdk.model;

import X.C84127Wzz;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* loaded from: classes13.dex */
public class BefTextLayoutResult {
    public Bitmap bitmap;
    public int height;
    public int lineCount;
    public int width;

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public int getWidth() {
        return this.width;
    }

    public static BefTextLayoutResult readFromByteArray(byte[][] bArr) {
        Bitmap bitmap;
        byte[] bArr2 = bArr[0];
        C84127Wzz c84127Wzz = new C84127Wzz(bArr2);
        BefTextLayoutResult befTextLayoutResult = new BefTextLayoutResult();
        if (bArr2.length != 0) {
            bitmap = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
        } else {
            bitmap = null;
        }
        befTextLayoutResult.setBitmap(bitmap);
        befTextLayoutResult.setWidth(c84127Wzz.LIZJ());
        befTextLayoutResult.setHeight(c84127Wzz.LIZJ());
        befTextLayoutResult.setLineCount(c84127Wzz.LIZJ());
        return befTextLayoutResult;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLineCount(int i) {
        this.lineCount = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
