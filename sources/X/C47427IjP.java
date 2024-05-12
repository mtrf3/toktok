package X;

/* renamed from: X.IjP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public /* synthetic */ class C47427IjP {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC47428IjQ.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC47428IjQ.PREFER_EXTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[EnumC47428IjQ.PREFER_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[EnumC47428IjQ.PREFER_SD_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
