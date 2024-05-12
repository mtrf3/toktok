package com.lynx.canvas;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class Callback {
    private native void nativeOnFailed(long j, String str);

    private native void nativeOnSuccess(long j, Bitmap bitmap);
}
