package X;

/* renamed from: X.ScF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public /* synthetic */ class C72463ScF {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC72462ScE.values().length];
        try {
            iArr[EnumC72462ScE.MUF_LIST_FIRST_LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC72462ScE.MUF_LIST_LOADING_MORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC72462ScE.MUF_LIST_COMPLETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC72462ScE.MUF_LIST_EMPTY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC72462ScE.FIRST_REFRESH_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC72462ScE.LOAD_MORE_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
    }
}
