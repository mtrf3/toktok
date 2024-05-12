package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.TPh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74593TPh extends C1C9 {
    public final /* synthetic */ C80101Vc9 LJIILL;
    public final /* synthetic */ C0A2 LJIILLIIL;

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        o.LJIIIZ(displayMetrics, "displayMetrics");
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // X.C1C9
    public final int LJIIL(int i) {
        int LJIIL = super.LJIIL(i);
        if (100 > LJIIL) {
            return LJIIL;
        }
        return 100;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74593TPh(C80101Vc9 c80101Vc9, C0A2 c0a2, Context context) {
        super(context);
        this.LJIILL = c80101Vc9;
        this.LJIILLIIL = c0a2;
    }

    @Override // X.C1C9, X.C0AB
    public final void LJFF(View targetView, C0AC state, C0A9 action) {
        o.LJIIIZ(targetView, "targetView");
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        int[] LIZJ = this.LJIILL.LIZJ(this.LJIILLIIL, targetView);
        int i = LIZJ[0];
        int i2 = 1;
        int i3 = LIZJ[1];
        int abs = Math.abs(i);
        int abs2 = Math.abs(i3);
        if (abs < abs2) {
            abs = abs2;
        }
        int LJIIJJI = LJIIJJI(abs);
        if (LJIIJJI >= 1) {
            i2 = LJIIJJI;
        }
        action.LIZIZ(i, i3, i2, this.LJIIIIZZ);
    }
}
