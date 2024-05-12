package X;

import java.util.concurrent.Executor;

/* renamed from: X.Qgc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67638Qgc<TResult> {
    public abstract C67646Qgk LIZLLL(Executor executor, InterfaceC67679QhH interfaceC67679QhH);

    public abstract C67646Qgk LJ(InterfaceC67677QhF interfaceC67677QhF);

    public abstract C67646Qgk LJFF(Executor executor, InterfaceC67677QhF interfaceC67677QhF);

    public abstract Exception LJIIIIZZ();

    public abstract TResult LJIIIZ();

    public abstract <X extends Throwable> TResult LJIIJ(Class<X> cls);

    public abstract boolean LJIIJJI();

    public abstract boolean LJIIL();

    public abstract boolean LJIILIIL();

    public AbstractC67638Qgc LJIILJJIL() {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public void LIZIZ(InterfaceC67661Qgz interfaceC67661Qgz) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void LIZ(ExecutorC67642Qgg executorC67642Qgg, InterfaceC67680QhI interfaceC67680QhI) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public void LIZJ(Executor executor, InterfaceC67661Qgz interfaceC67661Qgz) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> AbstractC67638Qgc<TContinuationResult> LJI(Executor executor, InterfaceC67660Qgy<TResult, TContinuationResult> interfaceC67660Qgy) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> AbstractC67638Qgc<TContinuationResult> LJII(Executor executor, InterfaceC67660Qgy<TResult, AbstractC67638Qgc<TContinuationResult>> interfaceC67660Qgy) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> AbstractC67638Qgc<TContinuationResult> LJIILL(Executor executor, InterfaceC67643Qgh<TResult, TContinuationResult> interfaceC67643Qgh) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
