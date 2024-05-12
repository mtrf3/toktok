package X;

import java.util.List;

/* loaded from: classes14.dex */
public abstract class TU4<T, S> implements InterfaceC60987Nwd {
    public S LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(TU5.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(TU9.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(TU6.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(TU7.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(TU8.LJLIL);

    public abstract void LJFF(S s);

    public final List<T> LIZLLL() {
        return (List) this.LIZIZ.getValue();
    }

    public final List<T> LJ() {
        return (List) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC60987Nwd
    public final List<T> LIZ() {
        return LJ();
    }

    @Override // X.InterfaceC60987Nwd
    public final List<T> LIZIZ() {
        return LIZLLL();
    }

    public final void LIZJ() {
        LIZLLL().clear();
        LJ().clear();
        ((List) this.LIZLLL.getValue()).clear();
        ((List) this.LJ.getValue()).clear();
        ((List) this.LJFF.getValue()).clear();
    }

    public final void LJI(S s) {
        synchronized (this) {
            this.LIZ = s;
            LIZJ();
            LJFF(s);
            List<T> LIZLLL = LIZLLL();
            LIZLLL.addAll(LJ());
            LIZLLL.addAll((List) this.LIZLLL.getValue());
            LIZLLL.addAll((List) this.LJ.getValue());
            LIZLLL.addAll((List) this.LJFF.getValue());
        }
    }

    public final void LJII(boolean z) {
        synchronized (this) {
            if (z) {
                LIZJ();
            }
        }
    }
}
