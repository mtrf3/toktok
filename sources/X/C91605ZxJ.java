package X;

import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS173S0200000_29;
import kotlin.jvm.internal.IDqS5S0100100_29;
import kotlin.jvm.internal.o;

/* renamed from: X.ZxJ, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91605ZxJ implements InterfaceC91507Zvj, InterfaceC91457Zuv {
    public final List<InterfaceC91288ZsC> LJLIL;
    public final InterfaceC91507Zvj LJLILLLLZI;
    public final C91480ZvI LJLJI;
    public final C91350ZtC LJLJJI;

    @Override // X.InterfaceC91291ZsF
    public final void Hz(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        this.LJLILLLLZI.Hz(playableQueue);
    }

    @Override // X.InterfaceC91291ZsF
    public final void Kj(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
        this.LJLILLLLZI.Kj(playMode);
    }

    @Override // X.InterfaceC91458Zuw
    public final InterfaceC91296ZsK LIZ() {
        return this.LJLILLLLZI.LIZ();
    }

    @Override // X.InterfaceC91458Zuw
    public final void LIZIZ(AbstractC91380Ztg playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        this.LJLILLLLZI.LIZIZ(playableQueue);
    }

    @Override // X.InterfaceC91458Zuw
    public final InterfaceC91296ZsK LIZJ() {
        return this.LJLILLLLZI.LIZJ();
    }

    @Override // X.InterfaceC91458Zuw
    public final boolean LIZLLL() {
        return this.LJLILLLLZI.LIZLLL();
    }

    @Override // X.InterfaceC91458Zuw
    public final List<InterfaceC91296ZsK> LJ(InterfaceC91296ZsK interfaceC91296ZsK) {
        return this.LJLILLLLZI.LJ(interfaceC91296ZsK);
    }

    @Override // X.InterfaceC91458Zuw
    public final boolean LJFF() {
        return this.LJLILLLLZI.LJFF();
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

    @Override // X.InterfaceC91458Zuw
    public final InterfaceC91296ZsK LJIIIIZZ() {
        return this.LJLILLLLZI.LJIIIIZZ();
    }

    @Override // X.InterfaceC91458Zuw
    public final List<InterfaceC91296ZsK> LJIIIZ(InterfaceC91296ZsK interfaceC91296ZsK) {
        return this.LJLILLLLZI.LJIIIZ(interfaceC91296ZsK);
    }

    @Override // X.InterfaceC91458Zuw
    public final void LJIIJ(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
        this.LJLILLLLZI.LJIIJ(playMode);
    }

    @Override // X.InterfaceC91458Zuw
    public final void LJIIJJI(C91299ZsN c91299ZsN, InterfaceC91296ZsK interfaceC91296ZsK) {
        this.LJLILLLLZI.LJIIJJI(c91299ZsN, interfaceC91296ZsK);
    }

    @Override // X.InterfaceC91290ZsE
    public final boolean LJIIL(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        return this.LJLILLLLZI.LJIIL(playableQueue);
    }

    @Override // X.InterfaceC91458Zuw
    public final void LJIILIIL(List playableList) {
        o.LJIIIZ(playableList, "playableList");
        this.LJLILLLLZI.LJIILIIL(playableList);
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

    @Override // X.InterfaceC91458Zuw
    public final void LJIILLIIL() {
        this.LJLILLLLZI.LJIILLIIL();
    }

    @Override // X.InterfaceC91458Zuw
    public final InterfaceC91297ZsL LJIIZILJ() {
        return this.LJLILLLLZI.LJIIZILJ();
    }

    @Override // X.InterfaceC91457Zuv
    public final void LJIJ(C91299ZsN c91299ZsN, int i) {
        this.LJLJI.LJIJ(c91299ZsN, i);
    }

    @Override // X.InterfaceC91461Zuz
    public final void Mu(InterfaceC91291ZsF listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI.Mu(listener);
    }

    @Override // X.InterfaceC91291ZsF
    public final void Y50(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
        this.LJLILLLLZI.Y50(playableQueue);
    }

    @Override // X.InterfaceC91291ZsF
    public final void a50(C91299ZsN c91299ZsN, InterfaceC91296ZsK playable) {
        o.LJIIIZ(playable, "playable");
        this.LJLILLLLZI.a50(c91299ZsN, playable);
    }

    @Override // X.InterfaceC91461Zuz
    public final void bK(InterfaceC91291ZsF listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI.bK(listener);
    }

    public final EnumC91310ZsY LJIJI() {
        C91330Zss c91330Zss = this.LJLJI.LJLILLLLZI;
        if (c91330Zss.LJII()) {
            int i = c91330Zss.LJIIL().LIZIZ().LIZ.LJIIL;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return EnumC91310ZsY.PLAYBACK_STATE_STOPPED;
                        }
                        return EnumC91310ZsY.PLAYBACK_STATE_ERROR;
                    }
                    return EnumC91310ZsY.PLAYBACK_STATE_PAUSED;
                }
                return EnumC91310ZsY.PLAYBACK_STATE_PLAYING;
            }
            return EnumC91310ZsY.PLAYBACK_STATE_STOPPED;
        }
        return EnumC91310ZsY.PLAYBACK_STATE_STOPPED;
    }

    public final long LJIJJ() {
        C91330Zss c91330Zss = this.LJLJI.LJLILLLLZI;
        if (c91330Zss.LJII()) {
            return c91330Zss.LJIIL().LIZ();
        }
        return 0L;
    }

    public final int LJIJJLI() {
        C91330Zss c91330Zss = this.LJLJI.LJLILLLLZI;
        if (c91330Zss.LJII()) {
            C91061ZoX LJIIL = c91330Zss.LJIIL();
            if (LJIIL.LIZIZ) {
                return LJIIL.LIZIZ().LJJJJI();
            }
        }
        return 0;
    }

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
        this.LJLILLLLZI.onAttach();
        this.LJLJI.onAttach();
        C91350ZtC c91350ZtC = this.LJLJJI;
        c91350ZtC.getClass();
        c91350ZtC.LJLIL = this;
        this.LJLJJI.onAttach();
        Iterator<InterfaceC91288ZsC> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            this.LJLJI.LJLJI.LJII(it.next());
        }
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        Iterator<InterfaceC91288ZsC> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            this.LJLJI.LJLJI.LJIIL(it.next());
        }
        this.LJLILLLLZI.onDetach();
        this.LJLJI.onDetach();
        this.LJLJJI.onDetach();
    }

    public final void LJIL(C91299ZsN c91299ZsN) {
        C91480ZvI c91480ZvI = this.LJLJI;
        C91333Zsv c91333Zsv = c91480ZvI.LJLJI;
        c91333Zsv.getClass();
        C34K c34k = new C34K();
        c91333Zsv.LJLIL.LIZIZ(new IDqS173S0200000_29(c34k, c91299ZsN, 0));
        if (c34k.element) {
            return;
        }
        C91330Zss c91330Zss = c91480ZvI.LJLILLLLZI;
        if (!c91330Zss.LJII()) {
            return;
        }
        C91061ZoX LJIIL = c91330Zss.LJIIL();
        LJIIL.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIIL);
        LIZ.append("  -> pause");
        X1D.LIZIZ(LIZ);
        LJIIL.LIZIZ().LJJL();
    }

    public final void LJJ(C91299ZsN c91299ZsN) {
        C91480ZvI c91480ZvI = this.LJLJI;
        C91333Zsv c91333Zsv = c91480ZvI.LJLJI;
        c91333Zsv.getClass();
        C34K c34k = new C34K();
        c91333Zsv.LJLIL.LIZIZ(new IDqS173S0200000_29(c34k, c91299ZsN, 1));
        if (c34k.element) {
            return;
        }
        C91330Zss c91330Zss = c91480ZvI.LJLILLLLZI;
        if (c91330Zss.LJII()) {
            C91061ZoX LJIIL = c91330Zss.LJIIL();
            LJIIL.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJIIL);
            LIZ.append("  -> resume");
            X1D.LIZIZ(LIZ);
            LJIIL.LIZJ();
        }
        IEarphonePlayerControlService LJII = EarphonePlayerControl.LJII();
        if (!LJII.LIZIZ()) {
            return;
        }
        LJII.LJ("music", false);
    }

    public final void LJJI(long j) {
        EnumC91310ZsY enumC91310ZsY;
        C91480ZvI c91480ZvI = this.LJLJI;
        C91333Zsv c91333Zsv = c91480ZvI.LJLJI;
        c91333Zsv.getClass();
        C34K c34k = new C34K();
        c91333Zsv.LJLIL.LIZIZ(new IDqS5S0100100_29(j, c34k, 0));
        if (c34k.element) {
            return;
        }
        C91330Zss c91330Zss = c91480ZvI.LJLILLLLZI;
        if (!c91330Zss.LJII()) {
            return;
        }
        int i = c91330Zss.LJIIL().LIZIZ().LIZ.LJIIL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_STOPPED;
                    } else {
                        enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_ERROR;
                    }
                } else {
                    enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_PAUSED;
                }
            } else {
                enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_PLAYING;
            }
        } else {
            enumC91310ZsY = EnumC91310ZsY.PLAYBACK_STATE_STOPPED;
        }
        if (enumC91310ZsY != EnumC91310ZsY.PLAYBACK_STATE_STOPPED) {
            c91330Zss.LJLIL.onSeekStateChanged(EnumC91311ZsZ.SEEKING, j);
            C91061ZoX LJIIL = c91330Zss.LJIIL();
            C91332Zsu c91332Zsu = new C91332Zsu(c91330Zss);
            LJIIL.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJIIL);
            LIZ.append("  -> seekToTime: -> ");
            LIZ.append(j);
            X1D.LIZIZ(LIZ);
            if (!LJIIL.LJ) {
                long j2 = 0;
                if (j >= 0) {
                    LJIIL.LJ = true;
                    long LIZ2 = LJIIL.LIZ() - 0;
                    if (0 < LIZ2) {
                        j2 = LIZ2;
                    }
                    if (j > j2) {
                        j = j2;
                    }
                    LJIIL.LIZIZ().LJJLIIIJLJLI((int) j, new C91338Zt0(LJIIL, c91332Zsu, j));
                    return;
                }
            }
            c91332Zsu.LIZ(j, false);
            return;
        }
        c91330Zss.LJIIL().LJFF((int) j);
    }

    public final void LJJIFFI(C91299ZsN c91299ZsN) {
        C91480ZvI c91480ZvI = this.LJLJI;
        C91333Zsv c91333Zsv = c91480ZvI.LJLJI;
        c91333Zsv.getClass();
        C34K c34k = new C34K();
        c91333Zsv.LJLIL.LIZIZ(new IDqS173S0200000_29(c34k, c91299ZsN, 2));
        if (c34k.element) {
            return;
        }
        c91480ZvI.LJLILLLLZI.LJIILJJIL();
    }

    public C91605ZxJ(EnumC91322Zsk scene, List interceptors) {
        C91576Zwq c91576Zwq = new C91576Zwq();
        C91480ZvI c91480ZvI = new C91480ZvI();
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(interceptors, "interceptors");
        this.LJLIL = interceptors;
        this.LJLILLLLZI = c91576Zwq;
        this.LJLJI = c91480ZvI;
        this.LJLJJI = new C91350ZtC(scene);
    }
}
