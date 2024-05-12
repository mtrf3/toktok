package X;

import android.view.View;

/* renamed from: X.Unt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78281Unt implements C0C4 {
    @Override // X.C0C4
    public final void LIZ(View view, float f) {
        float f2;
        float f3;
        float f4 = 1.0f;
        if (f < -1.0f) {
            f = -1.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.0f) {
            f2 = f + 1.0f;
        } else {
            f2 = 1.0f - f;
        }
        float f5 = (f2 * 0.100000024f) + 0.9f;
        if (f5 == 0.0f || Float.isNaN(f5) || Float.isInfinite(f5)) {
            f5 = 1.0f;
        }
        view.setScaleX(f5);
        view.setScaleY(f5);
        if (f < 0.0f) {
            f3 = f + 1.0f;
        } else {
            f3 = 1.0f - f;
        }
        float f6 = (0.39999998f * f3) + 0.6f;
        if (f6 != 0.0f && !Float.isNaN(f6) && !Float.isInfinite(f6)) {
            f4 = f6;
        }
        view.setAlpha(f4);
    }
}
