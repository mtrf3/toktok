package X;

/* loaded from: classes13.dex */
public /* synthetic */ class SPR {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[SPP.values().length];
        try {
            iArr[SPP.PUBLIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SPP.REMIND_LATER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SPP.PRIVATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
