package X;

import android.animation.Animator;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S3Q implements Animator.AnimatorListener {
    public final /* synthetic */ S3N LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        TuxTextView tuxTextView = this.LJLIL.LJIIL;
        if (tuxTextView != null) {
            tuxTextView.setText(this.LJLILLLLZI);
            this.LJLIL.LJIILL = null;
        } else {
            o.LJIJI("topSaleTitle");
            throw null;
        }
    }

    public S3Q(S3N s3n, String str) {
        this.LJLIL = s3n;
        this.LJLILLLLZI = str;
    }
}
