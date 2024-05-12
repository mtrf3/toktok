package X;

import java.lang.ref.WeakReference;

/* renamed from: X.YQn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87365YQn {
    public static WeakReference<InterfaceC87369YQr> LIZ;

    public static void LIZ(Throwable th) {
        InterfaceC87369YQr interfaceC87369YQr;
        WeakReference<InterfaceC87369YQr> weakReference = LIZ;
        if (weakReference == null || (interfaceC87369YQr = weakReference.get()) == null) {
            return;
        }
        interfaceC87369YQr.onException(th);
    }
}
