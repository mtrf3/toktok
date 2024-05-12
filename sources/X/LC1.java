package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LC1 extends AbstractC26257ASf {
    public final /* synthetic */ LC0 LIZ;

    public LC1(LC0 lc0) {
        this.LIZ = lc0;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        LC2 lc2;
        o.LJIIJ(bottomSheet, "bottomSheet");
        LC0 lc0 = this.LIZ;
        if (!lc0.LJLILLLLZI) {
            lc0.LJLILLLLZI = true;
            lc0.LJLJI = f;
        }
        float f2 = lc0.LJLJI;
        if (f > f2) {
            lc2 = LC2.TOP;
        } else if (f < f2) {
            lc2 = LC2.BOTTOM;
        } else {
            lc2 = LC2.DEFAULT;
        }
        lc0.LIZIZ(lc2);
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        o.LJIIJ(bottomSheet, "bottomSheet");
        if (i != 3) {
            if (i != 4 && i != 5) {
                if (i != 6) {
                    return;
                }
            } else {
                this.LIZ.LIZIZ(LC2.DEFAULT);
                return;
            }
        }
        this.LIZ.LIZIZ(LC2.TOP);
    }
}
