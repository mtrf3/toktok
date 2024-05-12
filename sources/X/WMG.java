package X;

/* loaded from: classes15.dex */
public /* synthetic */ class WMG {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[WME.values().length];
        LIZ = iArr;
        try {
            iArr[WME.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[WME.VIEW_CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[WME.ACTIVITY_CREATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[WME.STARTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZ[WME.RESUMED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
