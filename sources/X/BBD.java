package X;

/* loaded from: classes6.dex */
public /* synthetic */ class BBD {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[BBP.values().length];
        try {
            iArr[BBP.FILTER_COMMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BBP.BLOCK_KEYWORDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BBP.MANAGE_MODERATOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BBP.EDIT_MODERATOR_PERMISSION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
