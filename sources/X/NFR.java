package X;

import org.greenrobot.eventbus.EventBus;

/* loaded from: classes11.dex */
public final class NFR implements NQU {
    public final NFE LJLIL;
    public NFB LJLILLLLZI;

    @Override // X.NQU
    public final void H6() {
    }

    @Override // X.NQU
    public final void LLLLZI() {
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    @Override // X.NQU
    public final void onDestroy() {
        NFB nfb = this.LJLILLLLZI;
        if (nfb != null && EventBus.LIZJ().LJI(nfb)) {
            EventBus.LIZJ().LJIJ(nfb);
        }
    }

    @Override // X.NQU
    public final NRX u70() {
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new NFB(this.LJLIL);
        }
        return this.LJLILLLLZI;
    }

    @Override // X.NQU
    public final void unBind() {
        XKQ xkq;
        NFB nfb = this.LJLILLLLZI;
        if (nfb != null && (xkq = nfb.LLF) != null) {
            xkq.LIZIZ(null);
        }
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ NFE L9() {
        return this.LJLIL;
    }

    public NFR(C59122NIg c59122NIg) {
        this.LJLIL = c59122NIg;
    }
}
