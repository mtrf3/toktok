package X;

/* loaded from: classes15.dex */
public /* synthetic */ class VCH {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VCI.values().length];
        try {
            iArr[VCI.ENABLE_UP_CTL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VCI.ENABLE_DOWN_LOGGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VCI.ENABLE_DOWN_TEA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VCI.ENABLE_DOWN_VLM_EXE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
