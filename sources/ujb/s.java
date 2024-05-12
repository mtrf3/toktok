package ujb;

import X.C0NY;
import X.C110574Vp;
import X.C118234kV;
import X.C17N;
import X.C32I;
import X.C40511Fv9;
import X.C40517FvF;
import X.C40688Fy0;
import X.C40692Fy4;
import X.C47261Igj;
import X.C48690J9a;
import X.C61898ORa;
import X.C78842Uww;
import X.KMP;
import X.OJ4;
import X.ORY;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS71S0110000_1;
import kotlin.jvm.internal.AqS72S0110000_3;

/* loaded from: classes7.dex */
public class s extends o {
    public static final C40517FvF LJJLIIIIJ(CharSequence charSequence) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        return new C40517FvF(0, charSequence.length() - 1);
    }

    public static final int LJJLIIIJ(CharSequence charSequence) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final String LJLI(String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        return LJL("\"", "\"", str);
    }

    public static final void LJLILLLLZI(int i) {
        if (i >= 0) {
            return;
        }
        String LJ = KMP.LJ("Limit must be non-negative, but was ", i);
        LJ.toString();
        throw new IllegalArgumentException(LJ);
    }

    public static final Boolean LJZ(String str) {
        if (kotlin.jvm.internal.o.LJ(str, "true")) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.o.LJ(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final CharSequence LJZI(CharSequence charSequence) {
        int i;
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean LJJIJIIJIL = C17N.LJJIJIIJIL(charSequence.charAt(i));
            if (!z) {
                if (!LJJIJIIJIL) {
                    z = true;
                } else {
                    i2++;
                }
            } else {
                if (!LJJIJIIJIL) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final CharSequence LJZL(CharSequence charSequence) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!C17N.LJJIJIIJIL(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    public static final CharSequence LLD(CharSequence charSequence) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C17N.LJJIJIIJIL(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static boolean LJJJZ(CharSequence charSequence, char c) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        if (LJJLIIIJJIZ(charSequence, c, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean LJJL(CharSequence charSequence, char c) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        if (charSequence.length() <= 0 || !C17N.LJIILLIIL(charSequence.charAt(LJJLIIIJ(charSequence)), c, false)) {
            return false;
        }
        return true;
    }

    public static boolean LJJLI(CharSequence charSequence, CharSequence suffix) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(suffix, "suffix");
        if ((charSequence instanceof String) && (suffix instanceof String)) {
            return o.LJJJJ((String) charSequence, (String) suffix, false);
        }
        return LJJLJLI(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), false);
    }

    public static final String LJJLIL(int i, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                C118234kV it = new C40517FvF(1, i - str.length()).iterator();
                while (it.LJLJI) {
                    it.nextInt();
                    sb.append('0');
                }
                sb.append((CharSequence) str);
                charSequence = sb;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(C0NY.LIZIZ("Desired length ", i, " is less than zero."));
    }

    public static final String LJJLL(CharSequence prefix, String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(prefix, "prefix");
        if (LJLJLJ(str, prefix)) {
            String substring = str.substring(prefix.length());
            kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    public static final CharSequence LJJZZI(CharSequence charSequence, CharSequence charSequence2) {
        if (LJJLI(charSequence, charSequence2)) {
            StringBuilder sb = (StringBuilder) charSequence;
            return sb.subSequence(0, sb.length() - ((String) charSequence2).length());
        }
        StringBuilder sb2 = (StringBuilder) charSequence;
        return sb2.subSequence(0, sb2.length());
    }

    public static final String LJJZZIII(CharSequence suffix, String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(suffix, "suffix");
        if (LJJLI(str, suffix)) {
            String substring = str.substring(0, str.length() - ((String) suffix).length());
            kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static String LJLIIIL(String missingDelimiterValue, String str) {
        kotlin.jvm.internal.o.LJIIIZ(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(missingDelimiterValue, "missingDelimiterValue");
        int LJJLIIJ = LJJLIIJ(missingDelimiterValue, "_", 6);
        if (LJJLIIJ == -1) {
            return missingDelimiterValue;
        }
        return LJLIL(missingDelimiterValue, 1 + LJJLIIJ, missingDelimiterValue.length(), str).toString();
    }

    public static String LJLIIL(String str, String replacement) {
        kotlin.jvm.internal.o.LJIIIZ(replacement, "replacement");
        int LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ(str, '.', 0, 6);
        if (LJJLIIIJLLLLLLLZ == -1) {
            return str;
        }
        return LJLIL(str, LJJLIIIJLLLLLLLZ + 1, str.length(), replacement).toString();
    }

    public static C110574Vp LJLJJLL(CharSequence charSequence, String[] strArr) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        return OJ4.LJJJJLL(LJJLJ(charSequence, strArr, false, 0), new AqS172S0100000_6(charSequence, 126));
    }

    public static boolean LJLJL(CharSequence charSequence, char c) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        if (charSequence.length() <= 0 || !C17N.LJIILLIIL(charSequence.charAt(0), c, false)) {
            return false;
        }
        return true;
    }

    public static boolean LJLJLJ(CharSequence charSequence, CharSequence prefix) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(prefix, "prefix");
        if ((charSequence instanceof String) && (prefix instanceof String)) {
            return o.LJJJLIIL((String) charSequence, (String) prefix, false);
        }
        return LJJLJLI(charSequence, 0, prefix, 0, prefix.length(), false);
    }

    public static final String LJLJLLL(CharSequence charSequence, C40517FvF range) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.LJIIIIZZ().intValue() + 1).toString();
    }

    public static final String LJLL(String str, C40517FvF range) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(range, "range");
        String substring = str.substring(range.getStart().intValue(), range.LJIIIIZZ().intValue() + 1);
        kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String LJLLJ(String missingDelimiterValue, String str) {
        kotlin.jvm.internal.o.LJIIIZ(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(missingDelimiterValue, "missingDelimiterValue");
        int LJJLIIJ = LJJLIIJ(missingDelimiterValue, str, 6);
        if (LJJLIIJ == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(str.length() + LJJLIIJ, missingDelimiterValue.length());
        kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String LJLLLL(String missingDelimiterValue, char c) {
        kotlin.jvm.internal.o.LJIIIZ(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(missingDelimiterValue, "missingDelimiterValue");
        int LJJLIIIJJIZ = LJJLIIIJJIZ(missingDelimiterValue, c, 0, false, 6);
        if (LJJLIIIJJIZ == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(0, LJJLIIIJJIZ);
        kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String LL(String str, char... cArr) {
        CharSequence charSequence;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!ORY.LJJIIZI(str.charAt(length), cArr)) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static final boolean LJJJLZIJ(CharSequence charSequence, CharSequence other, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(other, "other");
        if (other instanceof String) {
            if (LJJLIIIJL(charSequence, (String) other, 0, z, 2) < 0) {
                return false;
            }
        } else if (LJJLIIIJJI(charSequence, other, 0, charSequence.length(), z, false) < 0) {
            return false;
        }
        return true;
    }

    public static int LJJLIIJ(CharSequence charSequence, String string, int i) {
        int i2;
        if ((i & 2) != 0) {
            i2 = LJJLIIIJ(charSequence);
        } else {
            i2 = 0;
        }
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(string, "string");
        if (!(charSequence instanceof String)) {
            return LJJLIIIJJI(charSequence, string, i2, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(string, i2);
    }

    public static final CharSequence LJJZ(int i, int i2, CharSequence charSequence) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        if (i2 >= i) {
            if (i2 == i) {
                String str = (String) charSequence;
                return str.subSequence(0, str.length());
            }
            String str2 = (String) charSequence;
            StringBuilder sb = new StringBuilder(str2.length() - (i2 - i));
            sb.append(charSequence, 0, i);
            sb.append(charSequence, i2, str2.length());
            return sb;
        }
        throw new IndexOutOfBoundsException(C48690J9a.LJIIJJI("End index (", i2, ") is less than start index (", i, ")."));
    }

    public static final String LJL(CharSequence charSequence, CharSequence charSequence2, String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        String str2 = (String) charSequence;
        String str3 = (String) charSequence2;
        if (str.length() >= str3.length() + str2.length() && LJLJLJ(str, charSequence) && LJJLI(str, charSequence2)) {
            String substring = str.substring(str2.length(), str.length() - str3.length());
            kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static final String LJLLI(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(delimiter, "delimiter");
        kotlin.jvm.internal.o.LJIIIZ(missingDelimiterValue, "missingDelimiterValue");
        int LJJLIIIJL = LJJLIIIJL(str, delimiter, 0, false, 6);
        if (LJJLIIIJL == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(delimiter.length() + LJJLIIIJL, str.length());
        kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String LJLLILLLL(char c, String str, String missingDelimiterValue) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(missingDelimiterValue, "missingDelimiterValue");
        int LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ(str, c, 0, 6);
        if (LJJLIIIJLLLLLLLZ == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(LJJLIIIJLLLLLLLZ + 1, str.length());
        kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String LJLLL(String str, String str2, String missingDelimiterValue) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(missingDelimiterValue, "missingDelimiterValue");
        int LJJLIIIJL = LJJLIIIJL(str, str2, 0, false, 6);
        if (LJJLIIIJL == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, LJJLIIIJL);
        kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String LJLLLLLL(char c, String str, String missingDelimiterValue) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(missingDelimiterValue, "missingDelimiterValue");
        int LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ(str, c, 0, 6);
        if (LJJLIIIJLLLLLLLZ == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, LJJLIIIJLLLLLLLZ);
        kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String LJLZ(String str, String str2, String missingDelimiterValue) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(missingDelimiterValue, "missingDelimiterValue");
        int LJJLIIJ = LJJLIIJ(str, str2, 6);
        if (LJJLIIJ == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, LJJLIIJ);
        kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final int LJJLIIIJILLIZJL(int i, CharSequence charSequence, String string, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(string, "string");
        if (z || !(charSequence instanceof String)) {
            return LJJLIIIJJI(charSequence, string, i, charSequence.length(), z, false);
        }
        return ((String) charSequence).indexOf(string, i);
    }

    public static final int LJJLIIIJLJLI(int i, CharSequence charSequence, boolean z, char[] chars) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ORY.LJJLIIIJ(chars), i);
        }
        if (i < 0) {
            i = 0;
        }
        C118234kV it = new C40517FvF(i, LJJLIIIJ(charSequence)).iterator();
        while (it.LJLJI) {
            int nextInt = it.nextInt();
            char charAt = charSequence.charAt(nextInt);
            for (char c : chars) {
                if (C17N.LJIILLIIL(c, charAt, z)) {
                    return nextInt;
                }
            }
        }
        return -1;
    }

    public static int LJJLIIIJLLLLLLLZ(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = LJJLIIIJ(charSequence);
        }
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(ORY.LJJLIIIJ(cArr), i);
            }
            int LJJLIIIJ = LJJLIIIJ(charSequence);
            if (i > LJJLIIIJ) {
                i = LJJLIIIJ;
            }
            while (-1 < i) {
                if (C17N.LJIILLIIL(cArr[0], charSequence.charAt(i), false)) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static C40692Fy4 LJJLJ(CharSequence charSequence, String[] strArr, boolean z, int i) {
        LJLILLLLZI(i);
        return new C40692Fy4(charSequence, 0, i, new AqS72S0110000_3(C61898ORa.LJIILL(strArr), (List<String>) z, true));
    }

    public static final CharSequence LJLIL(CharSequence charSequence, int i, int i2, CharSequence replacement) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(replacement, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(replacement);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        throw new IndexOutOfBoundsException(C48690J9a.LJIIJJI("End index (", i2, ") is less than start index (", i, ")."));
    }

    public static final List LJLJI(int i, CharSequence charSequence, String str, boolean z) {
        boolean z2;
        LJLILLLLZI(i);
        int i2 = 0;
        int LJJLIIIJILLIZJL = LJJLIIIJILLIZJL(0, charSequence, str, z);
        if (LJJLIIIJILLIZJL == -1 || i == 1) {
            return C47261Igj.LJJIJ(charSequence.toString());
        }
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = 10;
        if (z2 && i <= 10) {
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, LJJLIIIJILLIZJL).toString());
            i2 = str.length() + LJJLIIIJILLIZJL;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            LJJLIIIJILLIZJL = LJJLIIIJILLIZJL(i2, charSequence, str, z);
        } while (LJJLIIIJILLIZJL != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static List LJLJJI(CharSequence charSequence, char[] cArr, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        if (cArr.length == 1) {
            return LJLJI(0, charSequence, String.valueOf(cArr[0]), z);
        }
        LJLILLLLZI(0);
        C40688Fy0 c40688Fy0 = new C40688Fy0(new C40692Fy4(charSequence, 0, 0, new AqS71S0110000_1(cArr, z, 1)));
        ArrayList arrayList = new ArrayList(C32I.LJJL(c40688Fy0, 10));
        Iterator<Object> it = c40688Fy0.iterator();
        while (it.hasNext()) {
            arrayList.add(LJLJLLL(charSequence, (C40517FvF) it.next()));
        }
        return arrayList;
    }

    public static List LJLJJL(CharSequence charSequence, String[] strArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return LJLJI(i, charSequence, str, false);
            }
        }
        C40688Fy0 c40688Fy0 = new C40688Fy0(LJJLJ(charSequence, strArr, false, i));
        ArrayList arrayList = new ArrayList(C32I.LJJL(c40688Fy0, 10));
        Iterator<Object> it = c40688Fy0.iterator();
        while (it.hasNext()) {
            arrayList.add(LJLJLLL(charSequence, (C40517FvF) it.next()));
        }
        return arrayList;
    }

    public static int LJJLIIIJJIZ(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        if (z || !(charSequence instanceof String)) {
            return LJJLIIIJLJLI(i, charSequence, z, new char[]{c});
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int LJJLIIIJL(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return LJJLIIIJILLIZJL(i, charSequence, str, z);
    }

    public static final int LJJLIIIJJI(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C40511Fv9 LJIILLIIL;
        int i3 = i;
        int i4 = i2;
        if (!z2) {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            LJIILLIIL = new C40517FvF(i3, i4);
        } else {
            int LJJLIIIJ = LJJLIIIJ(charSequence);
            if (i3 > LJJLIIIJ) {
                i3 = LJJLIIIJ;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            LJIILLIIL = C78842Uww.LJIILLIIL(i3, i4);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i5 = LJIILLIIL.LJLIL;
            int i6 = LJIILLIIL.LJLILLLLZI;
            int i7 = LJIILLIIL.LJLJI;
            if (i7 > 0) {
                if (i5 > i6) {
                    return -1;
                }
            } else if (i7 >= 0 || i6 > i5) {
                return -1;
            }
            while (!o.LJJJJL((String) charSequence2, 0, z, i5, charSequence2.length(), (String) charSequence)) {
                if (i5 == i6) {
                    return -1;
                }
                i5 += i7;
            }
            return i5;
        }
        int i8 = LJIILLIIL.LJLIL;
        int i9 = LJIILLIIL.LJLILLLLZI;
        int i10 = LJIILLIIL.LJLJI;
        if (i10 > 0) {
            if (i8 > i9) {
                return -1;
            }
        } else if (i10 >= 0 || i9 > i8) {
            return -1;
        }
        while (!LJJLJLI(charSequence2, 0, charSequence, i8, charSequence2.length(), z)) {
            if (i8 == i9) {
                return -1;
            }
            i8 += i10;
        }
        return i8;
    }

    public static final boolean LJJLJLI(CharSequence charSequence, int i, CharSequence other, int i2, int i3, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(charSequence, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(other, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > other.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C17N.LJIILLIIL(charSequence.charAt(i + i4), other.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }
}
