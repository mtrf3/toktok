package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W2X extends AbstractC26257ASf {
    public final /* synthetic */ C81633W2b LIZ;

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
    }

    public W2X(C81633W2b c81633W2b) {
        this.LIZ = c81633W2b;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
        if (i != 3) {
            if (i != 5) {
                return;
            }
            this.LIZ.LLJILJILJ().Ov0(false);
            return;
        }
        this.LIZ.LLJILJILJ().Ov0(true);
    }
}
