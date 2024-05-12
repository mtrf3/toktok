package X;

/* renamed from: X.SyJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73831SyJ<T, R> implements InterfaceC73812Sy0<T>, InterfaceC73632Sv6<R> {
    public final InterfaceC73740Swq<? super R> LJLIL;
    public InterfaceC73651SvP LJLILLLLZI;
    public InterfaceC73632Sv6<T> LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;

    @Override // X.InterfaceC73651SvP
    public final void cancel() {
        this.LJLILLLLZI.cancel();
    }

    @Override // X.InterfaceC73570Su6
    public final void clear() {
        this.LJLJI.clear();
    }

    @Override // X.InterfaceC73570Su6
    public final boolean isEmpty() {
        return this.LJLJI.isEmpty();
    }

    @Override // X.InterfaceC73740Swq
    public void onComplete() {
        if (this.LJLJJI) {
            return;
        }
        this.LJLJJI = true;
        this.LJLIL.onComplete();
    }

    public AbstractC73831SyJ(InterfaceC73740Swq<? super R> interfaceC73740Swq) {
        this.LJLIL = interfaceC73740Swq;
    }

    public final int LIZIZ(int i) {
        InterfaceC73632Sv6<T> interfaceC73632Sv6 = this.LJLJI;
        if (interfaceC73632Sv6 != null && (i & 4) == 0) {
            int requestFusion = interfaceC73632Sv6.requestFusion(i);
            if (requestFusion != 0) {
                this.LJLJJL = requestFusion;
            }
            return requestFusion;
        }
        return 0;
    }

    @Override // X.InterfaceC73570Su6
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // X.InterfaceC73740Swq
    public void onError(Throwable th) {
        if (this.LJLJJI) {
            C73548Stk.LIZIZ(th);
        } else {
            this.LJLJJI = true;
            this.LJLIL.onError(th);
        }
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (EnumC73755Sx5.validate(this.LJLILLLLZI, interfaceC73651SvP)) {
            this.LJLILLLLZI = interfaceC73651SvP;
            if (interfaceC73651SvP instanceof InterfaceC73632Sv6) {
                this.LJLJI = (InterfaceC73632Sv6) interfaceC73651SvP;
            }
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC73651SvP
    public final void request(long j) {
        this.LJLILLLLZI.request(j);
    }
}
