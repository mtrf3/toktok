package X;

import Y.ALAdapterS11S0100000_14;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;

/* renamed from: X.Voj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80881Voj extends AbstractC261710z {
    public static final int[] LJIIJJI = {0, 1350, 2700, 4050};
    public static final int[] LJIIL = {667, 2017, 3367, 4717};
    public static final int[] LJIILIIL = {1000, 2350, 3700, 5050};
    public static final C80882Vok LJIILJJIL = new C80882Vok(Float.class);
    public static final C80887Vop LJIILL = new C80887Vop(Float.class);
    public ObjectAnimator LIZLLL;
    public ObjectAnimator LJ;
    public final C30901Je LJFF;
    public final C80601VkD LJI;
    public int LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public C0FH LJIIJ;

    @Override // X.AbstractC261710z
    public final void LJIIIZ() {
        this.LJIIJ = null;
    }

    public final void LJIIL() {
        this.LJII = 0;
        ((int[]) this.LIZJ)[0] = C78966Uyw.LJIILJJIL(this.LJI.LIZJ[0], ((AbstractC80872Voa) this.LIZ).LJLL);
        this.LJIIIZ = 0.0f;
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
        if (this.LJ.isRunning()) {
            return;
        }
        if (((Drawable) this.LIZ).isVisible()) {
            this.LJ.start();
        } else {
            LIZJ();
        }
    }

    @Override // X.AbstractC261710z
    public final void LJIIIIZZ() {
        if (this.LIZLLL == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, LJIILJJIL, 0.0f, 1.0f);
            this.LIZLLL = ofFloat;
            ofFloat.setDuration(5400L);
            this.LIZLLL.setInterpolator(null);
            this.LIZLLL.setRepeatCount(-1);
            this.LIZLLL.addListener(new ALAdapterS11S0100000_14(this, 48));
        }
        if (this.LJ == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, LJIILL, 0.0f, 1.0f);
            this.LJ = ofFloat2;
            ofFloat2.setDuration(333L);
            this.LJ.setInterpolator(this.LJFF);
            this.LJ.addListener(new ALAdapterS11S0100000_14(this, 49));
        }
        LJIIL();
        this.LIZLLL.start();
    }

    @Override // X.AbstractC261710z
    public final void LJFF() {
        LJIIL();
    }

    public C80881Voj(C80601VkD c80601VkD) {
        super(1);
        this.LJI = c80601VkD;
        this.LJFF = new C30901Je();
    }

    @Override // X.AbstractC261710z
    public final void LJI(C80878Vog c80878Vog) {
        this.LJIIJ = c80878Vog;
    }
}
