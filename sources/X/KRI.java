package X;

import android.util.Size;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KRI implements OnUIPlayListener {
    public final /* synthetic */ KRJ LJLIL;

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

    public KRI(KRJ krj) {
        this.LJLIL = krj;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        if (z) {
            KRJ krj = this.LJLIL;
            if (!krj.LJIIIIZZ) {
                Iterator<KRL> it = krj.LJIIJJI.iterator();
                while (it.hasNext()) {
                    it.next().onBuffering(true);
                }
                this.LJLIL.LJIIIIZZ = true;
                return;
            }
            return;
        }
        KRJ krj2 = this.LJLIL;
        if (krj2.LJIIIIZZ) {
            Iterator<KRL> it2 = krj2.LJIIJJI.iterator();
            while (it2.hasNext()) {
                it2.next().onBuffering(false);
            }
            this.LJLIL.LJIIIIZZ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        C279017q.LJ("onPausePlay", str, "LiveReplayClipPlayerController");
        Iterator it = ((ArrayList) this.LJLIL.LJIIJJI).iterator();
        while (it.hasNext()) {
            ((KRL) it.next()).onPausePlay(str);
        }
        this.LJLIL.getClass();
        LiveOuterService.LJJJLL().LJJJIL();
        C78473Uqz.LIZIZ(false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        C0NB.LIZIZ("LiveReplayClipPlayerController", "onPlayCompleted");
        Iterator<KRL> it = this.LJLIL.LJIIJJI.iterator();
        while (it.hasNext()) {
            it.next().onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        C279017q.LJ("onPlayCompletedFirstTime", str, "LiveReplayClipPlayerController");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        C0NB.LIZIZ("LiveReplayClipPlayerController", "onPlayFailed");
        Iterator<KRL> it = this.LJLIL.LJIIJJI.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(String.valueOf(ipg));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlayProgressChange:");
        LIZ.append(f);
        C0NB.LIZIZ("LiveReplayClipPlayerController", X1D.LIZIZ(LIZ));
        KRJ krj = this.LJLIL;
        if (krj.LJIIJ) {
            krj.LIZIZ();
            this.LJLIL.LJIIJ = false;
        }
        Iterator<KRL> it = this.LJLIL.LJIIJJI.iterator();
        while (it.hasNext()) {
            it.next().onPlayProgressChange(f);
        }
        KRJ krj2 = this.LJLIL;
        if (krj2.LJI == f) {
            krj2.LJII++;
        } else {
            krj2.LJII = 0;
        }
        if (krj2.LJII > 1) {
            onBuffering(true);
        } else {
            onBuffering(false);
        }
        this.LJLIL.LJI = f;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        C279017q.LJ("onPreparePlay", str, "LiveReplayClipPlayerController");
        Iterator<KRL> it = this.LJLIL.LJIIJJI.iterator();
        while (it.hasNext()) {
            it.next().onPreparePlay(str);
        }
        KRJ krj = this.LJLIL;
        if (krj.LJIIJ) {
            krj.LIZIZ();
            this.LJLIL.LJIIJ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        long j;
        int i;
        int i2;
        C0NB.LIZIZ("LiveReplayClipPlayerController", "onRenderFirstFrame");
        IWF iwf = this.LJLIL.LJ;
        if (iwf != null) {
            j = iwf.getDuration();
        } else {
            j = 0;
        }
        IWF iwf2 = this.LJLIL.LJ;
        if (iwf2 != null) {
            i = iwf2.getVideoWidth();
        } else {
            i = 0;
        }
        IWF iwf3 = this.LJLIL.LJ;
        if (iwf3 != null) {
            i2 = iwf3.getVideoHeight();
        } else {
            i2 = 0;
        }
        if (i > 0 && i2 > 0) {
            C73051Slj c73051Slj = this.LJLIL.LIZ;
            c73051Slj.getClass();
            c73051Slj.LJLJLJ = new Size(i, i2);
            c73051Slj.requestLayout();
        }
        Iterator it = ((ArrayList) this.LJLIL.LJIIJJI).iterator();
        while (it.hasNext()) {
            ((KRL) it.next()).LJLIIL(i, i2, j);
        }
        this.LJLIL.getClass();
        LiveOuterService.LJJJLL().LJJJIL();
        C78473Uqz.LIZIZ(true);
        KRJ krj = this.LJLIL;
        if (krj.LJIIJ) {
            krj.LIZIZ();
            this.LJLIL.LJIIJ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        C279017q.LJ("onResumePlay", str, "LiveReplayClipPlayerController");
        Iterator it = ((ArrayList) this.LJLIL.LJIIJJI).iterator();
        while (it.hasNext()) {
            ((KRL) it.next()).onResumePlay(str);
        }
        this.LJLIL.getClass();
        LiveOuterService.LJJJLL().LJJJIL();
        C78473Uqz.LIZIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        C0NB.LIZIZ("LiveReplayClipPlayerController", "onRetryOnError");
        Iterator<KRL> it = this.LJLIL.LJIIJJI.iterator();
        while (it.hasNext()) {
            it.next().LJIILL(String.valueOf(ipg));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        C012403c.LJ("onBufferedPercent:", i, "LiveReplayClipPlayerController");
        Iterator<KRL> it = this.LJLIL.LJIIJJI.iterator();
        while (it.hasNext()) {
            it.next().onBufferedPercent(str, j, i);
        }
    }
}
