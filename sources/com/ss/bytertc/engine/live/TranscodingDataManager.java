package com.ss.bytertc.engine.live;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class TranscodingDataManager {
    public static Context mContext;

    public static void SetContext(Context context) {
        mContext = context;
    }

    public static byte[] getCompressImageBuf(ByteBuffer byteBuffer, int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        byteBuffer.rewind();
        createBitmap.copyPixelsFromBuffer(byteBuffer);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
