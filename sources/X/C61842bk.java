package X;

/* renamed from: X.2bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public /* synthetic */ class C61842bk {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC61762bc.values().length];
        try {
            iArr[EnumC61762bc.NO_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC61762bc.BEFORE_SEARCH_NO_CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC61762bc.BEFORE_SEARCH_USE_UNIQUE_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC61762bc.USE_COMMON_CACHE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
