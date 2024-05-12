package X;

import android.animation.ValueAnimator;

/* renamed from: X.XXo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85000XXo implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C84995XXj LJLIL;
    public final /* synthetic */ C56K LJLILLLLZI;
    public final /* synthetic */ C56K LJLJI;

    public C85000XXo(C84995XXj c84995XXj, C56K c56k, C56K c56k2) {
        this.LJLIL = c84995XXj;
        this.LJLILLLLZI = c56k;
        this.LJLJI = c56k2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        C62846OlW c62846OlW = this.LJLIL.LJLILLLLZI;
        if (c62846OlW != null) {
            c62846OlW.setScaleX(floatValue);
        }
        C62846OlW c62846OlW2 = this.LJLIL.LJLILLLLZI;
        if (c62846OlW2 != null) {
            c62846OlW2.setScaleY(floatValue);
        }
        C62846OlW c62846OlW3 = this.LJLIL.LJLILLLLZI;
        if (c62846OlW3 != null) {
            c62846OlW3.setAlpha((floatValue - this.LJLILLLLZI.element) / this.LJLJI.element);
        }
        C62846OlW c62846OlW4 = this.LJLIL.LJLJI;
        if (c62846OlW4 != null) {
            c62846OlW4.setScaleX((this.LJLILLLLZI.element + 1.0f) - floatValue);
        }
        C62846OlW c62846OlW5 = this.LJLIL.LJLJI;
        if (c62846OlW5 != null) {
            c62846OlW5.setScaleY((this.LJLILLLLZI.element + 1.0f) - floatValue);
        }
        C62846OlW c62846OlW6 = this.LJLIL.LJLJI;
        if (c62846OlW6 == null) {
            return;
        }
        c62846OlW6.setAlpha((1.0f - floatValue) / this.LJLJI.element);
    }
}
