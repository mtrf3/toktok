package X;

/* loaded from: classes11.dex */
public /* synthetic */ class OP9 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[OP8.values().length];
        try {
            iArr[OP8.SELECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OP8.UNSELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OP8.CANT_SELECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
