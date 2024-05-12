package X;

import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class F26<T> implements F2Y<T> {
    public WeakReference<T> LJLIL;

    @Override // X.F2Y
    public final T LIZIZ() {
        WeakReference<T> weakReference = this.LJLIL;
        if (weakReference != null) {
            return weakReference.get();
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

    public F26(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.LJLIL = weakReference;
    }
}
