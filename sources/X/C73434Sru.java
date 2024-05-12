package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sru, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73434Sru extends AtomicReference<InterfaceC92693kP> implements C4I1, InterfaceC92693kP {
    public static final long serialVersionUID = -2467358622224974244L;
    public final InterfaceC73442Ss2 LJLIL;

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return C16880lQ.LLLZ("%s{%s}", new Object[]{C16880lQ.LJLLJ(C73434Sru.class), super.toString()});
    }

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    public void onComplete() {
        InterfaceC92693kP andSet;
        InterfaceC92693kP interfaceC92693kP = get();
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (interfaceC92693kP != enumC73418Sre && (andSet = getAndSet(enumC73418Sre)) != enumC73418Sre) {
            try {
                this.LJLIL.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public void dispose() {
        EnumC73418Sre.dispose(this);
    }

    public C73434Sru(InterfaceC73442Ss2 interfaceC73442Ss2) {
        this.LJLIL = interfaceC73442Ss2;
    }

    public void onError(Throwable th) {
        if (!tryOnError(th)) {
            C73548Stk.LIZIZ(th);
        }
    }

    public void setCancellable(InterfaceC73436Srw interfaceC73436Srw) {
        setDisposable(new C73435Srv(interfaceC73436Srw));
    }

    public void setDisposable(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.set(this, interfaceC92693kP);
    }

    public boolean tryOnError(Throwable th) {
        InterfaceC92693kP andSet;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        InterfaceC92693kP interfaceC92693kP = get();
        EnumC73418Sre enumC73418Sre = EnumC73418Sre.DISPOSED;
        if (interfaceC92693kP != enumC73418Sre && (andSet = getAndSet(enumC73418Sre)) != enumC73418Sre) {
            try {
                this.LJLIL.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
        return false;
    }
}
