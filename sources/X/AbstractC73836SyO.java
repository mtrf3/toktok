package X;

/* renamed from: X.SyO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73836SyO<T, R> implements InterfaceC116954iR<T>, InterfaceC73558Stu<R> {
    public final InterfaceC116954iR<? super R> LJLIL;
    public InterfaceC92693kP LJLILLLLZI;
    public InterfaceC73558Stu<T> LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;

    @Override // X.InterfaceC73570Su6
    public void clear() {
        this.LJLJI.clear();
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLILLLLZI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLILLLLZI.isDisposed();
    }

    @Override // X.InterfaceC73570Su6
    public final boolean isEmpty() {
        return this.LJLJI.isEmpty();
    }

    @Override // X.InterfaceC116954iR
    public void onComplete() {
        if (this.LJLJJI) {
            return;
        }
        this.LJLJJI = true;
        this.LJLIL.onComplete();
    }

    public AbstractC73836SyO(InterfaceC116954iR<? super R> interfaceC116954iR) {
        this.LJLIL = interfaceC116954iR;
    }

    public final void LIZ(Throwable th) {
        V0N.LJJIL(th);
        this.LJLILLLLZI.dispose();
        onError(th);
    }

    public final int LIZIZ(int i) {
        InterfaceC73558Stu<T> interfaceC73558Stu = this.LJLJI;
        if (interfaceC73558Stu != null && (i & 4) == 0) {
            int requestFusion = interfaceC73558Stu.requestFusion(i);
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

    @Override // X.InterfaceC116954iR
    public void onError(Throwable th) {
        if (this.LJLJJI) {
            C73548Stk.LIZIZ(th);
        } else {
            this.LJLJJI = true;
            this.LJLIL.onError(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLILLLLZI, interfaceC92693kP)) {
            this.LJLILLLLZI = interfaceC92693kP;
            if (interfaceC92693kP instanceof InterfaceC73558Stu) {
                this.LJLJI = (InterfaceC73558Stu) interfaceC92693kP;
            }
            this.LJLIL.onSubscribe(this);
        }
    }
}
