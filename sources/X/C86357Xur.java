package X;

import android.animation.Animator;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.Xur, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86357Xur implements Animator.AnimatorListener {
    public final /* synthetic */ LabelContainerWidget LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        ViewGroup.LayoutParams layoutParams = this.LJLIL.LL().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
        }
        LabelContainerWidget labelContainerWidget = this.LJLIL;
        long j = this.LJLJI;
        C86323XuJ.LIZ(labelContainerWidget.LJLZ(), false);
        labelContainerWidget.LL = j;
        labelContainerWidget.LJZL = new CountDownTimerC86356Xuq(j, labelContainerWidget);
        CountDownTimerC86356Xuq countDownTimerC86356Xuq = this.LJLIL.LJZL;
        if (countDownTimerC86356Xuq != null) {
            countDownTimerC86356Xuq.start();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        TuxTextView tuxTextView = this.LJLIL.LLD;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(this.LJLILLLLZI);
    }

    public C86357Xur(LabelContainerWidget labelContainerWidget, String str, long j) {
        this.LJLIL = labelContainerWidget;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
    }
}
