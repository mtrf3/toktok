package com.lynx.fresco;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* loaded from: classes6.dex */
public class FrescoBlur {
    public void blur(Bitmap bitmap, int i) {
        NativeBlurFilter.iterativeBoxBlur(bitmap, 3, i);
    }
}
