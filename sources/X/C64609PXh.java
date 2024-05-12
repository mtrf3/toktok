package X;

/* renamed from: X.PXh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public /* synthetic */ class C64609PXh {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC64572PVw.values().length];
        LIZIZ = iArr;
        try {
            iArr[EnumC64572PVw.HTTP_1_0.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZIZ[EnumC64572PVw.HTTP_1_1.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZIZ[EnumC64572PVw.HTTP_2.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZIZ[EnumC64572PVw.SPDY_3.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZIZ[EnumC64572PVw.QUIC.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[EnumC64610PXi.values().length];
        LIZ = iArr2;
        try {
            iArr2[EnumC64610PXi.HTTPDNS_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            LIZ[EnumC64610PXi.LOCALDNS_CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            LIZ[EnumC64610PXi.HTTPDNS_REQUEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            LIZ[EnumC64610PXi.LOCALDNS_REQUEST.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            LIZ[EnumC64610PXi.HTTPDNS_STALE_CACHE.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            LIZ[EnumC64610PXi.HARDCODE_IPS.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            LIZ[EnumC64610PXi.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
