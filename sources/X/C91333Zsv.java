package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Zsv, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91333Zsv implements InterfaceC91292ZsG {
    public final C91176ZqO<InterfaceC91288ZsC> LJLIL = new C91176ZqO<>();

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
        throw null;
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        this.LJLIL.LIZ.clear();
    }

    public final void LJII(InterfaceC91288ZsC listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.LIZ(listener);
    }

    public final void LJIIL(InterfaceC91288ZsC listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.LIZ.remove(listener);
    }
}
