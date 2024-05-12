package X;

/* renamed from: X.PXt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractRunnableC64621PXt implements Runnable {
    public final /* synthetic */ int LJLIL = 0;
    public final Object LJLILLLLZI;

    public abstract void LIZIZ();

    public abstract void LIZJ();

    public final void LIZ() {
        ((C67761Qib) this.LJLILLLLZI).LIZIZ.lock();
        try {
            if (Thread.interrupted()) {
                return;
            }
            LIZJ();
        } catch (RuntimeException e) {
            C67759QiZ c67759QiZ = ((C67761Qib) this.LJLILLLLZI).LIZ;
            c67759QiZ.LJLJJL.sendMessage(c67759QiZ.LJLJJL.obtainMessage(2, e));
        } finally {
            ((C67761Qib) this.LJLILLLLZI).LIZIZ.unlock();
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
                    String name = C16880lQ.LLLLIIIILLL().getName();
                    C16880lQ.LLLLIIIILLL().setName((String) this.LJLILLLLZI);
                    try {
                        LIZIZ();
                        C16880lQ.LLLLIIIILLL().setName(name);
                        return;
                    } catch (Throwable th) {
                        C16880lQ.LLLLIIIILLL().setName(name);
                        throw th;
                    }
                } finally {
                    if (LIZ) {
                    }
                }
        }
    }

    public AbstractRunnableC64621PXt(String str, Object[] objArr) {
        this.LJLILLLLZI = PVA.LJIIJJI(str, objArr);
    }
}
