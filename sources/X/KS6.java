package X;

import android.graphics.drawable.Animatable;

/* loaded from: classes9.dex */
public class KS6 implements W4Z<InterfaceC81599W0t> {
    public boolean LIZ;
    public final /* synthetic */ KS5 LIZIZ;

    @Override // X.W4Z
    public final void LIZIZ(String str, Throwable th) {
    }

    @Override // X.W4Z
    public final void LJI(Object obj, String str) {
    }

    public KS6(KS5 ks5) {
        this.LIZIZ = ks5;
    }

    @Override // X.W4Z
    public final void LIZJ(String str) {
        this.LIZ = false;
    }

    @Override // X.W4Z
    public final void LIZLLL(Object obj, String str) {
        this.LIZ = false;
    }

    @Override // X.W4Z
    public final void LJ(String str, Throwable th) {
        KS7 ks7 = this.LIZIZ.LJIIIIZZ;
        if (ks7 != null) {
            ks7.onFail();
        }
        this.LIZIZ.LIZ();
        this.LIZ = false;
    }

    @Override // X.W4Z
    public final void LJFF(String str, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
        Animatable LIZ;
        if (animatable != null) {
            this.LIZ = true;
            if (this.LIZIZ.LIZJ.getController() != null && this.LIZ && (LIZ = this.LIZIZ.LIZJ.getController().LIZ()) != null && !LIZ.isRunning() && this.LIZIZ.LJIIIZ) {
                LIZ.start();
            }
            KS7 ks7 = this.LIZIZ.LJIIIIZZ;
            if (ks7 != null) {
                ks7.onSuccess();
                return;
            }
            return;
        }
        this.LIZ = false;
    }
}
