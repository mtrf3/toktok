package X;

/* loaded from: classes15.dex */
public /* synthetic */ class VTG {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VTH.values().length];
        LIZ = iArr;
        try {
            iArr[VTH.COMPLETION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[VTH.START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[VTH.REPEAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[VTH.CANCEL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZ[VTH.READY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LIZ[VTH.UPDATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            LIZ[VTH.ERROR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            LIZ[VTH.FPS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
