package X;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sx8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73758Sx8 extends AtomicLong implements InterfaceC73651SvP, Runnable {
    public static final long serialVersionUID = -2809475196591179431L;
    public final InterfaceC73740Swq<? super Long> LJLIL;
    public long LJLILLLLZI;
    public final AtomicReference<InterfaceC92693kP> LJLJI = new AtomicReference<>();

    public final void LIZ() {
        if (this.LJLJI.get() != EnumC73418Sre.DISPOSED) {
            if (get() != 0) {
                InterfaceC73740Swq<? super Long> interfaceC73740Swq = this.LJLIL;
                long j = this.LJLILLLLZI;
                this.LJLILLLLZI = j + 1;
                interfaceC73740Swq.onNext(Long.valueOf(j));
                V2B.LJIILJJIL(this, 1L);
                return;
            }
            InterfaceC73740Swq<? super Long> interfaceC73740Swq2 = this.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Can't deliver value ");
            interfaceC73740Swq2.onError(new C73799Sxn(C0H1.LIZJ(LIZ, this.LJLILLLLZI, " due to lack of requests", LIZ)));
            EnumC73418Sre.dispose(this.LJLJI);
        }
    }

    @Override // X.InterfaceC73651SvP
    public final void cancel() {
        EnumC73418Sre.dispose(this.LJLJI);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC73758Sx8(InterfaceC73740Swq<? super Long> interfaceC73740Swq) {
        this.LJLIL = interfaceC73740Swq;
    }

    @Override // X.InterfaceC73651SvP
    public final void request(long j) {
        if (EnumC73755Sx5.validate(j)) {
            V2B.LIZ(this, j);
        }
    }
}
