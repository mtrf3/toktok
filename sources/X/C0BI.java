package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0BI, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0BI {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final AbstractC03300Ba LIZIZ;
    public volatile InterfaceC37591dj LIZJ;

    public abstract String LIZIZ();

    public final InterfaceC37591dj LIZ() {
        this.LIZIZ.LIZ();
        if (this.LIZ.compareAndSet(false, true)) {
            if (this.LIZJ == null) {
                this.LIZJ = this.LIZIZ.LJ(LIZIZ());
            }
            return this.LIZJ;
        }
        return this.LIZIZ.LJ(LIZIZ());
    }

    public C0BI(AbstractC03300Ba abstractC03300Ba) {
        this.LIZIZ = abstractC03300Ba;
    }

    public final void LIZJ(InterfaceC37591dj interfaceC37591dj) {
        if (interfaceC37591dj == this.LIZJ) {
            this.LIZ.set(false);
        }
    }
}
