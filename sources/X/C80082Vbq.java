package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Vbq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80082Vbq extends C1C9 {
    public C80082Vbq(Context context) {
        super(context);
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        boolean z;
        float f;
        if (C53322KwI.LIZIZ() == 3 || C53322KwI.LIZIZ() == 4) {
            z = true;
        } else {
            z = false;
        }
        float f2 = 25.0f;
        if (z) {
            f2 = 25.0f / displayMetrics.densityDpi;
            f = 1.5f;
        } else {
            f = displayMetrics.densityDpi;
        }
        return f2 / f;
    }

    @Override // X.C1C9, X.C0AB
    public final void LJFF(View view, C0AC c0ac, C0A9 c0a9) {
        int i;
        C0A2 c0a2 = this.LIZJ;
        int i2 = 0;
        if (c0a2 == null || !c0a2.LJIJJLI()) {
            i = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int LJJJJJ = c0a2.LJJJJJ(view) - marginLayoutParams.leftMargin;
            int LJJJJLI = c0a2.LJJJJLI(view) + marginLayoutParams.rightMargin;
            int paddingLeft = c0a2.getPaddingLeft();
            i = ((int) (((c0a2.LJLLLL - c0a2.getPaddingRight()) - paddingLeft) / 2.0f)) - (LJJJJJ + ((int) ((LJJJJLI - LJJJJJ) / 2.0f)));
        }
        C0A2 c0a22 = this.LIZJ;
        if (c0a22 != null && c0a22.LJIL()) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int LJJJJLL = c0a22.LJJJJLL(view) - marginLayoutParams2.topMargin;
            int LJJJJIZL = c0a22.LJJJJIZL(view) + marginLayoutParams2.bottomMargin;
            int paddingTop = c0a22.getPaddingTop();
            i2 = ((int) (((c0a22.LJLLLLLL - c0a22.getPaddingBottom()) - paddingTop) / 2.0f)) - (LJJJJLL + ((int) ((LJJJJIZL - LJJJJLL) / 2.0f)));
        }
        int LJIIJJI = LJIIJJI((int) Math.sqrt((i2 * i2) + (i * i)));
        if (LJIIJJI > 0) {
            c0a9.LIZIZ(-i, -i2, LJIIJJI, this.LJIIIIZZ);
        }
    }
}
