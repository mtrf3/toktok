package X;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;

/* renamed from: X.Qo7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68103Qo7 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ zzq LJLJI;
    public final /* synthetic */ InterfaceC68139Qoh LJLJJI;
    public final /* synthetic */ C68022Qmo LJLJJL;

    public RunnableC68103Qo7(C68022Qmo c68022Qmo, String str, String str2, zzq zzqVar, InterfaceC68139Qoh interfaceC68139Qoh) {
        this.LJLJJL = c68022Qmo;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = zzqVar;
        this.LJLJJI = interfaceC68139Qoh;
    }

    public final void LIZ() {
        C68033Qmz c68033Qmz;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                C68022Qmo c68022Qmo = this.LJLJJL;
                InterfaceC68041Qn7 interfaceC68041Qn7 = c68022Qmo.LIZLLL;
                if (interfaceC68041Qn7 == null) {
                    c68022Qmo.LIZ.LIZJ().LJFF.LIZJ(this.LJLIL, this.LJLILLLLZI, "Failed to get conditional properties; not connected to service");
                    c68033Qmz = this.LJLJJL.LIZ;
                } else {
                    QH7.LJIIIIZZ(this.LJLJI);
                    arrayList = C68083Qnn.LJIILL(interfaceC68041Qn7.LLJJJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI));
                    this.LJLJJL.LJIILLIIL();
                    c68033Qmz = this.LJLJJL.LIZ;
                }
            } catch (RemoteException e) {
                this.LJLJJL.LIZ.LIZJ().LJFF.LIZLLL(this.LJLIL, this.LJLILLLLZI, e, "Failed to get conditional properties; remote exception");
                c68033Qmz = this.LJLJJL.LIZ;
            }
            c68033Qmz.LJIL().LJJI(this.LJLJJI, arrayList);
        } catch (Throwable th) {
            this.LJLJJL.LIZ.LJIL().LJJI(this.LJLJJI, arrayList);
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
