package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IDE implements TGM {
    public final /* synthetic */ AbstractC46244ICy LJLIL;

    @Override // X.TGM
    public final void LJI() {
    }

    public IDE(AbstractC46244ICy abstractC46244ICy) {
        this.LJLIL = abstractC46244ICy;
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        this.LJLIL.LLFF.LJII(Boolean.TRUE);
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        o.LJIIIZ(state, "state");
        if (state == IDK.BEFORE_ANIMATE) {
            this.LJLIL.LLFFF.LJII(Boolean.TRUE);
        }
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        o.LJIIIZ(state, "state");
        if (state == IDK.AFTER_ANIMATE) {
            this.LJLIL.LLFFF.LJII(Boolean.FALSE);
        }
    }
}
