package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class WNV extends WNT {
    public final List<WNT> LIZJ;

    public WNV() {
        super(0);
        this.LIZJ = new ArrayList();
    }

    @Override // X.WNT
    public final void LIZIZ(float f) {
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            ((WNT) it.next()).LIZIZ(f);
        }
    }
}
