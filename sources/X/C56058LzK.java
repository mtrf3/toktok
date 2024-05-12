package X;

/* renamed from: X.LzK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public /* synthetic */ class C56058LzK {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC56059LzL.values().length];
        try {
            iArr[EnumC56059LzL.PREFETCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC56059LzL.PREFETCH_CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC56059LzL.REFRESH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC56059LzL.PULL_REFRESH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
