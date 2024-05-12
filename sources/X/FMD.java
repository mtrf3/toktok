package X;

import android.app.Application;
import defpackage.e1;

/* loaded from: classes7.dex */
public final class FMD extends FMC {
    @Override // X.FMC
    public final boolean LIZ() {
        if (C58122Pw.LIZ) {
            return ((Boolean) FME.LIZ.getValue()).booleanValue();
        }
        return !e1.LIZ(31744, "disable_mt_log_frequency_control", false, false);
    }

    @Override // X.FMC
    public final void LIZIZ() {
    }

    public FMD(Application application) {
        super(application);
    }
}
