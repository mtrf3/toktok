package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.AqS8S0100001_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WSf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82313WSf implements WSP {
    public ValueAnimator LIZ;
    public InterfaceC82311WSd LIZIZ;
    public boolean LIZJ;

    @Override // X.WSP
    public final void destroy() {
        ValueAnimator valueAnimator = this.LIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LIZ = null;
    }

    @Override // X.WSP
    public final void LIZ(InterfaceC82311WSd callback) {
        o.LJIIIZ(callback, "callback");
        this.LIZIZ = callback;
    }

    @Override // X.WSP
    public final void LIZIZ(float f) {
        AqS8S0100001_14 aqS8S0100001_14 = new AqS8S0100001_14(this, f, 0);
        if (!this.LIZJ) {
            aqS8S0100001_14.invoke();
        }
    }

    @Override // X.WSP
    public final void LIZJ(float f, float f2, int i) {
        C82312WSe c82312WSe = new C82312WSe(this, f, f2, i);
        if (!this.LIZJ) {
            c82312WSe.invoke();
        }
    }
}
