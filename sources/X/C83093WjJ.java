package X;

import Y.ALAdapterS11S0200000_14;
import Y.ARunnableS33S0200000_14;
import Y.AUListenerS38S0201000_14;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.WjJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83093WjJ extends C82604WbQ implements TKG {
    public TKH LJLIL;
    public boolean LJLILLLLZI;
    public final View LJLJI;
    public final long LJLJJI;

    public C83093WjJ(View target) {
        o.LJIIIZ(target, "target");
        this.LJLJI = target;
        this.LJLJJI = 200L;
        this.LJLILLLLZI = true;
    }

    @Override // X.TKG
    public final void LIZIZ(C30461Hm c30461Hm) {
        this.LJLJI.post(new ARunnableS33S0200000_14(c30461Hm, this, 84));
    }

    @Override // X.TKG
    public final void LIZJ(C30461Hm c30461Hm) {
        TKH tkh = this.LJLIL;
        if (tkh != null) {
            tkh.LJ();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.LJLJJI);
        o.LJIIIIZZ(duration, "ValueAnimator.ofFloat(0f…ation(transitionDuration)");
        C173216qz.LJ(duration, "filter_panel_hide", false);
        duration.addUpdateListener(new AUListenerS38S0201000_14(c30461Hm, this.LJLJI.getMeasuredHeight(), this, 5));
        duration.addListener(new ALAdapterS11S0200000_14(this, c30461Hm, 7));
        duration.start();
    }

    @Override // X.TKG
    public final void LJI(TKH tkh) {
        this.LJLIL = tkh;
    }
}
