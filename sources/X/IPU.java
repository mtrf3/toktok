package X;

import Y.ACallableS0S0203100_8;
import Y.ACallableS85S0200000_8;
import android.os.SystemClock;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IPU implements OnUIPlayListener {
    public final /* synthetic */ IQ9 LJLIL;

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

    public IPU(IQ9 iq9) {
        this.LJLIL = iq9;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        if (z) {
            IQ9 iq9 = this.LJLIL;
            if (!iq9.LJIIIZ) {
                Iterator<IQB> it = iq9.LJ().iterator();
                while (it.hasNext()) {
                    it.next().onBuffering(true);
                }
                if (IPP.LIZ == -1) {
                    IPP.LIZ = SystemClock.elapsedRealtime();
                }
                this.LJLIL.LJIIIZ = true;
                return;
            }
            return;
        }
        IQ9 iq92 = this.LJLIL;
        if (iq92.LJIIIZ) {
            Iterator<IQB> it2 = iq92.LJ().iterator();
            while (it2.hasNext()) {
                it2.next().onBuffering(false);
            }
            C10K.LIZIZ(IPO.LJLIL, FMX.LIZIZ(), null);
            this.LJLIL.LJIIIZ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        Fragment fragment;
        Fragment fragment2;
        ActivityC45651qj mo49getActivity;
        DialogFragment dialogFragment;
        IQ9 iq9 = this.LJLIL;
        if (iq9.LJIILL != IPW.PLAYER_START && (fragment = iq9.LJIILIIL) != null && fragment.isResumed() && (fragment2 = this.LJLIL.LJIILIIL) != null && (mo49getActivity = fragment2.mo49getActivity()) != null) {
            IQ9 iq92 = this.LJLIL;
            C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
            Fragment fragment3 = iq92.LJIILIIL;
            if (fragment3 instanceof DialogFragment) {
                dialogFragment = (DialogFragment) fragment3;
            } else {
                dialogFragment = null;
            }
            LJJIJIL.getClass();
            ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).nd0(mo49getActivity, dialogFragment);
        }
        Iterator<IQB> it = this.LJLIL.LJ().iterator();
        while (it.hasNext()) {
            it.next().LJJJJZI();
        }
        this.LJLIL.getClass();
        LiveOuterService.LJJJLL().LJJJIL();
        C78473Uqz.LIZIZ(false);
        IWF.LJJLIIIIJ().LJJIL();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        Iterator<IQB> it = this.LJLIL.LJ().iterator();
        while (it.hasNext()) {
            it.next().onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        Iterator<IQB> it = this.LJLIL.LJ().iterator();
        while (it.hasNext()) {
            it.next().LIZJ(String.valueOf(ipg));
        }
        Video video = this.LJLIL.LIZJ;
        if (ipg == null || video == null) {
            return;
        }
        C10K.LIZIZ(new ACallableS85S0200000_8(video, ipg, 8), FMX.LIZIZ(), null);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        Iterator<IQB> it = this.LJLIL.LJ().iterator();
        while (it.hasNext()) {
            it.next().onPlayProgressChange(f);
        }
        IQ9 iq9 = this.LJLIL;
        if (iq9.LJI == f) {
            iq9.LJIIIIZZ++;
        } else {
            iq9.LJIIIIZZ = 0;
        }
        if (iq9.LJIIIIZZ > 1) {
            onBuffering(true);
        } else {
            onBuffering(false);
        }
        IQ9 iq92 = this.LJLIL;
        iq92.LJI = f;
        iq92.LJII = f;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        this.LJLIL.LJ = SystemClock.elapsedRealtime();
        Iterator<IQB> it = this.LJLIL.LJ().iterator();
        while (it.hasNext()) {
            it.next().LJJJI();
        }
        C10K.LIZIZ(IPL.LJLIL, FMX.LIZIZ(), null);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        int i;
        int i2;
        if (this.LJLIL.LJIILIIL != null) {
            LiveOuterService.LJJJLL().LJJIJIL().getClass();
            ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Oj0();
        }
        Iterator<IQB> it = this.LJLIL.LJ().iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        IWF iwf = this.LJLIL.LJFF;
        if (iwf != null) {
            i = (int) iwf.getBitrate();
        } else {
            i = 0;
        }
        IWF iwf2 = this.LJLIL.LJFF;
        if (iwf2 != null) {
            i2 = iwf2.LJ();
        } else {
            i2 = 0;
        }
        if (this.LJLIL.LJ != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            IQ9 iq9 = this.LJLIL;
            long j = elapsedRealtime - iq9.LJ;
            Video video = iq9.LIZJ;
            int i3 = iq9.LIZLLL;
            if (video != null && it4 != null) {
                C10K.LIZIZ(new ACallableS0S0203100_8(i3, i, i2, j, video, it4, 1), FMX.LIZIZ(), null);
            }
            this.LJLIL.LJ = 0L;
        }
        this.LJLIL.getClass();
        LiveOuterService.LJJJLL().LJJJIL();
        C78473Uqz.LIZIZ(true);
        IWF.LJJLIIIIJ().LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        if (this.LJLIL.LJIILIIL != null) {
            LiveOuterService.LJJJLL().LJJIJIL().getClass();
            ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Oj0();
        }
        Iterator<IQB> it = this.LJLIL.LJ().iterator();
        while (it.hasNext()) {
            it.next().onResumePlay(str);
        }
        this.LJLIL.getClass();
        LiveOuterService.LJJJLL().LJJJIL();
        C78473Uqz.LIZIZ(true);
        IWF.LJJLIIIIJ().LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        Iterator<IQB> it = this.LJLIL.LJ().iterator();
        while (it.hasNext()) {
            it.next().LJIILL(String.valueOf(ipg));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        Iterator<IQB> it = this.LJLIL.LJ().iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(i);
        }
    }
}
