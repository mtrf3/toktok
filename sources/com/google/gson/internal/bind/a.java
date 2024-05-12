package com.google.gson.internal.bind;

import X.C16880lQ;
import X.C65385PlN;
import X.EnumC65386PlO;
import X.X1D;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes12.dex */
public final class a extends C65385PlN {
    public static final C0021a LL = new C0021a();
    public static final Object LLD = new Object();
    public Object[] LJLZ;
    public int LJZ;
    public String[] LJZI;
    public int[] LJZL;

    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    /* loaded from: classes12.dex */
    public static class C0021a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    @Override // X.C65385PlN, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLZ = new Object[]{LLD};
        this.LJZ = 1;
    }

    @Override // X.C65385PlN
    public final void LIZ() {
        LJJJJIZL(EnumC65386PlO.BEGIN_ARRAY);
        LJJJJL(((g) LJJJJJ()).iterator());
        this.LJZL[this.LJZ - 1] = 0;
    }

    @Override // X.C65385PlN
    public final void LIZIZ() {
        LJJJJIZL(EnumC65386PlO.BEGIN_OBJECT);
        LJJJJL(((m) LJJJJJ()).entrySet().iterator());
    }

    @Override // X.C65385PlN
    public final void LJ() {
        LJJJJIZL(EnumC65386PlO.END_ARRAY);
        LJJJJJL();
        LJJJJJL();
        int i = this.LJZ;
        if (i > 0) {
            int[] iArr = this.LJZL;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // X.C65385PlN
    public final void LJFF() {
        LJJJJIZL(EnumC65386PlO.END_OBJECT);
        LJJJJJL();
        LJJJJJL();
        int i = this.LJZ;
        if (i > 0) {
            int[] iArr = this.LJZL;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // X.C65385PlN
    public final String LJIIJ() {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (i < this.LJZ) {
            Object[] objArr = this.LJLZ;
            Object obj = objArr[i];
            if (obj instanceof g) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.LJZL[i]);
                    sb.append(']');
                }
            } else if (obj instanceof m) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String str = this.LJZI[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // X.C65385PlN
    public final boolean LJIILL() {
        LJJJJIZL(EnumC65386PlO.BOOLEAN);
        boolean LJFF = ((j) LJJJJJL()).LJFF();
        int i = this.LJZ;
        if (i > 0) {
            int[] iArr = this.LJZL;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return LJFF;
    }

    @Override // X.C65385PlN
    public final String LJJ() {
        LJJJJIZL(EnumC65386PlO.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) LJJJJJ()).next();
        String str = (String) entry.getKey();
        this.LJZI[this.LJZ - 1] = str;
        LJJJJL(entry.getValue());
        return str;
    }

    @Override // X.C65385PlN
    public final void LJJIIJ() {
        LJJJJIZL(EnumC65386PlO.NULL);
        LJJJJJL();
        int i = this.LJZ;
        if (i > 0) {
            int[] iArr = this.LJZL;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // X.C65385PlN
    public final EnumC65386PlO LJJIJIL() {
        if (this.LJZ == 0) {
            return EnumC65386PlO.END_DOCUMENT;
        }
        Object LJJJJJ = LJJJJJ();
        if (LJJJJJ instanceof Iterator) {
            boolean z = this.LJLZ[this.LJZ - 2] instanceof m;
            Iterator it = (Iterator) LJJJJJ;
            if (it.hasNext()) {
                if (z) {
                    return EnumC65386PlO.NAME;
                }
                LJJJJL(it.next());
                return LJJIJIL();
            }
            if (z) {
                return EnumC65386PlO.END_OBJECT;
            }
            return EnumC65386PlO.END_ARRAY;
        }
        if (LJJJJJ instanceof m) {
            return EnumC65386PlO.BEGIN_OBJECT;
        }
        if (LJJJJJ instanceof g) {
            return EnumC65386PlO.BEGIN_ARRAY;
        }
        if (LJJJJJ instanceof p) {
            Object obj = ((p) LJJJJJ).LJLIL;
            if (obj instanceof String) {
                return EnumC65386PlO.STRING;
            }
            if (obj instanceof Boolean) {
                return EnumC65386PlO.BOOLEAN;
            }
            if (obj instanceof Number) {
                return EnumC65386PlO.NUMBER;
            }
            throw new AssertionError();
        }
        if (LJJJJJ instanceof l) {
            return EnumC65386PlO.NULL;
        }
        if (LJJJJJ == LLD) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new AssertionError();
    }

    public final Object LJJJJJ() {
        return this.LJLZ[this.LJZ - 1];
    }

    public final Object LJJJJJL() {
        Object[] objArr = this.LJLZ;
        int i = this.LJZ - 1;
        this.LJZ = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // X.C65385PlN
    public final String toString() {
        return C16880lQ.LJLLJ(a.class);
    }

    private String LJIILIIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" at path ");
        LIZ.append(LJIIJ());
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.C65385PlN
    public final boolean LJIIJJI() {
        EnumC65386PlO LJJIJIL = LJJIJIL();
        if (LJJIJIL != EnumC65386PlO.END_OBJECT && LJJIJIL != EnumC65386PlO.END_ARRAY) {
            return true;
        }
        return false;
    }

    @Override // X.C65385PlN
    public final double LJIJ() {
        EnumC65386PlO LJJIJIL = LJJIJIL();
        EnumC65386PlO enumC65386PlO = EnumC65386PlO.NUMBER;
        if (LJJIJIL == enumC65386PlO || LJJIJIL == EnumC65386PlO.STRING) {
            double LJIIIZ = ((j) LJJJJJ()).LJIIIZ();
            if (this.LJLILLLLZI || (!Double.isNaN(LJIIIZ) && !Double.isInfinite(LJIIIZ))) {
                LJJJJJL();
                int i = this.LJZ;
                if (i > 0) {
                    int[] iArr = this.LJZL;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return LJIIIZ;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("JSON forbids NaN and infinities: ");
            LIZ.append(LJIIIZ);
            throw new NumberFormatException(X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Expected ");
        LIZ2.append(enumC65386PlO);
        LIZ2.append(" but was ");
        LIZ2.append(LJJIJIL);
        LIZ2.append(LJIILIIL());
        throw new IllegalStateException(X1D.LIZIZ(LIZ2));
    }

    @Override // X.C65385PlN
    public final int LJIJI() {
        EnumC65386PlO LJJIJIL = LJJIJIL();
        EnumC65386PlO enumC65386PlO = EnumC65386PlO.NUMBER;
        if (LJJIJIL == enumC65386PlO || LJJIJIL == EnumC65386PlO.STRING) {
            int LJIILJJIL = ((j) LJJJJJ()).LJIILJJIL();
            LJJJJJL();
            int i = this.LJZ;
            if (i > 0) {
                int[] iArr = this.LJZL;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return LJIILJJIL;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected ");
        LIZ.append(enumC65386PlO);
        LIZ.append(" but was ");
        LIZ.append(LJJIJIL);
        LIZ.append(LJIILIIL());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // X.C65385PlN
    public final long LJIJJ() {
        EnumC65386PlO LJJIJIL = LJJIJIL();
        EnumC65386PlO enumC65386PlO = EnumC65386PlO.NUMBER;
        if (LJJIJIL == enumC65386PlO || LJJIJIL == EnumC65386PlO.STRING) {
            long LJIJJLI = ((j) LJJJJJ()).LJIJJLI();
            LJJJJJL();
            int i = this.LJZ;
            if (i > 0) {
                int[] iArr = this.LJZL;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return LJIJJLI;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected ");
        LIZ.append(enumC65386PlO);
        LIZ.append(" but was ");
        LIZ.append(LJJIJIL);
        LIZ.append(LJIILIIL());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // X.C65385PlN
    public final String LJJIIZI() {
        EnumC65386PlO LJJIJIL = LJJIJIL();
        EnumC65386PlO enumC65386PlO = EnumC65386PlO.STRING;
        if (LJJIJIL == enumC65386PlO || LJJIJIL == EnumC65386PlO.NUMBER) {
            String LJJIFFI = ((j) LJJJJJL()).LJJIFFI();
            int i = this.LJZ;
            if (i > 0) {
                int[] iArr = this.LJZL;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return LJJIFFI;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected ");
        LIZ.append(enumC65386PlO);
        LIZ.append(" but was ");
        LIZ.append(LJJIJIL);
        LIZ.append(LJIILIIL());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // X.C65385PlN
    public final void LJJJJ() {
        if (LJJIJIL() == EnumC65386PlO.NAME) {
            LJJ();
            this.LJZI[this.LJZ - 2] = "null";
        } else {
            LJJJJJL();
            int i = this.LJZ;
            if (i > 0) {
                this.LJZI[i - 1] = "null";
            }
        }
        int i2 = this.LJZ;
        if (i2 > 0) {
            int[] iArr = this.LJZL;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public a(j jVar) {
        super(LL);
        this.LJLZ = new Object[32];
        this.LJZI = new String[32];
        this.LJZL = new int[32];
        LJJJJL(jVar);
    }

    public final void LJJJJIZL(EnumC65386PlO enumC65386PlO) {
        if (LJJIJIL() == enumC65386PlO) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected ");
        LIZ.append(enumC65386PlO);
        LIZ.append(" but was ");
        LIZ.append(LJJIJIL());
        LIZ.append(LJIILIIL());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final void LJJJJL(Object obj) {
        int i = this.LJZ;
        Object[] objArr = this.LJLZ;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[i * 2];
            int[] iArr = new int[i * 2];
            String[] strArr = new String[i * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.LJZL, 0, iArr, 0, this.LJZ);
            System.arraycopy(this.LJZI, 0, strArr, 0, this.LJZ);
            this.LJLZ = objArr2;
            this.LJZL = iArr;
            this.LJZI = strArr;
        }
        Object[] objArr3 = this.LJLZ;
        int i2 = this.LJZ;
        this.LJZ = i2 + 1;
        objArr3[i2] = obj;
    }
}
