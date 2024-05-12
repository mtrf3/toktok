package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Sxi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73794Sxi<T> extends AtomicLong implements InterfaceC73651SvP {
    public static final long serialVersionUID = 3562861878281475070L;
    public final InterfaceC73740Swq<? super T> LJLIL;
    public final C73793Sxh<T> LJLILLLLZI;

    @Override // X.InterfaceC73651SvP
    public final void cancel() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.LJLILLLLZI.LJIILL(this);
        }
    }

    @Override // X.InterfaceC73651SvP
    public final void request(long j) {
        long j2;
        if (!EnumC73755Sx5.validate(j)) {
            return;
        }
        do {
            j2 = get();
            if (j2 == Long.MIN_VALUE || j2 == Long.MAX_VALUE) {
                return;
            }
        } while (!compareAndSet(j2, V2B.LIZIZ(j2, j)));
    }

    public C73794Sxi(InterfaceC73740Swq<? super T> interfaceC73740Swq, C73793Sxh<T> c73793Sxh) {
        this.LJLIL = interfaceC73740Swq;
        this.LJLILLLLZI = c73793Sxh;
    }
}
