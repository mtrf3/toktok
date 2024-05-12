package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XHN {
    public final XGS LIZ;
    public final XJL<XHN> LIZIZ;
    public final XGZ LIZJ;
    public VLM LIZLLL;
    public final List<XHN> LJ;

    public XHN() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XHN)) {
            return false;
        }
        XHN xhn = (XHN) obj;
        return o.LJ(this.LIZ, xhn.LIZ) && o.LJ(this.LIZIZ, xhn.LIZIZ) && o.LJ(this.LIZJ, xhn.LIZJ) && this.LIZLLL == xhn.LIZLLL && o.LJ(this.LJ, xhn.LJ);
    }

    public final int hashCode() {
        return this.LJ.hashCode() + ((this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(", ");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    public XHN(XGS request, XKS xks, XGZ runner) {
        VLM state = VLM.Default;
        ArrayList arrayList = new ArrayList();
        o.LJIIIZ(request, "request");
        o.LJIIIZ(runner, "runner");
        o.LJIIIZ(state, "state");
        this.LIZ = request;
        this.LIZIZ = xks;
        this.LIZJ = runner;
        this.LIZLLL = state;
        this.LJ = arrayList;
    }
}
