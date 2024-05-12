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
public final class IPV implements OnUIPlayListener {
    public final /* synthetic */ C46580IPw LJLIL;

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

    public IPV(C46580IPw c46580IPw) {
        this.LJLIL = c46580IPw;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        if (z) {
            C46580IPw c46580IPw = this.LJLIL;
            if (!c46580IPw.LJIIJJI) {
                Iterator<IPR> it = c46580IPw.LJFF().iterator();
                while (it.hasNext()) {
                    it.next().onBuffering(true);
                }
                if (IPN.LIZ == -1) {
                    IPN.LIZ = SystemClock.elapsedRealtime();
                }
                this.LJLIL.LJIIJJI = true;
                return;
            }
            return;
        }
        C46580IPw c46580IPw2 = this.LJLIL;
        if (c46580IPw2.LJIIJJI) {
            Iterator<IPR> it2 = c46580IPw2.LJFF().iterator();
            while (it2.hasNext()) {
                it2.next().onBuffering(false);
            }
            C10K.LIZIZ(IPM.LJLIL, FMX.LIZIZ(), null);
            this.LJLIL.LJIIJJI = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        Fragment LJ;
        Fragment LJ2;
        ActivityC45651qj mo49getActivity;
        DialogFragment dialogFragment;
        if (IPZ.LIZIZ == EnumC73069Sm1.PREVIEW && IPZ.LIZ != IPX.PLAYER_START && (LJ = this.LJLIL.LJ()) != null && LJ.isResumed() && (LJ2 = this.LJLIL.LJ()) != null && (mo49getActivity = LJ2.mo49getActivity()) != null) {
            C46580IPw c46580IPw = this.LJLIL;
            C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
            Fragment LJ3 = c46580IPw.LJ();
            if (LJ3 instanceof DialogFragment) {
                dialogFragment = (DialogFragment) LJ3;
            } else {
                dialogFragment = null;
            }
            LJJIJIL.getClass();
            ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).nd0(mo49getActivity, dialogFragment);
        }
        Iterator<IPR> it = this.LJLIL.LJFF().iterator();
        while (it.hasNext()) {
            it.next().LJJJJZI();
        }
        this.LJLIL.getClass();
        LiveOuterService.LJJJLL().LJJJIL();
        C78473Uqz.LIZIZ(false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        Iterator<IPR> it = this.LJLIL.LJFF().iterator();
        while (it.hasNext()) {
            it.next().onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        Iterator<IPR> it = this.LJLIL.LJFF().iterator();
        while (it.hasNext()) {
            it.next().LIZJ(String.valueOf(ipg));
        }
        Video video = this.LJLIL.LJ;
        if (ipg == null || video == null) {
            return;
        }
        C10K.LIZIZ(new ACallableS85S0200000_8(video, ipg, 5), FMX.LIZIZ(), null);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        Iterator<IPR> it = this.LJLIL.LJFF().iterator();
        while (it.hasNext()) {
            it.next().onPlayProgressChange(f);
        }
        C46580IPw c46580IPw = this.LJLIL;
        if (c46580IPw.LJIIIZ == f) {
            c46580IPw.LJIIJ++;
        } else {
            c46580IPw.LJIIJ = 0;
        }
        if (c46580IPw.LJIIJ > 1) {
            onBuffering(true);
        } else {
            onBuffering(false);
        }
        this.LJLIL.LJIIIZ = f;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        this.LJLIL.LJI = SystemClock.elapsedRealtime();
        Iterator<IPR> it = this.LJLIL.LJFF().iterator();
        while (it.hasNext()) {
            it.next().LJJJI();
        }
        C10K.LIZIZ(IPK.LJLIL, FMX.LIZIZ(), null);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        int i;
        int i2;
        if (IPZ.LIZIZ == EnumC73069Sm1.PREVIEW && this.LJLIL.LJ() != null) {
            LiveOuterService.LJJJLL().LJJIJIL().getClass();
            ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Oj0();
        }
        Iterator<IPR> it = this.LJLIL.LJFF().iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        IWF iwf = this.LJLIL.LJII;
        if (iwf != null) {
            i = (int) iwf.getBitrate();
        } else {
            i = 0;
        }
        IWF iwf2 = this.LJLIL.LJII;
        if (iwf2 != null) {
            i2 = iwf2.LJ();
        } else {
            i2 = 0;
        }
        if (this.LJLIL.LJI != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C46580IPw c46580IPw = this.LJLIL;
            long j = elapsedRealtime - c46580IPw.LJI;
            Video video = c46580IPw.LJ;
            int i3 = c46580IPw.LJFF;
            if (video != null && it4 != null) {
                C10K.LIZIZ(new ACallableS0S0203100_8(i3, i, i2, j, video, it4, 0), FMX.LIZIZ(), null);
            }
            this.LJLIL.LJI = 0L;
        }
        this.LJLIL.getClass();
        LiveOuterService.LJJJLL().LJJJIL();
        C78473Uqz.LIZIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        if (IPZ.LIZIZ == EnumC73069Sm1.PREVIEW && this.LJLIL.LJ() != null) {
            LiveOuterService.LJJJLL().LJJIJIL().getClass();
            ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Oj0();
        }
        Iterator<IPR> it = this.LJLIL.LJFF().iterator();
        while (it.hasNext()) {
            it.next().onResumePlay(str);
        }
        this.LJLIL.getClass();
        LiveOuterService.LJJJLL().LJJJIL();
        C78473Uqz.LIZIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        Iterator<IPR> it = this.LJLIL.LJFF().iterator();
        while (it.hasNext()) {
            it.next().LJIILL(String.valueOf(ipg));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        Iterator<IPR> it = this.LJLIL.LJFF().iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(i);
        }
    }
}
