package X;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: X.QoK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68116QoK implements Runnable {
    public final /* synthetic */ C68136Qoe LJLIL;
    public final /* synthetic */ AppMeasurementDynamiteService LJLILLLLZI;

    public RunnableC68116QoK(AppMeasurementDynamiteService appMeasurementDynamiteService, C68136Qoe c68136Qoe) {
        this.LJLILLLLZI = appMeasurementDynamiteService;
        this.LJLIL = c68136Qoe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        C68136Qoe c68136Qoe;
        boolean z;
        try {
            C68082Qnm LJIJ = this.LJLILLLLZI.LJLIL.LJIJ();
            C68136Qoe c68136Qoe2 = this.LJLIL;
            LJIJ.LJFF();
            LJIJ.LJI();
            if (c68136Qoe2 != null && c68136Qoe2 != (c68136Qoe = LJIJ.LIZLLL)) {
                if (c68136Qoe == null) {
                    z = true;
                } else {
                    z = false;
                }
                QH7.LJIIJ("EventInterceptor already set.", z);
            }
            LJIJ.LIZLLL = c68136Qoe2;
        } finally {
            if (LIZ) {
            }
        }
    }
}
