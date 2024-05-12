package X;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Vrp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81073Vrp implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    public C81073Vrp(View view, float f) {
        this.LJLIL = view;
        this.LJLILLLLZI = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        float f;
        Float f2;
        o.LJIIIZ(animation, "animation");
        PropertyValuesHolder[] values = animation.getValues();
        if ((values instanceof Float) && (f2 = (Float) values) != null) {
            f = f2.floatValue();
        } else {
            f = 1.0f;
        }
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        float f3 = this.LJLILLLLZI;
        view.setAlpha(f3 - (f * f3));
    }
}
