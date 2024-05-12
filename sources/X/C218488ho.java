package X;

import android.animation.Animator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout;

/* renamed from: X.8ho, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218488ho {
    public static void LIZ(Animator animator, float f) {
        if (animator == null) {
            return;
        }
        C8RO c8ro = CommentNestedLayout.LLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("animate with time scaling ");
        LIZ.append(f);
        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
        if (((Number) C218608i0.LIZ.getValue()).intValue() == 1) {
            animator.setDuration(C78842Uww.LJIIJJI(f, 0.4f, 1.0f) * LiveCoverMinSizeSetting.DEFAULT);
            animator.setInterpolator(C55953Lxd.LIZLLL());
        } else {
            animator.setDuration(150L);
            animator.setInterpolator(new AccelerateDecelerateInterpolator());
        }
    }
}
