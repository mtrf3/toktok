package com.google.gson.internal.bind;

import X.C65403Plf;
import X.X1D;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class b extends C65403Plf {
    public static final a LJLLLL = new a();
    public static final p LJLLLLLL = new p("closed");
    public final List<j> LJLLILLLL;
    public String LJLLJ;
    public j LJLLL;

    /* loaded from: classes7.dex */
    public static class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    @Override // X.C65403Plf, java.io.Flushable
    public final void flush() {
    }

    public b() {
        super(LJLLLL);
        this.LJLLILLLL = new ArrayList();
        this.LJLLL = l.LJLIL;
    }

    @Override // X.C65403Plf
    public final void LIZIZ() {
        g gVar = new g();
        LJJIJIIJIL(gVar);
        ((ArrayList) this.LJLLILLLL).add(gVar);
    }

    @Override // X.C65403Plf
    public final void LIZJ() {
        m mVar = new m();
        LJJIJIIJIL(mVar);
        ((ArrayList) this.LJLLILLLL).add(mVar);
    }

    @Override // X.C65403Plf
    public final C65403Plf LJ() {
        if (!((ArrayList) this.LJLLILLLL).isEmpty() && this.LJLLJ == null) {
            if (LJJIIZI() instanceof g) {
                ((ArrayList) this.LJLLILLLL).remove(((ArrayList) r1).size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // X.C65403Plf
    public final void LJFF() {
        if (!((ArrayList) this.LJLLILLLL).isEmpty() && this.LJLLJ == null) {
            if (LJJIIZI() instanceof m) {
                ((ArrayList) this.LJLLILLLL).remove(r1.size() - 1);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // X.C65403Plf
    public final C65403Plf LJIIJJI() {
        LJJIJIIJIL(l.LJLIL);
        return this;
    }

    public final j LJJIIJZLJL() {
        if (((ArrayList) this.LJLLILLLL).isEmpty()) {
            return this.LJLLL;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected one JSON element but was ");
        LIZ.append(this.LJLLILLLL);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final j LJJIIZI() {
        return (j) ((ArrayList) this.LJLLILLLL).get(((ArrayList) r1).size() - 1);
    }

    @Override // X.C65403Plf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (((ArrayList) this.LJLLILLLL).isEmpty()) {
            ((ArrayList) this.LJLLILLLL).add(LJLLLLLL);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // X.C65403Plf
    public final C65403Plf LJI(String str) {
        if (!((ArrayList) this.LJLLILLLL).isEmpty() && this.LJLLJ == null) {
            if (LJJIIZI() instanceof m) {
                this.LJLLJ = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // X.C65403Plf
    public final void LJIILL(double d) {
        if (this.LJLJJLL || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            LJJIJIIJIL(new p((Number) Double.valueOf(d)));
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JSON forbids NaN and infinities: ");
        LIZ.append(d);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    @Override // X.C65403Plf
    public final void LJIJ(long j) {
        LJJIJIIJIL(new p((Number) Long.valueOf(j)));
    }

    @Override // X.C65403Plf
    public final void LJIJI(Boolean bool) {
        if (bool == null) {
            LJJIJIIJIL(l.LJLIL);
        } else {
            LJJIJIIJIL(new p(bool));
        }
    }

    @Override // X.C65403Plf
    public final void LJIJJ(Number number) {
        if (number == null) {
            LJJIJIIJIL(l.LJLIL);
            return;
        }
        if (!this.LJLJJLL) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("JSON forbids NaN and infinities: ");
                LIZ.append(number);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        LJJIJIIJIL(new p(number));
    }

    @Override // X.C65403Plf
    public final void LJJ(String str) {
        if (str == null) {
            LJJIJIIJIL(l.LJLIL);
        } else {
            LJJIJIIJIL(new p(str));
        }
    }

    @Override // X.C65403Plf
    public final void LJJIII(boolean z) {
        LJJIJIIJIL(new p(Boolean.valueOf(z)));
    }

    public final void LJJIJIIJIL(j jVar) {
        if (this.LJLLJ != null) {
            jVar.getClass();
            if (!(jVar instanceof l) || this.LJLJLLL) {
                ((m) LJJIIZI()).LJJII(this.LJLLJ, jVar);
            }
            this.LJLLJ = null;
            return;
        }
        if (((ArrayList) this.LJLLILLLL).isEmpty()) {
            this.LJLLL = jVar;
            return;
        }
        j LJJIIZI = LJJIIZI();
        if (LJJIIZI instanceof g) {
            ((g) LJJIIZI).LJJII(jVar);
            return;
        }
        throw new IllegalStateException();
    }
}
