package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AKS extends AbstractC26257ASf {
    public final /* synthetic */ AKR LIZ;

    public AKS(AKR akr) {
        this.LIZ = akr;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        float f2;
        o.LJIIIZ(bottomSheet, "bottomSheet");
        View view = this.LIZ.LJII;
        if (view != null) {
            View findViewById = view.findViewById(R.id.lbl);
            if (f < 0.0f) {
                f2 = 1 + f;
            } else {
                f2 = 1.0f;
            }
            findViewById.setAlpha(f2);
            return;
        }
        o.LJIJI("root");
        throw null;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
        if (i == 5) {
            this.LIZ.LJ();
        }
    }
}
