package X;

/* renamed from: X.4E4, reason: invalid class name */
/* loaded from: classes2.dex */
public /* synthetic */ class C4E4 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[C4E5.values().length];
        try {
            iArr[C4E5.INITIATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C4E5.TALKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C4E5.CANCELLING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[C4E3.values().length];
        try {
            iArr2[C4E3.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[C4E3.LOW_VOLUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[C4E3.HIGH_VOLUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[C4E3.STOP.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        LIZIZ = iArr2;
    }
}
