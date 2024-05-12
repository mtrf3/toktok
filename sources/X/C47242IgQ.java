package X;

/* renamed from: X.IgQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47242IgQ {
    public static final Object LIZ = new Object();
    public static InterfaceC46732IVs LIZIZ = null;

    public static InterfaceC46732IVs LIZ() {
        InterfaceC46732IVs interfaceC46732IVs = LIZIZ;
        if (interfaceC46732IVs != null) {
            return interfaceC46732IVs;
        }
        synchronized (LIZ) {
            InterfaceC46732IVs interfaceC46732IVs2 = LIZIZ;
            if (interfaceC46732IVs2 != null) {
                return interfaceC46732IVs2;
            }
            InterfaceC46732IVs LIZ2 = C13870gZ.LIZ();
            LIZIZ = LIZ2;
            return LIZ2;
        }
    }
}
