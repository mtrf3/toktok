package X;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: X.QoG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68112QoG implements Runnable {
    public final /* synthetic */ InterfaceC68139Qoh LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ AppMeasurementDynamiteService LJLJJL;

    public RunnableC68112QoG(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC68139Qoh interfaceC68139Qoh, String str, String str2, boolean z) {
        this.LJLJJL = appMeasurementDynamiteService;
        this.LJLIL = interfaceC68139Qoh;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C68022Qmo LJIJJ = this.LJLJJL.LJLIL.LJIJJ();
            InterfaceC68139Qoh interfaceC68139Qoh = this.LJLIL;
            String str = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            boolean z = this.LJLJJI;
            LJIJJ.LJFF();
            LJIJJ.LJI();
            LJIJJ.LJIIZILJ(new RunnableC68100Qo4(LJIJJ, str, str2, LJIJJ.LJIILJJIL(false), z, interfaceC68139Qoh));
        } finally {
            if (LIZ) {
            }
        }
    }
}
