package X;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: X.Qms, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68026Qms implements Runnable {
    public final /* synthetic */ zzq LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ zzac LJLJI;
    public final /* synthetic */ C68022Qmo LJLJJI;

    public RunnableC68026Qms(C68022Qmo c68022Qmo, zzq zzqVar, boolean z, zzac zzacVar) {
        this.LJLJJI = c68022Qmo;
        this.LJLIL = zzqVar;
        this.LJLILLLLZI = z;
        this.LJLJI = zzacVar;
    }

    public final void LIZ() {
        zzac zzacVar;
        C68022Qmo c68022Qmo = this.LJLJJI;
        InterfaceC68041Qn7 interfaceC68041Qn7 = c68022Qmo.LIZLLL;
        if (interfaceC68041Qn7 == null) {
            c68022Qmo.LIZ.LIZJ().LJFF.LIZ("Discarding data. Failed to send conditional user property to service");
            return;
        }
        QH7.LJIIIIZZ(this.LJLIL);
        C68022Qmo c68022Qmo2 = this.LJLJJI;
        if (this.LJLILLLLZI) {
            zzacVar = null;
        } else {
            zzacVar = this.LJLJI;
        }
        c68022Qmo2.LJIIIZ(interfaceC68041Qn7, zzacVar, this.LJLIL);
        this.LJLJJI.LJIILLIIL();
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
