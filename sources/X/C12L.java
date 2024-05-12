package X;

/* renamed from: X.12L, reason: invalid class name */
/* loaded from: classes.dex */
public /* synthetic */ class C12L {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C12F.values().length];
        try {
            iArr[C12F.CMD_TRANSITION_TO_INIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C12F.CMD_TRANSITION_TO_HIDDEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C12F.CMD_TRANSITION_TO_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[C12F.CMD_TRANSITION_TO_FLOATING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[C12F.CMD_TRANSITION_TO_SMALL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
