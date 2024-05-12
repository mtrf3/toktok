package com.bytedance.fresco.nativeheif;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public class HeifData {
    public final byte[] data;
    public final int height;
    public final int width;

    public Bitmap newBitmap(Bitmap.Config config) {
        int i;
        int i2;
        byte[] bArr = this.data;
        if (bArr == null || bArr.length <= 0 || (i = this.width) <= 0 || (i2 = this.height) <= 0) {
            return null;
        }
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(this.data));
        return createBitmap;
    }

    public HeifData(byte[] bArr, int i, int i2) {
        this.data = bArr;
        this.width = i;
        this.height = i2;
    }
}
