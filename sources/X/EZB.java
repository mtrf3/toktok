package X;

/* loaded from: classes7.dex */
public final /* synthetic */ class EZB {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EZC.values().length];
        LIZ = iArr;
        EZC ezc = EZC.GET;
        iArr[ezc.ordinal()] = 1;
        EZC ezc2 = EZC.POST;
        iArr[ezc2.ordinal()] = 2;
        iArr[EZC.PUT.ordinal()] = 3;
        iArr[EZC.DELETE.ordinal()] = 4;
        int[] iArr2 = new int[EZC.values().length];
        LIZIZ = iArr2;
        iArr2[ezc.ordinal()] = 1;
        iArr2[ezc2.ordinal()] = 2;
        iArr2[EZC.DOWNLOAD.ordinal()] = 3;
    }
}
