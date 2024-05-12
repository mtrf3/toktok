package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1pf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C44991pf extends C39231gN {
    public int LJIIL;

    public C44991pf(AbstractC39241gO abstractC39241gO) {
        super(abstractC39241gO);
        if (abstractC39241gO instanceof C45021pi) {
            this.LJ = C16D.HORIZONTAL_DIMENSION;
        } else {
            this.LJ = C16D.VERTICAL_DIMENSION;
        }
    }

    @Override // X.C39231gN
    public final void LIZLLL(int i) {
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
