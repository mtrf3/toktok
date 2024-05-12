package X;

/* renamed from: X.4YN, reason: invalid class name */
/* loaded from: classes2.dex */
public /* synthetic */ class C4YN {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C4YL.values().length];
        try {
            iArr[C4YL.SENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C4YL.NOTSENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C4YL.SENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[C4YL.SEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[C4YL.DEFAULT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
