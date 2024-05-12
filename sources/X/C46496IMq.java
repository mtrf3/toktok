package X;

/* renamed from: X.IMq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46496IMq {
    public static final EnumC46495IMp LIZ = EnumC46495IMp.VeLivePlayerLogLevelInfo;

    public static void LIZ() {
        EnumC46495IMp.VeLivePlayerLogLevelDebug.compareTo(LIZ);
    }

    public static void LIZIZ() {
        EnumC46495IMp.VeLivePlayerLogLevelError.compareTo(LIZ);
    }

    public static void LIZJ() {
        EnumC46495IMp.VeLivePlayerLogLevelInfo.compareTo(LIZ);
    }

    public static void LJ() {
        EnumC46495IMp.VeLivePlayerLogLevelWarn.compareTo(LIZ);
    }

    public static void LIZLLL(String str, String str2) {
        int i;
        int i2;
        if (EnumC46495IMp.VeLivePlayerLogLevelInfo.compareTo(LIZ) < 0 || str.length() == 0 || str2 == null || str2.length() == 0) {
            return;
        }
        int length = str2.length();
        if (length <= 3072) {
            LIZJ();
            return;
        }
        int i3 = 0;
        do {
            i = i3 + 3072;
            if (i <= length) {
                i2 = i;
            } else {
                i2 = length;
            }
            str2.substring(i3, i2);
            LIZJ();
            i3 = i;
        } while (i < length);
    }
}
