package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Swd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73727Swd extends AtomicReference<InterfaceC92693kP> implements InterfaceC73651SvP, Runnable {
    public static final long serialVersionUID = -2809475196591179431L;
    public final InterfaceC73740Swq<? super Long> LJLIL;
    public volatile boolean LJLILLLLZI;

    public final void LIZ() {
        if (get() != EnumC73418Sre.DISPOSED) {
            if (this.LJLILLLLZI) {
                this.LJLIL.onNext(0L);
                lazySet(EnumC73538Sta.INSTANCE);
                this.LJLIL.onComplete();
            } else {
                lazySet(EnumC73538Sta.INSTANCE);
                this.LJLIL.onError(new C73799Sxn("Can't deliver value due to lack of requests"));
            }
        }
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

    @Override // X.InterfaceC73651SvP
    public final void cancel() {
        EnumC73418Sre.dispose(this);
    }

    public RunnableC73727Swd(InterfaceC73740Swq<? super Long> interfaceC73740Swq) {
        this.LJLIL = interfaceC73740Swq;
    }

    @Override // X.InterfaceC73651SvP
    public final void request(long j) {
        if (EnumC73755Sx5.validate(j)) {
            this.LJLILLLLZI = true;
        }
    }
}
