package com.facebook.imagepipeline.nativecode;

import X.C32151Nz;
import X.C81713W5d;
import android.graphics.Bitmap;

/* loaded from: classes14.dex */
public class Bitmaps {
    public static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);

    static {
        C81713W5d.LIZ("imagepipeline");
    }

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (bitmap2.getConfig() == bitmap.getConfig()) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        C32151Nz.LJI(bitmap.isMutable());
        if (bitmap.getWidth() == bitmap2.getWidth()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32151Nz.LJI(z2);
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z3 = false;
        }
        C32151Nz.LJI(z3);
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }
}
