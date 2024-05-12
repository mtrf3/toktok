package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1gN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C39231gN implements C16B {
    public AbstractC39241gO LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final AbstractC39241gO LIZLLL;
    public int LJFF;
    public int LJI;
    public C44991pf LJIIIIZZ;
    public boolean LJIIIZ;
    public C16D LJ = C16D.UNKNOWN;
    public int LJII = 1;
    public final List<C16B> LJIIJ = new ArrayList();
    public final List<C39231gN> LJIIJJI = new ArrayList();

    public final void LIZJ() {
        ((ArrayList) this.LJIIJJI).clear();
        ((ArrayList) this.LJIIJ).clear();
        this.LJIIIZ = false;
        this.LJI = 0;
        this.LIZJ = false;
        this.LIZIZ = false;
    }

    public final String toString() {
        Object obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZLLL.LIZIZ.mDebugName);
        LIZ.append(":");
        LIZ.append(this.LJ);
        LIZ.append("(");
        if (this.LJIIIZ) {
            obj = Integer.valueOf(this.LJI);
        } else {
            obj = "unresolved";
        }
        LIZ.append(obj);
        LIZ.append(") <t=");
        LIZ.append(((ArrayList) this.LJIIJJI).size());
        LIZ.append(":d=");
        LIZ.append(((ArrayList) this.LJIIJ).size());
        LIZ.append(">");
        return X1D.LIZIZ(LIZ);
    }

    public C39231gN(AbstractC39241gO abstractC39241gO) {
        this.LIZLLL = abstractC39241gO;
    }

    @Override // X.C16B
    public final void LIZ(C16B c16b) {
        Iterator it = ((ArrayList) this.LJIIJJI).iterator();
        while (it.hasNext()) {
            if (!((C39231gN) it.next()).LJIIIZ) {
                return;
            }
        }
        this.LIZJ = true;
        AbstractC39241gO abstractC39241gO = this.LIZ;
        if (abstractC39241gO != null) {
            abstractC39241gO.LIZ(this);
        }
        if (this.LIZIZ) {
            this.LIZLLL.LIZ(this);
            return;
        }
        Iterator it2 = ((ArrayList) this.LJIIJJI).iterator();
        C39231gN c39231gN = null;
        int i = 0;
        while (it2.hasNext()) {
            C39231gN c39231gN2 = (C39231gN) it2.next();
            if (!(c39231gN2 instanceof C44991pf)) {
                i++;
                c39231gN = c39231gN2;
            }
        }
        if (c39231gN != null && i == 1 && c39231gN.LJIIIZ) {
            C44991pf c44991pf = this.LJIIIIZZ;
            if (c44991pf != null) {
                if (c44991pf.LJIIIZ) {
                    this.LJFF = this.LJII * c44991pf.LJI;
                } else {
                    return;
                }
            }
            LIZLLL(c39231gN.LJI + this.LJFF);
        }
        AbstractC39241gO abstractC39241gO2 = this.LIZ;
        if (abstractC39241gO2 != null) {
            abstractC39241gO2.LIZ(this);
        }
    }

    public final void LIZIZ(C16B c16b) {
        ((ArrayList) this.LJIIJ).add(c16b);
        if (this.LJIIIZ) {
            c16b.LIZ(c16b);
        }
    }

    public void LIZLLL(int i) {
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        this.LJI = i;
        Iterator it = ((ArrayList) this.LJIIJ).iterator();
        while (it.hasNext()) {
            C16B c16b = (C16B) it.next();
            c16b.LIZ(c16b);
        }
    }
}
