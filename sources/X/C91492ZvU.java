package X;

import kotlin.jvm.internal.IDqS173S0200000_29;
import kotlin.jvm.internal.IDqS417S0100000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvU, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91492ZvU implements InterfaceC91461Zuz, InterfaceC91292ZsG {
    public final C91176ZqO<InterfaceC91291ZsF> LJLIL = new C91176ZqO<>();

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        this.LJLIL.LIZ.clear();
    }

    @Override // X.InterfaceC91291ZsF
    public final void Hz(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        this.LJLIL.LIZIZ(new IDqS417S0100000_29(playableQueue, 21));
    }

    @Override // X.InterfaceC91291ZsF
    public final void Kj(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
        this.LJLIL.LIZIZ(new IDqS417S0100000_29(playMode, 20));
    }

    @Override // X.InterfaceC91461Zuz
    public final void Mu(InterfaceC91291ZsF listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.LIZ(listener);
    }

    @Override // X.InterfaceC91291ZsF
    public final void Y50(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        this.LJLIL.LIZIZ(new IDqS417S0100000_29(playableQueue, 22));
    }

    @Override // X.InterfaceC91461Zuz
    public final void bK(InterfaceC91291ZsF listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.LIZ.remove(listener);
    }

    @Override // X.InterfaceC91291ZsF
    public final void a50(C91299ZsN c91299ZsN, InterfaceC91296ZsK playable) {
        o.LJIIIZ(playable, "playable");
        this.LJLIL.LIZIZ(new IDqS173S0200000_29(c91299ZsN, playable, 11));
    }
}
