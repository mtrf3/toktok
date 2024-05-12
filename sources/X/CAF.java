package X;

/* loaded from: classes6.dex */
public /* synthetic */ class CAF {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[CAI.values().length];
        try {
            iArr[CAI.HYBRID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CAI.NATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[CAG.values().length];
        try {
            iArr2[CAG.HYBRID.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[CAG.NATIVE_DROP_DYNAMIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CAG.NATIVE_WHEN_ALL_STATIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CAG.NATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[CAH.values().length];
        try {
            iArr3[CAH.AUTO_SCROLL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[CAH.DRAG.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[CAH.PANEL_ITEM_SCROLL.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        LIZJ = iArr3;
    }
}
