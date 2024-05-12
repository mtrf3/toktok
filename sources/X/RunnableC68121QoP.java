package X;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: X.QoP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68121QoP implements Runnable {
    public final /* synthetic */ InterfaceC68139Qoh LJLIL;
    public final /* synthetic */ AppMeasurementDynamiteService LJLILLLLZI;

    public RunnableC68121QoP(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC68139Qoh interfaceC68139Qoh) {
        this.LJLILLLLZI = appMeasurementDynamiteService;
        this.LJLIL = interfaceC68139Qoh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        boolean z;
        try {
            C68083Qnn LJIL = this.LJLILLLLZI.LJLIL.LJIL();
            InterfaceC68139Qoh interfaceC68139Qoh = this.LJLIL;
            C68033Qmz c68033Qmz = this.LJLILLLLZI.LJLIL;
            if (c68033Qmz.LJJII != null && c68033Qmz.LJJII.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            LJIL.LJJ(interfaceC68139Qoh, z);
        } finally {
            if (LIZ) {
            }
        }
    }
}
