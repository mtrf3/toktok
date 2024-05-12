package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a8k, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92314a8k implements C33Q {
    public final C92071a4p LJLIL;

    public C92314a8k() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C92314a8k) && o.LJ(this.LJLIL, ((C92314a8k) obj).LJLIL);
    }

    public final int hashCode() {
        C92071a4p c92071a4p = this.LJLIL;
        if (c92071a4p == null) {
            return 0;
        }
        return c92071a4p.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinSetViewState(pinRegexCheckResult=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C92314a8k(C92071a4p c92071a4p) {
        this.LJLIL = c92071a4p;
    }
}
