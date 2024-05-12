package X;

import android.view.View;

/* renamed from: X.KOa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51628KOa implements C0CK {
    @Override // X.C0CK
    public final void LIZ(View view, float f) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (f < -1) {
            view.setAlpha(0.0f);
            return;
        }
        float f2 = 1;
        if (f <= f2) {
            float max = Math.max(0.77f, f2 - Math.abs(f));
            float f3 = f2 - max;
            float f4 = height * f3;
            float f5 = 2;
            float f6 = f4 / f5;
            float f7 = (width * f3) / f5;
            if (f < 0) {
                view.setTranslationX(f7 - (f6 / f5));
            } else {
                view.setTranslationX((f6 / f5) + (-f7));
            }
            view.setTranslationY(f6);
            view.setScaleX(max);
            view.setScaleY(max);
            view.setAlpha(1.0f);
            return;
        }
        view.setAlpha(0.0f);
    }
}
