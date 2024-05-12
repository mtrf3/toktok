package X;

import android.widget.FrameLayout;

/* renamed from: X.NHd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59093NHd implements InterfaceC59097NHh {
    public final InterfaceC59094NHe LJLIL;
    public FrameLayout LJLILLLLZI;

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    @Override // X.InterfaceC59097NHh
    public final void F1() {
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    @Override // X.InterfaceC59097NHh
    public final void onHide() {
        C59062NFy LIZIZ = this.LJLIL.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LIZ();
        }
    }

    @Override // X.InterfaceC59097NHh
    public final void onShow() {
        C59062NFy LIZIZ;
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout != null && (LIZIZ = this.LJLIL.LIZIZ()) != null) {
            LIZIZ.LIZIZ(this.LJLIL.LIZJ(), frameLayout);
        }
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ InterfaceC59094NHe L9() {
        return this.LJLIL;
    }

    public C59093NHd(C59095NHf c59095NHf) {
        this.LJLIL = c59095NHf;
    }

    @Override // X.InterfaceC59097NHh
    public final void Oc(FrameLayout frameLayout) {
        frameLayout.setVisibility(0);
        this.LJLILLLLZI = frameLayout;
        C59062NFy LIZIZ = this.LJLIL.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LIZJ(this.LJLIL.LIZJ(), frameLayout);
        }
    }
}
