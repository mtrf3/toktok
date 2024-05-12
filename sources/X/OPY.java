package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* loaded from: classes11.dex */
public final class OPY implements W4Z<InterfaceC81599W0t> {
    public final boolean LIZ = false;
    public final W5G LIZIZ;

    @Override // X.W4Z
    public final void LIZIZ(String str, Throwable th) {
    }

    @Override // X.W4Z
    public final void LIZJ(String str) {
    }

    @Override // X.W4Z
    public final void LJ(String str, Throwable th) {
    }

    @Override // X.W4Z
    public final void LJI(Object obj, String str) {
    }

    public OPY(C62846OlW c62846OlW) {
        this.LIZIZ = c62846OlW;
    }

    @Override // X.W4Z
    public final /* bridge */ /* synthetic */ void LIZLLL(Object obj, String str) {
    }

    @Override // X.W4Z
    public final void LJFF(String str, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
        InterfaceC81599W0t interfaceC81599W0t2 = interfaceC81599W0t;
        if (animatable == null) {
            return;
        }
        ValueAnimator LIZ = V9D.LIZ((AnimatedDrawable2) animatable);
        LIZ.setRepeatCount(-1);
        LIZ.start();
        if (!this.LIZ || interfaceC81599W0t2 == null) {
            return;
        }
        this.LIZIZ.getLayoutParams().width = KL2.LJIIJJI(this.LIZIZ.getContext());
        this.LIZIZ.getLayoutParams().height = -2;
        this.LIZIZ.setAspectRatio(interfaceC81599W0t2.getWidth() / interfaceC81599W0t2.getHeight());
    }
}
