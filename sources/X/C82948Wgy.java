package X;

import Y.ALAdapterS11S0200000_14;
import Y.ARunnableS33S0200000_14;
import Y.AUListenerS38S0201000_14;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.Wgy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82948Wgy implements TKG, InterfaceC82947Wgx {
    public TKH LJLIL = new C82604WbQ();
    public final View LJLILLLLZI;
    public final View LJLJI;

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
        this.LJLJI.setVisibility(4);
    }

    @Override // X.TKG
    public final void LIZIZ(C30461Hm c30461Hm) {
        this.LJLILLLLZI.post(new ARunnableS33S0200000_14(this, c30461Hm, 100));
    }

    @Override // X.TKG
    public final void LIZJ(C30461Hm c30461Hm) {
        this.LJLIL.LJ();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.addUpdateListener(new AUListenerS38S0201000_14(this, this.LJLILLLLZI.getMeasuredHeight(), c30461Hm, 6));
        duration.addListener(new ALAdapterS11S0200000_14(c30461Hm, this, 12));
        duration.start();
    }

    @Override // X.TKG
    public final void LJI(TKH tkh) {
        this.LJLIL = tkh;
    }

    public C82948Wgy(View view, View view2) {
        this.LJLILLLLZI = view;
        this.LJLJI = view2;
    }

    @Override // X.InterfaceC82947Wgx
    public final void LIZ(float f, int i, int i2) {
        this.LJLILLLLZI.setTranslationY(((i - i2) * f) + i2);
    }

    @Override // X.InterfaceC82947Wgx
    public final void LJIIIIZZ(float f, int i, int i2) {
        this.LJLILLLLZI.setTranslationY((i2 - i) * f);
    }
}
