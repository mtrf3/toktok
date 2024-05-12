package X;

/* renamed from: X.Q8w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public /* synthetic */ class C66522Q8w {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[EnumC66523Q8x.values().length];
        LIZJ = iArr;
        try {
            iArr[EnumC66523Q8x.PREMIUM_RATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZJ[EnumC66523Q8x.TOLL_FREE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZJ[EnumC66523Q8x.MOBILE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZJ[EnumC66523Q8x.FIXED_LINE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZJ[EnumC66523Q8x.FIXED_LINE_OR_MOBILE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LIZJ[EnumC66523Q8x.SHARED_COST.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            LIZJ[EnumC66523Q8x.VOIP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            LIZJ[EnumC66523Q8x.PERSONAL_NUMBER.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            LIZJ[EnumC66523Q8x.PAGER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            LIZJ[EnumC66523Q8x.UAN.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            LIZJ[EnumC66523Q8x.VOICEMAIL.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        int[] iArr2 = new int[EnumC66524Q8y.values().length];
        LIZIZ = iArr2;
        try {
            iArr2[EnumC66524Q8y.E164.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            LIZIZ[EnumC66524Q8y.INTERNATIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            LIZIZ[EnumC66524Q8y.RFC3966.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            LIZIZ[EnumC66524Q8y.NATIONAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        int[] iArr3 = new int[EnumC66521Q8v.values().length];
        LIZ = iArr3;
        try {
            iArr3[EnumC66521Q8v.FROM_NUMBER_WITH_PLUS_SIGN.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            LIZ[EnumC66521Q8v.FROM_NUMBER_WITH_IDD.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            LIZ[EnumC66521Q8v.FROM_NUMBER_WITHOUT_PLUS_SIGN.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            LIZ[EnumC66521Q8v.FROM_DEFAULT_COUNTRY.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
    }
}
