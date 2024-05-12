package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Srt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73433Srt<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73573Su9<T>, InterfaceC92693kP {
    public static final long serialVersionUID = -3434801548987643227L;
    public final InterfaceC116954iR<? super T> LJLIL;

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return C16880lQ.LLLZ("%s{%s}", new Object[]{C16880lQ.LJLLJ(C73433Srt.class), super.toString()});
    }

    public InterfaceC73573Su9<T> serialize() {
        return new C73572Su8(this);
    }

    @Override // X.InterfaceC73573Su9, X.InterfaceC92693kP
    public boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC215138cP
    public void onComplete() {
        if (!isDisposed()) {
            try {
                this.LJLIL.onComplete();
            } finally {
                dispose();
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public void dispose() {
        EnumC73418Sre.dispose(this);
    }

    public C73433Srt(InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLIL = interfaceC116954iR;
    }

    @Override // X.InterfaceC215138cP
    public void onError(Throwable th) {
        if (!tryOnError(th)) {
            C73548Stk.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC215138cP
    public void onNext(T t) {
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else if (!isDisposed()) {
            this.LJLIL.onNext(t);
        }
    }

    @Override // X.InterfaceC73573Su9
    public void setCancellable(InterfaceC73436Srw interfaceC73436Srw) {
        setDisposable(new C73435Srv(interfaceC73436Srw));
    }

    @Override // X.InterfaceC73573Su9
    public void setDisposable(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.set(this, interfaceC92693kP);
    }

    @Override // X.InterfaceC73573Su9
    public boolean tryOnError(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (!isDisposed()) {
            try {
                this.LJLIL.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }
        return false;
    }
}
