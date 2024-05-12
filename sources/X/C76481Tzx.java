package X;

import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Tzx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76481Tzx implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C47121t6 LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public C76481Tzx(boolean z, View view, int i, C47121t6 c47121t6, int i2) {
        this.LJLIL = z;
        this.LJLILLLLZI = view;
        this.LJLJI = i;
        this.LJLJJI = c47121t6;
        this.LJLJJL = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if (this.LJLIL) {
            View view = this.LJLILLLLZI;
            int i = this.LJLJI;
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setMinimumWidth(C15380j0.LIZ(((Float) animatedValue).floatValue()) + i);
        }
        C47121t6 c47121t6 = this.LJLJJI;
        int i2 = this.LJLJJL;
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        C29306Beo.LJJJLIIL(C15380j0.LIZ(((Float) animatedValue).floatValue()) + i2, c47121t6);
    }
}
