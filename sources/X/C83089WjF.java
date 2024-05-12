package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.WjF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83089WjF implements InterfaceC74483TLb {
    public final C83093WjJ LIZ;
    public EnumC83091WjH LIZIZ;
    public EnumC83092WjI LIZJ;
    public final C73893SzJ LIZLLL;
    public final View LJ;

    @Override // X.InterfaceC74483TLb
    public final C73426Srm LIZ() {
        C73893SzJ c73893SzJ = this.LIZLLL;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.InterfaceC74483TLb
    public final void LIZIZ() {
        this.LIZIZ = EnumC83091WjH.UNKNOWN;
        this.LJ.setVisibility(0);
        this.LIZLLL.onNext(EnumC74492TLk.PRE_SHOW);
        this.LIZLLL.onNext(EnumC74492TLk.SHOWN);
    }

    @Override // X.InterfaceC74483TLb
    public final void LIZJ() {
        this.LIZIZ = EnumC83091WjH.HIDE;
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
                    this.LIZIZ = EnumC83091WjH.HIDING;
                    this.LIZ.LIZJ(new C30461Hm());
                    return;
                } else {
                    this.LIZJ = EnumC83092WjI.NONE;
                    return;
                }
            }
            this.LIZJ = EnumC83092WjI.HIDE;
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
                    this.LIZIZ = EnumC83091WjH.SHOWING;
                    this.LIZ.LIZIZ(new C30461Hm());
                    return;
                } else {
                    this.LIZJ = EnumC83092WjI.SHOW;
                    return;
                }
            }
            this.LIZJ = EnumC83092WjI.NONE;
            return;
        }
        LIZIZ();
    }

    @Override // X.InterfaceC74483TLb
    public final C73805Sxt a3() {
        return LIZ().LJJIFFI(C78927UyJ.LJLILLLLZI).LJJIJL(TMM.LJLIL);
    }

    public C83089WjF(View target, View view) {
        C83093WjJ c83093WjJ;
        o.LJIIIZ(target, "target");
        this.LJ = target;
        if (view != null) {
            c83093WjJ = new C83093WjJ(view);
        } else {
            c83093WjJ = null;
        }
        this.LIZ = c83093WjJ;
        this.LIZIZ = EnumC83091WjH.UNKNOWN;
        this.LIZJ = EnumC83092WjI.NONE;
        this.LIZLLL = new C73893SzJ();
        if (c83093WjJ != null) {
            c83093WjJ.LJLIL = new C83090WjG(this);
        }
    }
}
