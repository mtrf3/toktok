package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notification.creator.power.NoticeTabCell;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MUK extends AnimatorListenerAdapter {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ NoticeTabCell LJLJI;
    public final /* synthetic */ String LJLJJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (this.LJLIL > this.LJLILLLLZI) {
            TuxTextView tuxTextView = this.LJLJI.LJLIL;
            if (tuxTextView != null) {
                tuxTextView.setText(this.LJLJJI);
            } else {
                o.LJIJI("tabText");
                throw null;
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (this.LJLIL <= this.LJLILLLLZI) {
            TuxTextView tuxTextView = this.LJLJI.LJLIL;
            if (tuxTextView != null) {
                tuxTextView.setText(this.LJLJJI);
            } else {
                o.LJIJI("tabText");
                throw null;
            }
        }
    }

    public MUK(float f, int i, NoticeTabCell noticeTabCell, String str) {
        this.LJLIL = f;
        this.LJLILLLLZI = i;
        this.LJLJI = noticeTabCell;
        this.LJLJJI = str;
    }
}
