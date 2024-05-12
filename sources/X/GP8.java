package X;

/* loaded from: classes8.dex */
public /* synthetic */ class GP8 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC41422GNm.values().length];
        try {
            iArr[EnumC41422GNm.FIRST_SAVE_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC41422GNm.LAST_SAVE_TIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[GP9.values().length];
        try {
            iArr2[GP9.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[GP9.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[GP9.POSTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[GP9.INVISIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        LIZIZ = iArr2;
    }
}
