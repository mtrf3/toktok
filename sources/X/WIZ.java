package X;

/* loaded from: classes15.dex */
public /* synthetic */ class WIZ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[WIY.values().length];
        try {
            iArr[WIY.ENTER_FROM_SINGLE_CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WIY.ENTER_FROM_LONG_PRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WIY.NONE_TYPE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
