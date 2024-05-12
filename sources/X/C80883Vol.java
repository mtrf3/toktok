package X;

import Y.ALAdapterS11S0100000_14;
import android.animation.ObjectAnimator;
import java.util.Arrays;

/* renamed from: X.Vol, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80883Vol extends AbstractC261710z {
    public static final C80886Voo LJIIIZ = new C80886Voo(Float.class);
    public ObjectAnimator LIZLLL;
    public final C30901Je LJ;
    public final C80602VkE LJFF;
    public int LJI;
    public boolean LJII;
    public float LJIIIIZZ;

    @Override // X.AbstractC261710z
    public final void LJI(C80878Vog c80878Vog) {
    }

    @Override // X.AbstractC261710z
    public final void LJII() {
    }

    @Override // X.AbstractC261710z
    public final void LJIIIZ() {
    }

    public final void LJIIL() {
        this.LJII = true;
        this.LJI = 1;
        Arrays.fill((int[]) this.LIZJ, C78966Uyw.LJIILJJIL(this.LJFF.LIZJ[0], ((AbstractC80872Voa) this.LIZ).LJLL));
    }

    @Override // X.AbstractC261710z
    public final void LIZJ() {
        ObjectAnimator objectAnimator = this.LIZLLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // X.AbstractC261710z
    public final void LJIIIIZZ() {
        if (this.LIZLLL == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, LJIIIZ, 0.0f, 1.0f);
            this.LIZLLL = ofFloat;
            ofFloat.setDuration(333L);
            this.LIZLLL.setInterpolator(null);
            this.LIZLLL.setRepeatCount(-1);
            this.LIZLLL.addListener(new ALAdapterS11S0100000_14(this, 52));
        }
        LJIIL();
        this.LIZLLL.start();
    }

    @Override // X.AbstractC261710z
    public final void LJFF() {
        LJIIL();
    }

    public C80883Vol(C80602VkE c80602VkE) {
        super(3);
        this.LJI = 1;
        this.LJFF = c80602VkE;
        this.LJ = new C30901Je();
    }
}
