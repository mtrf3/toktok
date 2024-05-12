package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;

/* renamed from: X.PlN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65385PlN implements Closeable {
    public static final char[] LJLLLLLL = ")]}'\n".toCharArray();
    public final Reader LJLIL;
    public boolean LJLILLLLZI;
    public final char[] LJLJI = new char[1024];
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public long LJLJLLL;
    public int LJLL;
    public String LJLLI;
    public int[] LJLLILLLL;
    public int LJLLJ;
    public String[] LJLLL;
    public int[] LJLLLL;

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0058, code lost:
    
        LIZJ();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJIJIIJIL() {
        /*
            r6 = this;
            r2 = 0
            r3 = 0
        L2:
            r4 = 0
        L3:
            int r5 = r6.LJLJJI
            int r1 = r5 + r4
            int r0 = r6.LJLJJL
            if (r1 >= r0) goto L4a
            char[] r0 = r6.LJLJI
            int r5 = r5 + r4
            char r1 = r0[r5]
            r0 = 9
            if (r1 == r0) goto L5b
            r0 = 10
            if (r1 == r0) goto L5b
            r0 = 12
            if (r1 == r0) goto L5b
            r0 = 13
            if (r1 == r0) goto L5b
            r0 = 32
            if (r1 == r0) goto L5b
            r0 = 35
            if (r1 == r0) goto L58
            r0 = 44
            if (r1 == r0) goto L5b
            r0 = 47
            if (r1 == r0) goto L58
            r0 = 61
            if (r1 == r0) goto L58
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L5b
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L5b
            r0 = 58
            if (r1 == r0) goto L5b
            r0 = 59
            if (r1 == r0) goto L58
            switch(r1) {
                case 91: goto L5b;
                case 92: goto L58;
                case 93: goto L5b;
                default: goto L47;
            }
        L47:
            int r4 = r4 + 1
            goto L3
        L4a:
            char[] r0 = r6.LJLJI
            int r0 = r0.length
            if (r4 >= r0) goto L68
            int r0 = r4 + 1
            boolean r0 = r6.LJI(r0)
            if (r0 == 0) goto L5b
            goto L3
        L58:
            r6.LIZJ()
        L5b:
            r3 = r4
            if (r2 != 0) goto L88
            java.lang.String r2 = new java.lang.String
            char[] r1 = r6.LJLJI
            int r0 = r6.LJLJJI
            r2.<init>(r1, r0, r3)
            goto L93
        L68:
            if (r2 != 0) goto L75
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r0 = 16
            int r0 = java.lang.Math.max(r4, r0)
            r2.<init>(r0)
        L75:
            char[] r1 = r6.LJLJI
            int r0 = r6.LJLJJI
            r2.append(r1, r0, r4)
            int r0 = r6.LJLJJI
            int r0 = r0 + r4
            r6.LJLJJI = r0
            r0 = 1
            boolean r0 = r6.LJI(r0)
            if (r0 != 0) goto L2
        L88:
            char[] r1 = r6.LJLJI
            int r0 = r6.LJLJJI
            r2.append(r1, r0, r3)
            java.lang.String r2 = r2.toString()
        L93:
            int r0 = r6.LJLJJI
            int r0 = r0 + r3
            r6.LJLJJI = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65385PlN.LJJIJIIJIL():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x009b, code lost:
    
        LIZJ();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x008b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJJJ() {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65385PlN.LJJJJ():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.LJLJLJ = 0;
        this.LJLLILLLL[0] = 8;
        this.LJLLJ = 1;
        this.LJLIL.close();
    }

    static {
        AbstractC38911fr.LJLIL = new C65387PlP();
    }

    public void LIZ() {
        int i = this.LJLJLJ;
        if (i == 0) {
            i = LIZLLL();
        }
        if (i == 3) {
            LJJIL(1);
            this.LJLLLL[this.LJLLJ - 1] = 0;
            this.LJLJLJ = 0;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Expected BEGIN_ARRAY but was ");
            LIZ.append(LJJIJIL());
            LIZ.append(LJIILIIL());
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
    }

    public void LIZIZ() {
        int i = this.LJLJLJ;
        if (i == 0) {
            i = LIZLLL();
        }
        if (i == 1) {
            LJJIL(3);
            this.LJLJLJ = 0;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Expected BEGIN_OBJECT but was ");
            LIZ.append(LJJIJIL());
            LIZ.append(LJIILIIL());
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
    }

    public final void LIZJ() {
        if (this.LJLILLLLZI) {
            return;
        }
        LJJJJI("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00c0, code lost:
    
        if (LJIIL(r8) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        if (r6 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        if (r16 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r1 != Long.MIN_VALUE) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        if (r17 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        if (r1 != r14) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        if (r17 != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        r1 = -r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d5, code lost:
    
        r18.LJLJLLL = r1;
        r18.LJLJJI += r10;
        r18.LJLJLJ = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e1, code lost:
    
        if (r17 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ec, code lost:
    
        r18.LJLL = r10;
        r18.LJLJLJ = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
    
        if (r6 == 2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e7, code lost:
    
        if (r6 == 4) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ea, code lost:
    
        if (r6 != 7) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZLLL() {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65385PlN.LIZLLL():int");
    }

    public void LJ() {
        int i = this.LJLJLJ;
        if (i == 0) {
            i = LIZLLL();
        }
        if (i == 4) {
            int i2 = this.LJLLJ - 1;
            this.LJLLJ = i2;
            int[] iArr = this.LJLLLL;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.LJLJLJ = 0;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected END_ARRAY but was ");
        LIZ.append(LJJIJIL());
        LIZ.append(LJIILIIL());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public void LJFF() {
        int i = this.LJLJLJ;
        if (i == 0) {
            i = LIZLLL();
        }
        if (i == 2) {
            int i2 = this.LJLLJ - 1;
            this.LJLLJ = i2;
            this.LJLLL[i2] = null;
            int[] iArr = this.LJLLLL;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.LJLJLJ = 0;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected END_OBJECT but was ");
        LIZ.append(LJJIJIL());
        LIZ.append(LJIILIIL());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public String LJIIJ() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.LJLLJ;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.LJLLILLLL[i2];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb.append('.');
                    String str = this.LJLLL[i2];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(this.LJLLLL[i2]);
                sb.append(']');
            }
        }
        return sb.toString();
    }

    public boolean LJIIJJI() {
        int i = this.LJLJLJ;
        if (i == 0) {
            i = LIZLLL();
        }
        if (i != 2 && i != 4) {
            return true;
        }
        return false;
    }

    public final String LJIILIIL() {
        StringBuilder LIZJ = C06460Ne.LIZJ(" at line ", this.LJLJJLL + 1, " column ", (this.LJLJJI - this.LJLJL) + 1, " path ");
        LIZJ.append(LJIIJ());
        return X1D.LIZIZ(LIZJ);
    }

    public boolean LJIILL() {
        int i = this.LJLJLJ;
        if (i == 0) {
            i = LIZLLL();
        }
        if (i == 5) {
            this.LJLJLJ = 0;
            int[] iArr = this.LJLLLL;
            int i2 = this.LJLLJ - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.LJLJLJ = 0;
            int[] iArr2 = this.LJLLLL;
            int i3 = this.LJLLJ - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected a boolean but was ");
        LIZ.append(LJJIJIL());
        LIZ.append(LJIILIIL());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public double LJIJ() {
        char c;
        int i = this.LJLJLJ;
        if (i == 0) {
            i = LIZLLL();
        }
        if (i == 15) {
            this.LJLJLJ = 0;
            int[] iArr = this.LJLLLL;
            int i2 = this.LJLLJ - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.LJLJLLL;
        }
        if (i == 16) {
            this.LJLLI = new String(this.LJLJI, this.LJLJJI, this.LJLL);
            this.LJLJJI += this.LJLL;
        } else {
            if (i != 8) {
                if (i == 9) {
                    c = '\"';
                } else if (i == 10) {
                    this.LJLLI = LJJIJIIJIL();
                } else if (i != 11) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Expected a double but was ");
                    LIZ.append(LJJIJIL());
                    LIZ.append(LJIILIIL());
                    throw new IllegalStateException(X1D.LIZIZ(LIZ));
                }
            } else {
                c = '\'';
            }
            this.LJLLI = LJJIIJZLJL(c);
        }
        this.LJLJLJ = 11;
        double parseDouble = Double.parseDouble(this.LJLLI);
        if (this.LJLILLLLZI || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.LJLLI = null;
            this.LJLJLJ = 0;
            int[] iArr2 = this.LJLLLL;
            int i3 = this.LJLLJ - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("JSON forbids NaN and infinities: ");
        LIZ2.append(parseDouble);
        LIZ2.append(LJIILIIL());
        throw new C38302F1m(X1D.LIZIZ(LIZ2));
    }

    public int LJIJI() {
        char c;
        int i = this.LJLJLJ;
        if (i == 0) {
            i = LIZLLL();
        }
        if (i == 15) {
            long j = this.LJLJLLL;
            int i2 = (int) j;
            if (j == i2) {
                this.LJLJLJ = 0;
                int[] iArr = this.LJLLLL;
                int i3 = this.LJLLJ - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Expected an int but was ");
            LIZ.append(this.LJLJLLL);
            LIZ.append(LJIILIIL());
            throw new NumberFormatException(X1D.LIZIZ(LIZ));
        }
        if (i == 16) {
            this.LJLLI = new String(this.LJLJI, this.LJLJJI, this.LJLL);
            this.LJLJJI += this.LJLL;
        } else {
            try {
                if (i != 8) {
                    if (i != 9) {
                        if (i == 10) {
                            this.LJLLI = LJJIJIIJIL();
                            int parseInt = Integer.parseInt(this.LJLLI);
                            this.LJLJLJ = 0;
                            int[] iArr2 = this.LJLLLL;
                            int i4 = this.LJLLJ - 1;
                            iArr2[i4] = iArr2[i4] + 1;
                            return parseInt;
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Expected an int but was ");
                        LIZ2.append(LJJIJIL());
                        LIZ2.append(LJIILIIL());
                        throw new IllegalStateException(X1D.LIZIZ(LIZ2));
                    }
                    c = '\"';
                } else {
                    c = '\'';
                }
                int parseInt2 = Integer.parseInt(this.LJLLI);
                this.LJLJLJ = 0;
                int[] iArr22 = this.LJLLLL;
                int i42 = this.LJLLJ - 1;
                iArr22[i42] = iArr22[i42] + 1;
                return parseInt2;
            } catch (NumberFormatException unused) {
            }
            this.LJLLI = LJJIIJZLJL(c);
        }
        this.LJLJLJ = 11;
        double parseDouble = Double.parseDouble(this.LJLLI);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.LJLLI = null;
            this.LJLJLJ = 0;
            int[] iArr3 = this.LJLLLL;
            int i6 = this.LJLLJ - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Expected an int but was ");
        LIZ3.append(this.LJLLI);
        LIZ3.append(LJIILIIL());
        throw new NumberFormatException(X1D.LIZIZ(LIZ3));
    }

    public long LJIJJ() {
        char c;
        int i = this.LJLJLJ;
        if (i == 0) {
            i = LIZLLL();
        }
        if (i == 15) {
            this.LJLJLJ = 0;
            int[] iArr = this.LJLLLL;
            int i2 = this.LJLLJ - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.LJLJLLL;
        }
        if (i == 16) {
            this.LJLLI = new String(this.LJLJI, this.LJLJJI, this.LJLL);
            this.LJLJJI += this.LJLL;
        } else {
            try {
                if (i != 8) {
                    if (i != 9) {
                        if (i == 10) {
                            this.LJLLI = LJJIJIIJIL();
                            long parseLong = Long.parseLong(this.LJLLI);
                            this.LJLJLJ = 0;
                            int[] iArr2 = this.LJLLLL;
                            int i3 = this.LJLLJ - 1;
                            iArr2[i3] = iArr2[i3] + 1;
                            return parseLong;
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Expected a long but was ");
                        LIZ.append(LJJIJIL());
                        LIZ.append(LJIILIIL());
                        throw new IllegalStateException(X1D.LIZIZ(LIZ));
                    }
                    c = '\"';
                } else {
                    c = '\'';
                }
                long parseLong2 = Long.parseLong(this.LJLLI);
                this.LJLJLJ = 0;
                int[] iArr22 = this.LJLLLL;
                int i32 = this.LJLLJ - 1;
                iArr22[i32] = iArr22[i32] + 1;
                return parseLong2;
            } catch (NumberFormatException unused) {
            }
            this.LJLLI = LJJIIJZLJL(c);
        }
        this.LJLJLJ = 11;
        double parseDouble = Double.parseDouble(this.LJLLI);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.LJLLI = null;
            this.LJLJLJ = 0;
            int[] iArr3 = this.LJLLLL;
            int i4 = this.LJLLJ - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Expected a long but was ");
        LIZ2.append(this.LJLLI);
        LIZ2.append(LJIILIIL());
        throw new NumberFormatException(X1D.LIZIZ(LIZ2));
    }

    public String LJJ() {
        String LJJIIJZLJL;
        int i = this.LJLJLJ;
        if (i == 0) {
            i = LIZLLL();
        }
        if (i == 14) {
            LJJIIJZLJL = LJJIJIIJIL();
        } else if (i == 12) {
            LJJIIJZLJL = LJJIIJZLJL('\'');
        } else if (i == 13) {
            LJJIIJZLJL = LJJIIJZLJL('\"');
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Expected a name but was ");
            LIZ.append(LJJIJIL());
            LIZ.append(LJIILIIL());
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        this.LJLJLJ = 0;
        this.LJLLL[this.LJLLJ - 1] = LJJIIJZLJL;
        return LJJIIJZLJL;
    }

    public void LJJIIJ() {
        int i = this.LJLJLJ;
        if (i == 0) {
            i = LIZLLL();
        }
        if (i == 7) {
            this.LJLJLJ = 0;
            int[] iArr = this.LJLLLL;
            int i2 = this.LJLLJ - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected null but was ");
        LIZ.append(LJJIJIL());
        LIZ.append(LJIILIIL());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public String LJJIIZI() {
        String str;
        int i = this.LJLJLJ;
        if (i == 0) {
            i = LIZLLL();
        }
        if (i == 10) {
            str = LJJIJIIJIL();
        } else if (i == 8) {
            str = LJJIIJZLJL('\'');
        } else if (i == 9) {
            str = LJJIIJZLJL('\"');
        } else if (i == 11) {
            str = this.LJLLI;
            this.LJLLI = null;
        } else if (i == 15) {
            str = Long.toString(this.LJLJLLL);
        } else if (i == 16) {
            str = new String(this.LJLJI, this.LJLJJI, this.LJLL);
            this.LJLJJI += this.LJLL;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Expected a string but was ");
            LIZ.append(LJJIJIL());
            LIZ.append(LJIILIIL());
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        this.LJLJLJ = 0;
        int[] iArr = this.LJLLLL;
        int i2 = this.LJLLJ - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public EnumC65386PlO LJJIJIL() {
        int i = this.LJLJLJ;
        if (i == 0) {
            i = LIZLLL();
        }
        switch (i) {
            case 1:
                return EnumC65386PlO.BEGIN_OBJECT;
            case 2:
                return EnumC65386PlO.END_OBJECT;
            case 3:
                return EnumC65386PlO.BEGIN_ARRAY;
            case 4:
                return EnumC65386PlO.END_ARRAY;
            case 5:
            case 6:
                return EnumC65386PlO.BOOLEAN;
            case 7:
                return EnumC65386PlO.NULL;
            case 8:
            case 9:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return EnumC65386PlO.STRING;
            case 12:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 14:
                return EnumC65386PlO.NAME;
            case 15:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return EnumC65386PlO.NUMBER;
            case 17:
                return EnumC65386PlO.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final char LJJIZ() {
        int i;
        int i2;
        if (this.LJLJJI != this.LJLJJL || LJI(1)) {
            char[] cArr = this.LJLJI;
            int i3 = this.LJLJJI;
            int i4 = i3 + 1;
            this.LJLJJI = i4;
            char c = cArr[i3];
            if (c != '\n') {
                if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
                    if (c != 'b') {
                        if (c != 'f') {
                            if (c == 'n') {
                                return '\n';
                            }
                            if (c != 'r') {
                                if (c != 't') {
                                    if (c == 'u') {
                                        if (i4 + 4 <= this.LJLJJL || LJI(4)) {
                                            int i5 = this.LJLJJI;
                                            int i6 = i5 + 4;
                                            char c2 = 0;
                                            while (i5 < i6) {
                                                char c3 = this.LJLJI[i5];
                                                char c4 = (char) (c2 << 4);
                                                if (c3 >= '0') {
                                                    if (c3 <= '9') {
                                                        i2 = c3 - '0';
                                                    } else if (c3 >= 'a') {
                                                        if (c3 <= 'f') {
                                                            i = c3 - 'a';
                                                            i2 = i + 10;
                                                        }
                                                    } else if (c3 >= 'A' && c3 <= 'F') {
                                                        i = c3 - 'A';
                                                        i2 = i + 10;
                                                    }
                                                    c2 = (char) (i2 + c4);
                                                    i5++;
                                                }
                                                StringBuilder LIZ = X1D.LIZ();
                                                LIZ.append("\\u");
                                                LIZ.append(new String(this.LJLJI, this.LJLJJI, 4));
                                                throw new NumberFormatException(X1D.LIZIZ(LIZ));
                                            }
                                            this.LJLJJI += 4;
                                            return c2;
                                        }
                                        LJJJJI("Unterminated escape sequence");
                                        throw null;
                                    }
                                    LJJJJI("Invalid escape sequence");
                                    throw null;
                                }
                                return '\t';
                            }
                            return '\r';
                        }
                        return '\f';
                    }
                    return '\b';
                }
            } else {
                this.LJLJJLL++;
                this.LJLJL = i4;
            }
            return c;
        }
        LJJJJI("Unterminated escape sequence");
        throw null;
    }

    public final void LJJJIL() {
        char c;
        do {
            if (this.LJLJJI < this.LJLJJL || LJI(1)) {
                char[] cArr = this.LJLJI;
                int i = this.LJLJJI;
                int i2 = i + 1;
                this.LJLJJI = i2;
                c = cArr[i];
                if (c == '\n') {
                    this.LJLJJLL++;
                    this.LJLJL = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append(LJIILIIL());
        return X1D.LIZIZ(LIZ);
    }

    public C65385PlN(Reader reader) {
        int[] iArr = new int[32];
        this.LJLLILLLL = iArr;
        int i = this.LJLLJ;
        this.LJLLJ = i + 1;
        iArr[i] = 6;
        this.LJLLL = new String[32];
        this.LJLLLL = new int[32];
        if (reader != null) {
            this.LJLIL = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    public final boolean LJI(int i) {
        int i2;
        char[] cArr = this.LJLJI;
        int i3 = this.LJLJL;
        int i4 = this.LJLJJI;
        this.LJLJL = i3 - i4;
        int i5 = this.LJLJJL;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.LJLJJL = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.LJLJJL = 0;
        }
        this.LJLJJI = 0;
        do {
            Reader reader = this.LJLIL;
            int i7 = this.LJLJJL;
            int read = reader.read(cArr, i7, cArr.length - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.LJLJJL + read;
            this.LJLJJL = i2;
            if (this.LJLJJLL == 0 && this.LJLJL == 0 && i2 > 0 && cArr[0] == 65279) {
                this.LJLJJI++;
                this.LJLJL = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final boolean LJIIL(char c) {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c != ',') {
                    if (c != '/' && c != '=') {
                        if (c != '{' && c != '}' && c != ':') {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            LIZJ();
            return false;
        }
        return false;
    }

    public final int LJJIII(boolean z) {
        char[] cArr = this.LJLJI;
        int i = this.LJLJJI;
        int i2 = this.LJLJJL;
        while (true) {
            if (i == i2) {
                this.LJLJJI = i;
                if (!LJI(1)) {
                    if (!z) {
                        return -1;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("End of input");
                    LIZ.append(LJIILIIL());
                    throw new EOFException(X1D.LIZIZ(LIZ));
                }
                i = this.LJLJJI;
                i2 = this.LJLJJL;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.LJLJJLL++;
                this.LJLJL = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.LJLJJI = i3;
                    if (i3 == i2) {
                        this.LJLJJI = i3 - 1;
                        boolean LJI = LJI(2);
                        this.LJLJJI++;
                        if (!LJI) {
                            return c;
                        }
                    }
                    LIZJ();
                    int i4 = this.LJLJJI;
                    char c2 = cArr[i4];
                    if (c2 != '*') {
                        if (c2 != '/') {
                            return c;
                        }
                        this.LJLJJI = i4 + 1;
                        LJJJIL();
                        i = this.LJLJJI;
                        i2 = this.LJLJJL;
                    } else {
                        this.LJLJJI = i4 + 1;
                        while (true) {
                            int i5 = 0;
                            if (this.LJLJJI + 2 <= this.LJLJJL || LJI(2)) {
                                char[] cArr2 = this.LJLJI;
                                int i6 = this.LJLJJI;
                                if (cArr2[i6] == '\n') {
                                    this.LJLJJLL++;
                                    this.LJLJL = i6 + 1;
                                    this.LJLJJI++;
                                }
                                while (this.LJLJI[this.LJLJJI + i5] == "*/".charAt(i5)) {
                                    i5++;
                                    if (i5 >= 2) {
                                        i = this.LJLJJI + 2;
                                        i2 = this.LJLJJL;
                                        break;
                                    }
                                }
                                this.LJLJJI++;
                            } else {
                                LJJJJI("Unterminated comment");
                                throw null;
                            }
                        }
                    }
                } else if (c == '#') {
                    this.LJLJJI = i3;
                    LIZJ();
                    LJJJIL();
                    i = this.LJLJJI;
                    i2 = this.LJLJJL;
                } else {
                    this.LJLJJI = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r4 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        r1.append(r2, r3, r4 - r3);
        r10.LJLJJI = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJIIJZLJL(char r11) {
        /*
            r10 = this;
            char[] r2 = r10.LJLJI
            r9 = 0
            r1 = r9
        L4:
            int r3 = r10.LJLJJI
            int r8 = r10.LJLJJL
        L8:
            r4 = r3
        L9:
            r7 = 1
            r6 = 16
            if (r4 >= r8) goto L54
            int r5 = r4 + 1
            char r4 = r2[r4]
            if (r4 != r11) goto L20
            r10.LJLJJI = r5
            int r5 = r5 - r3
            int r5 = r5 - r7
            if (r1 != 0) goto L71
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r3, r5)
            return r0
        L20:
            r0 = 92
            if (r4 != r0) goto L46
            r10.LJLJJI = r5
            int r5 = r5 - r3
            int r5 = r5 - r7
            if (r1 != 0) goto L37
            int r0 = r5 + 1
            int r0 = r0 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = java.lang.Math.max(r0, r6)
            r1.<init>(r0)
        L37:
            r1.append(r2, r3, r5)
            char r0 = r10.LJJIZ()
            r1.append(r0)
            int r3 = r10.LJLJJI
            int r8 = r10.LJLJJL
            goto L8
        L46:
            r0 = 10
            if (r4 != r0) goto L52
            int r0 = r10.LJLJJLL
            int r0 = r0 + 1
            r10.LJLJJLL = r0
            r10.LJLJL = r5
        L52:
            r4 = r5
            goto L9
        L54:
            if (r1 != 0) goto L63
            int r0 = r4 - r3
            int r0 = r0 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = java.lang.Math.max(r0, r6)
            r1.<init>(r0)
        L63:
            int r0 = r4 - r3
            r1.append(r2, r3, r0)
            r10.LJLJJI = r4
            boolean r0 = r10.LJI(r7)
            if (r0 == 0) goto L79
            goto L4
        L71:
            r1.append(r2, r3, r5)
            java.lang.String r0 = r1.toString()
            return r0
        L79:
            java.lang.String r0 = "Unterminated string"
            r10.LJJJJI(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65385PlN.LJJIIJZLJL(char):java.lang.String");
    }

    public final void LJJIL(int i) {
        int i2 = this.LJLLJ;
        int[] iArr = this.LJLLILLLL;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            int[] iArr3 = new int[i2 * 2];
            String[] strArr = new String[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.LJLLLL, 0, iArr3, 0, this.LJLLJ);
            System.arraycopy(this.LJLLL, 0, strArr, 0, this.LJLLJ);
            this.LJLLILLLL = iArr2;
            this.LJLLLL = iArr3;
            this.LJLLL = strArr;
        }
        int[] iArr4 = this.LJLLILLLL;
        int i3 = this.LJLLJ;
        this.LJLLJ = i3 + 1;
        iArr4[i3] = i;
    }

    public final void LJJJI(char c) {
        char[] cArr = this.LJLJI;
        do {
            int i = this.LJLJJI;
            int i2 = this.LJLJJL;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.LJLJJI = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.LJLJJI = i3;
                    LJJIZ();
                    i = this.LJLJJI;
                    i2 = this.LJLJJL;
                } else {
                    if (c2 == '\n') {
                        this.LJLJJLL++;
                        this.LJLJL = i3;
                    }
                    i = i3;
                }
            }
            this.LJLJJI = i;
        } while (LJI(1));
        LJJJJI("Unterminated string");
        throw null;
    }

    public final void LJJJJI(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(LJIILIIL());
        throw new C38302F1m(X1D.LIZIZ(LIZ));
    }
}
