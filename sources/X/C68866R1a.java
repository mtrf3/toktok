package X;

/* renamed from: X.R1a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public /* synthetic */ class C68866R1a {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[R1Y.values().length];
        try {
            iArr[R1Y.FOREGROUND_CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[R1Y.FOREGROUND_DISCONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[R1Y.FOREGROUND_ACTIVELY_DISCONNECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[R1Y.BACKGROUND_CONNECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[R1Y.BACKGROUND_DISCONNECTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[R1Y.BACKGROUND_ACTIVELY_DISCONNECTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
    }
}
