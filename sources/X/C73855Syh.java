package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Syh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73855Syh<T> implements InterfaceC73463SsN, InterfaceC92693kP {
    public final AtomicReference<InterfaceC92693kP> LJLIL = new AtomicReference<>();
    public final AtomicReference<InterfaceC92693kP> LJLILLLLZI = new AtomicReference<>();
    public final InterfaceC73445Ss5 LJLJI;
    public final InterfaceC73463SsN<? super T> LJLJJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73857Syj.LIZJ(this.LJLILLLLZI);
        EnumC73857Syj.LIZJ(this.LJLIL);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (this.LJLIL.get() == EnumC73857Syj.LJLIL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        if (!isDisposed()) {
            this.LJLIL.lazySet(EnumC73857Syj.LJLIL);
            EnumC73857Syj.LIZJ(this.LJLILLLLZI);
            this.LJLJJI.onError(th);
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        C73860Sym c73860Sym = new C73860Sym(this);
        if (C78996UzQ.LJJJI(this.LJLILLLLZI, c73860Sym, C73855Syh.class)) {
            this.LJLJJI.onSubscribe(this);
            this.LJLJI.LIZ(c73860Sym);
            C78996UzQ.LJJJI(this.LJLIL, interfaceC92693kP, C73855Syh.class);
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        if (!isDisposed()) {
            this.LJLIL.lazySet(EnumC73857Syj.LJLIL);
            EnumC73857Syj.LIZJ(this.LJLILLLLZI);
            this.LJLJJI.onSuccess(t);
        }
    }

    public C73855Syh(InterfaceC73445Ss5 interfaceC73445Ss5, InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        this.LJLJI = interfaceC73445Ss5;
        this.LJLJJI = interfaceC73463SsN;
    }
}
