package com.facebook.imagepipeline.nativecode;

import X.C32151Nz;
import X.C81713W5d;
import android.graphics.Bitmap;

/* loaded from: classes14.dex */
public class NativeBlurFilter {
    public static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    static {
        C81713W5d.LIZ("native-filters");
    }

    public static void iterativeBoxBlur(Bitmap bitmap, int i, int i2) {
        boolean z;
        bitmap.getClass();
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        if (i2 <= 0) {
            z2 = false;
        }
        C32151Nz.LJI(z2);
        nativeIterativeBoxBlur(bitmap, i, i2);
    }
}
