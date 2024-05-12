package X;

import com.ss.android.vesdk.ROTATE_DEGREE;

/* renamed from: X.Hdc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public /* synthetic */ class C44520Hdc {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ROTATE_DEGREE.values().length];
        LIZ = iArr;
        try {
            iArr[ROTATE_DEGREE.ROTATE_NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[ROTATE_DEGREE.ROTATE_90.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[ROTATE_DEGREE.ROTATE_180.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[ROTATE_DEGREE.ROTATE_270.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
