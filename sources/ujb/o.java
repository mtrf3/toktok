package ujb;

import X.AbstractC118224kU;
import X.C10120aW;
import X.C118234kV;
import X.C17N;
import X.C38350F3i;
import X.C40517FvF;
import X.PVC;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes7.dex */
public class o extends C38350F3i {
    public static final String LJJJ(String str) {
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.o.LJIIIIZZ(locale, "getDefault()");
        if (str.length() > 0) {
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                StringBuilder sb = new StringBuilder();
                char titleCase = Character.toTitleCase(charAt);
                if (titleCase != Character.toUpperCase(charAt)) {
                    sb.append(titleCase);
                } else {
                    String substring = str.substring(0, 1);
                    kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String upperCase = substring.toUpperCase(locale);
                    kotlin.jvm.internal.o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    sb.append(upperCase);
                }
                String substring2 = str.substring(1);
                kotlin.jvm.internal.o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
                sb.append(substring2);
                String sb2 = sb.toString();
                kotlin.jvm.internal.o.LJIIIIZZ(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            return str;
        }
        return str;
    }

    public static final byte[] LJJJIL(String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        byte[] bytes = str.getBytes(PVC.LIZ);
        kotlin.jvm.internal.o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final boolean LJJJJJL(CharSequence charSequence) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable LJJLIIIIJ = s.LJJLIIIIJ(charSequence);
        if ((LJJLIIIIJ instanceof Collection) && ((Collection) LJJLIIIIJ).isEmpty()) {
            return true;
        }
        Iterator<Integer> it = LJJLIIIIJ.iterator();
        while (it.hasNext()) {
            if (!C17N.LJJIJIIJIL(charSequence.charAt(((AbstractC118224kU) it).nextInt()))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJJJI(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence instanceof String) {
            if (charSequence2 != null) {
                return ((String) charSequence).contentEquals(charSequence2);
            }
            if (charSequence2 instanceof String) {
                return kotlin.jvm.internal.o.LJ(charSequence, charSequence2);
            }
        }
        if (charSequence != charSequence2) {
            if (charSequence != null && charSequence2 != null) {
                String str = (String) charSequence;
                String str2 = (String) charSequence2;
                if (str.length() == str2.length()) {
                    int length = str.length();
                    for (int i = 0; i < length; i++) {
                        if (str.charAt(i) == str2.charAt(i)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final String LJJJJLI(int i, CharSequence charSequence) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        if (i >= 0) {
            if (i != 0) {
                if (i != 1) {
                    int length = charSequence.length();
                    if (length != 0) {
                        if (length != 1) {
                            StringBuilder sb = new StringBuilder(charSequence.length() * i);
                            C118234kV it = new C40517FvF(1, i).iterator();
                            while (it.LJLJI) {
                                it.nextInt();
                                sb.append(charSequence);
                            }
                            String sb2 = sb.toString();
                            kotlin.jvm.internal.o.LJIIIIZZ(sb2, "{\n                    va…tring()\n                }");
                            return sb2;
                        }
                        char charAt = charSequence.charAt(0);
                        char[] cArr = new char[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            cArr[i2] = charAt;
                        }
                        return new String(cArr);
                    }
                } else {
                    return charSequence.toString();
                }
            }
            return "";
        }
        String LIZ = C10120aW.LIZ("Count 'n' must be non-negative, but was ", i, '.');
        LIZ.toString();
        throw new IllegalArgumentException(LIZ);
    }

    public static final boolean LJJJJ(String str, String suffix, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(suffix, "suffix");
        if (!z) {
            return str.endsWith(suffix);
        }
        return LJJJJL(str, str.length() - suffix.length(), true, 0, suffix.length(), suffix);
    }

    public static final boolean LJJJJIZL(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final boolean LJJJLIIL(String str, String prefix, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(prefix, "prefix");
        if (!z) {
            return str.startsWith(prefix);
        }
        return LJJJJL(str, 0, z, 0, prefix.length(), prefix);
    }

    public static final String LJJJJLL(String str, char c, char c2, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            kotlin.jvm.internal.o.LJIIIIZZ(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (C17N.LJIILLIIL(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.o.LJIIIIZZ(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static final String LJJJJZ(String str, String oldValue, String newValue, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(oldValue, "oldValue");
        kotlin.jvm.internal.o.LJIIIZ(newValue, "newValue");
        int i = 0;
        int LJJLIIIJILLIZJL = s.LJJLIIIJILLIZJL(0, str, oldValue, z);
        if (LJJLIIIJILLIZJL < 0) {
            return str;
        }
        int length = oldValue.length();
        int i2 = 1;
        if (length >= 1) {
            i2 = length;
        }
        int length2 = newValue.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, LJJLIIIJILLIZJL);
                sb.append(newValue);
                i = LJJLIIIJILLIZJL + length;
                if (LJJLIIIJILLIZJL >= str.length()) {
                    break;
                }
                LJJLIIIJILLIZJL = s.LJJLIIIJILLIZJL(LJJLIIIJILLIZJL + i2, str, oldValue, z);
            } while (LJJLIIIJILLIZJL > 0);
            sb.append((CharSequence) str, i, str.length());
            String sb2 = sb.toString();
            kotlin.jvm.internal.o.LJIIIIZZ(sb2, "stringBuilder.append(this, i, length).toString()");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static final String LJJJJZI(String str, String oldValue, String newValue, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(oldValue, "oldValue");
        kotlin.jvm.internal.o.LJIIIZ(newValue, "newValue");
        int LJJLIIIJL = s.LJJLIIIJL(str, oldValue, 0, z, 2);
        if (LJJLIIIJL < 0) {
            return str;
        }
        return s.LJLIL(str, LJJLIIIJL, oldValue.length() + LJJLIIIJL, newValue).toString();
    }

    public static final boolean LJJJJL(String str, int i, boolean z, int i2, int i3, String other) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(other, "other");
        if (!z) {
            return str.regionMatches(i, other, i2, i3);
        }
        return str.regionMatches(z, i, other, i2, i3);
    }
}
