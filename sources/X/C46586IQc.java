package X;

import java.lang.ref.WeakReference;

/* renamed from: X.IQc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46586IQc implements InterfaceC46587IQd {
    public static final C46586IQc LIZ = new C46586IQc();
    public static WeakReference<InterfaceC46587IQd> LIZIZ;
    public static boolean LIZJ;

    public static final InterfaceC46587IQd LIZIZ() {
        WeakReference<InterfaceC46587IQd> weakReference = LIZIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC46587IQd
    public final void LIZ() {
        InterfaceC46587IQd LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null) {
            LIZIZ2.LIZ();
        }
    }

    @Override // X.InterfaceC46587IQd
    public final void tryPlay() {
        InterfaceC46587IQd LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null) {
            LIZIZ2.tryPlay();
        }
    }

    public static final void LIZJ(C59319NPv c59319NPv) {
        WeakReference<InterfaceC46587IQd> weakReference;
        if (c59319NPv == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(c59319NPv);
        }
        LIZIZ = weakReference;
    }
}
