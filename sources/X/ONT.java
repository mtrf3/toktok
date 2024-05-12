package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ONT extends AbstractC26257ASf {
    public final /* synthetic */ ONQ LIZ;

    @Override // X.AbstractC26257ASf
    public final void LIZ(View p0, float f) {
        o.LJIIIZ(p0, "p0");
    }

    public ONT(ONQ onq) {
        this.LIZ = onq;
    }

    @Override // X.AbstractC26257ASf
    public final void LIZIZ(int i, View p0) {
        o.LJIIIZ(p0, "p0");
        if (i == 5) {
            C61779OMl.LIZJ(EnumC61773OMf.SWIPE, null, null, this.LIZ.LLD);
            this.LIZ.dismiss();
        }
    }
}
