package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.Uk8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78048Uk8 extends C87797Ycz {
    public final /* synthetic */ InterfaceC78049Uk9 LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LIZ(this.LJLILLLLZI.element);
    }

    public C78048Uk8(C78047Uk7 c78047Uk7, C76732zl c76732zl) {
        this.LJLIL = c78047Uk7;
        this.LJLILLLLZI = c76732zl;
    }
}
