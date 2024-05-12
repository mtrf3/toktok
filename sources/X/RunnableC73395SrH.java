package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SrH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73395SrH extends AtomicReference<InterfaceC92693kP> implements InterfaceC92693kP, Runnable {
    public static final long serialVersionUID = 1891866368734007884L;
    public final InterfaceC116954iR<? super Long> LJLIL;
    public final long LJLILLLLZI;
    public long LJLJI;

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (get() == EnumC73418Sre.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!isDisposed()) {
                long j = this.LJLJI;
                this.LJLIL.onNext(Long.valueOf(j));
                if (j == this.LJLILLLLZI) {
                    EnumC73418Sre.dispose(this);
                    this.LJLIL.onComplete();
                } else {
                    this.LJLJI = j + 1;
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
    }

    public RunnableC73395SrH(InterfaceC116954iR<? super Long> interfaceC116954iR, long j, long j2) {
        this.LJLIL = interfaceC116954iR;
        this.LJLJI = j;
        this.LJLILLLLZI = j2;
    }
}
