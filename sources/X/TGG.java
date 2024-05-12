package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes13.dex */
public final class TGG implements TGR {
    public final /* synthetic */ TGA LJLIL;

    public TGG(TGA tga) {
        this.LJLIL = tga;
    }

    @Override // X.TGR
    public final void LIZ(T4Q t4q) {
        Iterator it = ((ArrayList) this.LJLIL.LJLJJLL).iterator();
        while (it.hasNext()) {
            ((TGR) it.next()).LIZ(t4q);
        }
        this.LJLIL.LJLILLLLZI.setValue(C78897Uxp.LJJL(t4q.LIZ));
    }

    @Override // X.TGR
    public final void LIZIZ(T4R t4r) {
        Iterator it = ((ArrayList) this.LJLIL.LJLJJLL).iterator();
        while (it.hasNext()) {
            ((TGR) it.next()).LIZIZ(t4r);
        }
        this.LJLIL.LJLILLLLZI.setValue(null);
    }
}
