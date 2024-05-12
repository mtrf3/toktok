package X;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Fy1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40689Fy1 extends s {
    public static final CharSequence LLFF(CharSequence charSequence) {
        o.LJIIIZ(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 0) {
            length = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        return charSequence.subSequence(0, length);
    }

    public static final char LLFII(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    public static final Character LLFZ(CharSequence charSequence) {
        String str = (String) charSequence;
        if (str.length() == 0) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    public static final char LLIFFJFJJ(CharSequence charSequence) {
        o.LJIIIZ(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(s.LJJLIIIJ(charSequence));
    }

    public static final CharSequence LLII(CharSequence charSequence) {
        o.LJIIIZ(charSequence, "<this>");
        StringBuilder sb = new StringBuilder(charSequence);
        sb.reverse();
        o.LJIIIIZZ(sb, "StringBuilder(this).reverse()");
        return sb;
    }

    public static final String LLF(int i, String str) {
        o.LJIIIZ(str, "<this>");
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(i);
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        String LIZIZ = C0NY.LIZIZ("Requested character count ", i, " is less than zero.");
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final String LLFFF(int i, String str) {
        o.LJIIIZ(str, "<this>");
        int i2 = 0;
        if (i >= 0) {
            int length = str.length() - i;
            if (length >= 0) {
                i2 = length;
            }
            return LLIIII(i2, str);
        }
        String LIZIZ = C0NY.LIZIZ("Requested character count ", i, " is less than zero.");
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final Character LLI(int i, CharSequence charSequence) {
        o.LJIIIZ(charSequence, "<this>");
        if (i >= 0 && i <= s.LJJLIIIJ(charSequence)) {
            return Character.valueOf(charSequence.charAt(i));
        }
        return null;
    }

    public static final String LLIIII(int i, String str) {
        o.LJIIIZ(str, "<this>");
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(0, i);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        String LIZIZ = C0NY.LIZIZ("Requested character count ", i, " is less than zero.");
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final String LLIIIILZ(int i, String str) {
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(length - i);
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        String LIZIZ = C0NY.LIZIZ("Requested character count ", i, " is less than zero.");
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }
}
