package X;

/* renamed from: X.52Z, reason: invalid class name */
/* loaded from: classes3.dex */
public /* synthetic */ class C52Z {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C52V.values().length];
        try {
            iArr[C52V.UNDO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C52V.REDO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C52V.PLAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[C52V.PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[C52V.FULL_SCREEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
