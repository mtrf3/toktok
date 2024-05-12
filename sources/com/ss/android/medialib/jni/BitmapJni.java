package com.ss.android.medialib.jni;

import android.graphics.Bitmap;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;

/* loaded from: classes7.dex */
public class BitmapJni {
    public static native int nativeCompressBitmap(Bitmap bitmap, String str, int i);

    static {
        TENativeLibsLoader.loadRecorder();
    }

    public static int compressBitmap(Bitmap bitmap, String str, int i) {
        return nativeCompressBitmap(bitmap, str, i);
    }
}
