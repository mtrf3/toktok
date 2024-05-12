package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Syv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73869Syv<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC116954iR<T>, InterfaceC92693kP, InterfaceC73872Syy {
    public static final long serialVersionUID = 3764492702657003550L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;
    public final AbstractC73945T0j LJLJJI;
    public final C73616Suq LJLJJL = new C73616Suq();
    public final AtomicLong LJLJJLL = new AtomicLong();
    public final AtomicReference<InterfaceC92693kP> LJLJL = new AtomicReference<>();
    public InterfaceC115714gR<? extends T> LJLJLJ;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this.LJLJL);
        EnumC73418Sre.dispose(this);
        this.LJLJJI.dispose();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (this.LJLJJLL.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.LJLJJL.dispose();
            this.LJLIL.onComplete();
            this.LJLJJI.dispose();
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC73872Syy
    public final void LIZ(long j) {
        if (this.LJLJJLL.compareAndSet(j, Long.MAX_VALUE)) {
            EnumC73418Sre.dispose(this.LJLJL);
            InterfaceC115714gR<? extends T> interfaceC115714gR = this.LJLJLJ;
            this.LJLJLJ = null;
            interfaceC115714gR.LIZ(new C73420Srg(this.LJLIL, this));
            this.LJLJJI.dispose();
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJJLL.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.LJLJJL.dispose();
            this.LJLIL.onError(th);
            this.LJLJJI.dispose();
            return;
        }
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        long j = this.LJLJJLL.get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (!this.LJLJJLL.compareAndSet(j, j2)) {
                return;
            }
            this.LJLJJL.get().dispose();
            this.LJLIL.onNext(t);
            this.LJLJJL.replace(this.LJLJJI.LIZJ(new RunnableC73871Syx(j2, this), this.LJLILLLLZI, this.LJLJI));
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this.LJLJL, interfaceC92693kP);
    }

    public C73869Syv(InterfaceC116954iR<? super T> interfaceC116954iR, long j, TimeUnit timeUnit, AbstractC73945T0j abstractC73945T0j, InterfaceC115714gR<? extends T> interfaceC115714gR) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLJJI = abstractC73945T0j;
        this.LJLJLJ = interfaceC115714gR;
    }
}
