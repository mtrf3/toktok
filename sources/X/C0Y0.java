package X;

/* renamed from: X.0Y0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Y0 {
    public boolean LIZ;
    public InterfaceC09270Xz LIZIZ;
    public boolean LIZJ;

    public final void LIZ() {
        synchronized (this) {
            if (this.LIZ) {
                return;
            }
            this.LIZ = true;
            this.LIZJ = true;
            InterfaceC09270Xz interfaceC09270Xz = this.LIZIZ;
            if (interfaceC09270Xz != null) {
                try {
                    interfaceC09270Xz.onCancel();
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

    public final void LIZIZ(InterfaceC09270Xz interfaceC09270Xz) {
        synchronized (this) {
            while (this.LIZJ) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.LIZIZ == interfaceC09270Xz) {
                return;
            }
            this.LIZIZ = interfaceC09270Xz;
            if (this.LIZ) {
                interfaceC09270Xz.onCancel();
            }
        }
    }
}
