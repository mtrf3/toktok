package X;

/* renamed from: X.3FI, reason: invalid class name */
/* loaded from: classes2.dex */
public /* synthetic */ class C3FI {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C3FJ.values().length];
        try {
            iArr[C3FJ.VISIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C3FJ.HIDDEN_TEMPORARILY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C3FJ.HIDDEN_PERMANENTLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
