package X;

/* renamed from: X.Gzw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43356Gzw {
    public boolean LIZ;
    public InterfaceC43357Gzx LIZIZ;
    public boolean LIZJ;

    public void LIZ() {
        synchronized (this) {
            if (this.LIZ) {
                return;
            }
            this.LIZ = true;
            this.LIZJ = true;
            InterfaceC43357Gzx interfaceC43357Gzx = this.LIZIZ;
            if (interfaceC43357Gzx != null) {
                try {
                    interfaceC43357Gzx.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.LIZJ = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.LIZJ = false;
                notifyAll();
            }
        }
    }

    public final void LIZIZ(InterfaceC43357Gzx interfaceC43357Gzx) {
        synchronized (this) {
            while (this.LIZJ) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.LIZIZ == interfaceC43357Gzx) {
                return;
            }
            this.LIZIZ = interfaceC43357Gzx;
            if (this.LIZ) {
                interfaceC43357Gzx.onCancel();
            }
        }
    }
}
