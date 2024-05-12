package X;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: X.Qn5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68039Qn5 implements Runnable {
    public final /* synthetic */ zzq LJLIL;
    public final /* synthetic */ Bundle LJLILLLLZI;
    public final /* synthetic */ C68022Qmo LJLJI;

    public RunnableC68039Qn5(C68022Qmo c68022Qmo, zzq zzqVar, Bundle bundle) {
        this.LJLJI = c68022Qmo;
        this.LJLIL = zzqVar;
        this.LJLILLLLZI = bundle;
    }

    public final void LIZ() {
        C68022Qmo c68022Qmo = this.LJLJI;
        InterfaceC68041Qn7 interfaceC68041Qn7 = c68022Qmo.LIZLLL;
        if (interfaceC68041Qn7 == null) {
            c68022Qmo.LIZ.LIZJ().LJFF.LIZ("Failed to send default event parameters to service");
            return;
        }
        try {
            QH7.LJIIIIZZ(this.LJLIL);
            interfaceC68041Qn7.LJLJJLL(this.LJLILLLLZI, this.LJLIL);
        } catch (RemoteException e) {
            this.LJLJI.LIZ.LIZJ().LJFF.LIZIZ(e, "Failed to send default event parameters to service");
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
