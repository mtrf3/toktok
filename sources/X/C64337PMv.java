package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.i0;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.PMv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64337PMv {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final float LIZ = 1.0f;
    public final float LIZIZ = 0.5f;
    public final int LIZJ = 1000;
    public final float LIZLLL = 0.5f;
    public final short LJ = 4;
    public final short LJFF = 32;
    public final Pattern LJI = PatternProtector.compile("\\n\\r?\\n\\Z", 32);
    public final Pattern LJII = PatternProtector.compile("\\A\\r?\\n\\r?\\n", 32);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[LOOP:0: B:2:0x001d->B:12:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0161 A[EDGE_INSN: B:13:0x0161->B:14:0x0161 BREAK  A[LOOP:0: B:2:0x001d->B:12:0x0038], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0210 A[LOOP:1: B:26:0x019b->B:39:0x0210, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0273 A[EDGE_INSN: B:40:0x0273->B:41:0x0273 BREAK  A[LOOP:1: B:26:0x019b->B:39:0x0210], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.util.LinkedList r13) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64337PMv.LIZJ(java.util.LinkedList):void");
    }

    public static String LJIIIZ(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C64339PMx c64339PMx = (C64339PMx) it.next();
            if (c64339PMx.LIZ != EnumC64341PMz.INSERT) {
                sb.append(c64339PMx.LIZIZ);
            }
        }
        return sb.toString();
    }

    public static String LJIIJ(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C64339PMx c64339PMx = (C64339PMx) it.next();
            if (c64339PMx.LIZ != EnumC64341PMz.DELETE) {
                sb.append(c64339PMx.LIZIZ);
            }
        }
        return sb.toString();
    }

    public static List LJIILL(String str) {
        char charAt;
        String replace;
        LinkedList linkedList = new LinkedList();
        if (str.length() == 0) {
            return linkedList;
        }
        LinkedList linkedList2 = new LinkedList(Arrays.asList(str.split("\n")));
        Pattern compile = PatternProtector.compile("^@@ -(\\d+),?(\\d*) \\+(\\d+),?(\\d*) @@$");
        while (!linkedList2.isEmpty()) {
            Matcher matcher = compile.matcher((CharSequence) linkedList2.getFirst());
            if (matcher.matches()) {
                C64338PMw c64338PMw = new C64338PMw();
                linkedList.add(c64338PMw);
                c64338PMw.LIZIZ = CastIntegerProtector.parseInt(matcher.group(1));
                if (matcher.group(2).length() == 0) {
                    c64338PMw.LIZIZ--;
                    c64338PMw.LIZLLL = 1;
                } else if (matcher.group(2).equals(CardStruct.IStatusCode.DEFAULT)) {
                    c64338PMw.LIZLLL = 0;
                } else {
                    c64338PMw.LIZIZ--;
                    c64338PMw.LIZLLL = CastIntegerProtector.parseInt(matcher.group(2));
                }
                c64338PMw.LIZJ = CastIntegerProtector.parseInt(matcher.group(3));
                if (matcher.group(4).length() == 0) {
                    c64338PMw.LIZJ--;
                    c64338PMw.LJ = 1;
                } else if (matcher.group(4).equals(CardStruct.IStatusCode.DEFAULT)) {
                    c64338PMw.LJ = 0;
                } else {
                    c64338PMw.LIZJ--;
                    c64338PMw.LJ = CastIntegerProtector.parseInt(matcher.group(4));
                }
                linkedList2.removeFirst();
                while (true) {
                    if (!linkedList2.isEmpty()) {
                        try {
                            charAt = ((String) linkedList2.getFirst()).charAt(0);
                            replace = ((String) linkedList2.getFirst()).substring(1).replace("+", "%2B");
                        } catch (IndexOutOfBoundsException unused) {
                            linkedList2.removeFirst();
                        }
                        try {
                            String decode = URLDecoder.decode(replace, "UTF-8");
                            if (charAt != '-') {
                                if (charAt == '+') {
                                    c64338PMw.LIZ.add(new C64339PMx(EnumC64341PMz.INSERT, decode));
                                } else if (charAt == ' ') {
                                    c64338PMw.LIZ.add(new C64339PMx(EnumC64341PMz.EQUAL, decode));
                                } else if (charAt != '@') {
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("Invalid patch mode '");
                                    LIZ.append(charAt);
                                    LIZ.append("' in: ");
                                    LIZ.append(decode);
                                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                                }
                            } else {
                                c64338PMw.LIZ.add(new C64339PMx(EnumC64341PMz.DELETE, decode));
                            }
                            linkedList2.removeFirst();
                        } catch (UnsupportedEncodingException e) {
                            throw new Error("This system does not support UTF-8.", e);
                        } catch (IllegalArgumentException e2) {
                            throw new IllegalArgumentException(i0.LJFF("Illegal escape in patch_fromText: ", replace), e2);
                        }
                    }
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Invalid patch string: ");
                LIZ2.append((String) linkedList2.getFirst());
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
            }
        }
        return linkedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb A[LOOP:0: B:10:0x0029->B:44:0x00eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.util.LinkedList<X.C64339PMx> r16) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64337PMv.LIZLLL(java.util.LinkedList):void");
    }

    public static int LJFF(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        for (int i = 0; i < min; i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                return i;
            }
        }
        return min;
    }

    public static int LJI(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int min = Math.min(length, length2);
        for (int i = 1; i <= min; i++) {
            if (str.charAt(length - i) != str2.charAt(length2 - i)) {
                return i - 1;
            }
        }
        return min;
    }

    public static int LJIIJJI(int i, List list) {
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C64339PMx c64339PMx = (C64339PMx) it.next();
            if (c64339PMx.LIZ != EnumC64341PMz.INSERT) {
                i2 = c64339PMx.LIZIZ.length() + i2;
            }
            if (c64339PMx.LIZ != EnumC64341PMz.DELETE) {
                i3 = c64339PMx.LIZIZ.length() + i3;
            }
            if (i2 > i) {
                if (c64339PMx.LIZ == EnumC64341PMz.DELETE) {
                    return i5;
                }
            } else {
                i4 = i2;
                i5 = i3;
            }
        }
        return (i - i4) + i5;
    }

    public final int LJ(String str, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (str.length() == 0 || str2.length() == 0) {
            return 6;
        }
        char charAt = str.charAt(str.length() - 1);
        char charAt2 = str2.charAt(0);
        boolean z7 = !Character.isLetterOrDigit(charAt);
        boolean z8 = !Character.isLetterOrDigit(charAt2);
        if (z7 && Character.isWhitespace(charAt)) {
            z = true;
        } else {
            z = false;
        }
        if (z8 && Character.isWhitespace(charAt2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && Character.getType(charAt) == 15) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && Character.getType(charAt2) == 15) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && this.LJI.matcher(str).find()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4 && this.LJII.matcher(str2).find()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 || z6) {
            return 5;
        }
        if (z3 || z4) {
            return 4;
        }
        if (z7) {
            if (!z) {
                if (z2) {
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            if (z || z2) {
                return 2;
            }
            if (!z7 && !z8) {
                return 0;
            }
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x03e1, code lost:
    
        if (r8 < r1) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object[] LJIILJJIL(java.util.LinkedList<X.C64338PMw> r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 1373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64337PMv.LJIILJJIL(java.util.LinkedList, java.lang.String):java.lang.Object[]");
    }

    public static String[] LJII(int i, String str, String str2) {
        String substring = str.substring(i, (str.length() / 4) + i);
        String str3 = "";
        int i2 = -1;
        String str4 = "";
        String str5 = "";
        String str6 = "";
        String str7 = "";
        int i3 = -1;
        while (true) {
            i3 = str2.indexOf(substring, i3 + 1);
            if (i3 == i2) {
                break;
            }
            int LJFF = LJFF(str.substring(i), str2.substring(i3));
            int LJI = LJI(str.substring(0, i), str2.substring(0, i3));
            if (str3.length() < LJI + LJFF) {
                StringBuilder LIZ = X1D.LIZ();
                int i4 = i3 - LJI;
                LIZ.append(str2.substring(i4, i3));
                int i5 = i3 + LJFF;
                LIZ.append(str2.substring(i3, i5));
                str3 = X1D.LIZIZ(LIZ);
                str4 = str.substring(0, i - LJI);
                str5 = str.substring(i + LJFF);
                str6 = str2.substring(0, i4);
                str7 = str2.substring(i5);
            }
            i2 = -1;
        }
        if (str3.length() * 2 >= str.length()) {
            return new String[]{str4, str5, str6, str7, str3};
        }
        return null;
    }

    public final LinkedList LIZ(long j, String str, String str2) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int length = str.length();
        int length2 = str2.length();
        int i7 = ((length + length2) + 1) / 2;
        int i8 = i7 * 2;
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i9] = -1;
            iArr2[i9] = -1;
        }
        int i10 = i7 + 1;
        iArr[i10] = 0;
        iArr2[i10] = 0;
        int i11 = length - length2;
        if (i11 % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i7 && System.currentTimeMillis() <= j; i16++) {
            int i17 = -i16;
            for (int i18 = i17 + i12; i18 <= i16 - i14; i18 += 2) {
                int i19 = i7 + i18;
                if (i18 == i17 || (i18 != i16 && iArr[i19 - 1] < iArr[i19 + 1])) {
                    i4 = iArr[i19 + 1];
                } else {
                    i4 = iArr[i19 - 1] + 1;
                }
                int i20 = i4 - i18;
                while (i4 < length && i20 < length2 && str.charAt(i4) == str2.charAt(i20)) {
                    i4++;
                    i20++;
                }
                iArr[i19] = i4;
                if (i4 > length) {
                    i14 += 2;
                } else if (i20 > length2) {
                    i12 += 2;
                } else if (z && (i5 = (i7 + i11) - i18) >= 0 && i5 < i8 && (i6 = iArr2[i5]) != -1 && i4 >= length - i6) {
                    return LIZIZ(i4, j, str, i20, str2);
                }
            }
            for (int i21 = i17 + i13; i21 <= i16 - i15; i21 += 2) {
                int i22 = i7 + i21;
                if (i21 == i17 || (i21 != i16 && iArr2[i22 - 1] < iArr2[i22 + 1])) {
                    i = iArr2[i22 + 1];
                } else {
                    i = iArr2[i22 - 1] + 1;
                }
                int i23 = i - i21;
                while (i < length && i23 < length2 && str.charAt((length - i) - 1) == str2.charAt((length2 - i23) - 1)) {
                    i++;
                    i23++;
                }
                iArr2[i22] = i;
                if (i > length) {
                    i15 += 2;
                } else if (i23 > length2) {
                    i13 += 2;
                } else if (!z && (i2 = (i7 + i11) - i21) >= 0 && i2 < i8 && (i3 = iArr[i2]) != -1) {
                    int i24 = (i7 + i3) - i2;
                    if (i3 >= length - i) {
                        return LIZIZ(i3, j, str, i24, str2);
                    }
                }
            }
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C64339PMx(EnumC64341PMz.DELETE, str));
        linkedList.add(new C64339PMx(EnumC64341PMz.INSERT, str2));
        return linkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x015f, code lost:
    
        if (r9 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016e, code lost:
    
        if (r10 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ba, code lost:
    
        if (r10[4].length() > r9[4].length()) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedList LJIIIIZZ(long r14, java.lang.String r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64337PMv.LJIIIIZZ(long, java.lang.String, java.lang.String):java.util.LinkedList");
    }

    public final int LJIILIIL(int i, String str, String str2) {
        int i2;
        int i3;
        if (str != null && str2 != null) {
            int i4 = 0;
            int max = Math.max(0, Math.min(i, str.length()));
            if (str.equals(str2)) {
                return 0;
            }
            if (str.length() == 0) {
                return -1;
            }
            if (str2.length() + max <= str.length() && str.substring(max, str2.length() + max).equals(str2)) {
                return max;
            }
            HashMap hashMap = new HashMap();
            char[] charArray = str2.toCharArray();
            for (char c : charArray) {
                hashMap.put(Character.valueOf(c), 0);
            }
            int length = charArray.length;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i2 = 1;
                if (i5 >= length) {
                    break;
                }
                char c2 = charArray[i5];
                hashMap.put(Character.valueOf(c2), Integer.valueOf(((Integer) hashMap.get(Character.valueOf(c2))).intValue() | (1 << ((str2.length() - i6) - 1))));
                i6++;
                i5++;
            }
            double d = this.LIZIZ;
            int indexOf = str.indexOf(str2, max);
            if (indexOf != -1) {
                d = Math.min(LJIIL(0, indexOf, max, str2), d);
                int lastIndexOf = str.lastIndexOf(str2, str2.length() + max);
                if (lastIndexOf != -1) {
                    d = Math.min(LJIIL(0, lastIndexOf, max, str2), d);
                }
            }
            int length2 = 1 << (str2.length() - 1);
            int length3 = str.length() + str2.length();
            int[] iArr = new int[0];
            int i7 = 0;
            int i8 = -1;
            while (i7 < str2.length()) {
                int i9 = length3;
                while (i4 < length3) {
                    if (LJIIL(i7, max + length3, max, str2) <= d) {
                        i4 = length3;
                    } else {
                        i9 = length3;
                    }
                    length3 = AnonymousClass030.LIZJ(i9, i4, 2, i4);
                }
                int max2 = Math.max(i2, (max - length3) + 1);
                int length4 = str2.length() + Math.min(max + length3, str.length());
                int[] iArr2 = new int[length4 + 2];
                iArr2[length4 + 1] = (i2 << i7) - 1;
                while (true) {
                    if (length4 < max2) {
                        break;
                    }
                    int i10 = length4 - 1;
                    if (str.length() <= i10 || !hashMap.containsKey(Character.valueOf(str.charAt(i10)))) {
                        i3 = 0;
                    } else {
                        i3 = ((Integer) hashMap.get(Character.valueOf(str.charAt(i10)))).intValue();
                    }
                    if (i7 == 0) {
                        iArr2[length4] = ((iArr2[length4 + 1] << 1) | 1) & i3;
                    } else {
                        int i11 = length4 + 1;
                        int i12 = ((iArr2[i11] << 1) | 1) & i3;
                        int i13 = iArr[i11];
                        iArr2[length4] = i12 | ((iArr[length4] | i13) << 1) | 1 | i13;
                    }
                    if ((iArr2[length4] & length2) != 0) {
                        double LJIIL = LJIIL(i7, i10, max, str2);
                        if (LJIIL > d) {
                            continue;
                        } else if (i10 > max) {
                            max2 = Math.max(1, (max * 2) - i10);
                            i8 = i10;
                            d = LJIIL;
                        } else {
                            i8 = i10;
                            d = LJIIL;
                            i2 = 1;
                            break;
                        }
                    }
                    i2 = 1;
                    length4 = i10;
                }
                i7++;
                if (LJIIL(i7, max, max, str2) > d) {
                    break;
                }
                i4 = 0;
                iArr = iArr2;
            }
            return i8;
        }
        throw new IllegalArgumentException("Null inputs. (match_main)");
    }

    public final double LJIIL(int i, int i2, int i3, String str) {
        float length = i / str.length();
        int abs = Math.abs(i3 - i2);
        if (this.LIZJ == 0) {
            if (abs == 0) {
                return length;
            }
            return 1.0d;
        }
        return (abs / r0) + length;
    }

    public final LinkedList LIZIZ(int i, long j, String str, int i2, String str2) {
        String substring = str.substring(0, i);
        String substring2 = str2.substring(0, i2);
        String substring3 = str.substring(i);
        String substring4 = str2.substring(i2);
        LinkedList LJIIIIZZ2 = LJIIIIZZ(j, substring, substring2);
        LJIIIIZZ2.addAll(LJIIIIZZ(j, substring3, substring4));
        return LJIIIIZZ2;
    }
}
