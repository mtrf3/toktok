package X;

/* renamed from: X.0ZS, reason: invalid class name */
/* loaded from: classes.dex */
public /* synthetic */ class C0ZS {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0ZV.values().length];
        LIZ = iArr;
        try {
            iArr[C0ZV.RUNNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[C0ZV.FINISHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
