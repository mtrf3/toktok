package X;

import Y.ALAdapterS5S0000000_13;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UHQ extends AnimatorListenerAdapter {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ ViewPropertyAnimator LJLILLLLZI;
    public final /* synthetic */ float LJLJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        this.LJLIL.invoke();
        this.LJLILLLLZI.scaleX(this.LJLJI);
        this.LJLILLLLZI.scaleY(this.LJLJI);
        this.LJLILLLLZI.setDuration(300L);
        this.LJLILLLLZI.setStartDelay(0L);
        this.LJLILLLLZI.setInterpolator(C18950ol.LIZIZ(0.3f, 1.3f, 0.3f, 1.0f));
        this.LJLILLLLZI.setListener(new ALAdapterS5S0000000_13(2));
        this.LJLILLLLZI.start();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        UHR.LIZ = true;
    }

    public UHQ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, ViewPropertyAnimator viewPropertyAnimator, float f) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = viewPropertyAnimator;
        this.LJLJI = f;
    }
}
