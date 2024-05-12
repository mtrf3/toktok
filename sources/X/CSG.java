package X;

import kotlin.jvm.internal.o;
import uw.c0;

/* loaded from: classes6.dex */
public final class CSG<MODEL extends c0<? extends CR6>> extends CSH<MODEL> {
    public final CS6 LJIIIZ;
    public MODEL LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;

    public CSG() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CSG)) {
            return false;
        }
        CSG csg = (CSG) obj;
        return o.LJ(this.LJIIIZ, csg.LJIIIZ) && o.LJ(this.LJIIJ, csg.LJIIJ) && this.LJIIJJI == csg.LJIIJJI && this.LJIIL == csg.LJIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LJIIJ.hashCode() + (this.LJIIIZ.hashCode() * 31)) * 31;
        boolean z = this.LJIIJJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + (this.LJIIL ? 1 : 0);
    }

    @Override // X.CSH
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinnedPublicScreenMessageModel(pinBizModel=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", messageModel=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", isPinFailed=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", shown=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIL, ')', LIZ);
    }

    @Override // X.CSH
    public final /* bridge */ /* synthetic */ CRD LIZ() {
        return this.LJIIJ;
    }

    @Override // X.CSH
    public final void LIZIZ(CRD crd) {
        CQO cqo = (CQO) crd;
        o.LJIIIZ(cqo, "<set-?>");
        this.LJIIJ = cqo;
    }

    public CSG(CS6 cs6, CQO cqo) {
        super(cqo);
        this.LJIIIZ = cs6;
        this.LJIIJ = cqo;
        this.LJIIJJI = false;
        this.LJIIL = false;
    }
}
