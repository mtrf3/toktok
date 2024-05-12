package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AKL extends AbstractC26257ASf {
    public final /* synthetic */ AKJ LIZ;

    @Override // X.AbstractC26257ASf
    public final void LIZ(View bottomSheet, float f) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
    }

    public AKL(AKJ akj) {
        this.LIZ = akj;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View bottomSheet) {
        o.LJIIIZ(bottomSheet, "bottomSheet");
        if (i == 5) {
            AKJ akj = this.LIZ;
            akj.LLII = 1;
            akj.LJJIFFI();
        }
    }
}
