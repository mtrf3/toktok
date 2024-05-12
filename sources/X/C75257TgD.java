package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl;

/* renamed from: X.TgD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75257TgD implements InterfaceC75262TgI {
    public final /* synthetic */ AnimationManagerImpl LJLIL;

    public C75257TgD(AnimationManagerImpl animationManagerImpl) {
        this.LJLIL = animationManagerImpl;
    }

    @Override // X.InterfaceC75262TgI
    public final void LIZIZ(JBM jbm) {
        this.LJLIL.LIZIZ(jbm);
        View LJ = this.LJLIL.LJ();
        if (LJ != null) {
            TV3.LJIIJJI(LJ);
        }
        View LIZLLL = this.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            TV3.LJIIJJI(LIZLLL);
        }
        ((InterfaceC75260TgG) this.LJLIL.LJLJLJ.getValue()).release();
    }

    @Override // X.InterfaceC75262TgI
    public final void LIZ(JBM jbm, int i) {
        this.LJLIL.LIZ(jbm, i);
        View LJ = this.LJLIL.LJ();
        if (LJ != null) {
            TV3.LJIIJJI(LJ);
        }
        View LIZLLL = this.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            TV3.LJIIJJI(LIZLLL);
        }
        ((InterfaceC75260TgG) this.LJLIL.LJLJLJ.getValue()).release();
    }
}
