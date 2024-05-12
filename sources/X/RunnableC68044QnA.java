package X;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: X.QnA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68044QnA implements Runnable {
    public final /* synthetic */ zzq LJLIL;
    public final /* synthetic */ C68022Qmo LJLILLLLZI;

    public RunnableC68044QnA(C68022Qmo c68022Qmo, zzq zzqVar) {
        this.LJLILLLLZI = c68022Qmo;
        this.LJLIL = zzqVar;
    }

    public final void LIZ() {
        C68022Qmo c68022Qmo = this.LJLILLLLZI;
        InterfaceC68041Qn7 interfaceC68041Qn7 = c68022Qmo.LIZLLL;
        if (interfaceC68041Qn7 == null) {
            c68022Qmo.LIZ.LIZJ().LJFF.LIZ("Failed to send consent settings to service");
            return;
        }
        try {
            QH7.LJIIIIZZ(this.LJLIL);
            interfaceC68041Qn7.LLLIZZ(this.LJLIL);
            this.LJLILLLLZI.LJIILLIIL();
        } catch (RemoteException e) {
            this.LJLILLLLZI.LIZ.LIZJ().LJFF.LIZIZ(e, "Failed to send consent settings to the service");
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
