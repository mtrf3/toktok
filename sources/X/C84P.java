package X;

import android.graphics.Bitmap;

/* renamed from: X.84P, reason: invalid class name */
/* loaded from: classes4.dex */
public /* synthetic */ class C84P {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        LIZ = iArr;
        try {
            iArr[Bitmap.Config.RGB_565.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[Bitmap.Config.ALPHA_8.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[Bitmap.Config.ARGB_8888.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
