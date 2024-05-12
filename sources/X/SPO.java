package X;

/* loaded from: classes13.dex */
public /* synthetic */ class SPO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[SPP.values().length];
        try {
            iArr[SPP.PRIVATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SPP.PUBLIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SPP.REMIND_LATER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
