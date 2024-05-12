package X;

import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class IFU implements OnUIPlayListener {
    public final WeakReference<VideoViewComponent> LJLIL;

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C222688oa.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
        C222688oa.LIZIZ(this, str, j, i);
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
    public final /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
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

    public IFU(VideoViewComponent videoViewComponent) {
        this.LJLIL = new WeakReference<>(videoViewComponent);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        VideoViewComponent videoViewComponent = this.LJLIL.get();
        if (videoViewComponent != null && !videoViewComponent.LJLJJI.isEmpty()) {
            Iterator<OnUIPlayListener> it = videoViewComponent.LJLJJI.iterator();
            while (it.hasNext()) {
                it.next().onBuffering(z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        VideoViewComponent videoViewComponent = this.LJLIL.get();
        if (videoViewComponent != null && !videoViewComponent.LJLJJI.isEmpty()) {
            Iterator<OnUIPlayListener> it = videoViewComponent.LJLJJI.iterator();
            while (it.hasNext()) {
                it.next().onPausePlay(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        VideoViewComponent videoViewComponent = this.LJLIL.get();
        if (videoViewComponent != null && !videoViewComponent.LJLJJI.isEmpty()) {
            Iterator<OnUIPlayListener> it = videoViewComponent.LJLJJI.iterator();
            while (it.hasNext()) {
                it.next().onPlayCompleted(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        VideoViewComponent videoViewComponent = this.LJLIL.get();
        if (videoViewComponent != null && !videoViewComponent.LJLJJI.isEmpty()) {
            Iterator<OnUIPlayListener> it = videoViewComponent.LJLJJI.iterator();
            while (it.hasNext()) {
                it.next().onPlayCompletedFirstTime(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        Video video;
        VideoViewComponent videoViewComponent = this.LJLIL.get();
        if (videoViewComponent != null) {
            videoViewComponent.LJLJL = false;
            if (!videoViewComponent.LJLJJI.isEmpty()) {
                Iterator<OnUIPlayListener> it = videoViewComponent.LJLJJI.iterator();
                while (it.hasNext()) {
                    it.next().onPlayFailed(ipg);
                }
            }
            if (ipg.LIZIZ && (video = videoViewComponent.LJLJJL) != null) {
                videoViewComponent.LJIIIIZZ(video.getPlayAddrH264(), true, videoViewComponent.LJLJLLL, videoViewComponent.LJLJJL.isNeedSetCookie());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        VideoViewComponent videoViewComponent = this.LJLIL.get();
        if (videoViewComponent != null && !videoViewComponent.LJLJJI.isEmpty()) {
            Iterator<OnUIPlayListener> it = videoViewComponent.LJLJJI.iterator();
            while (it.hasNext()) {
                it.next().onPlayProgressChange(f);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        VideoViewComponent videoViewComponent = this.LJLIL.get();
        if (videoViewComponent != null && !videoViewComponent.LJLJJI.isEmpty()) {
            Iterator<OnUIPlayListener> it = videoViewComponent.LJLJJI.iterator();
            while (it.hasNext()) {
                it.next().onPreparePlay(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        VideoViewComponent videoViewComponent = this.LJLIL.get();
        if (videoViewComponent != null) {
            videoViewComponent.LJLJL = false;
            videoViewComponent.LJLJLJ = false;
            IFV.LIZ.LIZ(videoViewComponent);
            if (!videoViewComponent.LJLJJI.isEmpty()) {
                Iterator<OnUIPlayListener> it = videoViewComponent.LJLJJI.iterator();
                while (it.hasNext()) {
                    it.next().onRenderFirstFrame(it4);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        VideoViewComponent videoViewComponent = this.LJLIL.get();
        if (videoViewComponent != null && !videoViewComponent.LJLJJI.isEmpty()) {
            Iterator<OnUIPlayListener> it = videoViewComponent.LJLJJI.iterator();
            while (it.hasNext()) {
                it.next().onRenderReady(iph);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        VideoViewComponent videoViewComponent = this.LJLIL.get();
        if (videoViewComponent != null && !videoViewComponent.LJLJJI.isEmpty()) {
            Iterator<OnUIPlayListener> it = videoViewComponent.LJLJJI.iterator();
            while (it.hasNext()) {
                it.next().onResumePlay(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        VideoViewComponent videoViewComponent = this.LJLIL.get();
        if (videoViewComponent != null) {
            videoViewComponent.LJLJL = false;
            if (!videoViewComponent.LJLJJI.isEmpty()) {
                Iterator<OnUIPlayListener> it = videoViewComponent.LJLJJI.iterator();
                while (it.hasNext()) {
                    it.next().onRetryOnError(ipg);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        VideoViewComponent videoViewComponent = this.LJLIL.get();
        if (videoViewComponent != null && !videoViewComponent.LJLJJI.isEmpty()) {
            Iterator<OnUIPlayListener> it = videoViewComponent.LJLJJI.iterator();
            while (it.hasNext()) {
                it.next().onSeekEnd(str, z);
            }
        }
    }
}