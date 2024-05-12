package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sux, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73623Sux extends AtomicReference<Runnable> implements Runnable, InterfaceC92693kP {
    public static final long serialVersionUID = -4101336210206799084L;
    public final C73616Suq LJLIL;
    public final C73616Suq LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (getAndSet(null) != null) {
            this.LJLIL.dispose();
            this.LJLILLLLZI.dispose();
        }
    }

    public final void LIZ() {
        Runnable runnable = get();
        if (runnable != null) {
            try {
                runnable.run();
                lazySet(null);
                C73616Suq c73616Suq = this.LJLIL;
                EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
                c73616Suq.lazySet(enumC73418Sre);
                this.LJLILLLLZI.lazySet(enumC73418Sre);
            } catch (Throwable th) {
                lazySet(null);
                this.LJLIL.lazySet(EnumC73418Sre.DISPOSED);
                this.LJLILLLLZI.lazySet(EnumC73418Sre.DISPOSED);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
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

    public RunnableC73623Sux(Runnable runnable) {
        super(runnable);
        this.LJLIL = new C73616Suq();
        this.LJLILLLLZI = new C73616Suq();
    }
}
