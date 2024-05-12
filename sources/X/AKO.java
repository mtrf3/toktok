package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AKO extends AbstractC26257ASf {
    public final /* synthetic */ AKM LIZ;

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
    }

    public AKO(AKM akm) {
        this.LIZ = akm;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
        if (i == 5) {
            AKM akm = this.LIZ;
            akm.LJFF = 1;
            akm.LIZIZ();
        }
    }
}
