package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BAf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28337BAf extends AnimatorListenerAdapter {
    public final /* synthetic */ DrawGuessStartFragment LJLIL;

    public C28337BAf(DrawGuessStartFragment drawGuessStartFragment) {
        this.LJLIL = drawGuessStartFragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C29306Beo.LJI(this.LJLIL._$_findCachedViewById(R.id.a56));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation, boolean z) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation, z);
        InterfaceC30442Bx8.LJJJJLI.LIZ(Boolean.FALSE);
        C29306Beo.LJJLJLI(this.LJLIL._$_findCachedViewById(R.id.a56));
    }
}
