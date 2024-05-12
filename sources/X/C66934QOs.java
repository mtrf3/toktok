package X;

/* renamed from: X.QOs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public /* synthetic */ class C66934QOs {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC41264GHk.values().length];
        LIZIZ = iArr;
        try {
            iArr[EnumC41264GHk.STRONG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZIZ[EnumC41264GHk.WEAK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZIZ[EnumC41264GHk.FAKE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZIZ[EnumC41264GHk.NOT_AVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[EnumC66933QOr.values().length];
        LIZ = iArr2;
        try {
            iArr2[EnumC66933QOr.CONNECTION_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LIZ[EnumC66933QOr.CONNECTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            LIZ[EnumC66933QOr.CONNECT_FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            LIZ[EnumC66933QOr.CONNECT_CLOSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            LIZ[EnumC66933QOr.CONNECTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
