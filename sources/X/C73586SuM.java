package X;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SuM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73586SuM<T, U> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73509St7<Object> {
    public static final long serialVersionUID = 8663801314800248617L;
    public final C73585SuL<T, U> LJLIL;

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        C73585SuL<T, U> c73585SuL = this.LJLIL;
        c73585SuL.getClass();
        if (EnumC73418Sre.dispose(c73585SuL)) {
            InterfaceC73504St2<? extends T> interfaceC73504St2 = c73585SuL.LJLJI;
            if (interfaceC73504St2 == null) {
                c73585SuL.LJLIL.onError(new TimeoutException());
            } else {
                interfaceC73504St2.LIZ(c73585SuL.LJLJJI);
            }
        }
    }

    public C73586SuM(C73585SuL<T, U> c73585SuL) {
        this.LJLIL = c73585SuL;
    }

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable th) {
        C73585SuL<T, U> c73585SuL = this.LJLIL;
        c73585SuL.getClass();
        if (EnumC73418Sre.dispose(c73585SuL)) {
            c73585SuL.LJLIL.onError(th);
        } else {
            C73548Stk.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC73509St7
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this, interfaceC92693kP);
    }

    @Override // X.InterfaceC73509St7
    public final void onSuccess(Object obj) {
        C73585SuL<T, U> c73585SuL = this.LJLIL;
        c73585SuL.getClass();
        if (EnumC73418Sre.dispose(c73585SuL)) {
            InterfaceC73504St2<? extends T> interfaceC73504St2 = c73585SuL.LJLJI;
            if (interfaceC73504St2 == null) {
                c73585SuL.LJLIL.onError(new TimeoutException());
            } else {
                interfaceC73504St2.LIZ(c73585SuL.LJLJJI);
            }
        }
    }
}
