package X;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: X.QoR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68123QoR implements InterfaceC68140Qoi {
    public final InterfaceC68137Qof LIZ;
    public final /* synthetic */ AppMeasurementDynamiteService LIZIZ;

    public C68123QoR(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC68137Qof interfaceC68137Qof) {
        this.LIZIZ = appMeasurementDynamiteService;
        this.LIZ = interfaceC68137Qof;
    }

    @Override // X.InterfaceC68140Qoi
    public final void LIZ(long j, String str, String str2, Bundle bundle) {
        try {
            this.LIZ.LLILZ(j, str, str2, bundle);
        } catch (RemoteException e) {
            C68033Qmz c68033Qmz = this.LIZIZ.LJLIL;
            if (c68033Qmz != null) {
                c68033Qmz.LIZJ().LJIIIIZZ.LIZIZ(e, "Event listener threw exception");
            }
        }
    }
}
