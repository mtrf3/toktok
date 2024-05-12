package X;

/* renamed from: X.0pW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public /* synthetic */ class C19420pW {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;
    public static final /* synthetic */ int[] LIZLLL;

    static {
        int[] iArr = new int[EnumC08500Va.values().length];
        LIZLLL = iArr;
        try {
            iArr[EnumC08500Va.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZLLL[EnumC08500Va.DROP_WORK_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[C0VX.values().length];
        LIZJ = iArr2;
        try {
            iArr2[C0VX.NOT_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZJ[C0VX.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZJ[C0VX.UNMETERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LIZJ[C0VX.NOT_ROAMING.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            LIZJ[C0VX.METERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr3 = new int[C0VM.values().length];
        LIZIZ = iArr3;
        try {
            iArr3[C0VM.EXPONENTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            LIZIZ[C0VM.LINEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        int[] iArr4 = new int[EnumC08510Vb.values().length];
        LIZ = iArr4;
        try {
            iArr4[EnumC08510Vb.ENQUEUED.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            LIZ[EnumC08510Vb.RUNNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            LIZ[EnumC08510Vb.SUCCEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            LIZ[EnumC08510Vb.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            LIZ[EnumC08510Vb.BLOCKED.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            LIZ[EnumC08510Vb.CANCELLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
    }
}
