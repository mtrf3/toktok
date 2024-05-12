package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IGJ implements OnUIPlayListener {
    public final CopyOnWriteArraySet<OnUIPlayListener> LJLIL = new CopyOnWriteArraySet<>();

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
    public final /* synthetic */ void onPlayPrepared(String str) {
        C222688oa.LJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C222688oa.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C222688oa.LJJIIZI(this, str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C222688oa.LJJIJIIJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(IT4 it4) {
        C222688oa.LJJIL(this, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(IPH iph) {
        C222688oa.LJJJ(this, iph);
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        C222688oa.LJIIL(this, str);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        C222688oa.LJIILLIIL(this, str);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        C222688oa.LJIJJ(this, ipg);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlayFailed(ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        C222688oa.LJIJJLI(this, str);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlayPause(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        C222688oa.LJIL(this, str);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlayPrepare(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        C222688oa.LJJI(this, f);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        C222688oa.LJJIII(this, str);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlayStop(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        C222688oa.LJJIJ(this, str);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlaying(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
        C222688oa.LJJIZ(this, str);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onRenderFirstFrameFromResume(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str, IPH iph) {
        C222688oa.LJIILIIL(this, str, iph);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPausePlay(str, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
        C222688oa.LJIILL(this, str, i);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlayCompleted(str, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str, IPH iph) {
        C222688oa.LJIIZILJ(this, str, iph);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlayCompletedFirstTime(str, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg) {
        C222688oa.LJIJ(this, str, ipg);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlayFailed(str, ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
        C222688oa.LJJIIJ(this, str, jSONObject);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlayStop(str, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str, IPH iph) {
        C222688oa.LJJIJIIJI(this, str, iph);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlaying(str, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str, IPH iph) {
        C222688oa.LJJIJL(this, str, iph);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPreparePlay(str, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        C222688oa.LJJIJLIJ(this, str, it4);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onRenderFirstFrame(str, it4);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onResumePlay(str, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        C222688oa.LJJJJIZL(this, str, z);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onSeekEnd(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        C222688oa.LJJIIZ(this, str, z);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlayStop(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJ(this, str, z, iph);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onBuffering(str, z, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJIIIIZZ(this, str, z, iph);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onDecoderBuffering(str, z, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg, IPH iph) {
        C222688oa.LJIJI(this, str, ipg, iph);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlayFailed(str, ipg, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        C222688oa.LJJIFFI(this, str, j, j2);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlayProgressChange(str, j, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject, IPH iph) {
        C222688oa.LJJIIJZLJL(this, str, jSONObject, iph);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onPlayStop(str, jSONObject, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        C222688oa.LJJJJJ(this, str, i, f);
        Iterator<OnUIPlayListener> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().onSeekStart(str, i, f);
        }
    }
}
