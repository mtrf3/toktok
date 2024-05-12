package X;

import android.text.Layout;

/* loaded from: classes15.dex */
public /* synthetic */ class VRU {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        LIZ = iArr;
        try {
            iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
