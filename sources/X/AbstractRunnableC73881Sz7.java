package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sz7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractRunnableC73881Sz7<T> extends AtomicReference<T> implements InterfaceC116954iR<T>, InterfaceC92693kP, Runnable {
    public static final long serialVersionUID = -3517602651313910099L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;
    public final AbstractC73946T0k LJLJJI;
    public final AtomicReference<InterfaceC92693kP> LJLJJL = new AtomicReference<>();
    public InterfaceC92693kP LJLJJLL;

    public abstract void LIZ();

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this.LJLJJL);
        this.LJLJJLL.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJLL.isDisposed();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        EnumC73418Sre.dispose(this.LJLJJL);
        LIZ();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        EnumC73418Sre.dispose(this.LJLJJL);
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        lazySet(t);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJJLL, interfaceC92693kP)) {
            this.LJLJJLL = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
            AbstractC73946T0k abstractC73946T0k = this.LJLJJI;
            long j = this.LJLILLLLZI;
            EnumC73418Sre.replace(this.LJLJJL, abstractC73946T0k.LIZLLL(this, j, j, this.LJLJI));
        }
    }

    public AbstractRunnableC73881Sz7(C73844SyW c73844SyW, long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        this.LJLIL = c73844SyW;
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLJJI = abstractC73946T0k;
    }
}
