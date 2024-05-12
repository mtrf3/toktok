package X;

/* renamed from: X.QOt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public /* synthetic */ class C66935QOt {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC66933QOr.values().length];
        try {
            iArr[EnumC66933QOr.CONNECTION_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC66933QOr.CONNECTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC66933QOr.CONNECT_FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC66933QOr.CONNECT_CLOSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC66933QOr.CONNECTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
