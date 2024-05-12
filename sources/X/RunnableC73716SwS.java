package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SwS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73716SwS<T> extends AtomicReference<InterfaceC92693kP> implements Runnable, InterfaceC92693kP {
    public static final long serialVersionUID = 6812032969491025141L;
    public final T LJLIL;
    public final long LJLILLLLZI;
    public final C73715SwR<T> LJLJI;
    public final AtomicBoolean LJLJJI = new AtomicBoolean();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLJJI.compareAndSet(false, true)) {
                C73715SwR<T> c73715SwR = this.LJLJI;
                long j = this.LJLILLLLZI;
                T t = this.LJLIL;
                if (j == c73715SwR.LJLJL) {
                    c73715SwR.LJLIL.onNext(t);
                    EnumC73418Sre.dispose(this);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (get() == EnumC73418Sre.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
    }

    public RunnableC73716SwS(T t, long j, C73715SwR<T> c73715SwR) {
        this.LJLIL = t;
        this.LJLILLLLZI = j;
        this.LJLJI = c73715SwR;
    }
}
