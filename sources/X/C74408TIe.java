package X;

/* renamed from: X.TIe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74408TIe extends C82604WbQ {
    public final /* synthetic */ C74409TIf LJLIL;

    @Override // X.C82604WbQ, X.InterfaceC82947Wgx
    public final void LIZLLL() {
        this.LJLIL.LJI.setVisibility(0);
        this.LJLIL.LIZIZ.onNext(THZ.PRE_SHOW);
    }

    @Override // X.C82604WbQ, X.InterfaceC82947Wgx
    public final void LJ() {
        this.LJLIL.LIZIZ.onNext(THZ.PRE_HIDE);
    }

    @Override // X.C82604WbQ, X.InterfaceC82947Wgx
    public final void LJFF() {
        C74409TIf c74409TIf = this.LJLIL;
        c74409TIf.LIZJ = EnumC74379THb.SHOWN;
        c74409TIf.LIZIZ.onNext(THZ.SHOWN);
        this.LJLIL.LIZ();
    }

    @Override // X.C82604WbQ, X.InterfaceC82947Wgx
    public final void LJII() {
        C74409TIf c74409TIf = this.LJLIL;
        c74409TIf.LIZJ = EnumC74379THb.HIDE;
        c74409TIf.LJI.setVisibility(8);
        this.LJLIL.LIZIZ.onNext(THZ.HIDDEN);
        this.LJLIL.LIZ();
    }

    public C74408TIe(C74409TIf c74409TIf) {
        this.LJLIL = c74409TIf;
    }
}
