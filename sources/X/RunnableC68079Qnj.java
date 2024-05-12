package X;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzaw;

/* renamed from: X.Qnj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68079Qnj implements Runnable {
    public final /* synthetic */ zzaw LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC68139Qoh LJLJI;
    public final /* synthetic */ C68022Qmo LJLJJI;

    public RunnableC68079Qnj(C68022Qmo c68022Qmo, zzaw zzawVar, String str, InterfaceC68139Qoh interfaceC68139Qoh) {
        this.LJLJJI = c68022Qmo;
        this.LJLIL = zzawVar;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC68139Qoh;
    }

    public final void LIZ() {
        C68033Qmz c68033Qmz;
        byte[] bArr = null;
        try {
            try {
                C68022Qmo c68022Qmo = this.LJLJJI;
                InterfaceC68041Qn7 interfaceC68041Qn7 = c68022Qmo.LIZLLL;
                if (interfaceC68041Qn7 == null) {
                    c68022Qmo.LIZ.LIZJ().LJFF.LIZ("Discarding data. Failed to send event to service to bundle");
                    c68033Qmz = this.LJLJJI.LIZ;
                } else {
                    bArr = interfaceC68041Qn7.V(this.LJLIL, this.LJLILLLLZI);
                    this.LJLJJI.LJIILLIIL();
                    c68033Qmz = this.LJLJJI.LIZ;
                }
            } catch (RemoteException e) {
                this.LJLJJI.LIZ.LIZJ().LJFF.LIZIZ(e, "Failed to send event to the service to bundle");
                c68033Qmz = this.LJLJJI.LIZ;
            }
            c68033Qmz.LJIL().LJJII(this.LJLJI, bArr);
        } catch (Throwable th) {
            this.LJLJJI.LIZ.LJIL().LJJII(this.LJLJI, bArr);
            throw th;
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
