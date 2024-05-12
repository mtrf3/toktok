package X;

import java.lang.ref.WeakReference;

/* renamed from: X.EuV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37923EuV<T> implements InterfaceC37926EuY<T> {
    public final WeakReference<T> LIZ;

    @Override // X.InterfaceC37926EuY
    public final T LIZIZ() {
        WeakReference<T> weakReference = this.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public C37923EuV(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.LIZ = weakReference;
    }
}
