package X;

/* renamed from: X.0bJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10610bJ {
    public boolean LIZ;
    public InterfaceC10600bI LIZIZ;
    public Object LIZJ;
    public boolean LIZLLL;

    public final void LIZ() {
        synchronized (this) {
            if (this.LIZ) {
                return;
            }
            this.LIZ = true;
            this.LIZLLL = true;
            InterfaceC10600bI interfaceC10600bI = this.LIZIZ;
            Object obj = this.LIZJ;
            if (interfaceC10600bI != null) {
                try {
                    ((C1BA) interfaceC10600bI).LIZ();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.LIZLLL = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                C10590bH.LIZ(obj);
            }
            synchronized (this) {
                this.LIZLLL = false;
                notifyAll();
            }
        }
    }
}
