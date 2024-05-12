package X;

import android.view.View;

/* loaded from: classes15.dex */
public final class VZF implements VZJ {
    @Override // X.VZJ
    public final void LIZ(View view) {
        if (view != null) {
            view.setRotationX(0.0f);
            view.setRotationY(0.0f);
        }
    }

    @Override // X.VZJ
    public final void LIZIZ(VZA vza, View view, boolean z, int i) {
        float f;
        if (vza != null) {
            int childExpectSize = vza.getChildExpectSize();
            if (childExpectSize != 0) {
                f = i / childExpectSize;
            } else {
                f = 0.0f;
            }
            float LJJIIJZLJL = C78609UtB.LJJIIJZLJL(f * 9.0f, -9.0f, 9.0f);
            view.setCameraDistance(1280.0f);
            if (z) {
                view.setRotationX(LJJIIJZLJL);
            } else {
                view.setRotationY(-LJJIIJZLJL);
            }
        }
    }
}
