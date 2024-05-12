package com.facebook.imagepipeline.nativecode;

import X.C81713W5d;
import android.graphics.Bitmap;

/* loaded from: classes14.dex */
public class NativeRoundingFilter {
    public static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    public static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    static {
        C81713W5d.LIZ("native-filters");
    }

    public static void toCircle(Bitmap bitmap) {
        toCircle(bitmap, false);
    }

    public static void toCircle(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        nativeToCircleFilter(bitmap, z);
    }

    public static void toCircleWithBorder(Bitmap bitmap, int i, int i2, boolean z) {
        bitmap.getClass();
        nativeToCircleWithBorderFilter(bitmap, i, i2, z);
    }
}
