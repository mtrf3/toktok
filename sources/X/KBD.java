package X;

/* loaded from: classes9.dex */
public /* synthetic */ class KBD {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[KBF.values().length];
        try {
            iArr[KBF.GO_TO_MALL_SEARCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KBF.GO_TO_GENERAL_SEARCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[KBE.values().length];
        try {
            iArr2[KBE.PRODUCT_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[KBE.TALENT_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[KBE.STORE_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        LIZIZ = iArr2;
    }
}
