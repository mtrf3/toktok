package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Qgt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67655Qgt implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    public final void LIZ() {
        synchronized (this.LJLILLLLZI) {
            try {
                AtomicReference atomicReference = (AtomicReference) this.LJLILLLLZI;
                Object obj = this.LJLJI;
                atomicReference.set(Boolean.valueOf(((C68082Qnm) obj).LIZ.LJI.LJIILJJIL(((C68082Qnm) obj).LIZ.LJIILJJIL().LJIIJ(), C68555QvP.LJJIJLIJ)));
            } finally {
                ((AtomicReference) this.LJLILLLLZI).notify();
            }
        }
    }

    public final void LIZIZ() {
        synchronized (((C67654Qgs) this.LJLJI).LJLILLLLZI) {
            Object obj = this.LJLJI;
            if (((C67654Qgs) obj).LJLJI != null) {
                ((C67654Qgs) obj).LJLJI.onComplete((AbstractC67638Qgc) this.LJLILLLLZI);
            }
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

    public /* synthetic */ RunnableC67655Qgt(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLJI = obj;
        this.LJLILLLLZI = obj2;
    }
}
