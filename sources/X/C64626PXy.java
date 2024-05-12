package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.PXy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64626PXy {
    public static final char[] LJIIIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final List<String> LJFF;
    public final List<String> LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final String LJ() {
        if (this.LIZJ.isEmpty()) {
            return "";
        }
        return this.LJIIIIZZ.substring(this.LJIIIIZZ.indexOf(58, this.LIZ.length() + 3) + 1, this.LJIIIIZZ.indexOf(64));
    }

    public final String LJFF() {
        int indexOf = this.LJIIIIZZ.indexOf(47, this.LIZ.length() + 3);
        String str = this.LJIIIIZZ;
        return this.LJIIIIZZ.substring(indexOf, PVA.LJIIIIZZ(indexOf, str.length(), str, "?#"));
    }

    public final List<String> LJI() {
        int indexOf = this.LJIIIIZZ.indexOf(47, this.LIZ.length() + 3);
        String str = this.LJIIIIZZ;
        int LJIIIIZZ = PVA.LJIIIIZZ(indexOf, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < LJIIIIZZ) {
            int i = indexOf + 1;
            indexOf = PVA.LJIIIZ(this.LJIIIIZZ, i, LJIIIIZZ, '/');
            arrayList.add(this.LJIIIIZZ.substring(i, indexOf));
        }
        return arrayList;
    }

    public final String LJII() {
        if (this.LJI == null) {
            return null;
        }
        int indexOf = this.LJIIIIZZ.indexOf(63) + 1;
        String str = this.LJIIIIZZ;
        return this.LJIIIIZZ.substring(indexOf, PVA.LJIIIZ(str, indexOf, str.length(), '#'));
    }

    public final String LJIIIIZZ() {
        if (this.LIZIZ.isEmpty()) {
            return "";
        }
        int length = this.LIZ.length() + 3;
        String str = this.LJIIIIZZ;
        return this.LJIIIIZZ.substring(length, PVA.LJIIIIZZ(length, str.length(), str, ":@"));
    }

    public final C64627PXz LJIIJ() {
        int i;
        List<String> list;
        C64627PXz c64627PXz = new C64627PXz();
        c64627PXz.LIZ = this.LIZ;
        c64627PXz.LIZIZ = LJIIIIZZ();
        c64627PXz.LIZJ = LJ();
        c64627PXz.LIZLLL = this.LIZLLL;
        if (this.LJ != LIZLLL(this.LIZ)) {
            i = this.LJ;
        } else {
            i = -1;
        }
        c64627PXz.LJ = i;
        ((ArrayList) c64627PXz.LJFF).clear();
        ((ArrayList) c64627PXz.LJFF).addAll(LJI());
        String LJII = LJII();
        String str = null;
        if (LJII != null) {
            list = LJIJ(LIZIZ(LJII, " \"'<>#", true, false, true, true));
        } else {
            list = null;
        }
        c64627PXz.LJI = list;
        if (this.LJII != null) {
            str = this.LJIIIIZZ.substring(this.LJIIIIZZ.indexOf(35) + 1);
        }
        c64627PXz.LJII = str;
        return c64627PXz;
    }

    public final java.util.Set<String> LJIILLIIL() {
        if (this.LJI == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.LJI.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(ListProtector.get(this.LJI, i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public final String LJIJI() {
        C64627PXz c64627PXz;
        try {
            c64627PXz = new C64627PXz();
            c64627PXz.LJ(this, "/...");
        } catch (IllegalArgumentException unused) {
            c64627PXz = null;
        }
        c64627PXz.getClass();
        c64627PXz.LIZIZ = LIZIZ("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        c64627PXz.LIZJ = LIZIZ("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return c64627PXz.LIZJ().LJIIIIZZ;
    }

    public final java.net.URL LJIJJLI() {
        try {
            return new java.net.URL(this.LJIIIIZZ);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        return this.LJIIIIZZ.hashCode();
    }

    public final java.net.URI LJIJJ() {
        C64627PXz LJIIJ = LJIIJ();
        int size = ((ArrayList) LJIIJ.LJFF).size();
        for (int i = 0; i < size; i++) {
            ListProtector.set(LJIIJ.LJFF, i, LIZIZ((String) ListProtector.get(LJIIJ.LJFF, i), "[]", true, true, false, true));
        }
        List<String> list = LJIIJ.LJI;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = (String) ListProtector.get(LJIIJ.LJI, i2);
                if (str != null) {
                    ListProtector.set(LJIIJ.LJI, i2, LIZIZ(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = LJIIJ.LJII;
        if (str2 != null) {
            LJIIJ.LJII = LIZIZ(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String c64627PXz = LJIIJ.toString();
        try {
            return new java.net.URI(c64627PXz);
        } catch (URISyntaxException e) {
            try {
                return java.net.URI.create(c64627PXz.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String toString() {
        return this.LJIIIIZZ;
    }

    public C64626PXy(C64627PXz c64627PXz) {
        List<String> list;
        this.LIZ = c64627PXz.LIZ;
        String str = c64627PXz.LIZIZ;
        this.LIZIZ = LJIIL(0, str.length(), str, false);
        String str2 = c64627PXz.LIZJ;
        this.LIZJ = LJIIL(0, str2.length(), str2, false);
        this.LIZLLL = c64627PXz.LIZLLL;
        int i = c64627PXz.LJ;
        this.LJ = i == -1 ? LIZLLL(c64627PXz.LIZ) : i;
        this.LJFF = LJIILIIL(c64627PXz.LJFF, false);
        List<String> list2 = c64627PXz.LJI;
        if (list2 != null) {
            list = LJIILIIL(list2, true);
        } else {
            list = null;
        }
        this.LJI = list;
        String str3 = c64627PXz.LJII;
        this.LJII = str3 != null ? LJIIL(0, str3.length(), str3, false) : null;
        this.LJIIIIZZ = c64627PXz.toString();
    }

    public static int LIZLLL(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    public static C64626PXy LJIIIZ(String str) {
        C64627PXz c64627PXz = new C64627PXz();
        c64627PXz.LJ(null, str);
        return c64627PXz.LIZJ();
    }

    public static C64626PXy LJIIJJI(String str) {
        try {
            return LJIIIZ(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static List<String> LJIJ(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public final String LJIILL(String str) {
        List<String> list = this.LJI;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(ListProtector.get(this.LJI, i))) {
                return (String) ListProtector.get(this.LJI, i + 1);
            }
        }
        return null;
    }

    public final List<String> LJIIZILJ(String str) {
        if (this.LJI == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.LJI.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(ListProtector.get(this.LJI, i))) {
                arrayList.add(ListProtector.get(this.LJI, i + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C64626PXy) && ((C64626PXy) obj).LJIIIIZZ.equals(this.LJIIIIZZ)) {
            return true;
        }
        return false;
    }

    public static List LJIILIIL(List list, boolean z) {
        String str;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str2 = (String) ListProtector.get(list, i);
            if (str2 != null) {
                str = LJIIL(0, str2.length(), str2, z);
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String LIZJ(String str, boolean z, Charset charset) {
        return LIZ(str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", z, false, true, true, charset);
    }

    public static boolean LJIILJJIL(int i, int i2, String str) {
        int i3 = i + 2;
        if (i3 < i2 && str.charAt(i) == '%' && PVA.LJI(str.charAt(i + 1)) != -1 && PVA.LJI(str.charAt(i3)) != -1) {
            return true;
        }
        return false;
    }

    public static String LJIIL(int i, int i2, String str, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C64533PUj c64533PUj = new C64533PUj();
                c64533PUj.LJJIZ(i, i3, str);
                while (i3 < i2) {
                    int codePointAt = str.codePointAt(i3);
                    if (codePointAt == 37) {
                        int i4 = i3 + 2;
                        if (i4 < i2) {
                            int LJI = PVA.LJI(str.charAt(i3 + 1));
                            int LJI2 = PVA.LJI(str.charAt(i4));
                            if (LJI != -1 && LJI2 != -1) {
                                c64533PUj.LJJIII((LJI << 4) + LJI2);
                                i3 = i4;
                            }
                        }
                        c64533PUj.LJJJIL(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            c64533PUj.LJJIII(32);
                        }
                        c64533PUj.LJJJIL(codePointAt);
                    }
                    i3 += Character.charCount(codePointAt);
                }
                return c64533PUj.LJIILL();
            }
            i3++;
        }
        return str.substring(i, i2);
    }

    public static String LIZIZ(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return LIZ(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0073, code lost:
    
        if (r19 == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3 A[LOOP:2: B:50:0x009d->B:52:0x00a3, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.String r12, int r13, int r14, java.lang.String r15, boolean r16, boolean r17, boolean r18, boolean r19, java.nio.charset.Charset r20) {
        /*
            r6 = r13
        L1:
            if (r6 >= r14) goto Ld1
            int r2 = r12.codePointAt(r6)
            r0 = -1
            r10 = 128(0x80, float:1.8E-43)
            r9 = 127(0x7f, float:1.78E-43)
            r5 = 37
            r4 = 43
            r3 = 32
            if (r2 < r3) goto L36
            if (r2 == r9) goto L36
            if (r2 < r10) goto L1a
            if (r19 != 0) goto L36
        L1a:
            int r1 = r15.indexOf(r2)
            if (r1 != r0) goto L36
            if (r2 != r5) goto L32
            if (r16 == 0) goto L36
            if (r17 == 0) goto L2c
            boolean r1 = LJIILJJIL(r6, r14, r12)
            if (r1 == 0) goto L36
        L2c:
            int r0 = java.lang.Character.charCount(r2)
            int r6 = r6 + r0
            goto L1
        L32:
            if (r2 != r4) goto L2c
            if (r18 == 0) goto L2c
        L36:
            X.PUj r2 = new X.PUj
            r2.<init>()
            r2.LJJIZ(r13, r6, r12)
            r7 = 0
        L3f:
            if (r6 >= r14) goto Lcc
            int r1 = r12.codePointAt(r6)
            if (r16 == 0) goto L5e
            r8 = 9
            if (r1 == r8) goto L57
            r8 = 10
            if (r1 == r8) goto L57
            r8 = 12
            if (r1 == r8) goto L57
            r8 = 13
            if (r1 != r8) goto L5e
        L57:
            int r0 = java.lang.Character.charCount(r1)
            int r6 = r6 + r0
            r0 = -1
            goto L3f
        L5e:
            if (r1 != r4) goto L6d
            if (r18 == 0) goto L75
            if (r16 == 0) goto L6a
            java.lang.String r0 = "+"
        L66:
            r2.LJJJI(r0)
            goto L57
        L6a:
            java.lang.String r0 = "%2B"
            goto L66
        L6d:
            if (r1 < r3) goto L87
            if (r1 == r9) goto L87
            if (r1 < r10) goto L75
            if (r19 != 0) goto L87
        L75:
            int r8 = r15.indexOf(r1)
            if (r8 != r0) goto L87
            if (r1 != r5) goto Lc8
            if (r16 == 0) goto L87
            if (r17 == 0) goto Lc8
            boolean r0 = LJIILJJIL(r6, r14, r12)
            if (r0 != 0) goto Lc8
        L87:
            if (r7 != 0) goto L8e
            X.PUj r7 = new X.PUj
            r7.<init>()
        L8e:
            r8 = r20
            if (r8 == 0) goto L9a
            java.nio.charset.Charset r0 = X.PVA.LJIIIIZZ
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lbf
        L9a:
            r7.LJJJIL(r1)
        L9d:
            boolean r0 = r7.LLJ()
            if (r0 != 0) goto L57
            byte r0 = r7.readByte()
            r8 = r0 & 255(0xff, float:3.57E-43)
            r2.LJJIII(r5)
            char[] r11 = X.C64626PXy.LJIIIZ
            int r0 = r8 >> 4
            r0 = r0 & 15
            char r0 = r11[r0]
            r2.LJJIII(r0)
            r0 = r8 & 15
            char r0 = r11[r0]
            r2.LJJIII(r0)
            goto L9d
        Lbf:
            int r0 = java.lang.Character.charCount(r1)
            int r0 = r0 + r6
            r7.LJJIL(r12, r6, r0, r8)
            goto L9d
        Lc8:
            r2.LJJJIL(r1)
            goto L57
        Lcc:
            java.lang.String r0 = r2.LJIILL()
            return r0
        Ld1:
            java.lang.String r0 = r12.substring(r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64626PXy.LIZ(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
    }
}
