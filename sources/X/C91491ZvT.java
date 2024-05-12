package X;

import kotlin.jvm.internal.IDqS173S0200000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvT, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91491ZvT implements InterfaceC91460Zuy {
    public final C91176ZqO<InterfaceC91290ZsE> LJLIL = new C91176ZqO<>();

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        this.LJLIL.LIZ.clear();
    }

    @Override // X.InterfaceC91460Zuy
    public final void LJI(InterfaceC91290ZsE listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.LIZ.remove(listener);
    }

    @Override // X.InterfaceC91290ZsE
    public final boolean LJII(InterfaceC91296ZsK playable) {
        o.LJIIIZ(playable, "playable");
        C34K c34k = new C34K();
        this.LJLIL.LIZIZ(new IDqS173S0200000_29(c34k, playable, 8));
        return c34k.element;
    }

    @Override // X.InterfaceC91290ZsE
    public final boolean LJIIL(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        C34K c34k = new C34K();
        this.LJLIL.LIZIZ(new IDqS173S0200000_29(c34k, playableQueue, 10));
        return c34k.element;
    }

    @Override // X.InterfaceC91290ZsE
    public final boolean LJIILJJIL(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
        C34K c34k = new C34K();
        this.LJLIL.LIZIZ(new IDqS173S0200000_29(c34k, playMode, 9));
        return c34k.element;
    }

    @Override // X.InterfaceC91460Zuy
    public final void LJIILL(InterfaceC91290ZsE listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.LIZ(listener);
    }
}
