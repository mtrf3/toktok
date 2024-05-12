package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1CU, reason: invalid class name */
/* loaded from: classes.dex */
public class C1CU extends AnimatorListenerAdapter implements InterfaceC03480Bs {
    public final View LJLIL;
    public final View LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public int[] LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public final float LJLJLJ;
    public final float LJLJLLL;

    @Override // X.InterfaceC03480Bs
    public final void LIZIZ(AbstractC03490Bt abstractC03490Bt) {
    }

    @Override // X.InterfaceC03480Bs
    public final void LIZLLL(AbstractC03490Bt abstractC03490Bt) {
    }

    @Override // X.InterfaceC03480Bs
    public final void LJ(C1CW c1cw) {
    }

    @Override // X.InterfaceC03480Bs
    public final void LJFF(AbstractC03490Bt abstractC03490Bt) {
    }

    @Override // X.InterfaceC03480Bs
    public final void LIZJ(AbstractC03490Bt abstractC03490Bt) {
        this.LJLILLLLZI.setTranslationX(this.LJLJLJ);
        this.LJLILLLLZI.setTranslationY(this.LJLJLLL);
        abstractC03490Bt.LJIL(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.LJLJJL == null) {
            this.LJLJJL = new int[2];
        }
        this.LJLJJL[0] = Math.round(this.LJLILLLLZI.getTranslationX() + this.LJLJI);
        this.LJLJJL[1] = Math.round(this.LJLILLLLZI.getTranslationY() + this.LJLJJI);
        this.LJLIL.setTag(R.id.ljx, this.LJLJJL);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.LJLJJLL = this.LJLILLLLZI.getTranslationX();
        this.LJLJL = this.LJLILLLLZI.getTranslationY();
        this.LJLILLLLZI.setTranslationX(this.LJLJLJ);
        this.LJLILLLLZI.setTranslationY(this.LJLJLLL);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        this.LJLILLLLZI.setTranslationX(this.LJLJJLL);
        this.LJLILLLLZI.setTranslationY(this.LJLJL);
    }

    public C1CU(View view, View view2, int i, int i2, float f, float f2) {
        this.LJLILLLLZI = view;
        this.LJLIL = view2;
        this.LJLJI = i - Math.round(view.getTranslationX());
        this.LJLJJI = i2 - Math.round(view.getTranslationY());
        this.LJLJLJ = f;
        this.LJLJLLL = f2;
        int[] iArr = (int[]) view2.getTag(R.id.ljx);
        this.LJLJJL = iArr;
        if (iArr != null) {
            view2.setTag(R.id.ljx, null);
        }
    }
}
