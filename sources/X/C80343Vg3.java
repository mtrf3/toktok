package X;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vg3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80343Vg3 extends AbstractC80331Vfr {
    public final C80356VgG LIZLLL;
    public final ViewOnFocusChangeListenerC80358VgI LJ;
    public final C80345Vg5 LJFF;
    public final C80349Vg9 LJI;
    public AnimatorSet LJII;
    public ValueAnimator LJIIIIZZ;

    @Override // X.AbstractC80331Vfr
    public final void LIZ() {
        this.LIZ.setEndIconDrawable(C20110qd.LIZ(this.LIZIZ, R.drawable.bs2));
        C80315Vfb c80315Vfb = this.LIZ;
        c80315Vfb.setEndIconContentDescription(c80315Vfb.getResources().getText(R.string.dfi));
        this.LIZ.setEndIconOnClickListener(new ViewOnClickListenerC80330Vfq(this));
        C80315Vfb c80315Vfb2 = this.LIZ;
        C80345Vg5 c80345Vg5 = this.LJFF;
        c80315Vfb2.LLILZLL.add(c80345Vg5);
        if (c80315Vfb2.LJLJJL != null) {
            c80345Vg5.LIZ(c80315Vfb2);
        }
        this.LIZ.LLJI.add(this.LJI);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C80237VeL.LIZLLL);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new C80348Vg8(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = C80237VeL.LIZ;
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new C80353VgD(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.LJII = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.LJII.addListener(new C80359VgJ(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new C80353VgD(this));
        this.LJIIIIZZ = ofFloat3;
        ofFloat3.addListener(new C80360VgK(this));
    }

    public C80343Vg3(C80315Vfb c80315Vfb) {
        super(c80315Vfb);
        this.LIZLLL = new C80356VgG(this);
        this.LJ = new ViewOnFocusChangeListenerC80358VgI(this);
        this.LJFF = new C80345Vg5(this);
        this.LJI = new C80349Vg9(this);
    }

    @Override // X.AbstractC80331Vfr
    public final void LIZJ(boolean z) {
        if (this.LIZ.getSuffixText() == null) {
            return;
        }
        LIZLLL(z);
    }

    public final void LIZLLL(boolean z) {
        boolean z2;
        if (this.LIZ.LJI() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (!this.LJII.isRunning()) {
                this.LJIIIIZZ.cancel();
                this.LJII.start();
                if (z2) {
                    this.LJII.end();
                    return;
                }
                return;
            }
            return;
        }
        this.LJII.cancel();
        this.LJIIIIZZ.start();
        if (!z2) {
            return;
        }
        this.LJIIIIZZ.end();
    }
}
