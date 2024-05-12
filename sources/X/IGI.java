package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IGI implements OnUIPlayListener {
    public final InterfaceC46271IDz LJLIL;
    public final OnUIPlayListener LJLILLLLZI;
    public Aweme LJLJI;
    public Video LJLJJI;
    public int LJLJJL;
    public final Handler LJLJJLL;

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C222688oa.LIZ(this);
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
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C222688oa.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C222688oa.LJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str) {
        C222688oa.LJJIJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C222688oa.LJJJJJL(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        this.LJLILLLLZI.onBuffering(z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        this.LJLILLLLZI.onDecoderBuffering(z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        C56462Jm c56462Jm = ((IDU) this.LJLIL).LIZ.LLILLIZIL;
        if (c56462Jm != null) {
            c56462Jm.LIZ = 3;
        }
        this.LJLILLLLZI.onPausePlay(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        Integer num;
        java.util.Map<Integer, Integer> map = IEW.LIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        int i = 1;
        if (linkedHashMap.get(Integer.valueOf(IEW.LIZIZ)) != null) {
            Integer num2 = (Integer) linkedHashMap.get(Integer.valueOf(IEW.LIZIZ));
            if (num2 != null) {
                num = C77339UWx.LIZIZ(num2, 1);
            } else {
                num = null;
            }
            o.LJI(num);
            i = num.intValue();
        }
        map.put(Integer.valueOf(IEW.LIZIZ), Integer.valueOf(i));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateStoryPlayOrders: currentPlayIndex = ");
        LIZ.append(IEW.LIZIZ);
        LIZ.append(",currentPlayOrders = ");
        LIZ.append(i);
        IE0.LIZ(X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.onPlayCompleted(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        this.LJLILLLLZI.onPlayCompletedFirstTime(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        this.LJLILLLLZI.onPlayFailed(ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        this.LJLILLLLZI.onPlayPause(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        this.LJLILLLLZI.onPlayPrepare(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        this.LJLILLLLZI.onPlayProgressChange(f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
        this.LJLILLLLZI.onPlayRelease(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        this.LJLILLLLZI.onPlayStop(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        this.LJLILLLLZI.onPlaying(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
        this.LJLILLLLZI.onPreRenderSessionMissed(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        C56462Jm c56462Jm = ((IDU) this.LJLIL).LIZ.LLILLIZIL;
        if (c56462Jm != null) {
            c56462Jm.LIZ = 2;
        }
        this.LJLILLLLZI.onRenderFirstFrame(it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
        this.LJLILLLLZI.onRenderFirstFrameFromResume(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        this.LJLILLLLZI.onRenderReady(iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        C56462Jm c56462Jm = ((IDU) this.LJLIL).LIZ.LLILLIZIL;
        if (c56462Jm != null) {
            c56462Jm.LIZ = 2;
        }
        this.LJLILLLLZI.onResumePlay(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        this.LJLILLLLZI.onRetryOnError(ipg);
    }

    public IGI(IDU idu, OnUIPlayListener iOriginUIListener) {
        o.LJIIIZ(iOriginUIListener, "iOriginUIListener");
        this.LJLIL = idu;
        this.LJLILLLLZI = iOriginUIListener;
        this.LJLJJLL = new Handler(C16880lQ.LLJJJJ());
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
        this.LJLILLLLZI.onBufferedTimeMs(str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        this.LJLILLLLZI.onBuffering(str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
        this.LJLILLLLZI.onCompleteLoaded(str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
        this.LJLILLLLZI.onDecoderBuffering(str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str, IPH iph) {
        this.LJLILLLLZI.onPausePlay(str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str, IPH iph) {
        this.LJLILLLLZI.onPlayCompletedFirstTime(str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg) {
        this.LJLILLLLZI.onPlayFailed(str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
        this.LJLILLLLZI.onPlayStop(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str, IPH iph) {
        this.LJLILLLLZI.onPlaying(str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str, IPH iph) {
        C56462Jm c56462Jm = ((IDU) this.LJLIL).LIZ.LLILLIZIL;
        if (c56462Jm != null) {
            c56462Jm.LIZ = 1;
        }
        this.LJLILLLLZI.onPreparePlay(str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        this.LJLILLLLZI.onRenderFirstFrame(str, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str, IPH iph) {
        C56462Jm c56462Jm = ((IDU) this.LJLIL).LIZ.LLILLIZIL;
        if (c56462Jm != null) {
            c56462Jm.LIZ = 2;
        }
        this.LJLILLLLZI.onResumePlay(str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, IPG ipg) {
        this.LJLILLLLZI.onRetryOnError(str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        this.LJLILLLLZI.onSeekEnd(str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        this.LJLILLLLZI.onPlayStop(str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        this.LJLILLLLZI.onBufferedPercent(str, j, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z, IPH iph) {
        this.LJLILLLLZI.onBuffering(str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z, IPH iph) {
        this.LJLILLLLZI.onDecoderBuffering(str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg, IPH iph) {
        this.LJLILLLLZI.onPlayFailed(str, ipg, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        this.LJLILLLLZI.onPlayProgressChange(str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject, IPH iph) {
        this.LJLILLLLZI.onPlayStop(str, jSONObject, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        this.LJLILLLLZI.onPlayerInternalEvent(str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        this.LJLILLLLZI.onSeekStart(str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        this.LJLILLLLZI.onVideoBitrateChanged(str, enumC47177IfN, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
        this.LJLILLLLZI.onVideoSizeChanged(str, i, i2);
    }
}
