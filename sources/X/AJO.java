package X;

/* loaded from: classes5.dex */
public /* synthetic */ class AJO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AJN.values().length];
        try {
            iArr[AJN.LINK_SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AJN.EDIT_SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AJN.UNLINK_SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AJN.LINK_FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AJN.EDIT_FAILURE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AJN.UNLINK_FAILURE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
    }
}
