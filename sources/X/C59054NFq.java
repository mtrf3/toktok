package X;

/* renamed from: X.NFq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public /* synthetic */ class C59054NFq {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC59053NFp.values().length];
        try {
            iArr[EnumC59053NFp.ONLY_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC59053NFp.CACHE_WITH_RETRY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC59053NFp.ONLY_RENDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
