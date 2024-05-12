package X;

import Y.ARunnableS46S0100000_10;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;

/* renamed from: X.NRe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59354NRe implements InterfaceC59370NRu<NSI> {
    public final NSI LJLIL;

    @Override // X.InterfaceC59370NRu
    public final void H90() {
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    @Override // X.InterfaceC59370NRu
    public final void qk() {
    }

    @Override // X.InterfaceC59370NRu
    public final void LLLLZLL() {
        this.LJLIL.LIZIZ().LJLJI("COMMERCE_LYNX_BUTTON_TASK");
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ InterfaceC59369NRt L9() {
        return this.LJLIL;
    }

    public C59354NRe(C59353NRd c59353NRd) {
        this.LJLIL = c59353NRd;
    }

    @Override // X.InterfaceC59370NRu
    public final void Fe0(long j) {
        ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(this, 153);
        IVideoPlayTaskManager LIZIZ = this.LJLIL.LIZIZ();
        N68 LIZIZ2 = C1DD.LIZIZ("COMMERCE_LYNX_BUTTON_TASK", j);
        LIZIZ2.LIZJ = this.LJLIL.LIZ() * 1000;
        LIZIZ2.LIZLLL = aRunnableS46S0100000_10;
        LIZIZ2.LJ = false;
        LIZIZ.LJLJLJ(LIZIZ2.LIZ());
    }
}
