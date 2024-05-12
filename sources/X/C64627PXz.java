package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.PXz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64627PXz {
    public String LIZ;
    public String LIZLLL;
    public final List<String> LJFF;
    public List<String> LJI;
    public String LJII;
    public String LIZIZ = "";
    public String LIZJ = "";
    public int LJ = -1;

    public final C64626PXy LIZJ() {
        if (this.LIZ != null) {
            if (this.LIZLLL != null) {
                return new C64626PXy(this);
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r7.LIZ != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0092, code lost:
    
        if (r1 != (-1)) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r7.LIZ
            if (r0 == 0) goto L9b
            r5.append(r0)
            java.lang.String r0 = "://"
            r5.append(r0)
        L11:
            java.lang.String r0 = r7.LIZIZ
            boolean r0 = r0.isEmpty()
            r3 = 58
            if (r0 == 0) goto L23
            java.lang.String r0 = r7.LIZJ
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3d
        L23:
            java.lang.String r0 = r7.LIZIZ
            r5.append(r0)
            java.lang.String r0 = r7.LIZJ
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L38
            r5.append(r3)
            java.lang.String r0 = r7.LIZJ
            r5.append(r0)
        L38:
            r0 = 64
            r5.append(r0)
        L3d:
            java.lang.String r0 = r7.LIZLLL
            r2 = -1
            if (r0 == 0) goto L57
            int r0 = r0.indexOf(r3)
            if (r0 == r2) goto L95
            r0 = 91
            r5.append(r0)
            java.lang.String r0 = r7.LIZLLL
            r5.append(r0)
            r0 = 93
            r5.append(r0)
        L57:
            int r1 = r7.LJ
            if (r1 != r2) goto L92
            java.lang.String r0 = r7.LIZ
            if (r0 == 0) goto L75
        L5f:
            java.lang.String r0 = r7.LIZ
            int r1 = X.C64626PXy.LIZLLL(r0)
        L65:
            java.lang.String r0 = r7.LIZ
            if (r0 == 0) goto L6f
            int r0 = X.C64626PXy.LIZLLL(r0)
            if (r1 == r0) goto L75
        L6f:
            r5.append(r3)
            r5.append(r1)
        L75:
            java.util.List<java.lang.String> r3 = r7.LJFF
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r2 = r3.size()
            r6 = 0
            r1 = 0
        L7f:
            if (r1 >= r2) goto La2
            r0 = 47
            r5.append(r0)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            java.lang.String r0 = (java.lang.String) r0
            r5.append(r0)
            int r1 = r1 + 1
            goto L7f
        L92:
            if (r1 == r2) goto L5f
            goto L65
        L95:
            java.lang.String r0 = r7.LIZLLL
            r5.append(r0)
            goto L57
        L9b:
            java.lang.String r0 = "//"
            r5.append(r0)
            goto L11
        La2:
            java.util.List<java.lang.String> r0 = r7.LJI
            if (r0 == 0) goto Ld8
            r0 = 63
            r5.append(r0)
            java.util.List<java.lang.String> r4 = r7.LJI
            int r3 = r4.size()
        Lb1:
            if (r6 >= r3) goto Ld8
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r6)
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r6 + 1
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r6 <= 0) goto Lc8
            r0 = 38
            r5.append(r0)
        Lc8:
            r5.append(r2)
            if (r1 == 0) goto Ld5
            r0 = 61
            r5.append(r0)
            r5.append(r1)
        Ld5:
            int r6 = r6 + 2
            goto Lb1
        Ld8:
            java.lang.String r0 = r7.LJII
            if (r0 == 0) goto Le6
            r0 = 35
            r5.append(r0)
            java.lang.String r0 = r7.LJII
            r5.append(r0)
        Le6:
            java.lang.String r0 = r5.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64627PXz.toString():java.lang.String");
    }

    public C64627PXz() {
        ArrayList arrayList = new ArrayList();
        this.LJFF = arrayList;
        arrayList.add("");
    }

    public final void LIZLLL(String str) {
        if (str != null) {
            String LIZJ = PVA.LIZJ(C64626PXy.LJIIL(0, str.length(), str, false));
            if (LIZJ != null) {
                this.LIZLLL = LIZJ;
                return;
            }
            throw new IllegalArgumentException(i0.LJFF("unexpected host: ", str));
        }
        throw new NullPointerException("host == null");
    }

    public final void LJFF(String str) {
        if (str != null) {
            if (this.LJI == null) {
                return;
            }
            String LIZIZ = C64626PXy.LIZIZ(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
            int size = this.LJI.size();
            while (true) {
                size -= 2;
                if (size >= 0) {
                    if (LIZIZ.equals(ListProtector.get(this.LJI, size))) {
                        ListProtector.remove(this.LJI, size + 1);
                        ListProtector.remove(this.LJI, size);
                        if (this.LJI.isEmpty()) {
                            this.LJI = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new NullPointerException("name == null");
        }
    }

    public final void LJII(String str) {
        if (str != null) {
            if (str.equalsIgnoreCase("http")) {
                this.LIZ = "http";
                return;
            } else {
                if (str.equalsIgnoreCase("https")) {
                    this.LIZ = "https";
                    return;
                }
                throw new IllegalArgumentException(i0.LJFF("unexpected scheme: ", str));
            }
        }
        throw new NullPointerException("scheme == null");
    }

    public final void LIZ(String str, String str2) {
        String str3;
        if (str != null) {
            if (this.LJI == null) {
                this.LJI = new ArrayList();
            }
            this.LJI.add(C64626PXy.LIZIZ(str, " \"'<>#&=", true, false, true, true));
            List<String> list = this.LJI;
            if (str2 != null) {
                str3 = C64626PXy.LIZIZ(str2, " \"'<>#&=", true, false, true, true);
            } else {
                str3 = null;
            }
            list.add(str3);
            return;
        }
        throw new NullPointerException("encodedName == null");
    }

    public final void LIZIZ(String str, String str2) {
        String str3;
        if (str != null) {
            if (this.LJI == null) {
                this.LJI = new ArrayList();
            }
            this.LJI.add(C64626PXy.LIZIZ(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            List<String> list = this.LJI;
            if (str2 != null) {
                str3 = C64626PXy.LIZIZ(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
            } else {
                str3 = null;
            }
            list.add(str3);
            return;
        }
        throw new NullPointerException("name == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x006b, code lost:
    
        if (r8 != ':') goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x006d, code lost:
    
        if (r3 == (-1)) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x007a, code lost:
    
        if (r13.regionMatches(true, r14, "https:", 0, 6) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x007c, code lost:
    
        r24.LIZ = "https";
        r14 = r14 + 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x009c, code lost:
    
        if (r13.regionMatches(true, r14, "http:", 0, 5) == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x009e, code lost:
    
        r24.LIZ = "http";
        r14 = r14 + 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x029c, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("Expected URL scheme 'http' or 'https' but was '");
        r1.append(r13.substring(0, r3));
        r1.append("'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02ba, code lost:
    
        throw new java.lang.IllegalArgumentException(X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C64626PXy r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64627PXz.LJ(X.PXy, java.lang.String):void");
    }

    public final void LJIIIIZZ(String str, String str2) {
        LJFF(str);
        LIZIZ(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0028, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004e, code lost:
    
        if (r5 != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c9 -> B:32:0x0026). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x004e -> B:30:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x004e -> B:32:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(int r16, int r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64627PXz.LJI(int, int, java.lang.String):void");
    }
}
