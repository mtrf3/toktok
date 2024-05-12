package X;

import Y.ARunnableS34S0200000_15;
import Y.ARunnableS51S0100000_15;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bytedance.tux.icon.TuxIconView;

/* renamed from: X.YAi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86944YAi {
    public final View LIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL = true;

    public final void LIZ(boolean z) {
        if (this.LIZJ) {
            return;
        }
        if (z) {
            View view = this.LIZ;
            ViewPropertyAnimator animate = view.animate();
            if (this.LIZLLL) {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZIZ;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                this.LIZLLL = false;
            }
            C17N.LJJLIIIJJI(view);
            animate.setDuration(250L);
            animate.translationX(0.0f);
            animate.withStartAction(new ARunnableS51S0100000_15(this, 128));
            animate.withEndAction(new ARunnableS34S0200000_15(view, this, 65));
            animate.start();
            return;
        }
        View view2 = this.LIZ;
        ViewPropertyAnimator animate2 = view2.animate();
        animate2.setDuration(250L);
        animate2.translationX(-100.0f);
        animate2.withStartAction(new ARunnableS51S0100000_15(this, 129));
        animate2.withEndAction(new ARunnableS34S0200000_15(view2, this, 66));
        animate2.start();
    }

    public C86944YAi(TuxIconView tuxIconView, InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZ = tuxIconView;
        this.LIZIZ = interfaceC65784Pro;
        C17N.LJJIIJZLJL(tuxIconView);
    }
}
