package X;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Qmw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68030Qmw implements Runnable {
    public final /* synthetic */ AtomicReference LJLIL;
    public final /* synthetic */ zzq LJLILLLLZI;
    public final /* synthetic */ C68022Qmo LJLJI;

    public RunnableC68030Qmw(C68022Qmo c68022Qmo, AtomicReference atomicReference, zzq zzqVar) {
        this.LJLJI = c68022Qmo;
        this.LJLIL = atomicReference;
        this.LJLILLLLZI = zzqVar;
    }

    public final void LIZ() {
        AtomicReference atomicReference;
        synchronized (this.LJLIL) {
            try {
                try {
                } catch (RemoteException e) {
                    this.LJLJI.LIZ.LIZJ().LJFF.LIZIZ(e, "Failed to get app instance id");
                    atomicReference = this.LJLIL;
                }
                if (!this.LJLJI.LIZ.LJIILLIIL().LJIIL().LJFF(EnumC68125QoT.ANALYTICS_STORAGE)) {
                    this.LJLJI.LIZ.LIZJ().LJIIJ.LIZ("Analytics storage consent denied; will not get app instance id");
                    this.LJLJI.LIZ.LJIJ().LJI.set(null);
                    this.LJLJI.LIZ.LJIILLIIL().LJFF.LIZIZ(null);
                    this.LJLIL.set(null);
                    return;
                }
                C68022Qmo c68022Qmo = this.LJLJI;
                InterfaceC68041Qn7 interfaceC68041Qn7 = c68022Qmo.LIZLLL;
                if (interfaceC68041Qn7 == null) {
                    c68022Qmo.LIZ.LIZJ().LJFF.LIZ("Failed to get app instance id");
                    return;
                }
                QH7.LJIIIIZZ(this.LJLILLLLZI);
                this.LJLIL.set(interfaceC68041Qn7.LLJILLL(this.LJLILLLLZI));
                String str = (String) this.LJLIL.get();
                if (str != null) {
                    this.LJLJI.LIZ.LJIJ().LJI.set(str);
                    this.LJLJI.LIZ.LJIILLIIL().LJFF.LIZIZ(str);
                }
                this.LJLJI.LJIILLIIL();
                atomicReference = this.LJLIL;
                atomicReference.notify();
            } finally {
                this.LJLIL.notify();
            }
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
