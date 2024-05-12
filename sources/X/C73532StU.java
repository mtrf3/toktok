package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.StU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73532StU<T, R> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73509St7<T>, InterfaceC92693kP {
    public static final long serialVersionUID = 4375739915521278546L;
    public final InterfaceC73509St7<? super R> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC73504St2<? extends R>> LJLILLLLZI;
    public InterfaceC92693kP LJLJI;

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        this.LJLIL.onComplete();
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
        this.LJLJI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable th) {
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73509St7
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJI, interfaceC92693kP)) {
            this.LJLJI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC73509St7
    public final void onSuccess(T t) {
        try {
            InterfaceC73504St2<? extends R> apply = this.LJLILLLLZI.apply(t);
            C73320Sq4.LIZ(apply, "The mapper returned a null MaybeSource");
            InterfaceC73504St2<? extends R> interfaceC73504St2 = apply;
            if (!isDisposed()) {
                interfaceC73504St2.LIZ(new C73534StW(this));
            }
        } catch (Exception e) {
            V0N.LJJIL(e);
            this.LJLIL.onError(e);
        }
    }

    public C73532StU(InterfaceC73509St7<? super R> interfaceC73509St7, InterfaceC48038ItG<? super T, ? extends InterfaceC73504St2<? extends R>> interfaceC48038ItG) {
        this.LJLIL = interfaceC73509St7;
        this.LJLILLLLZI = interfaceC48038ItG;
    }
}
