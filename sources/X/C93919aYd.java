package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;
import kotlin.jvm.internal.o;

/* renamed from: X.aYd, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93919aYd {
    public final float LIZ;
    public final float LIZIZ;

    public /* synthetic */ C93919aYd() {
        this(0.0f, 1.0f);
    }

    public C93919aYd(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }

    public final ValueAnimator LIZ(View view, InterfaceC65784Pro<C76800UCe> onEnd) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(onEnd, "onEnd");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "Alpha", this.LIZ, this.LIZIZ);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new PathInterpolator(0.44f, 0.05f, 0.55f, 0.95f));
        ofFloat.addListener(new C94322af8(onEnd));
        ofFloat.start();
        return ofFloat;
    }

    public final ValueAnimator LIZIZ(View view, InterfaceC65784Pro<C76800UCe> onEnd) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(onEnd, "onEnd");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "Alpha", this.LIZIZ, this.LIZ);
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(new PathInterpolator(0.44f, 0.05f, 0.55f, 0.95f));
        ofFloat.addListener(new C94323af9(onEnd));
        ofFloat.start();
        return ofFloat;
    }
}
