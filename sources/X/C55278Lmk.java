package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.Lmk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55278Lmk implements C0C4 {
    public final InterfaceC55291Lmx LIZ;
    public Boolean LIZIZ;
    public Boolean LIZJ;

    public C55278Lmk(C55283Lmp c55283Lmp) {
        Boolean bool = Boolean.TRUE;
        this.LIZIZ = bool;
        this.LIZJ = bool;
        this.LIZ = c55283Lmp;
    }

    public static void LIZIZ(View view, float f) {
        int width = view.getWidth();
        int height = view.getHeight();
        float max = Math.max(0.85f, 1.0f - Math.abs(f));
        float f2 = 1.0f - max;
        float f3 = (height * f2) / 2.0f;
        float f4 = (width * f2) / 2.0f;
        if (f < 0.0f) {
            view.setTranslationX(f4 - (f3 / 2.0f));
        } else {
            view.setTranslationX((f3 / 2.0f) + (-f4));
        }
        view.setScaleX(max);
        view.setScaleY(max);
        view.setAlpha((((max - 0.85f) / 0.14999998f) * 0.5f) + 0.5f);
    }

    @Override // X.C0C4
    public final void LIZ(View view, float f) {
        if (f < -1.0f) {
            view.setAlpha(0.0f);
            return;
        }
        if (f <= 1.0f) {
            if (this.LIZ == null) {
                return;
            }
            if (f == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || f == -1.0f || f == 1.0f) {
                Boolean bool = Boolean.TRUE;
                this.LIZIZ = bool;
                this.LIZJ = bool;
                LIZIZ(view, 0.0f);
                return;
            }
            if (!this.LIZJ.booleanValue()) {
                return;
            }
            if (this.LIZIZ.booleanValue()) {
                this.LIZIZ = Boolean.FALSE;
                if ((f < 0.0f && f > -0.5f) || (f > 0.5f && f < 1.0f)) {
                    this.LIZJ = Boolean.valueOf(((C55283Lmp) this.LIZ).LIZ.LLJILJIL);
                } else {
                    this.LIZJ = Boolean.valueOf(((C55283Lmp) this.LIZ).LIZ.LLJIJIL);
                }
            }
            if (!this.LIZJ.booleanValue()) {
                return;
            }
            LIZIZ(view, f);
            return;
        }
        view.setAlpha(0.0f);
    }
}
