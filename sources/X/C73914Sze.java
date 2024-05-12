package X;

import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.Sze, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73914Sze<T> implements T1U<T> {
    public final /* synthetic */ InterfaceC116954iR<? super T> LIZ;
    public final /* synthetic */ C73915Szf<T> LIZIZ;

    @Override // X.T1U
    public final void LIZ(Throwable exception) {
        o.LJIIIZ(exception, "exception");
        String str = this.LIZIZ.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isDisposed: ");
        LIZ.append(this.LIZIZ.isDisposed());
        LIZ.append(", terminated: ");
        LIZ.append(this.LIZIZ.LJLJJI);
        LIZ.append(", onErrored: ");
        LIZ.append(this.LIZIZ.LJLJJL);
        LIZ.append(", sendRequest, onFail error: ");
        LIZ.append(exception);
        C0NB.LJ(str, X1D.LIZIZ(LIZ));
        if (!this.LIZIZ.isDisposed()) {
            C73915Szf<T> c73915Szf = this.LIZIZ;
            if (c73915Szf.LJLJJI || c73915Szf.LJLJJL) {
                return;
            }
            c73915Szf.LJLJJL = true;
            try {
                InterfaceC116954iR<? super T> interfaceC116954iR = this.LIZ;
                if (interfaceC116954iR == null) {
                    return;
                }
                interfaceC116954iR.onError(exception);
            } catch (Throwable th) {
                String str2 = this.LIZIZ.LJLILLLLZI;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("sendRequest, onFail error: ");
                LIZ2.append(th);
                C0NB.LJ(str2, X1D.LIZIZ(LIZ2));
                V0N.LJJIL(th);
                C73548Stk.LIZIZ(new C63756P0m(exception, th));
            }
        }
    }

    @Override // X.T1U
    public final void onSuccess(T t) {
        try {
            InterfaceC116954iR<? super T> interfaceC116954iR = this.LIZ;
            if (interfaceC116954iR != null) {
                interfaceC116954iR.onNext(t);
            }
            if (!this.LIZIZ.isDisposed()) {
                this.LIZIZ.LJLJJI = true;
                InterfaceC116954iR<? super T> interfaceC116954iR2 = this.LIZ;
                if (interfaceC116954iR2 != null) {
                    interfaceC116954iR2.onComplete();
                }
            }
        } catch (Throwable th) {
            C73915Szf<T> c73915Szf = this.LIZIZ;
            if (c73915Szf.LJLJJI) {
                C73548Stk.LIZIZ(th);
                String str = this.LIZIZ.LJLILLLLZI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sendRequest, onSuccess error: ");
                LIZ.append(th);
                C0NB.LJ(str, X1D.LIZIZ(LIZ));
                return;
            }
            if (c73915Szf.isDisposed()) {
                return;
            }
            try {
                this.LIZIZ.LJLJJL = true;
                InterfaceC116954iR<? super T> interfaceC116954iR3 = this.LIZ;
                if (interfaceC116954iR3 == null) {
                    return;
                }
                interfaceC116954iR3.onError(th);
            } catch (Throwable th2) {
                String str2 = this.LIZIZ.LJLILLLLZI;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("sendRequest, onSuccess error: ");
                LIZ2.append(th);
                C0NB.LJ(str2, X1D.LIZIZ(LIZ2));
                V0N.LJJIL(th2);
                C73548Stk.LIZIZ(new C63756P0m(th, th2));
            }
        }
    }

    public C73914Sze(InterfaceC116954iR<? super T> interfaceC116954iR, C73915Szf<T> c73915Szf) {
        this.LIZ = interfaceC116954iR;
        this.LIZIZ = c73915Szf;
    }
}
