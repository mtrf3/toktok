package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Cfx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31925Cfx<T> implements InterfaceC31927Cfz<T> {
    public WeakReference<T> LIZ;

    @Override // X.InterfaceC31927Cfz
    public final T LIZIZ() {
        WeakReference<T> weakReference = this.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC31927Cfz
    public final void release() {
        WeakReference<T> weakReference = this.LIZ;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.LIZ = null;
    }

    public C31925Cfx(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.LIZ = weakReference;
    }
}
