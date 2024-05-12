package X;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: X.Qle, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67950Qle implements Runnable {
    public final /* synthetic */ ServiceConnectionC67949Qld LJLIL;

    public RunnableC67950Qle(ServiceConnectionC67949Qld serviceConnectionC67949Qld) {
        this.LJLIL = serviceConnectionC67949Qld;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C68022Qmo c68022Qmo = this.LJLIL.LJLJI;
            Context context = c68022Qmo.LIZ.LIZ;
            this.LJLIL.LJLJI.LIZ.getClass();
            C68022Qmo.LJIJ(c68022Qmo, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
        } finally {
            if (LIZ) {
            }
        }
    }
}
