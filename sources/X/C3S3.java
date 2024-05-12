package X;

/* renamed from: X.3S3, reason: invalid class name */
/* loaded from: classes2.dex */
public /* synthetic */ class C3S3 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C3S2.values().length];
        try {
            iArr[C3S2.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C3S2.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C3S2.LOADED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
