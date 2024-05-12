package X;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: X.Plf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65403Plf implements Closeable, Flushable {
    public static final String[] LJLL = new String[128];
    public static final String[] LJLLI;
    public final Writer LJLIL;
    public int[] LJLILLLLZI;
    public int LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public String LJLJLJ;
    public boolean LJLJLLL;

    static {
        int i = 0;
        do {
            LJLL[i] = C16880lQ.LLLZ("\\u%04x", new Object[]{Integer.valueOf(i)});
            i++;
        } while (i <= 31);
        String[] strArr = LJLL;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        LJLLI = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C65403Plf LJ() {
        LIZLLL(1, 2, "]");
        return this;
    }

    public final void LJIIJ() {
        if (this.LJLJJI == null) {
            return;
        }
        this.LJLIL.write("\n");
        int i = this.LJLJI;
        for (int i2 = 1; i2 < i; i2++) {
            this.LJLIL.write(this.LJLJJI);
        }
    }

    public C65403Plf LJIIJJI() {
        if (this.LJLJLJ != null) {
            if (this.LJLJLLL) {
                LJJIIJ();
            } else {
                this.LJLJLJ = null;
                return this;
            }
        }
        LIZ();
        this.LJLIL.write("null");
        return this;
    }

    public final int LJIIL() {
        int i = this.LJLJI;
        if (i != 0) {
            return this.LJLILLLLZI[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void LJJIIJ() {
        if (this.LJLJLJ != null) {
            int LJIIL = LJIIL();
            if (LJIIL == 5) {
                this.LJLIL.write(44);
            } else if (LJIIL != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            LJIIJ();
            this.LJLILLLLZI[this.LJLJI - 1] = 4;
            LJIILIIL(this.LJLJLJ);
            this.LJLJLJ = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.LJLIL.close();
        int i = this.LJLJI;
        if (i <= 1 && (i != 1 || this.LJLILLLLZI[0] == 7)) {
            this.LJLJI = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.LJLJI != 0) {
            this.LJLIL.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void LIZ() {
        int LJIIL = LJIIL();
        if (LJIIL != 1) {
            if (LJIIL != 2) {
                if (LJIIL != 4) {
                    if (LJIIL != 6) {
                        if (LJIIL == 7) {
                            if (!this.LJLJJLL) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.LJLILLLLZI[this.LJLJI - 1] = 7;
                    return;
                }
                this.LJLIL.append((CharSequence) this.LJLJJL);
                this.LJLILLLLZI[this.LJLJI - 1] = 5;
                return;
            }
            this.LJLIL.append(',');
            LJIIJ();
            return;
        }
        this.LJLILLLLZI[this.LJLJI - 1] = 2;
        LJIIJ();
    }

    public void LIZIZ() {
        LJJIIJ();
        LIZ();
        int i = this.LJLJI;
        int[] iArr = this.LJLILLLLZI;
        if (i == iArr.length) {
            int[] iArr2 = new int[i * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.LJLILLLLZI = iArr2;
        }
        int[] iArr3 = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        this.LJLJI = i2 + 1;
        iArr3[i2] = 1;
        this.LJLIL.write("[");
    }

    public void LIZJ() {
        LJJIIJ();
        LIZ();
        int i = this.LJLJI;
        int[] iArr = this.LJLILLLLZI;
        if (i == iArr.length) {
            int[] iArr2 = new int[i * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.LJLILLLLZI = iArr2;
        }
        int[] iArr3 = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        this.LJLJI = i2 + 1;
        iArr3[i2] = 3;
        this.LJLIL.write("{");
    }

    public void LJFF() {
        LIZLLL(3, 5, "}");
    }

    public C65403Plf(Writer writer) {
        int[] iArr = new int[32];
        this.LJLILLLLZI = iArr;
        int i = this.LJLJI;
        if (i == iArr.length) {
            int[] iArr2 = new int[i * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.LJLILLLLZI = iArr2;
        }
        int[] iArr3 = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        this.LJLJI = i2 + 1;
        iArr3[i2] = 6;
        this.LJLJJL = ":";
        this.LJLJLLL = true;
        if (writer != null) {
            this.LJLIL = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    public C65403Plf LJI(String str) {
        if (str != null) {
            if (this.LJLJLJ == null) {
                if (this.LJLJI != 0) {
                    this.LJLJLJ = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.LJLJL
            if (r0 == 0) goto L42
            java.lang.String[] r7 = X.C65403Plf.LJLLI
        L6:
            java.io.Writer r0 = r8.LJLIL
            java.lang.String r6 = "\""
            r0.write(r6)
            int r5 = r9.length()
            r4 = 0
            r3 = 0
        L13:
            if (r4 >= r5) goto L45
            char r1 = r9.charAt(r4)
            r0 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto L24
            r2 = r7[r1]
            if (r2 != 0) goto L2a
        L21:
            int r4 = r4 + 1
            goto L13
        L24:
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L3b
            java.lang.String r2 = "\\u2028"
        L2a:
            if (r3 >= r4) goto L33
            java.io.Writer r1 = r8.LJLIL
            int r0 = r4 - r3
            r1.write(r9, r3, r0)
        L33:
            java.io.Writer r0 = r8.LJLIL
            r0.write(r2)
            int r3 = r4 + 1
            goto L21
        L3b:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L21
            java.lang.String r2 = "\\u2029"
            goto L2a
        L42:
            java.lang.String[] r7 = X.C65403Plf.LJLL
            goto L6
        L45:
            if (r3 >= r5) goto L4d
            java.io.Writer r0 = r8.LJLIL
            int r5 = r5 - r3
            r0.write(r9, r3, r5)
        L4d:
            java.io.Writer r0 = r8.LJLIL
            r0.write(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65403Plf.LJIILIIL(java.lang.String):void");
    }

    public void LJIILL(double d) {
        LJJIIJ();
        if (this.LJLJJLL || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            LIZ();
            this.LJLIL.append((CharSequence) Double.toString(d));
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Numeric values must be finite, but was ");
            LIZ.append(d);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
    }

    public void LJIJ(long j) {
        LJJIIJ();
        LIZ();
        this.LJLIL.write(Long.toString(j));
    }

    public void LJIJI(Boolean bool) {
        String str;
        if (bool == null) {
            LJIIJJI();
            return;
        }
        LJJIIJ();
        LIZ();
        Writer writer = this.LJLIL;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
    }

    public void LJIJJ(Number number) {
        if (number == null) {
            LJIIJJI();
            return;
        }
        LJJIIJ();
        String obj = number.toString();
        if (this.LJLJJLL || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            LIZ();
            this.LJLIL.append((CharSequence) obj);
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Numeric values must be finite, but was ");
            LIZ.append(number);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
    }

    public void LJJ(String str) {
        if (str == null) {
            LJIIJJI();
            return;
        }
        LJJIIJ();
        LIZ();
        LJIILIIL(str);
    }

    public void LJJIII(boolean z) {
        String str;
        LJJIIJ();
        LIZ();
        Writer writer = this.LJLIL;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
    }

    public final void LIZLLL(int i, int i2, String str) {
        int LJIIL = LJIIL();
        if (LJIIL == i2 || LJIIL == i) {
            if (this.LJLJLJ == null) {
                this.LJLJI--;
                if (LJIIL == i2) {
                    LJIIJ();
                }
                this.LJLIL.write(str);
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Dangling name: ");
            LIZ.append(this.LJLJLJ);
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        throw new IllegalStateException("Nesting problem.");
    }
}
