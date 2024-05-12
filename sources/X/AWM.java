package X;

/* loaded from: classes5.dex */
public /* synthetic */ class AWM {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AWL.values().length];
        try {
            iArr[AWL.ON_UPDATE_EVENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AWL.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AWL.TAB_CHANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
