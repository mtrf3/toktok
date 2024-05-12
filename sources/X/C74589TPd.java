package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: X.TPd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74589TPd extends C1C9 {
    public boolean LJIILL;

    public C74589TPd(Context context) {
        super(context);
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        return 80.0f / displayMetrics.densityDpi;
    }

    @Override // X.C1C9, X.C0AB
    public final void LJFF(View view, C0AC c0ac, C0A9 c0a9) {
        int LJIIIIZZ = LJIIIIZZ(LJIILIIL(), view);
        int LJIIIZ = LJIIIZ(LJIILJJIL(), view);
        int LJIIJJI = LJIIJJI((int) Math.sqrt((LJIIIZ * LJIIIZ) + (LJIIIIZZ * LJIIIIZZ)));
        if (this.LJIILL) {
            c0a9.LIZIZ(-LJIIIIZZ, -LJIIIZ, 1, null);
        } else {
            if (LJIIJJI <= 0) {
                return;
            }
            c0a9.LIZIZ(-LJIIIIZZ, -LJIIIZ, LJIIJJI, this.LJIIIIZZ);
        }
    }

    @Override // X.C1C9
    public final int LJII(int i, int i2, int i3, int i4, int i5) {
        return AnonymousClass030.LIZJ(i4, i3, 2, i3) - (((i2 - i) / 2) + i);
    }
}
