package X;

/* loaded from: classes9.dex */
public final /* synthetic */ class KBJ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[KBF.values().length];
        try {
            iArr[KBF.NOT_FROM_MALL_UG_OR_REVERT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KBF.FROM_UG_DEEPLINK_BUT_NOT_HAVE_FUNCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KBF.GO_TO_GENERAL_SEARCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[KBF.GO_TO_MALL_SEARCH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
