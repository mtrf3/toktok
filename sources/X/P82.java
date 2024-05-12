package X;

import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public final class P82 implements InterfaceC87369YQr {
    @Override // X.InterfaceC87369YQr
    public final void onException(Throwable th) {
        P81 p81;
        WeakReference<P81> weakReference = C63951P7z.LIZ;
        if (weakReference == null || (p81 = weakReference.get()) == null) {
            return;
        }
        p81.onException(th);
    }
}
