package X;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzaw;

/* renamed from: X.Qnk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68080Qnk implements Runnable {
    public final /* synthetic */ InterfaceC68139Qoh LJLIL;
    public final /* synthetic */ zzaw LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ AppMeasurementDynamiteService LJLJJI;

    public RunnableC68080Qnk(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC68139Qoh interfaceC68139Qoh, zzaw zzawVar, String str) {
        this.LJLJJI = appMeasurementDynamiteService;
        this.LJLIL = interfaceC68139Qoh;
        this.LJLILLLLZI = zzawVar;
        this.LJLJI = str;
    }

    public final void LIZ() {
        C68022Qmo LJIJJ = this.LJLJJI.LJLIL.LJIJJ();
        InterfaceC68139Qoh interfaceC68139Qoh = this.LJLIL;
        zzaw zzawVar = this.LJLILLLLZI;
        String str = this.LJLJI;
        LJIJJ.LJFF();
        LJIJJ.LJI();
        C68083Qnn LJIL = LJIJJ.LIZ.LJIL();
        LJIL.getClass();
        if (C67258QaU.getInstance().isGooglePlayServicesAvailable(LJIL.LIZ.LIZ, 12451000) != 0) {
            LJIJJ.LIZ.LIZJ().LJIIIIZZ.LIZ("Not bundling data. Service unavailable or out of date");
            LJIJJ.LIZ.LJIL().LJJII(interfaceC68139Qoh, new byte[0]);
        } else {
            LJIJJ.LJIIZILJ(new RunnableC68079Qnj(LJIJJ, zzawVar, str, interfaceC68139Qoh));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
