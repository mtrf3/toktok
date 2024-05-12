package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Stf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73543Stf extends AtomicReference<InterfaceC92693kP> implements InterfaceC73442Ss2, InterfaceC92693kP, InterfaceC64592gB<Throwable> {
    public static final long serialVersionUID = -4361286194466301354L;
    public final InterfaceC64592gB<? super Throwable> LJLIL;
    public final InterfaceC29937Boz LJLILLLLZI;

    public boolean hasCustomOnError() {
        if (this.LJLIL != this) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73442Ss2
    public void onComplete() {
        try {
            this.LJLILLLLZI.run();
        } catch (Throwable th) {
            V0N.LJJIL(th);
            C73548Stk.LIZIZ(th);
        }
        lazySet(EnumC73418Sre.DISPOSED);
    }

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        if (get() == EnumC73418Sre.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC92693kP
    public void dispose() {
        EnumC73418Sre.dispose(this);
    }

    public C73543Stf(InterfaceC29937Boz interfaceC29937Boz) {
        this.LJLIL = this;
        this.LJLILLLLZI = interfaceC29937Boz;
    }

    @Override // X.InterfaceC64592gB
    public void accept(Throwable th) {
        C73548Stk.LIZIZ(new C73545Sth(th));
    }

    @Override // X.InterfaceC73442Ss2
    public void onError(Throwable th) {
        try {
            this.LJLIL.accept(th);
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            C73548Stk.LIZIZ(th2);
        }
        lazySet(EnumC73418Sre.DISPOSED);
    }

    @Override // X.InterfaceC73442Ss2
    public void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this, interfaceC92693kP);
    }

    public C73543Stf(InterfaceC64592gB<? super Throwable> interfaceC64592gB, InterfaceC29937Boz interfaceC29937Boz) {
        this.LJLIL = interfaceC64592gB;
        this.LJLILLLLZI = interfaceC29937Boz;
    }
}
