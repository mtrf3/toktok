package X;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: X.Qn2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68036Qn2 implements Runnable {
    public final /* synthetic */ zzq LJLIL;
    public final /* synthetic */ InterfaceC68139Qoh LJLILLLLZI;
    public final /* synthetic */ C68022Qmo LJLJI;

    public RunnableC68036Qn2(C68022Qmo c68022Qmo, zzq zzqVar, InterfaceC68139Qoh interfaceC68139Qoh) {
        this.LJLJI = c68022Qmo;
        this.LJLIL = zzqVar;
        this.LJLILLLLZI = interfaceC68139Qoh;
    }

    public final void LIZ() {
        C68033Qmz c68033Qmz;
        String str = null;
        try {
            try {
                if (!this.LJLJI.LIZ.LJIILLIIL().LJIIL().LJFF(EnumC68125QoT.ANALYTICS_STORAGE)) {
                    this.LJLJI.LIZ.LIZJ().LJIIJ.LIZ("Analytics storage consent denied; will not get app instance id");
                    this.LJLJI.LIZ.LJIJ().LJI.set(null);
                    this.LJLJI.LIZ.LJIILLIIL().LJFF.LIZIZ(null);
                    c68033Qmz = this.LJLJI.LIZ;
                } else {
                    C68022Qmo c68022Qmo = this.LJLJI;
                    InterfaceC68041Qn7 interfaceC68041Qn7 = c68022Qmo.LIZLLL;
                    if (interfaceC68041Qn7 == null) {
                        c68022Qmo.LIZ.LIZJ().LJFF.LIZ("Failed to get app instance id");
                        c68033Qmz = this.LJLJI.LIZ;
                    } else {
                        QH7.LJIIIIZZ(this.LJLIL);
                        str = interfaceC68041Qn7.LLJILLL(this.LJLIL);
                        if (str != null) {
                            this.LJLJI.LIZ.LJIJ().LJI.set(str);
                            this.LJLJI.LIZ.LJIILLIIL().LJFF.LIZIZ(str);
                        }
                        this.LJLJI.LJIILLIIL();
                        c68033Qmz = this.LJLJI.LIZ;
                    }
                }
            } catch (RemoteException e) {
                this.LJLJI.LIZ.LIZJ().LJFF.LIZIZ(e, "Failed to get app instance id");
                c68033Qmz = this.LJLJI.LIZ;
            }
            c68033Qmz.LJIL().LJJIIJZLJL(str, this.LJLILLLLZI);
        } catch (Throwable th) {
            this.LJLJI.LIZ.LJIL().LJJIIJZLJL(null, this.LJLILLLLZI);
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
