package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.StS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73530StS<T, R> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73463SsN<T>, InterfaceC92693kP {
    public static final long serialVersionUID = -5843758257109742742L;
    public final InterfaceC73509St7<? super R> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC73504St2<? extends R>> LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.setOnce(this, interfaceC92693kP)) {
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        try {
            InterfaceC73504St2<? extends R> apply = this.LJLILLLLZI.apply(t);
            C73320Sq4.LIZ(apply, "The mapper returned a null MaybeSource");
            InterfaceC73504St2<? extends R> interfaceC73504St2 = apply;
            if (!isDisposed()) {
                interfaceC73504St2.LIZ(new C73529StR(this, this.LJLIL));
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            onError(th);
        }
    }

    public C73530StS(InterfaceC73509St7<? super R> interfaceC73509St7, InterfaceC48038ItG<? super T, ? extends InterfaceC73504St2<? extends R>> interfaceC48038ItG) {
        this.LJLIL = interfaceC73509St7;
        this.LJLILLLLZI = interfaceC48038ItG;
    }
}
