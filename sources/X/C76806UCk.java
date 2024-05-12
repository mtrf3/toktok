package X;

import android.animation.Animator;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.UCk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76806UCk implements Animator.AnimatorListener {
    public final /* synthetic */ C76805UCj LJLIL;
    public final /* synthetic */ C76810UCo LJLILLLLZI;
    public final /* synthetic */ SpannableStringBuilder LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ int LJLJJL;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o.LJIIIZ(animator, "animator");
        if (this.LJLIL.LJLIL) {
            CMV cmv = this.LJLILLLLZI.LIZIZ;
            cmv.setText(C76799UCd.LIZ(cmv, this.LJLJI, this.LJLJJI));
            C76805UCj c76805UCj = this.LJLIL;
            ViewGroup viewGroup = this.LJLILLLLZI.LIZLLL;
            c76805UCj.getClass();
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (this.LJLIL.LJLIL) {
                ViewGroup viewGroup2 = this.LJLILLLLZI.LIZLLL;
                C78866UxK.LJJLJ(viewGroup2.getMeasuredWidth(), viewGroup2);
            }
            this.LJLIL.LJIIIIZZ(this.LJLJJL, null);
        }
    }

    public C76806UCk(C76805UCj c76805UCj, C76810UCo c76810UCo, SpannableStringBuilder spannableStringBuilder, boolean z, int i) {
        this.LJLIL = c76805UCj;
        this.LJLILLLLZI = c76810UCo;
        this.LJLJI = spannableStringBuilder;
        this.LJLJJI = z;
        this.LJLJJL = i;
    }
}
