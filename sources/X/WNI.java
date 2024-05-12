package X;

import Y.ALAdapterS11S0200000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes15.dex */
public abstract class WNI implements Cloneable {
    public View LJLIL;
    public ViewGroup LJLILLLLZI;
    public long LJLJI = 300;

    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final WNI clone() {
        try {
            WNI wni = (WNI) super.clone();
            wni.LJLIL = null;
            return wni;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public abstract WNT LIZIZ(boolean z);

    public abstract void LIZLLL();

    public final Animator LIZJ(boolean z) {
        WNT LIZIZ = LIZIZ(z);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(LIZIZ, 70));
        ofFloat.addListener(new ALAdapterS11S0200000_14(this, LIZIZ, z, 15));
        ofFloat.setDuration(this.LJLJI);
        return ofFloat;
    }
}
