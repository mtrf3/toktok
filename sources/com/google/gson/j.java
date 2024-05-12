package com.google.gson;

import X.C16880lQ;
import X.C65403Plf;
import X.X1D;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes7.dex */
public abstract class j {
    public abstract j LIZJ();

    public boolean LJFF() {
        throw new UnsupportedOperationException(C16880lQ.LJLLJ(getClass()));
    }

    public byte LJII() {
        throw new UnsupportedOperationException(C16880lQ.LJLLJ(getClass()));
    }

    public char LJIIIIZZ() {
        throw new UnsupportedOperationException(C16880lQ.LJLLJ(getClass()));
    }

    public double LJIIIZ() {
        throw new UnsupportedOperationException(C16880lQ.LJLLJ(getClass()));
    }

    public float LJIIJ() {
        throw new UnsupportedOperationException(C16880lQ.LJLLJ(getClass()));
    }

    public int LJIILJJIL() {
        throw new UnsupportedOperationException(C16880lQ.LJLLJ(getClass()));
    }

    public final g LJIILLIIL() {
        if (this instanceof g) {
            return (g) this;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Not a JSON Array: ");
        LIZ.append(this);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final m LJIIZILJ() {
        if (this instanceof m) {
            return (m) this;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Not a JSON Object: ");
        LIZ.append(this);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final p LJIJ() {
        if (this instanceof p) {
            return (p) this;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Not a JSON Primitive: ");
        LIZ.append(this);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public long LJIJJLI() {
        throw new UnsupportedOperationException(C16880lQ.LJLLJ(getClass()));
    }

    public Number LJIL() {
        throw new UnsupportedOperationException(C16880lQ.LJLLJ(getClass()));
    }

    public short LJJI() {
        throw new UnsupportedOperationException(C16880lQ.LJLLJ(getClass()));
    }

    public String LJJIFFI() {
        throw new UnsupportedOperationException(C16880lQ.LJLLJ(getClass()));
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C65403Plf c65403Plf = new C65403Plf(stringWriter);
            c65403Plf.LJLJJLL = true;
            com.google.gson.internal.p.LIZIZ(this, c65403Plf);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
