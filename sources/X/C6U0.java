package X;

/* renamed from: X.6U0, reason: invalid class name */
/* loaded from: classes3.dex */
public /* synthetic */ class C6U0 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C6U1.values().length];
        try {
            iArr[C6U1.LARGER_WHITE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C6U1.SMALLER_WHITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C6U1.LARGER_BLACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[C6U1.SMALLER_BLACK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
