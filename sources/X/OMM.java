package X;

/* loaded from: classes11.dex */
public /* synthetic */ class OMM {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[OML.values().length];
        try {
            iArr[OML.PHOTO_TYPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OML.LIVE_TYPE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OML.FEED_TYPE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
