package X;

import Y.ARunnableS44S0100000_8;
import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.impl.StrategyImpl;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.video.FeedPlayerManagerViewModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IWF implements InterfaceC46330IGg {
    public static IWF LJIIL;
    public static boolean LJIILIIL;
    public static final C46307IFj LJIILJJIL = new C46307IFj();
    public IWH LIZ;
    public volatile boolean LIZIZ;
    public final IWH LIZJ;
    public final boolean LIZLLL;
    public boolean LJ;
    public final IWG LJFF;
    public String LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public Video LJIIIZ;
    public InterfaceC46587IQd LJIIJ;
    public Long LJIIJJI;

    public IWF() {
        this(true);
    }

    @Override // X.InterfaceC46330IGg
    public final void LJIJ() {
    }

    @Override // X.InterfaceC46330IGg
    public final void LJIJJLI() {
        LJIILIIL = false;
    }

    @Override // X.InterfaceC46330IGg
    public final void LIZIZ() {
        String str;
        if (C30K.LIZ("resumePlay")) {
            return;
        }
        this.LJIIJ.tryPlay();
        if (IWS.LIZ) {
            StringBuilder sb = new StringBuilder("resumePlay aid:");
            if (this.LIZ.LJ().LIZ.LIZLLL != null) {
                str = this.LIZ.LJ().LIZ.LIZLLL.getSourceId();
            } else {
                str = "null";
            }
            sb.append(str);
            C47150Iew.LIZJ("PlayerManager", sb.toString());
        }
        this.LIZ.resume();
        this.LIZIZ = false;
    }

    @Override // X.IDV
    public final float LIZJ() {
        return this.LIZ.LIZJ().LIZJ();
    }

    @Override // X.IDV
    public final int LJ() {
        return this.LIZ.LIZJ().LJ();
    }

    @Override // X.IDV
    public final float LJII() {
        return this.LIZ.LIZJ().LJII();
    }

    @Override // X.InterfaceC46330IGg
    public final void LJIIIIZZ() {
        this.LIZ = this.LIZJ;
    }

    @Override // X.InterfaceC46330IGg
    public final void LJIILIIL() {
        this.LJFF.LIZ(IWP.LIZ);
    }

    @Override // X.InterfaceC46330IGg
    public final void LJIILJJIL() {
        String str;
        this.LJIIJ.LIZ();
        if (IWS.LIZ) {
            StringBuilder sb = new StringBuilder("tryPausePlay aid:");
            if (this.LIZ.LJ().LIZ.LIZLLL != null) {
                str = this.LIZ.LJ().LIZ.LIZLLL.getSourceId();
            } else {
                str = "null";
            }
            sb.append(str);
            C47150Iew.LIZJ("PlayerManager", sb.toString());
        }
        this.LIZ.pause();
        this.LIZIZ = false;
        LJJLIIIJ();
        this.LJ = false;
    }

    @Override // X.InterfaceC46330IGg
    public final void LJIJJ() {
        this.LIZ.LIZLLL().LIZIZ();
    }

    @Override // X.InterfaceC46330IGg
    public final Integer LJIL() {
        int i;
        Integer num = (Integer) this.LIZ.LIZ(C46669ITh.LIZLLL);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJ() {
        if (C00F.LIZ(31744, 2, "cold_launch_player_opt_exp", true) == 1) {
            this.LJFF.LIZIZ(false);
        } else {
            if (C00F.LIZ(31744, 2, "cold_launch_player_opt_exp", true) != 2) {
                return;
            }
            this.LIZ.LJ().LIZ.LIZIZ.LJLJI(new IWT());
        }
    }

    @Override // X.InterfaceC46330IGg
    public final Integer LJJI() {
        int i;
        Long l = (Long) this.LIZ.LIZ(C46573IPp.LIZLLL);
        if (l != null) {
            i = l.intValue();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJIIZ() {
        this.LIZ.reset();
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJIL() {
        this.LIZ.LIZLLL().LIZJ();
    }

    @Override // X.IDV
    public final int LJJJJ() {
        return this.LIZ.LIZJ().LJIILL();
    }

    @Override // X.InterfaceC46330IGg
    public final String LJJJJIZL() {
        if (this.LIZ.LJ() != null && this.LIZ.LJ().LIZ.LIZLLL != null) {
            return this.LIZ.LJ().LIZ.LIZLLL.getSourceId();
        }
        return "";
    }

    @Override // X.IDV
    public final VideoUrlModel LJJJJLI() {
        return C51029K0z.LJJJJZ(this.LIZ.LJ().LIZ.LIZLLL);
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJJLIIL() {
        this.LIZ.LIZJ().LJJJLIIL();
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJJZ() {
        this.LIZ.LIZJ().LJJJZ();
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJL() {
        this.LIZ.reset();
        TTVideoEngine.LJJLIIIJJIZ();
        this.LIZ.LJJL();
        this.LIZIZ = false;
        this.LJFF.LJ = 1;
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJLIL() {
        String str;
        if (IWS.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("render aid:");
            if (this.LIZ.LJ().LIZ.LIZLLL != null) {
                str = this.LIZ.LJ().LIZ.LIZLLL.getSourceId();
            } else {
                str = "null";
            }
            LIZ.append(str);
            C47150Iew.LIZJ("PlayerManager", X1D.LIZIZ(LIZ));
        }
        this.LIZ.LJ().LIZ.LIZIZ.LJJLIL();
        if (C33842DPy.LIZIZ() || ((StrategyImpl.LIZIZ().LJJIJLIJ() && C55068LjM.LIZIZ()) || (C54502LaE.LJ("detail_page_startup") && IWV.LIZ()))) {
            LJIILIIL = true;
        }
    }

    @Override // X.InterfaceC46330IGg
    public final void LLLLLL() {
        String str;
        if (IWS.LIZ) {
            StringBuilder sb = new StringBuilder("stopPlay aid:");
            if (this.LIZ.LJ().LIZ.LIZLLL != null) {
                str = this.LIZ.LJ().LIZ.LIZLLL.getSourceId();
            } else {
                str = "null";
            }
            sb.append(str);
            C47150Iew.LIZJ("PlayerManager", sb.toString());
        }
        if (IWG.LJIIJJI) {
            IWG.LJIIJJI = false;
            return;
        }
        LJJLIIIJ();
        this.LIZ.stop();
        this.LIZIZ = false;
    }

    @Override // X.IDV
    public final float getBitrate() {
        return this.LIZ.LIZJ().getBitrate();
    }

    @Override // X.IDV
    public final long getCurrentPosition() {
        return this.LIZ.LIZJ().getCurrentPosition();
    }

    @Override // X.IDV
    public final long getDuration() {
        return this.LIZ.LIZJ().getDuration();
    }

    @Override // X.InterfaceC46330IGg
    public final float getSpeed() {
        return this.LIZ.LIZJ().getSpeed();
    }

    @Override // X.IDV
    public final int getVideoHeight() {
        return this.LIZ.LIZJ().getHeight();
    }

    @Override // X.IDV
    public final int getVideoWidth() {
        return this.LIZ.LIZJ().getWidth();
    }

    @Override // X.IDV
    public final boolean isMute() {
        return this.LIZ.LIZJ().isMute();
    }

    @Override // X.IDV
    public final boolean isPaused() {
        return ((C46751IWl) this.LIZ.getPlayState()).LIZ.isPaused();
    }

    @Override // X.IDV
    public final boolean isPlaying() {
        return ((C46751IWl) this.LIZ.getPlayState()).LIZ();
    }

    @Override // X.InterfaceC46330IGg
    public final void release() {
        this.LIZ.reset();
        this.LIZ.release();
        this.LIZIZ = false;
        this.LJFF.LJ = 1;
    }

    public static InterfaceC46330IGg LJJLIIIIJ() {
        InterfaceC46330IGg playerManager;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if ((LJIIIIZZ instanceof ActivityC45651qj) && (playerManager = FeedSharePlayerViewModel.getPlayerManager((ActivityC45651qj) LJIIIIZZ)) != null) {
            return playerManager;
        }
        if (C47285Ih7.LIZJ()) {
            Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ2 instanceof ActivityC45651qj) {
                ActivityC45651qj activity = (ActivityC45651qj) LJIIIIZZ2;
                o.LJIIIZ(activity, "activity");
                InterfaceC46330IGg interfaceC46330IGg = ((FeedPlayerManagerViewModel) ViewModelProviders.of(activity).get(FeedPlayerManagerViewModel.class)).LJLIL;
                if (interfaceC46330IGg != null) {
                    return interfaceC46330IGg;
                }
            }
        }
        if (LJIIL == null) {
            synchronized (IWF.class) {
                if (LJIIL == null) {
                    IWF iwf = new IWF(false);
                    LJIIL = iwf;
                    iwf.LIZ.LJIILIIL();
                    if (C35051DpH.LIZ <= 0) {
                        TTVideoEngineLog.turnOn(1, 1);
                    }
                }
            }
        }
        return LJIIL;
    }

    public final void LJJLIIIJ() {
        long currentPosition = getCurrentPosition();
        if (this.LIZLLL || this.LIZ.LJ().LIZ.LIZLLL == null || TextUtils.isEmpty(this.LIZ.LJ().LIZ.LIZLLL.getSourceId()) || currentPosition < 0) {
            return;
        }
        C46307IFj c46307IFj = LJIILJJIL;
        IWQ iwq = c46307IFj.get(this.LIZ.LJ().LIZ.LIZLLL.getSourceId());
        if (iwq == null) {
            iwq = new IWQ();
        }
        iwq.LIZ = currentPosition;
        this.LIZ.LJ().LIZ.LIZIZ.LJLJJLL();
        c46307IFj.put(this.LIZ.LJ().LIZ.LIZLLL.getSourceId(), iwq);
    }

    @Override // X.IDV
    public final String LJJIJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC46330IGg
    public final IWH LJJIJIL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC46330IGg
    public final Long LJJJ() {
        return this.LJIIJJI;
    }

    @Override // X.IDV
    public final ITZ getPlayerType() {
        return ITZ.TT;
    }

    @Override // X.IDV
    public final boolean isPrepared() {
        return this.LIZIZ;
    }

    public IWF(boolean z) {
        boolean z2;
        this.LJIIJ = C46586IQc.LIZ;
        this.LJIIJJI = 0L;
        this.LIZLLL = false;
        boolean z3 = IWS.LIZ;
        IXB.LIZ = z3;
        if (C00F.LIZ(31744, 0, "player_v3_up_enable", true) == 1 && (((Number) C35080Dpk.LIZLLL.getValue()).intValue() != 1 || J8V.LJIIL())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((Number) C35080Dpk.LIZJ.getValue()).intValue() == 1 || (C00F.LIZ(31744, 0, "player_v3_up_mtk_enable", true) == 1 && J8V.LJIIL())) {
            z2 = true;
        }
        if (z3) {
            C47150Iew.LIZJ("PlayerManager", "PlayerManager con useV3:" + z2);
        }
        if (z2 || C63078OpG.LIZ()) {
            IXL LJFF = IWO.LIZ().LJFF(z, true);
            this.LIZ = LJFF;
            this.LIZJ = LJFF;
            LJFF.LIZLLL().LIZLLL(new C46535IOd());
        } else {
            IXL LIZLLL = IWO.LIZ().LIZLLL();
            this.LIZ = LIZLLL;
            this.LIZJ = LIZLLL;
            LIZLLL.LIZLLL().LIZLLL(new C46535IOd());
        }
        this.LJFF = new IWG(this, this.LIZ.LJ().LIZ.LIZIZ);
    }

    @Override // X.IDV
    public final void LIZ(String str) {
        this.LIZ.LIZLLL().LIZ(str);
    }

    @Override // X.InterfaceC232739Bl
    public final String LIZLLL(int i) {
        IWH iwh = this.LIZ;
        if (iwh != null) {
            return iwh.LJJLIIJ(i);
        }
        return "";
    }

    @Override // X.InterfaceC46330IGg
    public final void LJFF(float f) {
        this.LIZ.LJFF(f);
    }

    @Override // X.InterfaceC46330IGg
    public final void LJI(float f) {
        String str;
        if (IWS.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("seek aid:");
            if (this.LIZ.LJ().LIZ.LIZLLL != null) {
                str = this.LIZ.LJ().LIZ.LIZLLL.getSourceId();
            } else {
                str = "null";
            }
            LIZ.append(str);
            LIZ.append(", progress:");
            LIZ.append(f);
            C47150Iew.LIZJ("PlayerManager", X1D.LIZIZ(LIZ));
        }
        this.LIZ.LJI(f);
    }

    @Override // X.InterfaceC46330IGg
    public final void LJIIIZ(String str) {
        if (this.LJII == null) {
            this.LJII = str;
        }
    }

    @Override // X.InterfaceC46330IGg
    public final void LJIIJ(C46745IWf c46745IWf) {
        String str;
        SimVideoUrlModel playAddr;
        if (c46745IWf == null || c46745IWf.LIZJ == null) {
            return;
        }
        if (IWS.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tryPrepareNext aid:");
            SimVideo simVideo = c46745IWf.LIZJ;
            if (simVideo != null && (playAddr = simVideo.getPlayAddr()) != null) {
                if (playAddr.getSourceId() == null) {
                    str = "nullid";
                } else {
                    str = playAddr.getSourceId();
                }
            } else {
                str = "null";
            }
            LIZ.append(str);
            C47150Iew.LIZJ("PlayerManager", X1D.LIZIZ(LIZ));
        }
        C1FP.LJIJI(C35525Dwv.LJLIL);
        this.LIZ.LJIIIIZZ(c46745IWf);
    }

    @Override // X.InterfaceC46330IGg
    public final void LJIIL(Long l) {
        this.LJIIJJI = l;
    }

    @Override // X.InterfaceC46330IGg
    public final void LJIILL(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Aweme> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C51029K0z.LJJJJ(it.next().getVideo()));
        }
        C46982IcE.LIZLLL.execute(new ARunnableS44S0100000_8(arrayList, 153));
    }

    @Override // X.InterfaceC46330IGg
    public final String LJIIZILJ(IWJ iwj) {
        boolean z;
        Audio.InfoIdType infoIdType;
        IWM iwm;
        boolean z2;
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
        Video video = iwj.LIZ;
        Audio audio = iwj.LIZIZ;
        if (IWS.LIZ) {
            C47150Iew.LIZJ("PlayerManager", "tryPlay aid:" + J8V.LJIIJ(video));
        }
        if (video == null) {
            return null;
        }
        int i = iwj.LIZLLL;
        IEL iel = iwj.LJ;
        boolean z3 = iel.LIZ;
        boolean z4 = iel.LIZJ;
        boolean z5 = iel.LIZIZ;
        EnumC47177IfN resolution = iwj.LIZJ.getResolution();
        IWI iwi = IWI.Normal;
        IEL iel2 = iwj.LJ;
        boolean z6 = iel2.LIZLLL;
        boolean z7 = iel2.LJ;
        String str = iel2.LJFF;
        if (!TextUtils.isEmpty(video.getVideoAdTag())) {
            str = video.getVideoAdTag();
        }
        String str2 = iwj.LJ.LJI;
        iwi.setLoop(z6);
        iwi.setTag(str);
        iwi.setSubTag(str2);
        if (video.getPlayAddr() != null) {
            video.getPlayAddr().getSourceId();
        }
        new WeakReference(this);
        if (LJJJJZI(video) && !LJIILIIL) {
            z = true;
        } else {
            z = false;
        }
        C46744IWe c46744IWe = new C46744IWe();
        SimVideo LJJJJ = C51029K0z.LJJJJ(video);
        C46745IWf c46745IWf = c46744IWe.LIZ;
        c46745IWf.LIZJ = LJJJJ;
        c46745IWf.LJIIJ = i;
        c46745IWf.LJIJI = z4;
        c46745IWf.LJIIIZ = z5;
        c46745IWf.LJFF = resolution;
        c46745IWf.LJIJJ = iwi;
        boolean isNeedSetCookie = video.isNeedSetCookie();
        C46745IWf c46745IWf2 = c46744IWe.LIZ;
        c46745IWf2.LJIJJLI = isNeedSetCookie;
        c46745IWf2.LJJIJIIJIL = z;
        c46745IWf2.LJIILJJIL = z7;
        c46745IWf2.LJIJ = z3;
        c46744IWe.LIZ.LIZLLL = Audio.convertToSimAudio(video, audio);
        if (iwj.LJI) {
            infoIdType = Audio.InfoIdType.TRANSLATED;
        } else {
            infoIdType = Audio.InfoIdType.ORIGINAL;
        }
        int infoId = infoIdType.getInfoId();
        C46745IWf c46745IWf3 = c46744IWe.LIZ;
        c46745IWf3.LJ = infoId;
        c46745IWf3.LJJJJL = iwj.LJII;
        if (iwj.LJIIJ) {
            iwm = IWM.DOWN;
        } else {
            iwm = IWM.UP;
        }
        String actionType = iwm.name();
        o.LJIIIZ(actionType, "actionType");
        C46745IWf c46745IWf4 = c46744IWe.LIZ;
        c46745IWf4.getClass();
        c46745IWf4.LJJLIIIIJ = actionType;
        c46744IWe.LIZ.LJJLIIIJ = valueOf.longValue();
        if (((Boolean) C46291IEt.LIZ.getValue()).booleanValue()) {
            c46744IWe.LIZJ(iwj.LJ.LJIIIZ);
        }
        C46259IDn c46259IDn = iwj.LJFF;
        if (c46259IDn != null) {
            C46745IWf c46745IWf5 = c46744IWe.LIZ;
            c46745IWf5.LJJJ = true;
            c46745IWf5.LJJJI = c46259IDn.LIZ;
            c46745IWf5.LJJJIL = c46259IDn.LIZIZ;
            c46745IWf5.LJJIZ = c46259IDn.LIZJ;
            c46745IWf5.LJJJJ = c46259IDn.LIZLLL;
        }
        IEL iel3 = iwj.LJ;
        Integer num = iel3.LJII;
        if (num != null && iel3.LJIIIIZZ != null) {
            c46744IWe.LIZ.LJJJJJ = num.intValue();
            c46744IWe.LIZ.LJJJJJL = iwj.LJ.LJIIIIZZ.intValue();
        }
        if (this.LJIIIIZZ) {
            z2 = false;
            c46744IWe.LIZ.LJJJJZ = false;
        } else {
            z2 = false;
        }
        if (iwj.LJIIIIZZ) {
            C46745IWf c46745IWf6 = c46744IWe.LIZ;
            c46745IWf6.LJIILIIL = null;
            c46745IWf6.LJJJJZ = z2;
        }
        C86951YAp c86951YAp = C86951YAp.LIZIZ;
        if (c86951YAp.LJ() && iwj.LJIIIZ) {
            c46744IWe.LIZ.LJJLIIJ = c86951YAp.LIZIZ();
        }
        C1FP.LJIJI(C35524Dwu.LJLIL);
        this.LIZ.LJIIL(c46744IWe.LIZ());
        if (!C33842DPy.LIZIZ()) {
            LJIILIIL = true;
            return "";
        }
        return "";
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJII(IWH iwh) {
        this.LIZ = iwh;
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJIII(OnUIPlayListener onUIPlayListener) {
        String str;
        this.LJIIJ.LIZ();
        if (IWS.LIZ) {
            StringBuilder sb = new StringBuilder("tryPausePlay aid:");
            if (this.LIZ.LJ().LIZ.LIZLLL != null) {
                str = this.LIZ.LJ().LIZ.LIZLLL.getSourceId();
            } else {
                str = "null";
            }
            sb.append(str);
            C47150Iew.LIZJ("PlayerManager", sb.toString());
        }
        if (onUIPlayListener == null || !this.LIZ.LJ().LIZ.LIZIZ.LJJLIIIJLJLI(onUIPlayListener)) {
            return;
        }
        this.LIZ.pause();
        this.LIZIZ = false;
        LJJLIIIJ();
    }

    @Override // X.InterfaceC245709kc
    public final String LJJIJIIJI(String str) {
        C38798FKo LJ;
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ.LJ().LIZ.LIZIZ;
        if (interfaceC46747IWh == null || (LJ = interfaceC46747IWh.LJ()) == null) {
            LJ = null;
        }
        return E6S.LIZ(LJ, str);
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJIJL(Aweme aweme) {
        LJJIZ(aweme, null);
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJIJLIJ(IGM igm) {
        this.LIZ.LIZLLL().LJ(igm);
    }

    @Override // X.InterfaceC46330IGg
    public final String LJJJI(C46745IWf c46745IWf) {
        Object obj;
        String str;
        IWM iwm;
        boolean z;
        String str2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (C30K.LIZ("tryPlayRequest")) {
            return "155";
        }
        SimVideoUrlModel simVideoUrlModel = c46745IWf.LJI;
        if (IWS.LIZ) {
            StringBuilder sb = new StringBuilder("tryPlayRequest aid:");
            if (simVideoUrlModel != null) {
                str2 = simVideoUrlModel.getSourceId();
            } else {
                str2 = "null";
            }
            sb.append(str2);
            C47150Iew.LIZJ("PlayerManager", sb.toString());
        }
        if (simVideoUrlModel == null && c46745IWf.LIZJ == null) {
            return "161";
        }
        boolean z2 = false;
        if (simVideoUrlModel != null) {
            if (!C46734IVu.LIZIZ(simVideoUrlModel)) {
                return "156";
            }
            if (!this.LIZLLL && !TextUtils.isEmpty(simVideoUrlModel.getSourceId())) {
                LJIILJJIL.put(simVideoUrlModel.getSourceId(), new IWQ());
            }
            String bitRatedRatioUri = simVideoUrlModel.getBitRatedRatioUri();
            String uri = simVideoUrlModel.getUri();
            C47716Io4.LIZ = bitRatedRatioUri;
            C47716Io4.LIZ(bitRatedRatioUri);
            C2W7.LIZIZ.LIZ(uri);
            if (LJJLI(simVideoUrlModel.getSourceId()) && !LJIILIIL) {
                z = true;
            } else {
                z = false;
            }
            c46745IWf.LJJIJIIJIL = z;
        }
        SimVideo simVideo = c46745IWf.LIZJ;
        if (simVideo != null && (obj = simVideo.origin) != null) {
            Video video = (Video) obj;
            if (video.getVideoAdTag() != null) {
                str = video.getVideoAdTag();
            } else {
                str = "";
            }
            o.LJIIIZ(str, "<set-?>");
            c46745IWf.LJIILLIIL = str;
            if (this.LJIIIZ == video) {
                iwm = IWM.COLD_START;
            } else {
                iwm = IWM.CLICK;
            }
            String name = iwm.name();
            o.LJIIIZ(name, "<set-?>");
            c46745IWf.LJJLIIIIJ = name;
        }
        if (this.LJFF.LJ == 2) {
            z2 = true;
        }
        c46745IWf.LJJI = z2;
        c46745IWf.LJJLIIIJ = elapsedRealtime;
        C1FP.LJIJI(C35524Dwu.LJLIL);
        this.LIZ.LJIIL(c46745IWf);
        this.LIZIZ = true;
        if (!C33842DPy.LIZIZ()) {
            LJIILIIL = true;
            return "tryPlayV2";
        }
        return "tryPlayV2";
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJJJL(boolean z) {
        this.LJIIIIZZ = z;
    }

    public final boolean LJJJJLL(VideoUrlModel videoUrlModel) {
        String bitRatedRatioUri;
        if (videoUrlModel == null) {
            return false;
        }
        if (IWS.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("checkResumePlay aid:");
            LIZ.append(videoUrlModel.getSourceId());
            C47150Iew.LIZJ("PlayerManager", X1D.LIZIZ(LIZ));
        }
        if (this.LIZ.LJ().LIZ.LIZLLL == null || !TextUtils.equals(videoUrlModel.getUri(), this.LIZ.LJ().LIZ.LIZLLL.getUri()) || !TextUtils.equals(videoUrlModel.getRatio(), this.LIZ.LJ().LIZ.LIZLLL.getRatio())) {
            return false;
        }
        if (!TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
            bitRatedRatioUri = videoUrlModel.getDashVideoId();
        } else {
            bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
        }
        if (TextUtils.isEmpty(videoUrlModel.getSourceId()) || !this.LIZ.LJ().LIZ.LIZIZ.LJLJL(videoUrlModel.getSourceId(), bitRatedRatioUri)) {
            return false;
        }
        return true;
    }

    public final boolean LJJJJZ(IXO ixo) {
        if (ixo == null || TextUtils.isEmpty(ixo.LJ)) {
            return false;
        }
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ.LJ().LIZ.LIZIZ;
        String str = ixo.LJ;
        return interfaceC46747IWh.LJLJL(str, str);
    }

    public final boolean LJJJJZI(Video video) {
        if (C36152EGu.LJ()) {
            return C33842DPy.LIZIZ();
        }
        if (StrategyImpl.LIZIZ().LJJIJLIJ()) {
            return C55068LjM.LIZIZ();
        }
        if (C54502LaE.LJ("detail_page_startup")) {
            return IWV.LIZ();
        }
        if (DVQ.LIZ && video.getPlayAddr() != null && TextUtils.equals(video.getPlayAddr().getSourceId(), this.LJII)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJJLL(OnUIPlayListener onUIPlayListener) {
        this.LIZ.LJJJLL(onUIPlayListener);
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJJLZIJ(int i) {
        this.LIZ.LIZJ().LJJJLZIJ(i);
    }

    public final boolean LJJLI(String str) {
        if (C36152EGu.LJ()) {
            return C33842DPy.LIZIZ();
        }
        if (StrategyImpl.LIZIZ().LJJIJLIJ()) {
            return C55068LjM.LIZIZ();
        }
        if (C54502LaE.LJ("detail_page_startup")) {
            return IWV.LIZ();
        }
        if (DVQ.LIZ && TextUtils.equals(str, this.LJII)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46330IGg
    public final boolean LJJLIIIJLJLI(OnUIPlayListener onUIPlayListener) {
        return this.LIZ.LJ().LIZ.LIZIZ.LJJLIIIJLJLI(onUIPlayListener);
    }

    @Override // X.InterfaceC46330IGg
    public final void setSurface(Surface surface) {
        this.LIZ.setSurface(surface);
    }

    @Override // X.InterfaceC46330IGg
    public final void LJIILLIIL(Aweme aweme, C46367IHr c46367IHr) {
        if (aweme != null) {
            this.LJI = aweme.getAid();
            IWG iwg = this.LJFF;
            iwg.LJ = 2;
            iwg.LIZJ(aweme, c46367IHr);
        }
    }

    @Override // X.InterfaceC46330IGg
    public final String LJJIIJ(C46745IWf c46745IWf, OnUIPlayListener onUIPlayListener) {
        int i;
        String sourceId;
        String sourceId2;
        IWQ iwq;
        String str;
        SimVideoUrlModel playAddr;
        int i2 = 2;
        if (C56662Kg.LIZ().LJIIIIZZ("player_prerender_duration")) {
            i = 1;
        } else {
            i = 2;
        }
        C56662Kg.LIZ().LIZLLL(i, "player_prerender_success_type");
        if (i == 2) {
            C56662Kg.LIZ().LIZJ("player_prerender_duration_after_tryplay", false);
            if (C36152EGu.LJFF()) {
                C56662Kg.LIZ().LIZJ("player_prerender_duration_after_tryplay_nuj_scene", false);
            }
        }
        if (C56662Kg.LIZ().LJIIIIZZ("player_prerender_to_onprepared")) {
            i2 = 1;
        }
        C56662Kg.LIZ().LIZLLL(i2, "player_prerender_onprepared_success_type");
        C56662Kg.LIZ().LJFF("cold_boot_start_to_tryplay", false);
        if (!C56662Kg.LIZ().LJIIIIZZ("player_prepared_end_to_tryplay")) {
            C56662Kg.LIZ().LJFF("player_prepared_end_to_tryplay", false);
        }
        if (!C56662Kg.LIZ().LJII("player_tryplay_to_ui_to_video_end")) {
            C56662Kg.LIZ().LIZJ("player_tryplay_to_ui_to_video_end", false);
        }
        C56662Kg.LIZ().LIZJ("player_tryplay_to_first_frame", false);
        if (C30K.LIZ("tryResumePlay")) {
            return "101";
        }
        if (IWS.LIZ) {
            StringBuilder sb = new StringBuilder("tryResumePlay aid:");
            SimVideo simVideo = c46745IWf.LIZJ;
            if (simVideo != null && (playAddr = simVideo.getPlayAddr()) != null) {
                if (playAddr.getSourceId() == null) {
                    str = "nullid";
                } else {
                    str = playAddr.getSourceId();
                }
            } else {
                str = "null";
            }
            sb.append(str);
            C47150Iew.LIZJ("PlayerManager", sb.toString());
        }
        this.LJIIJ.tryPlay();
        if (onUIPlayListener == null) {
            return "102";
        }
        if (!this.LIZ.LJ().LIZ.LIZIZ.LJJLIIIJLJLI(onUIPlayListener)) {
            return "103";
        }
        SimVideo simVideo2 = c46745IWf.LIZJ;
        if (simVideo2 == null) {
            return "104";
        }
        VideoUrlModel LJJJJZ = C51029K0z.LJJJJZ(simVideo2.getPlayAddrBytevc1());
        VideoUrlModel LJJJJZ2 = C51029K0z.LJJJJZ(c46745IWf.LIZJ.getPlayAddrH264());
        if (LJJJJZ == null && LJJJJZ2 == null && this.LIZ.LJ().LIZ.LJ == null) {
            return "105";
        }
        int i3 = c46745IWf.LJIIJ;
        c46745IWf.LJIIJ = i3;
        if (i3 > 0) {
            c46745IWf.LJIIIZ = true;
            c46745IWf.LJIJ = true;
            c46745IWf.LJIJI = true;
            c46745IWf.LJIJJ = IWI.Normal;
            LJJJI(c46745IWf);
            return "106";
        }
        if (LJJJJZ(this.LIZ.LJ().LIZ.LJ)) {
            this.LIZ.LJ().LIZ.LIZIZ.LJLILLLLZI(this.LIZ.LJ().LIZ.LJ.LJ);
            this.LIZIZ = false;
            return "107";
        }
        if (LJJJJLL(LJJJJZ) || LJJJJLL(LJJJJZ2)) {
            InterfaceC46747IWh interfaceC46747IWh = this.LIZ.LJ().LIZ.LIZIZ;
            if (LJJJJZ != null) {
                sourceId = LJJJJZ.getSourceId();
            } else {
                sourceId = LJJJJZ2.getSourceId();
            }
            interfaceC46747IWh.LJLILLLLZI(sourceId);
            this.LIZIZ = false;
            return "108";
        }
        c46745IWf.LJIIJ = 0;
        c46745IWf.LJIJ = true;
        if (this.LJ) {
            this.LJ = false;
            if (LJJJJZ != null) {
                sourceId2 = LJJJJZ.getSourceId();
            } else {
                sourceId2 = LJJJJZ2.getSourceId();
            }
            if (TextUtils.isEmpty(sourceId2)) {
                iwq = new IWQ();
            } else {
                iwq = LJIILJJIL.get(sourceId2);
                if (iwq == null) {
                    iwq = new IWQ();
                }
            }
            c46745IWf.LJIIJ = (int) iwq.LIZ;
            c46745IWf.LJIJ = false;
        }
        c46745IWf.LJIIIZ = true;
        c46745IWf.LJIJI = true;
        c46745IWf.LJIJJ = IWI.Normal;
        LJJJI(c46745IWf);
        return "";
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJIIJZLJL(float f, float f2) {
        this.LIZ.LIZLLL().setVolume(f, f2);
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJIZ(Aweme aweme, C46367IHr c46367IHr) {
        if (TextUtils.isEmpty(this.LJI) && aweme != null) {
            this.LJI = aweme.getAid();
        }
        this.LJFF.LIZJ(aweme, c46367IHr);
    }

    @Override // X.InterfaceC46330IGg
    public final String LJJJJI(Video video, boolean z) {
        return LJIJI(video, null, false, z);
    }

    public final String LJJLIIIJILLIZJL(Video video, int i) {
        return LJIIJJI(video, null, false, true, i, true, true, null);
    }

    public final String LJJLIIIJL(Video video, OnUIPlayListener onUIPlayListener) {
        return LJJLIIIJLLLLLLLZ(video, false, onUIPlayListener, 0);
    }

    @Override // X.InterfaceC46330IGg
    public final String LJJIJIIJIL(VideoUrlModel videoUrlModel, boolean z, C46259IDn c46259IDn) {
        boolean z2;
        String str;
        IWI iwi = IWI.Normal;
        if (C30K.LIZ("tryPlayWithInitialStart")) {
            return "155";
        }
        if (IWS.LIZ) {
            StringBuilder sb = new StringBuilder("tryPlayWithInitialStart aid:");
            if (videoUrlModel != null) {
                str = videoUrlModel.getSourceId();
            } else {
                str = "null";
            }
            sb.append(str);
            C47150Iew.LIZJ("PlayerManager", sb.toString());
        }
        if (!C46734IVu.LIZIZ(C51029K0z.LJJJIL(videoUrlModel))) {
            return "156";
        }
        if (!this.LIZLLL && !TextUtils.isEmpty(videoUrlModel.getSourceId())) {
            LJIILJJIL.put(videoUrlModel.getSourceId(), new IWQ());
        }
        String bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
        String uri = videoUrlModel.getUri();
        C47716Io4.LIZ = bitRatedRatioUri;
        C47716Io4.LIZ(bitRatedRatioUri);
        C2W7.LIZIZ.LIZ(uri);
        if (LJJLI(videoUrlModel.getSourceId()) && !LJIILIIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        C46744IWe c46744IWe = new C46744IWe();
        SimVideoUrlModel LJJJJI = C51029K0z.LJJJJI(videoUrlModel);
        C46745IWf c46745IWf = c46744IWe.LIZ;
        c46745IWf.LJI = LJJJJI;
        c46745IWf.LJIIIZ = true;
        c46745IWf.LJIL = true;
        c46745IWf.LJIJJ = iwi;
        c46745IWf.LJIIJ = 0;
        c46745IWf.LJIJ = true;
        c46745IWf.LJIJJLI = z;
        c46744IWe.LIZLLL(videoUrlModel.getVideoAdTag());
        C46745IWf c46745IWf2 = c46744IWe.LIZ;
        c46745IWf2.LJJIJIIJIL = z2;
        c46745IWf2.LJII = false;
        c46745IWf2.LJJJJL = false;
        if (c46259IDn != null) {
            c46745IWf2.LJJIZ = c46259IDn.LIZJ;
            c46745IWf2.LJJJ = true;
            c46745IWf2.LJJJI = c46259IDn.LIZ;
            c46745IWf2.LJJJIL = c46259IDn.LIZIZ;
            c46745IWf2.LJJJJ = c46259IDn.LIZLLL;
        }
        C1FP.LJIJI(C35524Dwu.LJLIL);
        this.LIZ.LJIIL(c46744IWe.LIZ());
        this.LIZIZ = true;
        if (!C33842DPy.LIZIZ()) {
            LJIILIIL = true;
        }
        return "prepareWithInitialStart";
    }

    @Override // X.InterfaceC46330IGg
    public final void LJJJJJ(Aweme aweme, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        IWM iwm;
        Video video;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (aweme != null) {
            LJIIIZ(aweme.getAid());
        }
        if (C00F.LIZ(31744, 2, "cold_launch_player_opt_exp", true) == 1) {
            IWG iwg = this.LJFF;
            iwg.getClass();
            if (IWS.LIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("tryPrerenderVideoColdStart aweme:");
                LIZ.append(aweme);
                C47150Iew.LIZJ("PreCreateHelper", X1D.LIZIZ(LIZ));
            }
            iwg.LIZIZ(true);
            if (iwg.LJII || aweme == null || aweme.isLive() || (video = aweme.getVideo()) == null || aweme.getVideo().getProperPlayAddr() == null) {
                return;
            }
            video.setRationAndSourceId(aweme.getAid());
            C46744IWe c46744IWe = new C46744IWe();
            c46744IWe.LIZ.LIZJ = C51029K0z.LJJJJ(video);
            c46744IWe.LIZ.LJIJJLI = video.isNeedSetCookie();
            c46744IWe.LIZ.LIZLLL = Audio.Companion.convertToSimAudio(aweme.getVideo(), aweme.getAudio());
            c46744IWe.LIZ.LJ = Audio.InfoIdType.ORIGINAL.getInfoId();
            iwg.LJFF.LJIIJ(c46744IWe.LIZ());
            iwg.LJII = true;
            return;
        }
        if (C00F.LIZ(31744, 2, "cold_launch_player_opt_exp", true) != 2 || aweme == null || aweme.isLive()) {
            return;
        }
        aweme.toString();
        C46259IDn LIZ2 = IQ6.LIZ(aweme, -1, null);
        Video video2 = aweme.getVideo();
        Audio audio = aweme.getAudio();
        if (video2 == null || aweme.getVideo().getProperPlayAddr() == null) {
            return;
        }
        if (z) {
            Object value = IZ8.n0.getValue();
            o.LJIIIIZZ(value, "<get-triggerResetSession…xecuteColdPrerender>(...)");
            if (((Boolean) value).booleanValue()) {
                this.LIZ.LJJLIIIJJI();
            }
        }
        video2.setRationAndSourceId(aweme.getAid());
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "feed_cold_start_pre_decode_not_render", true) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (C00F.LIZ(31744, 1, "feed_cold_start_prerender_range_enable", true) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (C00F.LIZ(31744, 0, "force_first_video_hardware_decode", true) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        C46744IWe c46744IWe2 = new C46744IWe();
        c46744IWe2.LIZ.LIZJ = C51029K0z.LJJJJ(video2);
        boolean isNeedSetCookie = video2.isNeedSetCookie();
        C46745IWf c46745IWf = c46744IWe2.LIZ;
        c46745IWf.LJIJJLI = isNeedSetCookie;
        c46745IWf.LJJIJIL = true;
        c46745IWf.LJJIJIIJI = z3;
        c46745IWf.LJIIIIZZ = z2;
        c46745IWf.LJJJLL = z5;
        c46745IWf.LJJJJI = z4;
        c46744IWe2.LIZLLL(video2.getVideoAdTag());
        c46744IWe2.LIZ.LIZLLL = Audio.convertToSimAudio(video2, audio);
        int infoId = Audio.InfoIdType.ORIGINAL.getInfoId();
        C46745IWf c46745IWf2 = c46744IWe2.LIZ;
        c46745IWf2.LJ = infoId;
        c46745IWf2.LJJJJL = false;
        if (z) {
            iwm = IWM.CLICK;
        } else {
            iwm = IWM.COLD_START;
        }
        String actionType = iwm.name();
        o.LJIIIZ(actionType, "actionType");
        C46745IWf c46745IWf3 = c46744IWe2.LIZ;
        c46745IWf3.getClass();
        c46745IWf3.LJJLIIIIJ = actionType;
        C46745IWf c46745IWf4 = c46744IWe2.LIZ;
        c46745IWf4.LJJLIIIJ = elapsedRealtime;
        if (LIZ2 != null) {
            c46745IWf4.LJJIZ = LIZ2.LIZJ;
            c46745IWf4.LJJJ = true;
            c46745IWf4.LJJJI = LIZ2.LIZ;
            c46745IWf4.LJJJIL = LIZ2.LIZIZ;
            c46745IWf4.LJJJJ = LIZ2.LIZLLL;
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = video2;
        }
        LJIIJ(c46744IWe2.LIZ());
    }

    @Override // X.InterfaceC46330IGg
    public final String LJIJI(Video video, Audio audio, boolean z, boolean z2) {
        return LJIIJJI(video, audio, z, z2, 0, true, true, null);
    }

    @Override // X.InterfaceC46330IGg
    public final String LJJIFFI(Video video, boolean z, OnUIPlayListener onUIPlayListener, int i) {
        return LJJLIIIJLLLLLLLZ(video, z, onUIPlayListener, i);
    }

    @Override // X.InterfaceC46330IGg
    public final String LJJIIZI(Video video, boolean z, boolean z2, HashMap hashMap) {
        return LJJLIIIJJI(video, null, z, false, false, true, 0, true, true, null, z2, hashMap, false);
    }

    public final String LJJLIIIJLLLLLLLZ(Video video, boolean z, OnUIPlayListener onUIPlayListener, int i) {
        return LJJJJJL(video, null, z, false, false, onUIPlayListener, i, null, false);
    }

    @Override // X.InterfaceC46330IGg
    public final String LJJJIL(Video video, boolean z, OnUIPlayListener onUIPlayListener, int i, boolean z2, HashMap hashMap, C46259IDn c46259IDn) {
        return LJJLIIIJJIZ(video, null, z, false, false, onUIPlayListener, i, c46259IDn, z2, hashMap, false);
    }

    @Override // X.InterfaceC46330IGg
    public final String LJIIJJI(Video video, Audio audio, boolean z, boolean z2, int i, boolean z3, boolean z4, C46259IDn c46259IDn) {
        return LJJLIIIJJI(video, audio, z, false, false, z2, i, z3, z4, c46259IDn, false, null, false);
    }

    @Override // X.InterfaceC46330IGg
    public final String LJJJJJL(Video video, Audio audio, boolean z, boolean z2, boolean z3, OnUIPlayListener onUIPlayListener, int i, C46259IDn c46259IDn, boolean z4) {
        return LJJLIIIJJIZ(video, audio, z, z2, z3, onUIPlayListener, i, c46259IDn, false, null, z4);
    }

    public final String LJJLIIIJJIZ(Video video, Audio audio, boolean z, boolean z2, boolean z3, OnUIPlayListener onUIPlayListener, int i, C46259IDn c46259IDn, boolean z4, HashMap hashMap, boolean z5) {
        int i2;
        String sourceId;
        String sourceId2;
        IWQ iwq;
        int i3 = 2;
        if (C56662Kg.LIZ().LJIIIIZZ("player_prerender_duration")) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        C56662Kg.LIZ().LIZLLL(i2, "player_prerender_success_type");
        if (i2 == 2) {
            C56662Kg.LIZ().LIZJ("player_prerender_duration_after_tryplay", false);
            if (C36152EGu.LJFF()) {
                C56662Kg.LIZ().LIZJ("player_prerender_duration_after_tryplay_nuj_scene", false);
            }
        }
        if (!C56662Kg.LIZ().LJIIIIZZ("player_prepared_end_to_tryplay")) {
            C56662Kg.LIZ().LJFF("player_prepared_end_to_tryplay", false);
        }
        if (!C56662Kg.LIZ().LJII("player_tryplay_to_ui_to_video_end")) {
            C56662Kg.LIZ().LIZJ("player_tryplay_to_ui_to_video_end", false);
        }
        if (C56662Kg.LIZ().LJIIIIZZ("player_prerender_to_onprepared")) {
            i3 = 1;
        }
        C56662Kg.LIZ().LIZLLL(i3, "player_prerender_onprepared_success_type");
        C56662Kg.LIZ().LJFF("cold_boot_start_to_tryplay", false);
        C56662Kg.LIZ().LIZJ("player_tryplay_to_first_frame", false);
        if (C30K.LIZ("tryResumePlay")) {
            return "101";
        }
        if (IWS.LIZ) {
            C47150Iew.LIZJ("PlayerManager", "tryResumePlay aid:" + J8V.LJIIJ(video));
        }
        this.LJIIJ.tryPlay();
        if (onUIPlayListener == null) {
            return "102";
        }
        if (!this.LIZ.LJ().LIZ.LIZIZ.LJJLIIIJLJLI(onUIPlayListener)) {
            return "103";
        }
        if (video == null) {
            return "104";
        }
        VideoUrlModel playAddrBytevc1 = video.getPlayAddrBytevc1();
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        if (playAddrBytevc1 == null && playAddrH264 == null && this.LIZ.LJ().LIZ.LJ == null) {
            return "105";
        }
        if (i > 0) {
            LJJLIIIJJI(video, audio, z, z2, z3, true, i, true, true, c46259IDn, z4, hashMap, z5);
            return "106";
        }
        if (LJJJJZ(this.LIZ.LJ().LIZ.LJ)) {
            this.LIZ.LJ().LIZ.LIZIZ.LJLILLLLZI(this.LIZ.LJ().LIZ.LJ.LJ);
            this.LIZIZ = false;
            return "107";
        }
        if (LJJJJLL(playAddrBytevc1) || LJJJJLL(playAddrH264)) {
            InterfaceC46747IWh interfaceC46747IWh = this.LIZ.LJ().LIZ.LIZIZ;
            if (playAddrBytevc1 != null) {
                sourceId = playAddrBytevc1.getSourceId();
            } else {
                sourceId = playAddrH264.getSourceId();
            }
            interfaceC46747IWh.LJLILLLLZI(sourceId);
            this.LIZIZ = false;
            return "108";
        }
        if (this.LJ) {
            this.LJ = false;
            if (playAddrBytevc1 != null) {
                sourceId2 = playAddrBytevc1.getSourceId();
            } else {
                sourceId2 = playAddrH264.getSourceId();
            }
            if (TextUtils.isEmpty(sourceId2)) {
                iwq = new IWQ();
            } else {
                iwq = LJIILJJIL.get(sourceId2);
                if (iwq == null) {
                    iwq = new IWQ();
                }
            }
            LJJLIIIJJI(video, audio, z, z2, z3, true, (int) iwq.LIZ, false, true, c46259IDn, z4, hashMap, z5);
            return "";
        }
        LJJLIIIJJI(video, audio, z, z2, z3, true, 0, true, true, c46259IDn, z4, hashMap, z5);
        return "";
    }

    public final String LJJLIIIJJI(Video video, Audio audio, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, boolean z6, C46259IDn c46259IDn, boolean z7, HashMap hashMap, boolean z8) {
        boolean z9;
        boolean z10;
        Audio.InfoIdType infoIdType;
        IWM iwm;
        if (video == null) {
            return null;
        }
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
        if (IWS.LIZ) {
            C47150Iew.LIZJ("PlayerManager", "tryPlayWithInitialStart aid:" + J8V.LJIIJ(video));
        }
        if (video.getPlayAddr() != null) {
            video.getPlayAddr().getSourceId();
        }
        new WeakReference(this);
        if (LJJJJZI(video) && !LJIILIIL) {
            z9 = true;
        } else {
            z9 = false;
        }
        C46744IWe c46744IWe = new C46744IWe();
        SimVideo LJJJJ = C51029K0z.LJJJJ(video);
        C46745IWf c46745IWf = c46744IWe.LIZ;
        c46745IWf.LIZJ = LJJJJ;
        c46745IWf.LJIIIZ = z4;
        if (this.LJFF.LJ == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        c46745IWf.LJJI = z10;
        c46745IWf.LJIIJ = i;
        c46745IWf.LJIJ = z5;
        boolean isNeedSetCookie = video.isNeedSetCookie();
        C46745IWf c46745IWf2 = c46744IWe.LIZ;
        c46745IWf2.LJIJJLI = isNeedSetCookie;
        c46745IWf2.LJJIJIIJIL = z9;
        c46745IWf2.LJIJI = z6;
        c46744IWe.LIZLLL(video.getVideoAdTag());
        c46744IWe.LIZ.LIZLLL = Audio.convertToSimAudio(video, audio);
        if (z3) {
            infoIdType = Audio.InfoIdType.TRANSLATED;
        } else {
            infoIdType = Audio.InfoIdType.ORIGINAL;
        }
        int infoId = infoIdType.getInfoId();
        C46745IWf c46745IWf3 = c46744IWe.LIZ;
        c46745IWf3.LJ = infoId;
        c46745IWf3.LJJJJL = false;
        if (this.LJIIIZ == video) {
            iwm = IWM.COLD_START;
        } else {
            iwm = IWM.CLICK;
        }
        String actionType = iwm.name();
        o.LJIIIZ(actionType, "actionType");
        C46745IWf c46745IWf4 = c46744IWe.LIZ;
        c46745IWf4.getClass();
        c46745IWf4.LJJLIIIIJ = actionType;
        c46744IWe.LIZ.LJJLIIIJILLIZJL = z8;
        long longValue = valueOf.longValue();
        C46745IWf c46745IWf5 = c46744IWe.LIZ;
        c46745IWf5.LJJLIIIJ = longValue;
        if (c46259IDn != null) {
            c46745IWf5.LJJIZ = c46259IDn.LIZJ;
            c46745IWf5.LJJJ = true;
            c46745IWf5.LJJJI = c46259IDn.LIZ;
            c46745IWf5.LJJJIL = c46259IDn.LIZIZ;
            c46745IWf5.LJJJJ = c46259IDn.LIZLLL;
        }
        C86951YAp c86951YAp = C86951YAp.LIZIZ;
        if (c86951YAp.LJ() && z2) {
            c46744IWe.LIZ.LJJLIIJ = c86951YAp.LIZIZ();
        }
        if (z7) {
            C46745IWf c46745IWf6 = c46744IWe.LIZ;
            c46745IWf6.LJJJLZIJ = z7;
            c46745IWf6.LJJJJLI = hashMap;
        }
        if (z) {
            C46745IWf c46745IWf7 = c46744IWe.LIZ;
            c46745IWf7.LJIILIIL = null;
            c46745IWf7.LJJJJZ = false;
        }
        C1FP.LJIJI(C35524Dwu.LJLIL);
        this.LIZ.LJIIL(c46744IWe.LIZ());
        if (!C33842DPy.LIZIZ()) {
            LJIILIIL = true;
            return "";
        }
        return "";
    }
}
