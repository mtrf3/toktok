package X;

/* loaded from: classes9.dex */
public /* synthetic */ class KPA {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[KPB.values().length];
        try {
            iArr[KPB.CLOSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KPB.OPENED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KPB.OPENING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
