package X;

import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.AqS156S0200000_9;

/* renamed from: X.Mia, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57568Mia extends AbstractC55918Lx4 {
    public C80842Vo6 LIZIZ;
    public View LIZJ;
    public View LIZLLL;

    @Override // X.AbstractC55918Lx4
    public final void LIZIZ() {
        View view = this.LIZJ;
        if (view != null) {
            view.clearAnimation();
        }
        View view2 = this.LIZLLL;
        if (view2 != null) {
            view2.clearAnimation();
        }
    }

    @Override // X.AbstractC55918Lx4
    public final void LJ(View view, View view2) {
        this.LIZJ = view;
        this.LIZLLL = view2;
        this.LIZIZ = LJFF(90.0f, 0.0f, view.getWidth() / 2.0f, view.getHeight() / 2.0f, true, null);
        view2.startAnimation(LJFF(0.0f, 90.0f, view.getWidth() / 2.0f, view.getHeight() / 2.0f, false, new AqS156S0200000_9(view, this, 45)));
    }

    public final C80842Vo6 LJFF(float f, float f2, float f3, float f4, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C80842Vo6 c80842Vo6 = new C80842Vo6(f, f2, f3, f4);
        c80842Vo6.setDuration(300L);
        c80842Vo6.setFillAfter(true);
        c80842Vo6.setInterpolator(new LinearInterpolator());
        c80842Vo6.setAnimationListener(new AnimationAnimationListenerC57566MiY(z, this, interfaceC65784Pro));
        return c80842Vo6;
    }
}
