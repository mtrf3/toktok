package X;

import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: X.Qnh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68077Qnh implements Runnable {
    public final /* synthetic */ zzq LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ zzaw LJLJI;
    public final /* synthetic */ C68022Qmo LJLJJI;

    public RunnableC68077Qnh(C68022Qmo c68022Qmo, zzq zzqVar, boolean z, zzaw zzawVar) {
        this.LJLJJI = c68022Qmo;
        this.LJLIL = zzqVar;
        this.LJLILLLLZI = z;
        this.LJLJI = zzawVar;
    }

    public final void LIZ() {
        zzaw zzawVar;
        C68022Qmo c68022Qmo = this.LJLJJI;
        InterfaceC68041Qn7 interfaceC68041Qn7 = c68022Qmo.LIZLLL;
        if (interfaceC68041Qn7 == null) {
            c68022Qmo.LIZ.LIZJ().LJFF.LIZ("Discarding data. Failed to send event to service");
            return;
        }
        QH7.LJIIIIZZ(this.LJLIL);
        C68022Qmo c68022Qmo2 = this.LJLJJI;
        if (this.LJLILLLLZI) {
            zzawVar = null;
        } else {
            zzawVar = this.LJLJI;
        }
        c68022Qmo2.LJIIIZ(interfaceC68041Qn7, zzawVar, this.LJLIL);
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
