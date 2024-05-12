package X;

/* loaded from: classes8.dex */
public /* synthetic */ class IBO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[IBJ.values().length];
        try {
            iArr[IBJ.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IBJ.COMPLETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IBJ.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
