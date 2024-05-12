package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sv5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73631Sv5<U> extends AtomicReference<InterfaceC73651SvP> implements InterfaceC73812Sy0<U> {
    public static final long serialVersionUID = -1266041316834525931L;
    public final C73630Sv4<?, U> LJLIL;

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        C73630Sv4<?, U> c73630Sv4 = this.LJLIL;
        c73630Sv4.getClass();
        if (EnumC73418Sre.dispose(c73630Sv4)) {
            c73630Sv4.LJLIL.onComplete();
        }
    }

    public C73631Sv5(C73630Sv4<?, U> c73630Sv4) {
        this.LJLIL = c73630Sv4;
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        C73630Sv4<?, U> c73630Sv4 = this.LJLIL;
        c73630Sv4.getClass();
        if (EnumC73418Sre.dispose(c73630Sv4)) {
            c73630Sv4.LJLIL.onError(th);
        } else {
            C73548Stk.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(Object obj) {
        EnumC73755Sx5.cancel(this);
        C73630Sv4<?, U> c73630Sv4 = this.LJLIL;
        c73630Sv4.getClass();
        if (EnumC73418Sre.dispose(c73630Sv4)) {
            c73630Sv4.LJLIL.onComplete();
        }
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        EnumC73755Sx5.setOnce(this, interfaceC73651SvP, Long.MAX_VALUE);
    }
}
