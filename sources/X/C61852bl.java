package X;

/* renamed from: X.2bl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public /* synthetic */ class C61852bl {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC61762bc.values().length];
        try {
            iArr[EnumC61762bc.USE_COMMON_CACHE.ordinal()] = 1;
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
        LIZ = iArr;
    }
}
