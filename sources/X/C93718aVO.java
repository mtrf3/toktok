package X;

import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.aVO, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93718aVO {
    public ValueAnimator LIZ;
    public boolean LIZIZ;
    public final C93919aYd LIZJ = new C93919aYd(0.34f, 1.0f);

    public final void LIZ(View view, View alphaView) {
        o.LJIIIZ(alphaView, "alphaView");
        view.setOnTouchListener(new ViewOnTouchListenerC93717aVN(this, view, alphaView));
    }
}
