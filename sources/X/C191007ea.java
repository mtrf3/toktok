package X;

/* renamed from: X.7ea, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public /* synthetic */ class C191007ea {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC191017eb.values().length];
        try {
            iArr[EnumC191017eb.STATUS_PAGE_INIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC191017eb.STATUS_POI_DETAIL_READY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC191017eb.STATUS_POI_DETAIL_FAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC191017eb.STATUS_MAP_READY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC191017eb.STATUS_MAP_FAIL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC191017eb.STATUS_NONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
    }
}
