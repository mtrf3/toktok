package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.T0a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73936T0a<T, U, V> extends C07950Sx implements InterfaceC116954iR<T> {
    public final InterfaceC116954iR<? super V> LJLILLLLZI;
    public final InterfaceC73767SxH<U> LJLJI;
    public volatile boolean LJLJJI;
    public volatile boolean LJLJJL;

    public abstract void LIZLLL(InterfaceC116954iR<? super V> interfaceC116954iR, U u);

    public final boolean LJ() {
        if (((AtomicInteger) this.LJLIL).getAndIncrement() == 0) {
            return true;
        }
        return false;
    }

    public AbstractC73936T0a(C73844SyW c73844SyW, C73939T0d c73939T0d) {
        super(3);
        this.LJLILLLLZI = c73844SyW;
        this.LJLJI = c73939T0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(Object obj, InterfaceC92693kP interfaceC92693kP) {
        InterfaceC116954iR<? super V> interfaceC116954iR = this.LJLILLLLZI;
        InterfaceC73767SxH<U> interfaceC73767SxH = this.LJLJI;
        if (((AtomicInteger) this.LJLIL).get() == 0 && ((AtomicInteger) this.LJLIL).compareAndSet(0, 1)) {
            if (interfaceC73767SxH.isEmpty()) {
                LIZLLL(interfaceC116954iR, obj);
                if (((AtomicInteger) this.LJLIL).addAndGet(-1) == 0) {
                    return;
                }
            } else {
                interfaceC73767SxH.offer(obj);
            }
        } else {
            interfaceC73767SxH.offer(obj);
            if (!LJ()) {
                return;
            }
        }
        C73975T1n.LJII(interfaceC73767SxH, interfaceC116954iR, interfaceC92693kP, this);
    }
}
