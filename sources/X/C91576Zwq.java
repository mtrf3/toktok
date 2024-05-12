package X;

import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import java.util.List;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.Zwq, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91576Zwq implements InterfaceC91507Zvj, InterfaceC91461Zuz, InterfaceC91460Zuy {
    public final InterfaceC91461Zuz LJLIL;
    public final InterfaceC91460Zuy LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.InterfaceC91291ZsF
    public final void Hz(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        this.LJLIL.Hz(playableQueue);
    }

    @Override // X.InterfaceC91291ZsF
    public final void Kj(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
        this.LJLIL.Kj(playMode);
    }

    @Override // X.InterfaceC91460Zuy
    public final void LJI(InterfaceC91290ZsE listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI.LJI(listener);
    }

    @Override // X.InterfaceC91290ZsE
    public final boolean LJII(InterfaceC91296ZsK playable) {
        o.LJIIIZ(playable, "playable");
        return this.LJLILLLLZI.LJII(playable);
    }

    @Override // X.InterfaceC91290ZsE
    public final boolean LJIIL(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        return this.LJLILLLLZI.LJIIL(playableQueue);
    }

    @Override // X.InterfaceC91290ZsE
    public final boolean LJIILJJIL(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
        return this.LJLILLLLZI.LJIILJJIL(playMode);
    }

    @Override // X.InterfaceC91460Zuy
    public final void LJIILL(InterfaceC91290ZsE listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI.LJIILL(listener);
    }

    @Override // X.InterfaceC91461Zuz
    public final void Mu(InterfaceC91291ZsF listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.Mu(listener);
    }

    @Override // X.InterfaceC91291ZsF
    public final void Y50(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        this.LJLIL.Y50(playableQueue);
    }

    @Override // X.InterfaceC91291ZsF
    public final void a50(C91299ZsN c91299ZsN, InterfaceC91296ZsK playable) {
        o.LJIIIZ(playable, "playable");
        this.LJLIL.a50(c91299ZsN, playable);
    }

    @Override // X.InterfaceC91461Zuz
    public final void bK(InterfaceC91291ZsF listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.bK(listener);
    }

    public C91576Zwq() {
        C91492ZvU c91492ZvU = new C91492ZvU();
        C91491ZvT c91491ZvT = new C91491ZvT();
        this.LJLIL = c91492ZvU;
        this.LJLILLLLZI = c91491ZvT;
        this.LJLJI = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 62));
    }

    public final C91490ZvS LJIJI() {
        return (C91490ZvS) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
        this.LJLIL.onAttach();
        this.LJLILLLLZI.onAttach();
        LJIJI().getClass();
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        this.LJLIL.onDetach();
        this.LJLILLLLZI.onDetach();
        LJIJI().onDetach();
    }

    @Override // X.InterfaceC91458Zuw
    public final InterfaceC91296ZsK LIZ() {
        return LJIJI().LIZ();
    }

    @Override // X.InterfaceC91458Zuw
    public final InterfaceC91296ZsK LIZJ() {
        return LJIJI().LIZJ();
    }

    @Override // X.InterfaceC91458Zuw
    public final boolean LIZLLL() {
        if (LJIJI().LJIIIIZZ() == null || ExpiredPlayableManager.INSTANCE.isTodayPlayableLimited()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC91458Zuw
    public final boolean LJFF() {
        return LJIJI().LJFF();
    }

    @Override // X.InterfaceC91458Zuw
    public final InterfaceC91296ZsK LJIIIIZZ() {
        return LJIJI().LJIIIIZZ();
    }

    @Override // X.InterfaceC91458Zuw
    public final void LJIILLIIL() {
        LJIJI().LJIILLIIL();
    }

    @Override // X.InterfaceC91458Zuw
    public final InterfaceC91297ZsL LJIIZILJ() {
        return LJIJI().LJLJJI;
    }

    @Override // X.InterfaceC91458Zuw
    public final void LIZIZ(AbstractC91380Ztg playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        if (this.LJLILLLLZI.LJIIL(playableQueue)) {
            return;
        }
        LJIJI().LIZIZ(playableQueue);
    }

    @Override // X.InterfaceC91458Zuw
    public final List<InterfaceC91296ZsK> LJ(InterfaceC91296ZsK interfaceC91296ZsK) {
        return LJIJI().LJ(interfaceC91296ZsK);
    }

    @Override // X.InterfaceC91458Zuw
    public final List<InterfaceC91296ZsK> LJIIIZ(InterfaceC91296ZsK interfaceC91296ZsK) {
        return LJIJI().LJIIIZ(interfaceC91296ZsK);
    }

    @Override // X.InterfaceC91458Zuw
    public final void LJIIJ(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
        if (this.LJLILLLLZI.LJIILJJIL(playMode)) {
            return;
        }
        LJIJI().LJIIJ(playMode);
    }

    @Override // X.InterfaceC91458Zuw
    public final void LJIILIIL(List playableList) {
        o.LJIIIZ(playableList, "playableList");
        LJIJI().LJIILIIL(playableList);
    }

    @Override // X.InterfaceC91458Zuw
    public final void LJIIJJI(C91299ZsN c91299ZsN, InterfaceC91296ZsK interfaceC91296ZsK) {
        if (this.LJLILLLLZI.LJII(interfaceC91296ZsK)) {
            return;
        }
        LJIJI().LJIIJJI(c91299ZsN, interfaceC91296ZsK);
    }
}
