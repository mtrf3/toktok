package X;

import Y.ALAdapterS11S0200000_14;
import Y.ARunnableS33S0200000_14;
import Y.AUListenerS38S0201000_14;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.WlB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83209WlB implements TKG, InterfaceC82947Wgx {
    public final ViewGroup LJLILLLLZI;
    public final View LJLJI;
    public final View LJLJJI;
    public TKH LJLIL = new C82604WbQ();
    public boolean LJLJJL = true;

    @Override // X.InterfaceC82947Wgx
    public final void LJ() {
    }

    @Override // X.InterfaceC82947Wgx
    public final void LIZLLL() {
        this.LJLJJI.setVisibility(0);
        this.LJLJI.setVisibility(0);
    }

    @Override // X.InterfaceC82947Wgx
    public final void LJFF() {
        this.LJLJI.setTranslationY(0.0f);
    }

    @Override // X.InterfaceC82947Wgx
    public final void LJII() {
        C16880lQ.LJLLL(this.LJLJJI, this.LJLILLLLZI);
    }

    @Override // X.TKG
    public final void LIZIZ(C30461Hm c30461Hm) {
        this.LJLILLLLZI.removeAllViews();
        ViewGroup viewGroup = (ViewGroup) this.LJLJJI.getParent();
        if (viewGroup != null) {
            C16880lQ.LJLLL(this.LJLJJI, viewGroup);
        }
        this.LJLILLLLZI.addView(this.LJLJJI);
        if (this.LJLJJL) {
            this.LJLILLLLZI.post(new ARunnableS33S0200000_14(this, c30461Hm, 40));
        } else {
            this.LJLIL.LJFF();
            LJFF();
        }
    }

    @Override // X.TKG
    public final void LIZJ(C30461Hm c30461Hm) {
        this.LJLIL.LJ();
        if (this.LJLJJL) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addUpdateListener(new AUListenerS38S0201000_14(this, this.LJLJI.getMeasuredHeight(), c30461Hm, 1));
            duration.addListener(new ALAdapterS11S0200000_14(c30461Hm, this, 3));
            duration.start();
            return;
        }
        this.LJLIL.LJII();
        LJII();
    }

    @Override // X.TKG
    public final void LJI(TKH tkh) {
        this.LJLIL = tkh;
    }

    public C83209WlB(ViewGroup viewGroup, View view, View view2) {
        this.LJLILLLLZI = viewGroup;
        this.LJLJJI = view;
        this.LJLJI = view2;
    }

    @Override // X.InterfaceC82947Wgx
    public final void LIZ(float f, int i, int i2) {
        float f2 = ((i - i2) * f) + i2;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.LJLJI.setTranslationY(f2);
    }

    @Override // X.InterfaceC82947Wgx
    public final void LJIIIIZZ(float f, int i, int i2) {
        this.LJLJI.setTranslationY((i2 - i) * f);
    }
}
