package X;

import android.view.View;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IDJ implements TGM {
    public final /* synthetic */ ID1 LJLIL;

    @Override // X.TGM
    public final void LJI() {
        Iterator<TGM> it = this.LJLIL.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().LJI();
        }
    }

    public IDJ(ID1 id1) {
        this.LJLIL = id1;
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        Iterator<TGM> it = this.LJLIL.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().LIZ(stickerView);
        }
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        o.LJIIIZ(state, "state");
        Iterator<TGM> it = this.LJLIL.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(state);
        }
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        o.LJIIIZ(state, "state");
        Iterator<TGM> it = this.LJLIL.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().LJII(state);
        }
    }
}
