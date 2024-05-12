package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SzW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73906SzW<T, R> implements InterfaceC116954iR<T> {
    public final C73904SzU<T, R> LJLIL;
    public final C73912Szc<T> LJLILLLLZI;
    public volatile boolean LJLJI;
    public Throwable LJLJJI;
    public final AtomicReference<InterfaceC92693kP> LJLJJL = new AtomicReference<>();

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLJI = true;
        this.LJLIL.LIZIZ();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLJJI = th;
        this.LJLJI = true;
        this.LJLIL.LIZIZ();
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        this.LJLILLLLZI.offer(t);
        this.LJLIL.LIZIZ();
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this.LJLJJL, interfaceC92693kP);
    }

    public C73906SzW(C73904SzU<T, R> c73904SzU, int i) {
        this.LJLIL = c73904SzU;
        this.LJLILLLLZI = new C73912Szc<>(i);
    }
}
