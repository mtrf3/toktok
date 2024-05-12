package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Stb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73539Stb<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73509St7<T>, InterfaceC73442Ss2, InterfaceC92693kP {
    public static final long serialVersionUID = -2177128922851101253L;
    public final InterfaceC73442Ss2 LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC73445Ss5> LJLILLLLZI;

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
    }

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73509St7
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.replace(this, interfaceC92693kP);
    }

    @Override // X.InterfaceC73509St7
    public final void onSuccess(T t) {
        try {
            InterfaceC73445Ss5 apply = this.LJLILLLLZI.apply(t);
            C73320Sq4.LIZ(apply, "The mapper returned a null CompletableSource");
            InterfaceC73445Ss5 interfaceC73445Ss5 = apply;
            if (!isDisposed()) {
                interfaceC73445Ss5.LIZ(this);
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            onError(th);
        }
    }

    public C73539Stb(InterfaceC73442Ss2 interfaceC73442Ss2, InterfaceC48038ItG<? super T, ? extends InterfaceC73445Ss5> interfaceC48038ItG) {
        this.LJLIL = interfaceC73442Ss2;
        this.LJLILLLLZI = interfaceC48038ItG;
    }
}
