package X;

import android.os.Build;

/* renamed from: X.HPe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44014HPe {
    public static void LIZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("mobile_model", Build.MODEL);
        c188727au.LJIIIZ("mobile_brand", Build.BRAND);
        c188727au.LJIIIZ("android_version", Build.VERSION.RELEASE);
        FMX.LJIIL(str, c188727au.LIZ);
    }
}
