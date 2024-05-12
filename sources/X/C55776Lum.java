package X;

/* renamed from: X.Lum, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public /* synthetic */ class C55776Lum {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC55775Lul.values().length];
        try {
            iArr[EnumC55775Lul.FOLLOWED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC55775Lul.FAIL_NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC55775Lul.FAIL_PRIVATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC55775Lul.FAIL_FRIENDS_ONLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC55775Lul.FAIL_SUBSCRIBERS_ONLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC55775Lul.SUCCESS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
    }
}
