package X;

import kotlin.jvm.internal.o;

/* renamed from: X.33m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C777833m<T> extends AbstractC73391SrD<T> {
    public final C60692Zt LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RxDisposableObserver{taskInfo='");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC116954iR
    public void onComplete() {
        dispose();
    }

    public C777833m(C60692Zt c60692Zt) {
        this.LJLILLLLZI = c60692Zt;
    }
}
