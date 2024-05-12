package X;

/* renamed from: X.Stt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73557Stt<T> extends AbstractC73555Str<T> implements InterfaceC116954iR<T> {
    public static final long serialVersionUID = 4109457741734051389L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public final InterfaceC29937Boz LJLILLLLZI;
    public InterfaceC92693kP LJLJI;
    public InterfaceC73558Stu<T> LJLJJI;
    public boolean LJLJJL;

    public final void LIZ() {
        if (compareAndSet(0, 1)) {
            try {
                this.LJLILLLLZI.run();
            } catch (Throwable th) {
                V0N.LJJIL(th);
                C73548Stk.LIZIZ(th);
            }
        }
    }

    @Override // X.AbstractC73555Str, X.InterfaceC73570Su6
    public final void clear() {
        this.LJLJJI.clear();
    }

    @Override // X.AbstractC73555Str, X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJI.dispose();
        LIZ();
    }

    @Override // X.AbstractC73555Str, X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI.isDisposed();
    }

    @Override // X.AbstractC73555Str, X.InterfaceC73570Su6
    public final boolean isEmpty() {
        return this.LJLJJI.isEmpty();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLIL.onComplete();
        LIZ();
    }

    @Override // X.AbstractC73555Str, X.InterfaceC73570Su6
    public final T poll() {
        T poll = this.LJLJJI.poll();
        if (poll == null && this.LJLJJL) {
            LIZ();
        }
        return poll;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
        LIZ();
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        this.LJLIL.onNext(t);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJI, interfaceC92693kP)) {
            this.LJLJI = interfaceC92693kP;
            if (interfaceC92693kP instanceof InterfaceC73558Stu) {
                this.LJLJJI = (InterfaceC73558Stu) interfaceC92693kP;
            }
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.AbstractC73555Str, X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        InterfaceC73558Stu<T> interfaceC73558Stu = this.LJLJJI;
        boolean z = false;
        if (interfaceC73558Stu == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = interfaceC73558Stu.requestFusion(i);
        if (requestFusion != 0) {
            if (requestFusion == 1) {
                z = true;
            }
            this.LJLJJL = z;
        }
        return requestFusion;
    }

    public C73557Stt(InterfaceC116954iR<? super T> interfaceC116954iR, InterfaceC29937Boz interfaceC29937Boz) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC29937Boz;
    }
}
