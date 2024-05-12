package X;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: X.Vps, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80952Vps extends C80953Vpt {
    @Override // X.C80949Vpp
    public final float LJIIIIZZ(View view) {
        return view.getTransitionAlpha();
    }

    @Override // X.C80953Vpt, X.C78894Uxm
    public final void LJII(int i, View view) {
        view.setTransitionVisibility(i);
    }

    @Override // X.C80949Vpp
    public final void LJIIIZ(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // X.C80948Vpo
    public final void LJIIJ(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // X.C80948Vpo
    public final void LJIIJJI(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // X.C80954Vpu, X.C78894Uxm
    public final void LJI(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
