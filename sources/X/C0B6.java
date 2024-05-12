package X;

import Y.IDUListenerS263S0100000;
import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0B6, reason: invalid class name */
/* loaded from: classes.dex */
public class C0B6 implements Animator.AnimatorListener {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final RecyclerView.ViewHolder LJLJJL;
    public final int LJLJJLL;
    public final ValueAnimator LJLJL;
    public boolean LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public float LJLLJ;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.LJLLJ = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.LJLLILLLL) {
            this.LJLJJL.setIsRecyclable(true);
        }
        this.LJLLILLLL = true;
    }

    public C0B6(RecyclerView.ViewHolder viewHolder, int i, float f, float f2, float f3, float f4) {
        this.LJLJJLL = i;
        this.LJLJJL = viewHolder;
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
        this.LJLJI = f3;
        this.LJLJJI = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJLJL = ofFloat;
        ofFloat.addUpdateListener(new IDUListenerS263S0100000(this, 2));
        ofFloat.setTarget(viewHolder.itemView);
        ofFloat.addListener(this);
        this.LJLLJ = 0.0f;
    }
}
