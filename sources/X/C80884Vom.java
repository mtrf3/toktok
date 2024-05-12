package X;

import Y.ALAdapterS11S0100000_14;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vom, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80884Vom extends AbstractC261710z {
    public static final int[] LJIIJJI = {533, 567, 850, 750};
    public static final int[] LJIIL = {1267, 1000, 333, 0};
    public static final C80885Von LJIILIIL = new C80885Von(Float.class);
    public ObjectAnimator LIZLLL;
    public final Interpolator[] LJ;
    public final C80602VkE LJFF;
    public int LJI;
    public boolean LJII;
    public float LJIIIIZZ;
    public boolean LJIIIZ;
    public C0FH LJIIJ;

    @Override // X.AbstractC261710z
    public final void LJIIIZ() {
        this.LJIIJ = null;
    }

    public final void LJIIL() {
        this.LJI = 0;
        int LJIILJJIL = C78966Uyw.LJIILJJIL(this.LJFF.LIZJ[0], ((AbstractC80872Voa) this.LIZ).LJLL);
        int[] iArr = (int[]) this.LIZJ;
        iArr[0] = LJIILJJIL;
        iArr[1] = LJIILJJIL;
    }

    @Override // X.AbstractC261710z
    public final void LIZJ() {
        ObjectAnimator objectAnimator = this.LIZLLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // X.AbstractC261710z
    public final void LJII() {
        if (((Drawable) this.LIZ).isVisible()) {
            this.LJIIIZ = true;
            this.LIZLLL.setRepeatCount(0);
        } else {
            LIZJ();
        }
    }

    @Override // X.AbstractC261710z
    public final void LJIIIIZZ() {
        if (this.LIZLLL == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, LJIILIIL, 0.0f, 1.0f);
            this.LIZLLL = ofFloat;
            ofFloat.setDuration(1800L);
            this.LIZLLL.setInterpolator(null);
            this.LIZLLL.setRepeatCount(-1);
            this.LIZLLL.addListener(new ALAdapterS11S0100000_14(this, 53));
        }
        LJIIL();
        this.LIZLLL.start();
    }

    @Override // X.AbstractC261710z
    public final void LJFF() {
        LJIIL();
    }

    @Override // X.AbstractC261710z
    public final void LJI(C80878Vog c80878Vog) {
        this.LJIIJ = c80878Vog;
    }

    public C80884Vom(Context context, C80602VkE c80602VkE) {
        super(2);
        this.LJFF = c80602VkE;
        this.LJ = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.animator.d), AnimationUtils.loadInterpolator(context, R.animator.e), AnimationUtils.loadInterpolator(context, R.animator.f), AnimationUtils.loadInterpolator(context, R.animator.g)};
    }
}
