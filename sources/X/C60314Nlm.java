package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Nlm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60314Nlm<T, R> implements F2Y<R> {
    public WeakReference<T> LJLIL;
    public final InterfaceC88472Yns<T, R> LJLILLLLZI;

    @Override // X.F2Y
    public final R LIZIZ() {
        T t;
        WeakReference<T> weakReference = this.LJLIL;
        if (weakReference != null && (t = weakReference.get()) != null) {
            return this.LJLILLLLZI.invoke(t);
        }
        return null;
    }

    @Override // X.InterfaceC37788EsK
    public final void release() {
        WeakReference<T> weakReference = this.LJLIL;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.LJLIL = null;
    }

    public C60314Nlm(Object obj, C60313Nll provider) {
        o.LJIIJ(provider, "provider");
        this.LJLILLLLZI = provider;
        this.LJLIL = new WeakReference<>(obj);
    }
}
