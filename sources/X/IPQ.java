package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IPQ implements OnUIPlayListener {
    public final /* synthetic */ C46578IPu LJLIL;

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
    public final void onDecoderBuffering(boolean z) {
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
    public final /* synthetic */ void onPausePlay(String str, IPH iph) {
        C222688oa.LJIILIIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C222688oa.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, IPH iph) {
        C222688oa.LJIIZILJ(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg) {
        C222688oa.LJIJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg, IPH iph) {
        C222688oa.LJIJI(this, str, ipg, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C222688oa.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepare(String str) {
        C222688oa.LJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C222688oa.LJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C222688oa.LJJIFFI(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C222688oa.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str) {
        C222688oa.LJJIII(this, str);
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
    public final /* synthetic */ void onPreparePlay(String str, IPH iph) {
        C222688oa.LJJIJL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(String str, IT4 it4) {
        C222688oa.LJJIJLIJ(this, str, it4);
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
    public final /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, IPG ipg) {
        C222688oa.LJJJJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
        C222688oa.LJJJJIZL(this, str, z);
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

    public IPQ(C46578IPu c46578IPu) {
        this.LJLIL = c46578IPu;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        if (z) {
            C46578IPu c46578IPu = this.LJLIL;
            if (!c46578IPu.LJIIJJI) {
                Iterator<IPR> it = c46578IPu.LIZLLL().iterator();
                while (it.hasNext()) {
                    it.next().onBuffering(true);
                }
                if (IPS.LIZ == -1) {
                    IPS.LIZ = SystemClock.elapsedRealtime();
                }
                this.LJLIL.LJIIJJI = true;
                return;
            }
            return;
        }
        C46578IPu c46578IPu2 = this.LJLIL;
        if (c46578IPu2.LJIIJJI) {
            Iterator<IPR> it2 = c46578IPu2.LIZLLL().iterator();
            while (it2.hasNext()) {
                it2.next().onBuffering(false);
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = IPS.LIZ;
                long j2 = elapsedRealtime - j;
                if (j != -1 && j2 > 80) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", j2);
                    jSONObject.put("enter_from", "TEMAI");
                }
                IPS.LIZ = -1L;
            } catch (Exception e) {
                C36922EeM.LIZ(e);
            }
            this.LJLIL.LJIIJJI = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        Iterator<IPR> it = this.LJLIL.LIZLLL().iterator();
        while (it.hasNext()) {
            it.next().LJJJJZI();
        }
        this.LJLIL.getClass();
        LiveOuterService.LJJJLL().LJJJIL();
        C78473Uqz.LIZIZ(false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        Iterator<IPR> it = this.LJLIL.LIZLLL().iterator();
        while (it.hasNext()) {
            it.next().onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        int i;
        String videoUrlModel;
        Iterator<IPR> it = this.LJLIL.LIZLLL().iterator();
        while (it.hasNext()) {
            it.next().LIZJ(String.valueOf(ipg));
        }
        Video video = this.LJLIL.LJ;
        if (ipg == null || video == null) {
            return;
        }
        try {
            int videoLength = video.getVideoLength();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", String.valueOf(ipg.LJ));
            jSONObject.put("error_internal_code", String.valueOf(ipg.LJFF));
            jSONObject.put("error_info", ipg.LJI.toString());
            int i2 = 0;
            if (ipg.LIZIZ) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_bytevc1", String.valueOf(i));
            if (ipg.LIZLLL) {
                i2 = 1;
            }
            jSONObject.put("is_dash", String.valueOf(i2));
            jSONObject.put("is_ad", CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("vduration", videoLength * 1000);
            jSONObject.put("internet_speed", String.valueOf(C47497IkX.LIZJ()));
            jSONObject.put("cache_size", String.valueOf(C46728IVo.LJ(video.getPlayAddr())));
            jSONObject.put("video_size", String.valueOf(C46728IVo.LJIIIZ(video.getPlayAddr())));
            if (video.getPlayAddr() == null) {
                videoUrlModel = "null";
            } else {
                videoUrlModel = video.getPlayAddr().toString();
                o.LJIIIIZZ(videoUrlModel, "video.playAddr.toString()");
            }
            jSONObject.put("play_url", videoUrlModel);
            jSONObject.put("is_from_feed_cache", CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("enter_from", "TEMAI");
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        Iterator<IPR> it = this.LJLIL.LIZLLL().iterator();
        while (it.hasNext()) {
            it.next().onPlayProgressChange(f);
        }
        C46578IPu c46578IPu = this.LJLIL;
        if (c46578IPu.LJIIIZ == f) {
            c46578IPu.LJIIJ++;
        } else {
            c46578IPu.LJIIJ = 0;
        }
        if (c46578IPu.LJIIJ > 1) {
            onBuffering(true);
        } else {
            onBuffering(false);
        }
        this.LJLIL.LJIIIZ = f;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        this.LJLIL.LJI = SystemClock.elapsedRealtime();
        Iterator<IPR> it = this.LJLIL.LIZLLL().iterator();
        while (it.hasNext()) {
            it.next().LJJJI();
        }
        try {
            new JSONObject().put("enter_from", "TEMAI");
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        int i;
        Iterator<IPR> it = this.LJLIL.LIZLLL().iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        IWF iwf = this.LJLIL.LJII;
        int i2 = 0;
        if (iwf != null) {
            i = (int) iwf.getBitrate();
        } else {
            i = 0;
        }
        IWF iwf2 = this.LJLIL.LJII;
        if (iwf2 != null) {
            i2 = iwf2.LJ();
        }
        if (this.LJLIL.LJI != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C46578IPu c46578IPu = this.LJLIL;
            long j = elapsedRealtime - c46578IPu.LJI;
            Video video = c46578IPu.LJ;
            int i3 = c46578IPu.LJFF;
            if (video != null && it4 != null) {
                try {
                    VideoUrlModel playAddr = video.getPlayAddr();
                    int videoLength = video.getVideoLength();
                    int LJIILL = C78963Uyt.LJIILL(playAddr);
                    int LIZJ = C47497IkX.LIZJ();
                    int LJ = C46728IVo.LJ(video.getPlayAddr()) / 1024;
                    boolean isBytevc1 = it4.isBytevc1();
                    Integer cpuRate = C39179FZf.LIZIZ;
                    if (cpuRate == null) {
                        cpuRate = -1;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", j);
                    jSONObject.put("vduration", videoLength * 1000);
                    jSONObject.put("video_quality", LJIILL);
                    jSONObject.put("internet_speed", LIZJ);
                    jSONObject.put("pre_cache_size", LJ);
                    jSONObject.put("video_bitrate", i3);
                    jSONObject.put("play_bitrate", i);
                    jSONObject.put("is_bytevc1", isBytevc1);
                    jSONObject.put("codec_name", i2);
                    o.LJIIIIZZ(cpuRate, "cpuRate");
                    jSONObject.put("cpu_rate", cpuRate.intValue());
                    jSONObject.put("enter_from", "TEMAI");
                } catch (Exception e) {
                    C36922EeM.LIZ(e);
                }
            }
            this.LJLIL.LJI = 0L;
        }
        this.LJLIL.getClass();
        LiveOuterService.LJJJLL().LJJJIL();
        C78473Uqz.LIZIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        Iterator<IPR> it = this.LJLIL.LIZLLL().iterator();
        while (it.hasNext()) {
            it.next().onResumePlay(str);
        }
        this.LJLIL.getClass();
        LiveOuterService.LJJJLL().LJJJIL();
        C78473Uqz.LIZIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        Iterator<IPR> it = this.LJLIL.LIZLLL().iterator();
        while (it.hasNext()) {
            it.next().LJIILL(String.valueOf(ipg));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        Iterator<IPR> it = this.LJLIL.LIZLLL().iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(i);
        }
    }
}
