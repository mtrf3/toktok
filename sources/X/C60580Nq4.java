package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Nq4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60580Nq4 implements InterfaceC60581Nq5 {
    public final View LIZ;
    public final View LIZIZ;

    @Override // X.InterfaceC60581Nq5
    public final Animator LIZ() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LIZ, "alpha", 1.0f, 0.0f);
        o.LJFF(ofFloat, "ObjectAnimator.ofFloat(t…iew, \"alpha\", 1.0f, 0.0f)");
        return ofFloat;
    }

    @Override // X.InterfaceC60581Nq5
    public final void LIZIZ() {
        View view = this.LIZ;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 1.0f);
        o.LJFF(ofFloat, "ObjectAnimator.ofFloat(t…, targetView.alpha, 1.0f)");
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    @Override // X.InterfaceC60581Nq5
    public final void onInit() {
        this.LIZIZ.setAlpha(0.0f);
    }

    public C60580Nq4(View view) {
        o.LJIIJ(view, "view");
        this.LIZIZ = view;
        this.LIZ = view;
    }
}
