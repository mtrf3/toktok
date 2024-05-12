package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.Weo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82814Weo implements Animator.AnimatorListener {
    public TextUtils.TruncateAt LJLIL = TextUtils.TruncateAt.END;
    public final /* synthetic */ C82815Wep LJLILLLLZI;
    public final /* synthetic */ ValueAnimator LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ float LJLJJL;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLILLLLZI.LIZLLL.setEllipsize(this.LJLIL);
        this.LJLJI.removeAllUpdateListeners();
        C16880lQ.LJLLI(this.LJLJI, this);
        this.LJLJJI.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLILLLLZI.LIZLLL.setEllipsize(this.LJLIL);
        this.LJLJI.removeAllUpdateListeners();
        C16880lQ.LJLLI(this.LJLJI, this);
        this.LJLILLLLZI.LJFF.LIZ(this.LJLJJL);
        this.LJLJJI.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        TextUtils.TruncateAt ellipsize = this.LJLILLLLZI.LIZLLL.getEllipsize();
        o.LJIIIIZZ(ellipsize, "recordTitleView.ellipsize");
        this.LJLIL = ellipsize;
        this.LJLILLLLZI.LIZLLL.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    }

    public C82814Weo(C82815Wep c82815Wep, ValueAnimator valueAnimator, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, float f) {
        this.LJLILLLLZI = c82815Wep;
        this.LJLJI = valueAnimator;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = f;
    }
}
