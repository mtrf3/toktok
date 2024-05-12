package X;

import android.view.View;

/* loaded from: classes15.dex */
public final class VZE implements VZJ {
    public float LIZ;
    public float LIZIZ = 0.8f;
    public float LIZJ = 1.0f;
    public float LIZLLL = 0.8f;
    public float LJ = 1.0f;

    @Override // X.VZJ
    public final void LIZ(View view) {
        if (view != null) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    @Override // X.VZJ
    public final void LIZIZ(VZA vza, View view, boolean z, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (vza != null && this.LIZJ >= this.LIZIZ && this.LJ >= this.LIZLLL && vza.getChildExpectSize() > 0) {
            float abs = Math.abs(i);
            int childExpectSize = vza.getChildExpectSize();
            float f6 = this.LIZJ;
            float f7 = this.LIZIZ;
            float f8 = childExpectSize;
            float f9 = this.LJ;
            float f10 = f9 - (((f9 - this.LIZLLL) * abs) / f8);
            float LJJIIJZLJL = C78609UtB.LJJIIJZLJL(f6 - (((f6 - f7) * abs) / f8), f7, f6);
            float LJJIIJZLJL2 = C78609UtB.LJJIIJZLJL(f10, this.LIZLLL, this.LJ);
            view.setScaleX(LJJIIJZLJL);
            view.setScaleY(LJJIIJZLJL2);
            float f11 = this.LIZ;
            if (f11 > 0.0f) {
                if (z) {
                    f = f11 * f8;
                    f2 = 2.0f - this.LJ;
                    f3 = this.LIZLLL;
                } else {
                    f = f11 * f8;
                    f2 = 2.0f - this.LIZJ;
                    f3 = this.LIZIZ;
                }
                float f12 = ((f2 - f3) * f) / 2.0f;
                float min = Math.min(abs, f8);
                float f13 = f8 / 2.0f;
                float abs2 = 1.0f - (Math.abs(min - f13) / f13);
                if (i > 0) {
                    if (min >= f13) {
                        f5 = (abs2 * 0.5f * f12) + (-f12);
                    } else {
                        f4 = abs2 * (-0.5f);
                        f5 = f4 * f12;
                    }
                } else {
                    f4 = abs2 * 0.5f;
                    if (min > f13) {
                        f5 = f12 - (f4 * f12);
                    }
                    f5 = f4 * f12;
                }
                if (z) {
                    view.setTranslationY(f5);
                } else {
                    view.setTranslationX(f5);
                }
            }
        }
    }
}
