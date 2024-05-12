package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes13.dex */
public final class T08 extends AtomicReference<InterfaceC92693kP> implements Runnable, InterfaceC64592gB<InterfaceC92693kP> {
    public static final long serialVersionUID = -4552101107598366241L;
    public final T06<?> LJLIL;
    public long LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LJJZZI(this);
        } finally {
            if (LIZ) {
            }
        }
    }

    public T08(T06<?> t06) {
        this.LJLIL = t06;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(InterfaceC92693kP interfaceC92693kP) {
        InterfaceC92693kP interfaceC92693kP2 = interfaceC92693kP;
        EnumC73418Sre.replace(this, interfaceC92693kP2);
        synchronized (this.LJLIL) {
            if (this.LJLJJI) {
                ((T09) this.LJLIL.LJLIL).LIZIZ(interfaceC92693kP2);
            }
        }
    }
}
