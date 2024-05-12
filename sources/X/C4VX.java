package X;

/* renamed from: X.4VX, reason: invalid class name */
/* loaded from: classes2.dex */
public /* synthetic */ class C4VX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C4VW.values().length];
        try {
            iArr[C4VW.NETWORK_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C4VW.NETWORK_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C4VW.LOAD_SHARE_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[C4VW.LOAD_SHARE_END.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
