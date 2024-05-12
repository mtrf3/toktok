package X;

import com.ss.android.vesdk.ROTATE_DEGREE;

/* renamed from: X.HdX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public /* synthetic */ class C44515HdX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ROTATE_DEGREE.values().length];
        try {
            iArr[ROTATE_DEGREE.ROTATE_90.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ROTATE_DEGREE.ROTATE_180.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ROTATE_DEGREE.ROTATE_270.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
