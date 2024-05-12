package X;

/* renamed from: X.IjS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public /* synthetic */ class C47430IjS {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC47429IjR.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC47429IjR.PREFER_SD_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[EnumC47429IjR.PREFER_EXTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[EnumC47429IjR.PREFER_PRIVATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[EnumC47429IjR.PREFER_EXTERNAL_EXCLUDE_SDCARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZ[EnumC47429IjR.PREFER_EXTERNAL_ONLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
