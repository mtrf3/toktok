package X;

/* renamed from: X.10n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public /* synthetic */ class C260510n {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC24230xH.values().length];
        try {
            iArr[EnumC24230xH.FULL_UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC24230xH.PLAY_STATUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC24230xH.COVER_CHANGED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[AnonymousClass017.values().length];
        try {
            iArr2[AnonymousClass017.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[AnonymousClass017.PLAYING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[AnonymousClass017.PAUSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        LIZIZ = iArr2;
    }
}
