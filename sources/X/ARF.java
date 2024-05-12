package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ARF extends AnimatorListenerAdapter {
    public final /* synthetic */ JBQ LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        SmartImageView smartImageView = this.LJLIL.LJLJI;
        if (smartImageView != null) {
            smartImageView.setTranslationY(this.LJLILLLLZI);
        }
        SmartImageView smartImageView2 = this.LJLIL.LJLJI;
        if (smartImageView2 != null) {
            smartImageView2.setScaleX(1.0f);
        }
        SmartImageView smartImageView3 = this.LJLIL.LJLJI;
        if (smartImageView3 == null) {
            return;
        }
        smartImageView3.setScaleY(1.0f);
    }

    public ARF(JBQ jbq, float f) {
        this.LJLIL = jbq;
        this.LJLILLLLZI = f;
    }
}
