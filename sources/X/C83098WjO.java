package X;

import android.view.View;

/* renamed from: X.WjO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83098WjO extends C82604WbQ {
    public final /* synthetic */ C83097WjN LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    @Override // X.C82604WbQ, X.InterfaceC82947Wgx
    public final void LIZLLL() {
        this.LJLIL.LJ.setVisibility(0);
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(0);
        }
        this.LJLIL.LIZLLL.onNext(EnumC74492TLk.PRE_SHOW);
    }

    @Override // X.C82604WbQ, X.InterfaceC82947Wgx
    public final void LJ() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(0);
        }
        this.LJLIL.LIZLLL.onNext(EnumC74492TLk.PRE_HIDE);
    }

    @Override // X.C82604WbQ, X.InterfaceC82947Wgx
    public final void LJFF() {
        this.LJLIL.LIZIZ = EnumC83096WjM.SHOWN;
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(8);
        }
        this.LJLIL.LIZLLL.onNext(EnumC74492TLk.SHOWN);
        C83097WjN c83097WjN = this.LJLIL;
        EnumC83099WjP enumC83099WjP = c83097WjN.LIZJ;
        if (enumC83099WjP == EnumC83099WjP.SHOW) {
            c83097WjN.show();
        } else if (enumC83099WjP == EnumC83099WjP.HIDE) {
            c83097WjN.hide();
        }
        c83097WjN.LIZJ = EnumC83099WjP.NONE;
    }

    @Override // X.C82604WbQ, X.InterfaceC82947Wgx
    public final void LJII() {
        this.LJLIL.LIZIZ = EnumC83096WjM.HIDE;
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(8);
        }
        this.LJLIL.LJ.setVisibility(8);
        this.LJLIL.LIZLLL.onNext(EnumC74492TLk.HIDDEN);
        C83097WjN c83097WjN = this.LJLIL;
        EnumC83099WjP enumC83099WjP = c83097WjN.LIZJ;
        if (enumC83099WjP == EnumC83099WjP.SHOW) {
            c83097WjN.show();
        } else if (enumC83099WjP == EnumC83099WjP.HIDE) {
            c83097WjN.hide();
        }
        c83097WjN.LIZJ = EnumC83099WjP.NONE;
    }

    public C83098WjO(C83097WjN c83097WjN, View view) {
        this.LJLIL = c83097WjN;
        this.LJLILLLLZI = view;
    }
}
