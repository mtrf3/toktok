package X;

import com.bytedance.retrofit2.SsHttpCall;

/* renamed from: X.SrP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73403SrP<T> extends AbstractC73672Svk<C64797Pbt<T>> {
    public final InterfaceC37276Ek4<T> LJLIL;

    public C73403SrP(SsHttpCall ssHttpCall) {
        this.LJLIL = ssHttpCall;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super C64797Pbt<T>> interfaceC116954iR) {
        boolean z;
        InterfaceC37276Ek4<T> m31clone = this.LJLIL.m31clone();
        interfaceC116954iR.onSubscribe(new J22(m31clone));
        try {
            C64797Pbt<T> execute = m31clone.execute();
            if (!m31clone.isCanceled()) {
                interfaceC116954iR.onNext(execute);
            }
            if (!m31clone.isCanceled()) {
                try {
                    interfaceC116954iR.onComplete();
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    V0N.LJJIL(th);
                    if (z) {
                        C73548Stk.LIZIZ(th);
                        return;
                    }
                    if (m31clone.isCanceled()) {
                        return;
                    }
                    try {
                        interfaceC116954iR.onError(th);
                    } catch (Throwable th2) {
                        V0N.LJJIL(th2);
                        C73548Stk.LIZIZ(new C63756P0m(th, th2));
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }
}
