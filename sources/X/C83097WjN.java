package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.WjN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83097WjN implements InterfaceC74483TLb {
    public final TKG LIZ;
    public EnumC83096WjM LIZIZ;
    public EnumC83099WjP LIZJ;
    public final C73893SzJ LIZLLL;
    public final View LJ;

    @Override // X.InterfaceC74483TLb
    public final C73426Srm LIZ() {
        C73893SzJ c73893SzJ = this.LIZLLL;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.InterfaceC74483TLb
    public final void LIZIZ() {
        this.LIZIZ = EnumC83096WjM.UNKNOWN;
        this.LJ.setVisibility(0);
        this.LIZLLL.onNext(EnumC74492TLk.PRE_SHOW);
        this.LIZLLL.onNext(EnumC74492TLk.SHOWN);
    }

    @Override // X.InterfaceC74483TLb
    public final void LIZJ() {
        this.LIZIZ = EnumC83096WjM.HIDE;
        this.LJ.setVisibility(8);
        this.LIZLLL.onNext(EnumC74492TLk.PRE_HIDE);
        this.LIZLLL.onNext(EnumC74492TLk.HIDDEN);
    }

    @Override // X.InterfaceC74483TLb
    public final void hide() {
        if (this.LIZ != null) {
            int ordinal = this.LIZIZ.ordinal();
            if (ordinal != 1) {
                if (ordinal != 3 && ordinal != 4) {
                    this.LIZIZ = EnumC83096WjM.HIDING;
                    this.LIZ.LIZJ(new C30461Hm());
                    return;
                } else {
                    this.LIZJ = EnumC83099WjP.NONE;
                    return;
                }
            }
            this.LIZJ = EnumC83099WjP.HIDE;
            return;
        }
        LIZJ();
    }

    @Override // X.InterfaceC74483TLb
    public final void show() {
        if (this.LIZ != null) {
            int ordinal = this.LIZIZ.ordinal();
            if (ordinal != 1 && ordinal != 2) {
                if (ordinal != 3) {
                    this.LIZIZ = EnumC83096WjM.SHOWING;
                    this.LIZ.LIZIZ(new C30461Hm());
                    return;
                } else {
                    this.LIZJ = EnumC83099WjP.SHOW;
                    return;
                }
            }
            this.LIZJ = EnumC83099WjP.NONE;
            return;
        }
        LIZIZ();
    }

    @Override // X.InterfaceC74483TLb
    public final C73805Sxt a3() {
        return LIZ().LJJIFFI(AnonymousClass636.LJLIL).LJJIJL(C78840Uwu.LJLJJLL);
    }

    public C83097WjN(View view, View view2, View view3, C83100WjQ transitionProvider) {
        TKG tkg;
        o.LJIIIZ(transitionProvider, "transitionProvider");
        this.LJ = view;
        if (view3 != null) {
            tkg = (TKG) transitionProvider.invoke(view3);
        } else {
            tkg = null;
        }
        this.LIZ = tkg;
        this.LIZIZ = EnumC83096WjM.UNKNOWN;
        this.LIZJ = EnumC83099WjP.NONE;
        this.LIZLLL = new C73893SzJ();
        if (tkg != null) {
            tkg.LJI(new C83098WjO(this, view2));
        }
    }
}
