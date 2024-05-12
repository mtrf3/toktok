package X;

import android.graphics.Rect;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes15.dex */
public class W8X implements Closeable {
    public final C81392Vwy<InterfaceC81378Vwk> LJLIL;
    public final W4P<FileInputStream> LJLILLLLZI;
    public C81828W9o LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public C81787W7z LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public Rect LJLLJ;
    public java.util.Map<String, String> LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public int LJZL;

    public W8X() {
        throw null;
    }

    public final synchronized boolean LJIIJ() {
        boolean z;
        if (!C81392Vwy.LJIIJJI(this.LJLIL)) {
            if (this.LJLILLLLZI == null) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public final C81392Vwy<InterfaceC81378Vwk> LIZLLL() {
        return C81392Vwy.LIZJ(this.LJLIL);
    }

    public final InputStream LJFF() {
        W4P<FileInputStream> w4p = this.LJLILLLLZI;
        if (w4p != null) {
            return w4p.get();
        }
        C81392Vwy LIZJ = C81392Vwy.LIZJ(this.LJLIL);
        if (LIZJ != null) {
            try {
                return new C81377Vwj((InterfaceC81378Vwk) LIZJ.LJI());
            } finally {
                C81392Vwy.LJ(LIZJ);
            }
        }
        return null;
    }

    public final int LJI() {
        C81392Vwy<InterfaceC81378Vwk> c81392Vwy = this.LJLIL;
        if (c81392Vwy != null && c81392Vwy.LJI() != null) {
            return this.LJLIL.LJI().size();
        }
        return this.LJLJLLL;
    }

    public final void LJIILIIL() {
        if (this.LJLJJLL < 0 || this.LJLJL < 0) {
            LJIIL();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C81392Vwy.LJ(this.LJLIL);
    }

    public final String LJ() {
        C81392Vwy<InterfaceC81378Vwk> LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            return "";
        }
        int min = Math.min(LJI(), 10);
        byte[] bArr = new byte[min];
        try {
            InterfaceC81378Vwk LJI = LIZLLL.LJI();
            if (LJI == null) {
                return "";
            }
            LJI.read(0, bArr, 0, min);
            LIZLLL.close();
            StringBuilder sb = new StringBuilder(min * 2);
            for (int i = 0; i < min; i++) {
                sb.append(C16880lQ.LLLZ("%02X", new Object[]{Byte.valueOf(bArr[i])}));
            }
            return sb.toString();
        } finally {
            LIZLLL.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x031b, code lost:
    
        if (r0 != 6) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0212, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x007d, code lost:
    
        if ("VP8L".equals(r1) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x007f, code lost:
    
        r8 = X.W91.LIZJ(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x008a, code lost:
    
        if ("VP8X".equals(r1) == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x008c, code lost:
    
        r9.skip(8);
        r8 = new android.util.Pair<>(java.lang.Integer.valueOf(X.W91.LIZLLL(r9) + 1), java.lang.Integer.valueOf(X.W91.LIZLLL(r9) + 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00b3, code lost:
    
        if (r9 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0119, code lost:
    
        if (r12 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        X.W91.LIZ(r9);
        r9.read(r11);
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if ("WEBP".charAt(r8) == r11[r8]) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01d6, code lost:
    
        if (r11 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r8 >= 4) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r9.read(r11);
        r8 = new java.lang.StringBuilder();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        r8.append((char) r11[r1]);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r1 >= 4) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        r1 = r8.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
    
        if ("VP8 ".equals(r1) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        r8 = X.W91.LIZIZ(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        r9.close();
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x025b, code lost:
    
        r0 = X.PUU.LIZ(r9, 2, false) - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0260, code lost:
    
        if (r0 <= 6) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0262, code lost:
    
        r8 = X.PUU.LIZ(r9, 4, false);
        r6 = X.PUU.LIZ(r9, 2, false);
        r1 = (r0 - 4) - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0271, code lost:
    
        if (r8 != 1165519206) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0273, code lost:
    
        if (r6 != 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0275, code lost:
    
        if (r1 != 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0278, code lost:
    
        r0 = X.W9D.LIZ(r9, r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f9 A[Catch: IOException -> 0x031d, TryCatch #23 {IOException -> 0x031d, blocks: (B:90:0x02d3, B:92:0x02d7, B:94:0x02db, B:97:0x02e0, B:99:0x02e4, B:101:0x02e8, B:103:0x02ec, B:105:0x02f0, B:108:0x02f5, B:110:0x02f9, B:114:0x0307, B:116:0x030b), top: B:89:0x02d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0307 A[Catch: IOException -> 0x031d, TryCatch #23 {IOException -> 0x031d, blocks: (B:90:0x02d3, B:92:0x02d7, B:94:0x02db, B:97:0x02e0, B:99:0x02e4, B:101:0x02e8, B:103:0x02ec, B:105:0x02f0, B:108:0x02f5, B:110:0x02f9, B:114:0x0307, B:116:0x030b), top: B:89:0x02d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d7 A[Catch: IOException -> 0x031d, TryCatch #23 {IOException -> 0x031d, blocks: (B:90:0x02d3, B:92:0x02d7, B:94:0x02db, B:97:0x02e0, B:99:0x02e4, B:101:0x02e8, B:103:0x02ec, B:105:0x02f0, B:108:0x02f5, B:110:0x02f9, B:114:0x0307, B:116:0x030b), top: B:89:0x02d3 }] */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL() {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W8X.LJIIL():void");
    }

    public W8X(C81392Vwy<InterfaceC81378Vwk> c81392Vwy) {
        this.LJLJI = C81828W9o.LIZIZ;
        this.LJLJJI = -1;
        this.LJLJJLL = -1;
        this.LJLJL = -1;
        this.LJLJLJ = 1;
        this.LJLJLLL = -1;
        this.LJLLI = true;
        C32151Nz.LJI(C81392Vwy.LJIIJJI(c81392Vwy));
        InterfaceC81378Vwk LJI = c81392Vwy.LJI();
        if (LJI instanceof C81379Vwl) {
            this.LJLIL = c81392Vwy.clone();
            C81379Vwl c81379Vwl = (C81379Vwl) LJI;
            this.LJLLL = c81379Vwl.LJLILLLLZI;
            if (c81379Vwl.LJLJI) {
                this.LJLZ = true;
                this.LJLLLLLL = false;
                this.LJLLLL = false;
                c81379Vwl.LJLJI = false;
            }
        } else {
            this.LJLIL = C81392Vwy.LJIIL(new C81379Vwl(c81392Vwy.clone()));
        }
        this.LJLILLLLZI = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r2 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.W8X LIZ(X.W8X r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L11
            X.W4P<java.io.FileInputStream> r1 = r3.LJLILLLLZI
            if (r1 == 0) goto L12
            X.W8X r2 = new X.W8X
            int r0 = r3.LJLJLLL
            r2.<init>(r1, r0)
        Le:
            r2.LIZJ(r3)
        L11:
            return r2
        L12:
            X.Vwy<X.Vwk> r0 = r3.LJLIL
            X.Vwy r1 = X.C81392Vwy.LIZJ(r0)
            if (r1 != 0) goto L20
        L1a:
            X.C81392Vwy.LJ(r1)
            if (r2 == 0) goto L11
            goto Le
        L20:
            X.W8X r2 = new X.W8X     // Catch: java.lang.Throwable -> L26
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L26
            goto L1a
        L26:
            r0 = move-exception
            X.C81392Vwy.LJ(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W8X.LIZ(X.W8X):X.W8X");
    }

    public static void LIZIZ(W8X w8x) {
        if (w8x != null) {
            w8x.close();
        }
    }

    public static boolean LJIIJJI(W8X w8x) {
        if (w8x != null && w8x.LJIIJ()) {
            return true;
        }
        return false;
    }

    public final void LIZJ(W8X w8x) {
        w8x.LJIILIIL();
        this.LJLJI = w8x.LJLJI;
        w8x.LJIILIIL();
        this.LJLJJLL = w8x.LJLJJLL;
        w8x.LJIILIIL();
        this.LJLJL = w8x.LJLJL;
        w8x.LJIILIIL();
        this.LJLJJI = w8x.LJLJJI;
        w8x.LJIILIIL();
        this.LJLJJL = w8x.LJLJJL;
        this.LJLJLJ = w8x.LJLJLJ;
        this.LJLJLLL = w8x.LJI();
        this.LJLL = w8x.LJLL;
        w8x.LJIILIIL();
        this.LJLLI = w8x.LJLLI;
        this.LJLLILLLL = w8x.LJLLILLLL;
        this.LJLLJ = w8x.LJLLJ;
        this.LJLLL = w8x.LJLLL;
        this.LJLLLL = w8x.LJLLLL;
        this.LJLLLLLL = w8x.LJLLLLLL;
        this.LJLZ = w8x.LJLZ;
    }

    public W8X(W4P<FileInputStream> w4p, int i) {
        this.LJLJI = C81828W9o.LIZIZ;
        this.LJLJJI = -1;
        this.LJLJJLL = -1;
        this.LJLJL = -1;
        this.LJLJLJ = 1;
        this.LJLJLLL = -1;
        this.LJLLI = true;
        w4p.getClass();
        this.LJLIL = null;
        this.LJLILLLLZI = w4p;
        this.LJLJLLL = i;
    }
}
