package X;

/* renamed from: X.Ct1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public /* synthetic */ class C32735Ct1 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC32736Ct2.values().length];
        try {
            iArr[EnumC32736Ct2.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC32736Ct2.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC32736Ct2.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC32734Ct0.values().length];
        try {
            iArr2[EnumC32734Ct0.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC32734Ct0.EMPTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC32734Ct0.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC32734Ct0.READY.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        LIZIZ = iArr2;
    }
}
