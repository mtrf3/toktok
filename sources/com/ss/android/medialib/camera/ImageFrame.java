package com.ss.android.medialib.camera;

import X.P6X;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class ImageFrame {
    public Bitmap bitmap;
    public ByteBuffer byteBuffer;
    public int format;
    public int height;
    public byte[] mBuf;
    public P6X mPlane;
    public int rotate;
    public int width;

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public byte[] getBuf() {
        return this.mBuf;
    }

    public int getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    public P6X getPlane() {
        return this.mPlane;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBuf(byte[] bArr) {
        this.mBuf = bArr;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public ImageFrame(Bitmap bitmap, int i) {
        this.bitmap = bitmap;
        this.format = i;
    }

    public ImageFrame(P6X p6x, int i, int i2, int i3) {
        this.mPlane = p6x;
        this.format = i;
        this.width = i2;
        this.height = i3;
    }

    public ImageFrame(byte[] bArr, int i, int i2, int i3) {
        this.mBuf = bArr;
        this.format = i;
        this.width = i2;
        this.height = i3;
    }

    public ImageFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        this.byteBuffer = byteBuffer;
        this.width = i;
        this.height = i2;
        this.format = i3;
        this.rotate = i4;
    }

    public static ImageFrame create(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return new ImageFrame(byteBuffer, i, i2, i3, i4);
    }
}
