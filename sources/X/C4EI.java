package X;

/* renamed from: X.4EI, reason: invalid class name */
/* loaded from: classes2.dex */
public /* synthetic */ class C4EI {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[C4EJ.values().length];
        try {
            iArr[C4EJ.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C4EJ.INPUTTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[C4E2.values().length];
        try {
            iArr2[C4E2.LOW_VOLUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[C4E2.HIGH_VOLUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        LIZIZ = iArr2;
    }
}