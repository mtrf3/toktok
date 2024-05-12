package X;

/* renamed from: X.4YO, reason: invalid class name */
/* loaded from: classes2.dex */
public /* synthetic */ class C4YO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C4YM.values().length];
        try {
            iArr[C4YM.SENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C4YM.NOTSENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C4YM.SENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[C4YM.SEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[C4YM.DEFAULT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
