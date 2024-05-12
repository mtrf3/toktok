package X;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: X.QoH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68113QoH implements Runnable {
    public final /* synthetic */ InterfaceC68139Qoh LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ AppMeasurementDynamiteService LJLJJI;

    public RunnableC68113QoH(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC68139Qoh interfaceC68139Qoh, String str, String str2) {
        this.LJLJJI = appMeasurementDynamiteService;
        this.LJLIL = interfaceC68139Qoh;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C68022Qmo LJIJJ = this.LJLJJI.LJLIL.LJIJJ();
            InterfaceC68139Qoh interfaceC68139Qoh = this.LJLIL;
            String str = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            LJIJJ.LJFF();
            LJIJJ.LJI();
            LJIJJ.LJIIZILJ(new RunnableC68103Qo7(LJIJJ, str, str2, LJIJJ.LJIILJJIL(false), interfaceC68139Qoh));
        } finally {
            if (LIZ) {
            }
        }
    }
}
