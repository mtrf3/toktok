package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: X.Vbv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80087Vbv extends C1C9 {
    public final /* synthetic */ C80092Vc0 LJIILL;

    @Override // X.C0AB
    public final PointF LIZ(int i) {
        return null;
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // X.C1C9
    public final int LJIIL(int i) {
        return Math.min(100, super.LJIIL(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80087Vbv(C80092Vc0 c80092Vc0, Context context) {
        super(context);
        this.LJIILL = c80092Vc0;
    }

    @Override // X.C1C9, X.C0AB
    public final void LJFF(View view, C0AC c0ac, C0A9 c0a9) {
        C80092Vc0 c80092Vc0 = this.LJIILL;
        int[] LIZIZ = c80092Vc0.LIZIZ(c80092Vc0.LIZ.getLayoutManager(), view);
        int i = LIZIZ[0];
        int i2 = LIZIZ[1];
        int LJIIJJI = LJIIJJI(Math.max(Math.abs(i), Math.abs(i2)));
        if (LJIIJJI > 0) {
            c0a9.LIZIZ(i, i2, LJIIJJI, this.LJIIIIZZ);
        }
    }
}