package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* renamed from: X.LCi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53872LCi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ C59765Ncv LJLILLLLZI;
    public final /* synthetic */ Drawable LJLJI;

    public C53872LCi(View view, C59765Ncv c59765Ncv, Drawable drawable) {
        this.LJLIL = view;
        this.LJLILLLLZI = c59765Ncv;
        this.LJLJI = drawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        View view = this.LJLIL;
        if (view != null) {
            C59765Ncv c59765Ncv = this.LJLILLLLZI;
            Drawable drawable = this.LJLJI;
            c59765Ncv.getClass();
            if (drawable instanceof GradientDrawable) {
                ((GradientDrawable) drawable).setColor(intValue);
            }
            view.setBackground(drawable);
        }
    }
}
