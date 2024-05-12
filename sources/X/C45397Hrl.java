package X;

import Y.ARunnableS43S0100000_7;
import android.animation.Animator;
import android.content.Context;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Hrl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45397Hrl implements Animator.AnimatorListener {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ AlertDialogC45396Hrk LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TextView textView = this.LJLILLLLZI.LJLLI;
        if (textView != null) {
            textView.setText(R.string.imf);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.LJLILLLLZI.LJLLLL.post(new ARunnableS43S0100000_7(this, 129));
    }

    public C45397Hrl(Context context, AlertDialogC45396Hrk alertDialogC45396Hrk) {
        this.LJLILLLLZI = alertDialogC45396Hrk;
        this.LJLIL = context;
    }
}
