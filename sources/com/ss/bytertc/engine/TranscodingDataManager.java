package com.ss.bytertc.engine;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class TranscodingDataManager {
    public static Context mContext;

    public static native void nativeEndProcessRoomRegionTranscodingData(String str);

    public static native void nativeProcessRoomRegionTranscodingData(int i, String str, String str2, byte[] bArr, int i2, int i3);

    public static native void nativeStartProcessRoomRegionTranscodingData(String str);

    public static void SetContext(Context context) {
        mContext = context;
    }

    public static byte[] getCompressImageBuf(ByteBuffer byteBuffer, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
