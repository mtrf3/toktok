package X;

/* renamed from: X.Toa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public /* synthetic */ class C75776Toa {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC75775ToZ.values().length];
        try {
            iArr[EnumC75775ToZ.PAUSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC75775ToZ.FORWARD_STREAM_FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC75775ToZ.RECONNECTING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC75775ToZ.NORMAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC75775ToZ.PULLING_STREAM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
