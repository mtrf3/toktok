package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Get, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42051Get extends C43356Gzw {
    public final List<C43356Gzw> LIZLLL = new ArrayList();

    @Override // X.C43356Gzw
    public final void LIZ() {
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((C43356Gzw) it.next()).LIZ();
        }
        super.LIZ();
    }

    public final C43356Gzw LIZLLL() {
        C43356Gzw c43356Gzw = new C43356Gzw();
        LIZJ(c43356Gzw);
        return c43356Gzw;
    }

    public final void LIZJ(C43356Gzw c43356Gzw) {
        C1JI.LJII();
        ((ArrayList) this.LIZLLL).add(c43356Gzw);
    }

    public final void LJ(C43356Gzw c43356Gzw) {
        C1JI.LJII();
        ((ArrayList) this.LIZLLL).remove(c43356Gzw);
    }
}
