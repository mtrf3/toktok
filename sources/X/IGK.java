package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IGK implements IGO, OnUIPlayListener {
    public static final IGK LJLIL = new IGK();
    public static final List<OnUIPlayListener> LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(boolean z) {
        C222688oa.LJFF(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C222688oa.LJIIIZ(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(IPG ipg) {
        C222688oa.LJIJJ(this, ipg);
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
    public final /* synthetic */ void onPreparePlay(String str) {
        C222688oa.LJJIJIL(this, str);
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

    static {
        List<OnUIPlayListener> arrayList;
        Object value = IZ8.LJIJJ.getValue();
        o.LJIIIIZZ(value, "<get-fixGlobalPlayListenerCrash>(...)");
        if (((Boolean) value).booleanValue()) {
            arrayList = new CopyOnWriteArrayList<>();
        } else {
            arrayList = new ArrayList<>();
        }
        LJLILLLLZI = arrayList;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        throw new RuntimeException("Illegal call");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlayPause(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlayPrepare(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlayRelease(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlayStop(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlaying(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPreRenderSessionMissed(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onRenderFirstFrameFromResume(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onBufferedTimeMs(str, j);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onBuffering(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onCompleteLoaded(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onDecoderBuffering(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onMaskInfoCallback(String str, ITW barrageMaskData) {
        o.LJIIIZ(barrageMaskData, "barrageMaskData");
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onMaskInfoCallback(str, barrageMaskData);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str, IPH iph) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPausePlay(str, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlayCompleted(str, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str, IPH iph) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlayCompletedFirstTime(str, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlayFailed(str, ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlayStop(str, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str, IPH iph) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlaying(str, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str, IPH iph) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPreparePlay(str, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onRenderFirstFrame(str, it4);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str, IPH iph) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onResumePlay(str, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, IPG ipg) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onRetryOnError(str, ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onSeekEnd(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSpeedChanged(String str, float f) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onSpeedChanged(str, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlayStop(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onBufferedPercent(str, j, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z, IPH iph) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onBuffering(str, z, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z, IPH iph) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onDecoderBuffering(str, z, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg, IPH iph) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlayFailed(str, ipg, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlayProgressChange(str, j, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject, IPH iph) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlayStop(str, jSONObject, iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPlayerInternalEvent(str, i, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onSeekStart(str, i, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onVideoBitrateChanged(str, enumC47177IfN, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(str, i, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onFrameAboutToBeRendered(int i, long j, long j2, java.util.Map<Integer, String> map) {
        Iterator<OnUIPlayListener> it = LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onFrameAboutToBeRendered(i, j, j2, map);
        }
    }
}
