package X;

import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class ID6 implements TGM {
    public final /* synthetic */ C46245ICz LJLIL;

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
    }

    @Override // X.TGM
    public final void LJI() {
    }

    public ID6(C46245ICz c46245ICz) {
        this.LJLIL = c46245ICz;
        C60903NvH.LJIIJJI().getUiService().getClass();
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        o.LJIIIZ(state, "state");
        if (state == IDK.BEFORE_ANIMATE) {
            if (this.LJLIL.LJZI && this.LJLIL.LJLLLLLL.LLJJIJIIJIL() != null && !o.LJ(this.LJLIL.LJLLLLLL.LLJJIJIIJIL(), this.LJLIL.LJZL)) {
                this.LJLIL.LJZI = false;
                C46245ICz c46245ICz = this.LJLIL;
                c46245ICz.LJZL = c46245ICz.LJLLLLLL.LLJJIJIIJIL();
                Effect LLJJIJIIJIL = this.LJLIL.LJLLLLLL.LLJJIJIIJIL();
                if (LLJJIJIIJIL != null) {
                    C78897Uxp.LJJL(LLJJIJIIJIL);
                }
            }
            if (o.LJ("livestreaming", this.LJLIL.LJLLJ) && !s.LJJJLZIJ(this.LJLIL.LJLLILLLL.getClass().getName(), "VideoRecordNewActivity", false)) {
                s.LJJJLZIJ(this.LJLIL.LJLLILLLL.getClass().getName(), "SAAActivity", false);
            }
        }
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        o.LJIIIZ(state, "state");
        if (state == IDK.AFTER_ANIMATE && o.LJ("livestreaming", this.LJLIL.LJLLJ) && !s.LJJJLZIJ(this.LJLIL.LJLLILLLL.getClass().getName(), "VideoRecordNewActivity", false)) {
            s.LJJJLZIJ(this.LJLIL.LJLLILLLL.getClass().getName(), "SAAActivity", false);
        }
    }
}
