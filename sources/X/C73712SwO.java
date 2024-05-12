package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SwO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73712SwO<U> extends AtomicReference<InterfaceC92693kP> implements InterfaceC116954iR<U> {
    public static final long serialVersionUID = -7449079488798789337L;
    public final InterfaceC116954iR<? super U> LJLIL;
    public final C73711SwN<?, ?> LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        C73711SwN<?, ?> c73711SwN = this.LJLILLLLZI;
        c73711SwN.LJLJL = false;
        c73711SwN.LIZ();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLILLLLZI.dispose();
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(U u) {
        this.LJLIL.onNext(u);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.replace(this, interfaceC92693kP);
    }

    public C73712SwO(C73844SyW c73844SyW, C73711SwN c73711SwN) {
        this.LJLIL = c73844SyW;
        this.LJLILLLLZI = c73711SwN;
    }
}
