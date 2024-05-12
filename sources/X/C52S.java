package X;

/* renamed from: X.52S, reason: invalid class name */
/* loaded from: classes3.dex */
public /* synthetic */ class C52S {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C52V.values().length];
        try {
            iArr[C52V.EXCEED_LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C52V.UNDO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C52V.REDO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[C52V.PLAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[C52V.PAUSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[C52V.FULL_SCREEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
    }
}
