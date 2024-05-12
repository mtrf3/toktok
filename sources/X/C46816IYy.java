package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.IYy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46816IYy implements InterfaceC197777pV {
    public IWH LIZ;
    public IZ0 LIZIZ;
    public InterfaceC46540IOi LIZJ;
    public C46539IOh LIZLLL;

    @Override // X.InterfaceC197777pV
    public final C229728zw LIZJ() {
        InterfaceC46645ISj LIZJ;
        IWH iwh = this.LIZ;
        if (iwh == null) {
            LIZJ = null;
        } else {
            LIZJ = iwh.LIZJ();
        }
        return new C229728zw(LIZJ);
    }

    @Override // X.InterfaceC197777pV
    public final C198427qY LIZLLL() {
        IWK LIZLLL;
        IWH iwh = this.LIZ;
        if (iwh == null) {
            LIZLLL = null;
        } else {
            LIZLLL = iwh.LIZLLL();
        }
        return new C198427qY(LIZLLL);
    }

    @Override // X.InterfaceC197777pV
    public final IWU getPlayState() {
        I90 playState;
        IWH iwh = this.LIZ;
        if (iwh == null) {
            playState = null;
        } else {
            playState = iwh.getPlayState();
        }
        return new IWU(playState);
    }

    @Override // X.InterfaceC197777pV
    public final void pause() {
        IWH iwh = this.LIZ;
        if (iwh != null) {
            iwh.pause();
        }
        IZ0 iz0 = this.LIZIZ;
        if (iz0 == null) {
            return;
        }
        iz0.pause();
    }

    @Override // X.InterfaceC197777pV
    public final void release() {
        IWH iwh = this.LIZ;
        if (iwh != null) {
            iwh.LJJJLL(null);
        }
        this.LIZLLL = null;
        IWH iwh2 = this.LIZ;
        if (iwh2 != null) {
            iwh2.release();
        }
        IZ0 iz0 = this.LIZIZ;
        if (iz0 != null) {
            iz0.release();
        }
        this.LIZIZ = null;
        this.LIZ = null;
    }

    @Override // X.InterfaceC197777pV
    public final void reset() {
        IWH iwh = this.LIZ;
        if (iwh == null) {
            return;
        }
        iwh.reset();
    }

    @Override // X.InterfaceC197777pV
    public final void resume() {
        IZ0 iz0 = this.LIZIZ;
        if (iz0 == null) {
            return;
        }
        iz0.resume();
    }

    @Override // X.InterfaceC197777pV
    public final void stop() {
        IWH iwh = this.LIZ;
        if (iwh != null) {
            iwh.stop();
        }
        IZ0 iz0 = this.LIZIZ;
        if (iz0 == null) {
            return;
        }
        iz0.stop();
    }

    public C46816IYy(IZ1 iz1) {
        IWK LIZLLL;
        IWK LIZLLL2;
        IZ0 c47202Ifm;
        this.LIZ = ISimPlayerService.LIZ.get().LJFF(false, iz1.LIZ);
        C46539IOh c46539IOh = new C46539IOh(this.LIZJ, this.LIZ, this);
        this.LIZLLL = c46539IOh;
        IWH iwh = this.LIZ;
        if (iwh != null) {
            iwh.LJJJLL(c46539IOh);
        }
        IWH iwh2 = this.LIZ;
        if (iwh2 != null) {
            iwh2.LJIIIZ(C46982IcE.LJI());
        }
        if (C1DG.LIZ().getConfig().getSimPlayerConfig().perfEventEnabled() || C1DG.LIZ().getConfig().getSimPlayerConfig().perfEventEnabledInPlayRequest()) {
            IWH iwh3 = this.LIZ;
            if (iwh3 != null && (LIZLLL = iwh3.LIZLLL()) != null) {
                LIZLLL.LIZLLL(new O5Y());
            }
            IWH iwh4 = this.LIZ;
            if (iwh4 != null && (LIZLLL2 = iwh4.LIZLLL()) != null) {
                LIZLLL2.LJ(new C46327IGd());
            }
        }
        if (C1DG.LIZ().getConfig().getCommonConfig().simKitStrategyEnabled()) {
            c47202Ifm = new C47201Ifl(iz1, this.LIZ, this.LIZLLL);
        } else {
            c47202Ifm = new C47202Ifm(iz1, this.LIZ, this.LIZLLL);
        }
        this.LIZIZ = c47202Ifm;
    }

    @Override // X.InterfaceC197777pV
    public final void LIZ(InterfaceC46811IYt playRequest) {
        o.LJIIIZ(playRequest, "playRequest");
        playRequest.LJII();
        SimRadar.keyScan("PlayerImpl", "play", null, playRequest.getKey());
        if (this.LIZLLL != null) {
            playRequest.getKey();
            playRequest.LJIIIZ();
        }
        IZ0 iz0 = this.LIZIZ;
        if (iz0 != null) {
            iz0.LIZ(playRequest);
        }
        C46812IYu LJ = playRequest.LJ();
        if (LJ == null || !LJ.LJIIIIZZ) {
            return;
        }
        LIZLLL().LIZ();
    }

    @Override // X.InterfaceC197777pV
    public final void LIZIZ(IZ2 host) {
        String LJLLJ;
        o.LJIIIZ(host, "host");
        Object[] objArr = new Object[2];
        FrameLayout LJJLIIIJLJLI = host.LJJLIIIJLJLI();
        if (LJJLIIIJLJLI == null) {
            LJLLJ = null;
        } else {
            LJLLJ = C16880lQ.LJLLJ(LJJLIIIJLJLI.getClass());
        }
        objArr[0] = LJLLJ;
        objArr[1] = host.getSurface();
        SimRadar.keyScan("PlayerImpl", "attach", objArr);
        IZ0 iz0 = this.LIZIZ;
        if (iz0 == null) {
            return;
        }
        iz0.LIZIZ(host);
    }

    @Override // X.InterfaceC197777pV
    public final void LJ(InterfaceC197787pW host) {
        o.LJIIIZ(host, "host");
        IZ0 iz0 = this.LIZIZ;
        if (iz0 == null) {
            return;
        }
        iz0.LJ(host);
    }

    @Override // X.InterfaceC197777pV
    public final void LJFF(String sceneID) {
        o.LJIIIZ(sceneID, "sceneID");
        SimRadar.keyScan("PlayerImpl", "clearPlayList", "sceneID", sceneID);
        IZ0 iz0 = this.LIZIZ;
        if (iz0 == null) {
            return;
        }
        iz0.LJFF(sceneID);
    }

    @Override // X.InterfaceC197777pV
    public final void LJII(InterfaceC46540IOi interfaceC46540IOi) {
        this.LIZJ = interfaceC46540IOi;
        C46539IOh c46539IOh = this.LIZLLL;
        if (c46539IOh == null) {
            return;
        }
        c46539IOh.LJLJI = interfaceC46540IOi;
    }

    @Override // X.InterfaceC197777pV
    public final void LJIIIIZZ(C197807pY c197807pY) {
        C46539IOh c46539IOh = this.LIZLLL;
        if (c46539IOh == null) {
            return;
        }
        c46539IOh.LJLJJL = c197807pY;
    }

    @Override // X.InterfaceC197777pV
    public final void LJIIIZ(C44418Hby c44418Hby) {
        IWH iwh = this.LIZ;
        if (iwh == null) {
            return;
        }
        iwh.LJIIIIZZ(C46810IYs.LIZ(c44418Hby, null));
    }

    @Override // X.InterfaceC197777pV
    public final void LJI(String sceneID, List<? extends InterfaceC46811IYt> list) {
        o.LJIIIZ(sceneID, "sceneID");
        o.LJIILLIIL(Integer.valueOf(list.size()), "setPlayList: ");
        SimRadar.keyScan("PlayerImpl", "setPlayList", "sceneID", sceneID, "size", Integer.valueOf(list.size()));
        IZ0 iz0 = this.LIZIZ;
        if (iz0 == null) {
            return;
        }
        iz0.LJI(sceneID, list);
    }
}
