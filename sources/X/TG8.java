package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TG8 implements TGO {
    public final List<TGT> LJLIL = new ArrayList();
    public final List<TGT> LJLILLLLZI = new ArrayList();

    @Override // X.TGO
    public final List<TGT> LIZ() {
        return this.LJLIL;
    }

    @Override // X.TGO
    public final void LIZIZ(TGT stickerBarView) {
        o.LJIIIZ(stickerBarView, "stickerBarView");
        if (!((ArrayList) this.LJLIL).contains(stickerBarView)) {
            ((ArrayList) this.LJLIL).add(stickerBarView);
        }
    }

    public final void bb(boolean z) {
        if (z) {
            if (((ArrayList) this.LJLIL).isEmpty()) {
                return;
            }
            Iterator it = ((ArrayList) this.LJLIL).iterator();
            while (it.hasNext()) {
                TGT tgt = (TGT) it.next();
                if (tgt.LLIIIJ()) {
                    tgt.LLIIIL();
                    ((ArrayList) this.LJLILLLLZI).add(tgt);
                }
            }
            return;
        }
        if (!this.LJLILLLLZI.isEmpty()) {
            Iterator it2 = ((ArrayList) this.LJLILLLLZI).iterator();
            while (it2.hasNext()) {
                ((TGT) it2.next()).LLIIIZ();
            }
            ((ArrayList) this.LJLILLLLZI).clear();
        }
    }
}
