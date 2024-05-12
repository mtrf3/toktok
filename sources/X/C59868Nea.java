package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Nea, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59868Nea<T> implements InterfaceC59876Nei<T> {
    public WeakReference<T> LIZ;

    @Override // X.InterfaceC59876Nei
    public final T LIZIZ() {
        WeakReference<T> weakReference = this.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC59876Nei
    public final void release() {
        WeakReference<T> weakReference = this.LIZ;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.LIZ = null;
    }

    public C59868Nea(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.LIZ = weakReference;
    }
}
