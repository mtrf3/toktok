package X;

/* renamed from: X.9V2, reason: invalid class name */
/* loaded from: classes5.dex */
public /* synthetic */ class C9V2 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C9V1.values().length];
        try {
            iArr[C9V1.VALIDATING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C9V1.INVALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C9V1.VALIDATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
