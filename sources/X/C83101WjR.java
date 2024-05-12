package X;

import Y.ALAdapterS11S0200000_14;
import Y.ARunnableS33S0200000_14;
import Y.AUListenerS38S0201000_14;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.WjR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83101WjR extends C82604WbQ implements TKG {
    public TKH LJLIL;
    public boolean LJLILLLLZI;
    public ValueAnimator LJLJI;
    public final View LJLJJI;
    public final long LJLJJL;
    public final long LJLJJLL;
    public final OSZ<String, String> LJLJL;

    @Override // X.TKG
    public final void LIZIZ(C30461Hm c30461Hm) {
        ValueAnimator valueAnimator = this.LJLJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        TKH tkh = this.LJLIL;
        if (tkh != null) {
            tkh.LIZLLL();
        }
        this.LJLJJI.setAlpha(0.0f);
        this.LJLJJI.post(new ARunnableS33S0200000_14(c30461Hm, this, 104));
    }

    @Override // X.TKG
    public final void LIZJ(C30461Hm c30461Hm) {
        String str;
        ValueAnimator valueAnimator = this.LJLJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        TKH tkh = this.LJLIL;
        if (tkh != null) {
            tkh.LJ();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.LJLJJLL);
        o.LJIIIIZZ(duration, "ValueAnimator.ofFloat(0f…on(endTransitionDuration)");
        OSZ<String, String> osz = this.LJLJL;
        if (osz == null || (str = osz.getSecond()) == null) {
            str = "";
        }
        C173216qz.LJ(duration, str, false);
        this.LJLJI = duration;
        int measuredHeight = this.LJLJJI.getMeasuredHeight();
        ValueAnimator valueAnimator2 = this.LJLJI;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS38S0201000_14(c30461Hm, measuredHeight, this, 7));
        }
        ValueAnimator valueAnimator3 = this.LJLJI;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new ALAdapterS11S0200000_14(this, c30461Hm, 14));
        }
        ValueAnimator valueAnimator4 = this.LJLJI;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    @Override // X.TKG
    public final void LJI(TKH tkh) {
        this.LJLIL = tkh;
    }

    public C83101WjR(View target, OSZ osz) {
        o.LJIIIZ(target, "target");
        this.LJLJJI = target;
        this.LJLJJL = 490L;
        this.LJLJJLL = 250L;
        this.LJLJL = osz;
        this.LJLILLLLZI = true;
    }
}
