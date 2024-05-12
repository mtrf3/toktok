package X;

import java.lang.ref.WeakReference;

/* renamed from: X.IDc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46248IDc {
    public static WeakReference<InterfaceC46246IDa> LIZ;
    public static final C46249IDd LIZIZ = new C46249IDd();

    public static InterfaceC46246IDa LIZ() {
        WeakReference<InterfaceC46246IDa> weakReference = LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
