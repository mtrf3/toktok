package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Sx4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73754Sx4<T> extends AtomicLong implements InterfaceC73704SwG<T>, InterfaceC73651SvP {
    public static final long serialVersionUID = 7326289992464377023L;
    public final InterfaceC73740Swq<? super T> LJLIL;
    public final C73616Suq LJLILLLLZI = new C73616Suq();

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    @Override // X.InterfaceC215138cP
    public abstract /* synthetic */ void onNext(T t);

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return C16880lQ.LLLZ("%s{%s}", new Object[]{C16880lQ.LJLLJ(getClass()), super.toString()});
    }

    @Override // X.InterfaceC73651SvP
    public final void cancel() {
        this.LJLILLLLZI.dispose();
        LIZLLL();
    }

    public final boolean isCancelled() {
        return this.LJLILLLLZI.isDisposed();
    }

    public final InterfaceC73704SwG<T> serialize() {
        return new C73757Sx7(this);
    }

    public final void LIZ() {
        if (isCancelled()) {
            return;
        }
        try {
            this.LJLIL.onComplete();
        } finally {
            this.LJLILLLLZI.dispose();
        }
    }

    public final long requested() {
        return get();
    }

    @Override // X.InterfaceC215138cP
    public void onComplete() {
        LIZ();
    }

    public AbstractC73754Sx4(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        this.LJLIL = interfaceC73740Swq;
    }

    public final boolean LIZIZ(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (isCancelled()) {
            return false;
        }
        try {
            this.LJLIL.onError(th);
            this.LJLILLLLZI.dispose();
            return true;
        } catch (Throwable th2) {
            this.LJLILLLLZI.dispose();
            throw th2;
        }
    }

    @Override // X.InterfaceC215138cP
    public final void onError(Throwable th) {
        if (!tryOnError(th)) {
            C73548Stk.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC73651SvP
    public final void request(long j) {
        if (EnumC73755Sx5.validate(j)) {
            V2B.LIZ(this, j);
            LIZJ();
        }
    }

    public final void setCancellable(InterfaceC73436Srw interfaceC73436Srw) {
        setDisposable(new C73435Srv(interfaceC73436Srw));
    }

    public final void setDisposable(InterfaceC92693kP interfaceC92693kP) {
        this.LJLILLLLZI.update(interfaceC92693kP);
    }

    public boolean tryOnError(Throwable th) {
        return LIZIZ(th);
    }
}
