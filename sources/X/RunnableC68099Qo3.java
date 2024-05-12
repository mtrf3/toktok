package X;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;

/* renamed from: X.Qo3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68099Qo3 implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    public final void LIZ() {
        boolean z;
        ((InterfaceC68124QoS) this.LJLILLLLZI).LJ();
        if (C17J.LJJJJZ()) {
            ((InterfaceC68124QoS) this.LJLILLLLZI).LIZIZ().LJIILIIL(this);
            return;
        }
        if (((AbstractC68102Qo6) this.LJLJI).LIZJ != 0) {
            z = true;
        } else {
            z = false;
        }
        ((AbstractC68102Qo6) this.LJLJI).LIZJ = 0L;
        if (z) {
            ((AbstractC68102Qo6) this.LJLJI).LIZIZ();
        }
    }

    public final void LIZIZ() {
        C68022Qmo c68022Qmo = (C68022Qmo) this.LJLJI;
        InterfaceC68041Qn7 interfaceC68041Qn7 = c68022Qmo.LIZLLL;
        if (interfaceC68041Qn7 == null) {
            c68022Qmo.LIZ.LIZJ().LJFF.LIZ("Failed to send measurementEnabled to service");
            return;
        }
        try {
            QH7.LJIIIIZZ(this.LJLILLLLZI);
            interfaceC68041Qn7.LLLLJ((zzq) this.LJLILLLLZI);
            ((C68022Qmo) this.LJLJI).LJIILLIIL();
        } catch (RemoteException e) {
            ((C68048QnE) this.LJLJI).LIZ.LIZJ().LJFF.LIZIZ(e, "Failed to send measurementEnabled to the service");
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        switch (this.LJLIL) {
            case 0:
                try {
                    LIZ();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
            default:
                try {
                    LIZIZ();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
        }
    }

    public /* synthetic */ RunnableC68099Qo3(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLJI = obj;
        this.LJLILLLLZI = obj2;
    }
}
