package X;

/* loaded from: classes13.dex */
public /* synthetic */ class STE {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[STF.values().length];
        try {
            iArr[STF.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[STF.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[STF.WAITING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[STF.FAIL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[STF.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[STH.values().length];
        try {
            iArr2[STH.RETRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[STH.SELECT_OTHER_PHOTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[STH.CANCEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[STH.BACK_TO_EDIT_PROFILE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[ST9.values().length];
        try {
            iArr3[ST9.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[ST9.GENERATING.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[ST9.SUCCESSFUL.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[ST9.IN_QUEUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[ST9.FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[ST9.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        LIZJ = iArr3;
    }
}
