package X;

import Y.ALAdapterS11S0200000_14;
import Y.AUListenerS38S0201000_14;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Wgz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82949Wgz implements TKG, InterfaceC82947Wgx {
    public TKH LJLIL = new C82604WbQ();
    public final ViewGroup LJLILLLLZI;
    public final View LJLJI;
    public final View LJLJJI;
    public ValueAnimator LJLJJL;
    public ValueAnimator LJLJJLL;

    @Override // X.InterfaceC82947Wgx
    public final void LJFF() {
    }

    @Override // X.InterfaceC82947Wgx
    public final void LIZLLL() {
        this.LJLJJI.setVisibility(4);
        this.LJLJI.setVisibility(0);
    }

    @Override // X.InterfaceC82947Wgx
    public final void LJ() {
        this.LJLJJI.setVisibility(0);
    }

    @Override // X.InterfaceC82947Wgx
    public final void LJII() {
        C16880lQ.LJLLL(this.LJLJI, this.LJLILLLLZI);
    }

    @Override // X.TKG
    public final void LIZIZ(C30461Hm c30461Hm) {
        ValueAnimator valueAnimator = this.LJLJJLL;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.LJLJJLL.cancel();
        }
        this.LJLJI.setAlpha(0.0f);
        if (this.LJLJI.getParent() != null) {
            C16880lQ.LJLLL(this.LJLJI, (ViewGroup) this.LJLJI.getParent());
        }
        this.LJLILLLLZI.addView(this.LJLJI);
        this.LJLIL.LIZLLL();
        LIZLLL();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(new SJM());
        duration.addUpdateListener(new AUListenerS38S0201000_14(this, this.LJLJI.getMeasuredHeight(), c30461Hm, 3));
        duration.addListener(new ALAdapterS11S0200000_14(c30461Hm, this, 5));
        duration.start();
        this.LJLJJL = duration;
    }

    @Override // X.TKG
    public final void LIZJ(C30461Hm c30461Hm) {
        ValueAnimator valueAnimator = this.LJLJJL;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.LJLJJL.cancel();
        }
        this.LJLIL.LJ();
        LJ();
        c30461Hm.LJ();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(new SJM());
        duration.addUpdateListener(new AUListenerS38S0201000_14(this, this.LJLJI.getMeasuredHeight(), c30461Hm, 4));
        duration.addListener(new ALAdapterS11S0200000_14(c30461Hm, this, 6));
        duration.start();
        this.LJLJJLL = duration;
    }

    @Override // X.TKG
    public final void LJI(TKH tkh) {
        this.LJLIL = tkh;
    }

    public C82949Wgz(ViewGroup viewGroup, View view, View view2) {
        this.LJLILLLLZI = viewGroup;
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
