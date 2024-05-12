package X;

/* loaded from: classes9.dex */
public /* synthetic */ class KPV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[KPT.values().length];
        try {
            iArr[KPT.NOT_DEFINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KPT.PLAYING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KPT.PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
