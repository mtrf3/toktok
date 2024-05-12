package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KSC extends AnimatorListenerAdapter {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Animator LJLILLLLZI;
    public final /* synthetic */ KSB LJLJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        String str = this.LJLIL;
        if (str != null) {
            this.LJLJI.setPreloadCover(str);
        }
        this.LJLILLLLZI.start();
    }

    public KSC(String str, Animator animator, KSB ksb) {
        this.LJLIL = str;
        this.LJLILLLLZI = animator;
        this.LJLJI = ksb;
    }
}
