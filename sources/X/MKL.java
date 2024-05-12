package X;

import Y.ALAdapterS7S0100000_9;
import Y.AUListenerS97S0100000_9;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import kotlin.jvm.internal.AqS18S1101000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MKL extends AnimatorListenerAdapter {
    public final /* synthetic */ C68322mC<ObjectAnimator> LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ C68322mC<ObjectAnimator> LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ OSZ<Integer, Integer> LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, android.animation.ObjectAnimator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, android.animation.ObjectAnimator, java.lang.Object] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C68322mC<ObjectAnimator> c68322mC = this.LJLIL;
        ?? ofFloat = ObjectAnimator.ofFloat(this.LJLILLLLZI, "scaleX", 2.0f, 0.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(view, \"scaleX\", 2f, 0f)");
        c68322mC.element = ofFloat;
        C68322mC<ObjectAnimator> c68322mC2 = this.LJLJI;
        ?? ofFloat2 = ObjectAnimator.ofFloat(this.LJLILLLLZI, "scaleY", 2.0f, 0.0f);
        o.LJIIIIZZ(ofFloat2, "ofFloat(view, \"scaleY\", 2f, 0f)");
        c68322mC2.element = ofFloat2;
        C62822Ol8 c62822Ol8 = C88124YiG.LIZJ;
        ((AnimatorSet) c62822Ol8.getValue()).setInterpolator(C55953Lxd.LJFF());
        ((AnimatorSet) c62822Ol8.getValue()).play(this.LJLIL.element).with(this.LJLJI.element);
        PointF LJFF = C8TC.LIZIZ.LJFF();
        if (LJFF == null) {
            LJFF = new PointF(0.0f, 0.0f);
        }
        float f = 0;
        ValueAnimator ofObject = ValueAnimator.ofObject(new MKJ(new PointF(f - (this.LJLJJI / 10), LJFF.y), new PointF(f - (this.LJLJJI / 2), LJFF.y)), new PointF(this.LJLJJL.getSecond().intValue(), this.LJLJJL.getFirst().intValue()), LJFF);
        ofObject.setTarget(this.LJLILLLLZI);
        ofObject.addUpdateListener(new AUListenerS97S0100000_9(this.LJLILLLLZI, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJLL;
        animatorSet.setDuration(400L);
        animatorSet.addListener(new ALAdapterS7S0100000_9(interfaceC65784Pro, 0));
        animatorSet.playTogether(ofObject, c62822Ol8.getValue());
        animatorSet.start();
    }

    public MKL(C68322mC c68322mC, View view, C68322mC c68322mC2, float f, OSZ osz, AqS18S1101000_1 aqS18S1101000_1) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = view;
        this.LJLJI = c68322mC2;
        this.LJLJJI = f;
        this.LJLJJL = osz;
        this.LJLJJLL = aqS18S1101000_1;
    }
}
