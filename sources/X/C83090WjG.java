package X;

/* renamed from: X.WjG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83090WjG extends C82604WbQ {
    public final /* synthetic */ C83089WjF LJLIL;

    @Override // X.C82604WbQ, X.InterfaceC82947Wgx
    public final void LIZLLL() {
        this.LJLIL.LJ.setVisibility(0);
        this.LJLIL.LIZLLL.onNext(EnumC74492TLk.PRE_SHOW);
    }

    @Override // X.C82604WbQ, X.InterfaceC82947Wgx
    public final void LJ() {
        this.LJLIL.LIZLLL.onNext(EnumC74492TLk.PRE_HIDE);
    }

    @Override // X.C82604WbQ, X.InterfaceC82947Wgx
    public final void LJFF() {
        C83089WjF c83089WjF = this.LJLIL;
        c83089WjF.LIZIZ = EnumC83091WjH.SHOWN;
        c83089WjF.LIZLLL.onNext(EnumC74492TLk.SHOWN);
        C83089WjF c83089WjF2 = this.LJLIL;
        EnumC83092WjI enumC83092WjI = c83089WjF2.LIZJ;
        if (enumC83092WjI == EnumC83092WjI.SHOW) {
            c83089WjF2.show();
        } else if (enumC83092WjI == EnumC83092WjI.HIDE) {
            c83089WjF2.hide();
        }
        c83089WjF2.LIZJ = EnumC83092WjI.NONE;
    }

    @Override // X.C82604WbQ, X.InterfaceC82947Wgx
    public final void LJII() {
        C83089WjF c83089WjF = this.LJLIL;
        c83089WjF.LIZIZ = EnumC83091WjH.HIDE;
        c83089WjF.LJ.setVisibility(8);
        this.LJLIL.LIZLLL.onNext(EnumC74492TLk.HIDDEN);
        C83089WjF c83089WjF2 = this.LJLIL;
        EnumC83092WjI enumC83092WjI = c83089WjF2.LIZJ;
        if (enumC83092WjI == EnumC83092WjI.SHOW) {
            c83089WjF2.show();
        } else if (enumC83092WjI == EnumC83092WjI.HIDE) {
            c83089WjF2.hide();
        }
        c83089WjF2.LIZJ = EnumC83092WjI.NONE;
    }

    public C83090WjG(C83089WjF c83089WjF) {
        this.LJLIL = c83089WjF;
    }
}
