package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ssa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73476Ssa<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73463SsN<T>, InterfaceC92693kP {
    public static final long serialVersionUID = -5314538511045349925L;
    public final InterfaceC73463SsN<? super T> LJLIL;
    public final InterfaceC48038ItG<? super Throwable, ? extends InterfaceC73471SsV<? extends T>> LJLILLLLZI;

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
        try {
            InterfaceC73471SsV<? extends T> apply = this.LJLILLLLZI.apply(th);
            C73320Sq4.LIZ(apply, "The nextFunction returned a null SingleSource.");
            apply.LIZ(new C73478Ssc(this.LJLIL, this));
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            this.LJLIL.onError(new C63756P0m(th, th2));
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.setOnce(this, interfaceC92693kP)) {
            this.LJLIL.onSubscribe(this);
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        this.LJLIL.onSuccess(t);
    }

    public C73476Ssa(InterfaceC73463SsN<? super T> interfaceC73463SsN, InterfaceC48038ItG<? super Throwable, ? extends InterfaceC73471SsV<? extends T>> interfaceC48038ItG) {
        this.LJLIL = interfaceC73463SsN;
        this.LJLILLLLZI = interfaceC48038ItG;
    }
}
