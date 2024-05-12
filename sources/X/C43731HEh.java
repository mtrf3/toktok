package X;

/* renamed from: X.HEh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43731HEh {
    public static final C43731HEh LIZ = new C43731HEh();
    public static volatile C43735HEl LIZIZ;

    public final InterfaceC43316GzI LIZIZ() {
        if (LIZIZ == null) {
            synchronized (this) {
                if (LIZIZ == null) {
                    LIZIZ = new C43735HEl();
                }
            }
        }
        C43735HEl c43735HEl = LIZIZ;
        if (c43735HEl == null) {
            return new C43735HEl();
        }
        return c43735HEl;
    }

    public final void LIZ() {
        ((C45330Hqg) LIZIZ()).LJI().LJIIL();
        ((C45330Hqg) LIZIZ()).LIZJ().LIZJ();
        synchronized (this) {
            C43735HEl c43735HEl = LIZIZ;
            if (c43735HEl != null) {
                c43735HEl.LIZLLL();
            }
            LIZIZ = null;
        }
    }
}
