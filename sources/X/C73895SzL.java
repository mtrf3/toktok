package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SzL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73895SzL<T> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73463SsN<T> {
    public static final long serialVersionUID = 3323743579927613702L;
    public final C73896SzM<T, ?> LJLIL;
    public final int LJLILLLLZI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLIL.LIZ(this.LJLILLLLZI, th);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this, interfaceC92693kP);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        C73896SzM<T, ?> c73896SzM = this.LJLIL;
        c73896SzM.LJLJJI[this.LJLILLLLZI] = t;
        if (c73896SzM.decrementAndGet() == 0) {
            try {
                Object apply = c73896SzM.LJLILLLLZI.apply(c73896SzM.LJLJJI);
                C73320Sq4.LIZ(apply, "The zipper returned a null value");
                c73896SzM.LJLIL.onSuccess(apply);
            } catch (Throwable th) {
                V0N.LJJIL(th);
                c73896SzM.LJLIL.onError(th);
            }
        }
    }

    public C73895SzL(C73896SzM<T, ?> c73896SzM, int i) {
        this.LJLIL = c73896SzM;
        this.LJLILLLLZI = i;
    }
}
