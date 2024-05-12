package X;

import Y.ALAdapterS11S0200000_14;
import Y.ARunnableS33S0200000_14;
import Y.AUListenerS38S0201000_14;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.Wgw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82946Wgw implements TKG, InterfaceC82947Wgx {
    public TKH LJLIL = new C82604WbQ();
    public final FrameLayout LJLILLLLZI;
    public final View LJLJI;
    public final View LJLJJI;

    @Override // X.InterfaceC82947Wgx
    public final void LJ() {
    }

    @Override // X.InterfaceC82947Wgx
    public final void LJFF() {
    }

    @Override // X.InterfaceC82947Wgx
    public final void LIZLLL() {
        this.LJLJI.setVisibility(0);
    }

    @Override // X.InterfaceC82947Wgx
    public final void LJII() {
        C16880lQ.LJLLLL(this.LJLJJI, this.LJLILLLLZI);
    }

    @Override // X.TKG
    public final void LIZIZ(C30461Hm c30461Hm) {
        this.LJLILLLLZI.removeAllViews();
        this.LJLILLLLZI.addView(this.LJLJJI);
        this.LJLILLLLZI.post(new ARunnableS33S0200000_14(this, c30461Hm, 34));
    }

    @Override // X.TKG
    public final void LIZJ(C30461Hm c30461Hm) {
        this.LJLIL.LJ();
        c30461Hm.LJ();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
        duration.setInterpolator(new C81271Vv1());
        duration.addUpdateListener(new AUListenerS38S0201000_14(this, this.LJLJI.getMeasuredHeight(), c30461Hm, 0));
        duration.addListener(new ALAdapterS11S0200000_14(c30461Hm, this, 1));
        duration.start();
    }

    @Override // X.TKG
    public final void LJI(TKH tkh) {
        this.LJLIL = tkh;
    }

    public C82946Wgw(FrameLayout frameLayout, View view, View view2) {
        this.LJLILLLLZI = frameLayout;
        this.LJLJJI = view;
        this.LJLJI = view2;
    }

    @Override // X.InterfaceC82947Wgx
    public final void LIZ(float f, int i, int i2) {
        this.LJLJI.setTranslationY(((i - i2) * f) + i2);
        this.LJLJI.setAlpha(f);
    }

    @Override // X.InterfaceC82947Wgx
    public final void LJIIIIZZ(float f, int i, int i2) {
        this.LJLJI.setTranslationY((i2 - i) * f);
        this.LJLJI.setAlpha(1.0f - f);
    }
}
