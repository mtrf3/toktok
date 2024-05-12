package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Qgi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67644Qgi implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    public final void LIZ() {
        synchronized (this.LJLILLLLZI) {
            try {
                AtomicReference atomicReference = (AtomicReference) this.LJLILLLLZI;
                Object obj = this.LJLJI;
                atomicReference.set(Double.valueOf(((C68082Qnm) obj).LIZ.LJI.LJII(((C68082Qnm) obj).LIZ.LJIILJJIL().LJIIJ(), C68555QvP.LJJJI)));
            } finally {
                ((AtomicReference) this.LJLILLLLZI).notify();
            }
        }
    }

    public final void LIZIZ() {
        try {
            C67646Qgk LIZ = ((C67647Qgl) this.LJLJI).LJLILLLLZI.LIZ(((AbstractC67638Qgc) this.LJLILLLLZI).LJIIIZ());
            if (LIZ == null) {
                ((C67647Qgl) this.LJLJI).onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            ExecutorC67642Qgg executorC67642Qgg = C67641Qgf.LIZIZ;
            LIZ.LJFF(executorC67642Qgg, (C67647Qgl) this.LJLJI);
            LIZ.LIZLLL(executorC67642Qgg, (C67647Qgl) this.LJLJI);
            LIZ.LIZ(executorC67642Qgg, (C67647Qgl) this.LJLJI);
        } catch (C67645Qgj e) {
            if (e.getCause() instanceof Exception) {
                ((C67647Qgl) this.LJLJI).onFailure((Exception) e.getCause());
            } else {
                ((C67647Qgl) this.LJLJI).onFailure(e);
            }
        } catch (CancellationException unused) {
            ((C67647Qgl) this.LJLJI).LIZ();
        } catch (Exception e2) {
            ((C67647Qgl) this.LJLJI).onFailure(e2);
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

    public /* synthetic */ RunnableC67644Qgi(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLJI = obj;
        this.LJLILLLLZI = obj2;
    }
}
