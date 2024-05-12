package X;

import android.text.TextUtils;
import java.lang.Character;

/* renamed from: X.8Qm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211168Qm {
    public static final String LIZ = "&";

    public static float LIZJ(String str) {
        float f = 0.0f;
        if (str == null) {
            return 0.0f;
        }
        int i = -1;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return f;
            }
            int i3 = 2;
            float f2 = 1.0f;
            if (LIZIZ(i2, str) != 2) {
                i3 = 1;
                if (LIZLLL(i2, str)) {
                    f2 = 0.5f;
                }
            }
            i += i3;
            f += f2;
        }
    }

    public static int LIZIZ(int i, String str) {
        char charAt = str.charAt(i);
        if (55296 <= charAt) {
            if (charAt <= 56319) {
                int i2 = i + 1;
                if (i2 < str.length()) {
                    int charAt2 = (str.charAt(i2) - 56320) + ((charAt - 55296) * 1024) + 65536;
                    if (118784 <= charAt2 && charAt2 <= 128895) {
                        return 2;
                    }
                    return -1;
                }
                return -1;
            }
        } else {
            if (8448 <= charAt) {
                if (charAt <= 10239) {
                    return 1;
                }
                if (11013 <= charAt) {
                    if (charAt <= 11015) {
                        return 1;
                    }
                } else if (10548 <= charAt) {
                    if (charAt <= 10549) {
                        return 1;
                    }
                }
                if (12951 <= charAt) {
                    if (charAt <= 12953) {
                        return 1;
                    }
                }
            }
            if (charAt == 169 || charAt == 174 || charAt == 12349 || charAt == 12336 || charAt == 11093 || charAt == 11036 || charAt == 11035 || charAt == 11088) {
                return 1;
            }
        }
        int i3 = i + 1;
        if (i3 < str.length() && str.charAt(i3) == 8419) {
            return 2;
        }
        return -1;
    }

    public static boolean LIZLLL(int i, String str) {
        if (i >= str.length()) {
            return false;
        }
        char charAt = str.charAt(i);
        if (!Character.isDigit(charAt)) {
            if (!Character.isLowerCase(charAt)) {
                return false;
            }
            Character.UnicodeBlock of = Character.UnicodeBlock.of(charAt);
            if (of != Character.UnicodeBlock.BASIC_LATIN && of != Character.UnicodeBlock.LATIN_1_SUPPLEMENT && of != Character.UnicodeBlock.LATIN_EXTENDED_A && of != Character.UnicodeBlock.LATIN_EXTENDED_B && of != Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) {
                return false;
            }
        }
        return true;
    }

    public static String LIZ(int i, String str, String str2) {
        int i2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i <= 0) {
            return "";
        }
        if (str.length() <= i) {
            return str;
        }
        int i3 = -1;
        float f = 0.0f;
        do {
            i2 = i3 + 1;
            if (i2 < str.length()) {
                int i4 = 2;
                float f2 = 1.0f;
                if (LIZIZ(i2, str) != 2) {
                    i4 = 1;
                    if (LIZLLL(i2, str)) {
                        f2 = 0.5f;
                    }
                }
                i3 += i4;
                if (i3 >= str.length()) {
                    break;
                }
                f += f2;
            } else {
                break;
            }
        } while (f <= i + 0.01f);
        if (i2 >= str.length()) {
            return str;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str.substring(0, i2));
        LIZ2.append(str2);
        return X1D.LIZIZ(LIZ2);
    }
}
