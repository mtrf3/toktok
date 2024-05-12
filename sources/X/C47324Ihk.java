package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ihk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47324Ihk implements OnUIPlayListener {
    public final /* synthetic */ C47323Ihj LJLIL;

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C222688oa.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        C222688oa.LIZJ(this, str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C222688oa.LIZLLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJ(this, str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(boolean z) {
        C222688oa.LJFF(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
        C222688oa.LJI(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
        C222688oa.LJII(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJIIIIZZ(this, str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C222688oa.LJIIIZ(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, java.util.Map map) {
        C222688oa.LJIIJ(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, ITW itw) {
        C222688oa.LJIIJJI(this, str, itw);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str) {
        C222688oa.LJIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C222688oa.LJIILLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str, IPH playerEvent) {
        o.LJIIIZ(playerEvent, "playerEvent");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(IPG ipg) {
        C222688oa.LJIJJ(this, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg) {
        C222688oa.LJIJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C222688oa.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C222688oa.LJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C222688oa.LJJI(this, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C222688oa.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C222688oa.LJJIIJ(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, IPH iph) {
        C222688oa.LJJIIJZLJL(this, str, jSONObject, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, boolean z) {
        C222688oa.LJJIIZ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C222688oa.LJJIIZI(this, str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str) {
        C222688oa.LJJIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str, IPH iph) {
        C222688oa.LJJIJIIJI(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C222688oa.LJJIJIIJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str) {
        C222688oa.LJJIJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str, IPH playerEvent) {
        o.LJIIIZ(playerEvent, "playerEvent");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(IT4 it4) {
        C222688oa.LJJIL(this, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C222688oa.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(IPH iph) {
        C222688oa.LJJJ(this, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str) {
        C222688oa.LJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str, IPH playerEvent) {
        o.LJIIIZ(playerEvent, "playerEvent");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(IPG ipg) {
        C222688oa.LJJJJI(this, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, IPG ipg) {
        C222688oa.LJJJJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        C222688oa.LJJJJJ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C222688oa.LJJJJJL(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        C222688oa.LJJJJL(this, str, enumC47177IfN, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C222688oa.LJJJJLI(this, str, i, i2);
    }

    public C47324Ihk(C47323Ihj c47323Ihj) {
        this.LJLIL = c47323Ihj;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        IWH iwh;
        InterfaceC47328Iho interfaceC47328Iho = this.LJLIL.LJLILLLLZI;
        if (interfaceC47328Iho != null) {
            interfaceC47328Iho.LIZIZ();
        }
        C47323Ihj c47323Ihj = this.LJLIL;
        if (!c47323Ihj.LJLJLLL && (iwh = c47323Ihj.LJLLI) != null) {
            iwh.stop();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        IHR LJ;
        InterfaceC46747IWh interfaceC46747IWh;
        IWH iwh = this.LJLIL.LJLLI;
        if (iwh != null && (LJ = iwh.LJ()) != null && (interfaceC46747IWh = LJ.LIZ.LIZIZ) != null) {
            interfaceC46747IWh.LJJJZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str, IPH playerEvent) {
        IHR LJ;
        InterfaceC46747IWh interfaceC46747IWh;
        o.LJIIIZ(playerEvent, "playerEvent");
        IWH iwh = this.LJLIL.LJLLI;
        if (iwh != null && (LJ = iwh.LJ()) != null && (interfaceC46747IWh = LJ.LIZ.LIZIZ) != null) {
            interfaceC46747IWh.LJJJZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
        IHR LJ;
        InterfaceC46747IWh interfaceC46747IWh;
        IWH iwh = this.LJLIL.LJLLI;
        if (iwh != null && (LJ = iwh.LJ()) != null && (interfaceC46747IWh = LJ.LIZ.LIZIZ) != null) {
            interfaceC46747IWh.LJJJZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        String str2;
        List<String> list;
        String str3;
        IHR LJ;
        InterfaceC46747IWh interfaceC46747IWh;
        int i;
        List<String> list2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C47323Ihj c47323Ihj = this.LJLIL;
        long j = elapsedRealtime - c47323Ihj.LJLJLJ;
        C47325Ihl c47325Ihl = c47323Ihj.LJLJJLL;
        int i2 = 0;
        if (c47325Ihl == null || (list2 = c47325Ihl.LIZIZ) == null || (str2 = (String) ORZ.LJLLLLLL(0, list2)) == null) {
            str2 = "";
        }
        C47325Ihl c47325Ihl2 = this.LJLIL.LJLJJLL;
        List<String> list3 = null;
        if (c47325Ihl2 != null) {
            list = c47325Ihl2.LIZIZ;
        } else {
            list = null;
        }
        C48421IzR.LIZIZ(j, String.valueOf(list), str2, this.LJLIL.LJLIL);
        C47325Ihl c47325Ihl3 = this.LJLIL.LJLJJLL;
        if (c47325Ihl3 != null) {
            str3 = c47325Ihl3.LJFF;
            list3 = c47325Ihl3.LIZIZ;
        } else {
            str3 = null;
        }
        C48137Iur.LJFF(str3, String.valueOf(list3), Long.valueOf(j), this.LJLIL.LJLIL, str2);
        C47323Ihj c47323Ihj2 = this.LJLIL;
        InterfaceC47330Ihq interfaceC47330Ihq = c47323Ihj2.LJLJJI;
        if (interfaceC47330Ihq != null) {
            C47325Ihl c47325Ihl4 = c47323Ihj2.LJLJJLL;
            if (c47325Ihl4 != null) {
                i = c47325Ihl4.LIZJ;
                i2 = c47325Ihl4.LIZLLL;
            } else {
                i = 0;
            }
            interfaceC47330Ihq.LIZ(i, i2);
        }
        IWH iwh = this.LJLIL.LJLLI;
        if (iwh != null && (LJ = iwh.LJ()) != null && (interfaceC46747IWh = LJ.LIZ.LIZIZ) != null) {
            this.LJLIL.getClass();
            interfaceC46747IWh.LJJJLZIJ(60);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        this.LJLIL.getClass();
        this.LJLIL.getClass();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        String str2;
        List<String> urlList;
        if (i == 100) {
            SimVideoUrlModel simVideoUrlModel = this.LJLIL.LJLJL;
            String str3 = null;
            if (simVideoUrlModel != null) {
                str2 = simVideoUrlModel.getSourceId();
            } else {
                str2 = null;
            }
            if (o.LJ(str, str2)) {
                XPS LIZLLL = XPS.LIZLLL();
                SimVideoUrlModel simVideoUrlModel2 = this.LJLIL.LJLJL;
                if (simVideoUrlModel2 != null && (urlList = simVideoUrlModel2.getUrlList()) != null) {
                    str3 = (String) ORZ.LJLLLL(urlList);
                }
                String LIZJ = LIZLLL.LIZJ(str3);
                if (!C1B6.LIZIZ(LIZJ)) {
                    C13870gZ.LIZ().LIZJ(this.LJLIL.LJLJL, LIZJ, true, new C47326Ihm());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg, IPH playerEvent) {
        String str2;
        int i;
        List<String> list;
        String str3;
        String str4;
        String num;
        List<String> list2;
        o.LJIIIZ(playerEvent, "playerEvent");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C47323Ihj c47323Ihj = this.LJLIL;
        long j = elapsedRealtime - c47323Ihj.LJLJLJ;
        C47325Ihl c47325Ihl = c47323Ihj.LJLJJLL;
        int i2 = 0;
        String str5 = "";
        if (c47325Ihl == null || (list2 = c47325Ihl.LIZIZ) == null || (str2 = (String) ORZ.LJLLLLLL(0, list2)) == null) {
            str2 = "";
        }
        if (ipg != null) {
            i = ipg.LJ;
            i2 = ipg.LJFF;
        } else {
            i = 0;
        }
        InterfaceC47329Ihp interfaceC47329Ihp = this.LJLIL.LJLJI;
        if (interfaceC47329Ihp != null) {
            interfaceC47329Ihp.LIZ(i, i2);
        }
        C47325Ihl c47325Ihl2 = this.LJLIL.LJLJJLL;
        List<String> list3 = null;
        if (c47325Ihl2 != null) {
            list = c47325Ihl2.LIZIZ;
        } else {
            list = null;
        }
        String valueOf = String.valueOf(list);
        if (ipg == null || (str3 = Integer.valueOf(ipg.LJFF).toString()) == null) {
            str3 = "";
        }
        C48421IzR.LIZ(i, valueOf, str2, j, str3, this.LJLIL.LJLIL);
        C47325Ihl c47325Ihl3 = this.LJLIL.LJLJJLL;
        if (c47325Ihl3 != null) {
            str4 = c47325Ihl3.LJFF;
            list3 = c47325Ihl3.LIZIZ;
        } else {
            str4 = null;
        }
        String valueOf2 = String.valueOf(list3);
        String str6 = this.LJLIL.LJLIL;
        if (ipg != null && (num = Integer.valueOf(ipg.LJFF).toString()) != null) {
            str5 = num;
        }
        C48137Iur.LIZLLL(str4, valueOf2, str6, str2, str5);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        InterfaceC47327Ihn interfaceC47327Ihn = this.LJLIL.LJLJJL;
        if (interfaceC47327Ihn != null) {
            interfaceC47327Ihn.LIZ((((float) j) * 1.0f) / ((float) j2), (int) j);
        }
    }
}
