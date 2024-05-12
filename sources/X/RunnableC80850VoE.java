package X;

import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: X.VoE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80850VoE implements Runnable {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final long LJLJI = System.currentTimeMillis();
    public final float LJLJJI;
    public final float LJLJJL;
    public final /* synthetic */ ViewOnTouchListenerC80851VoF LJLJJLL;

    public final void LIZ() {
        VA9<V92> LJFF = this.LJLJJLL.LJFF();
        if (LJFF != null) {
            ViewOnTouchListenerC80851VoF viewOnTouchListenerC80851VoF = this.LJLJJLL;
            float currentTimeMillis = ((float) (System.currentTimeMillis() - this.LJLJI)) * 1.0f;
            ViewOnTouchListenerC80851VoF viewOnTouchListenerC80851VoF2 = this.LJLJJLL;
            float f = currentTimeMillis / ((float) viewOnTouchListenerC80851VoF2.LJLJJL);
            if (1.0f <= f) {
                f = 1.0f;
            }
            float interpolation = ((AccelerateDecelerateInterpolator) viewOnTouchListenerC80851VoF2.LJLLILLLL).getInterpolation(f);
            float f2 = this.LJLJJI;
            viewOnTouchListenerC80851VoF.LIZJ(C06420Na.LIZIZ(this.LJLJJL, f2, interpolation, f2) / viewOnTouchListenerC80851VoF.LJI(), this.LJLIL, this.LJLILLLLZI);
            if (interpolation < 1.0f) {
                LJFF.postOnAnimation(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80850VoE(ViewOnTouchListenerC80851VoF viewOnTouchListenerC80851VoF, float f, float f2, float f3, float f4) {
        this.LJLJJLL = viewOnTouchListenerC80851VoF;
        this.LJLIL = f3;
        this.LJLILLLLZI = f4;
        this.LJLJJI = f;
        this.LJLJJL = f2;
    }
}
