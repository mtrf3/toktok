package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.IEy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46296IEy implements OnUIPlayListener, IEZ {
    public static WeakReference<IEZ> LJLJLJ;
    public final OnUIPlayListener LJLIL;
    public final IE3 LJLILLLLZI;
    public Aweme LJLJI;
    public final List<Video> LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;

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

    public final Video LIZ() {
        List<Video> list = this.LJLJJI;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (Video) ListProtector.get(this.LJLJJI, this.LJLJJL);
    }

    public final String LIZIZ() {
        String str;
        Aweme aweme = this.LJLJI;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        if (this.LJLJJL == 0) {
            return str;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(this.LJLJJL);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.IEZ
    public final long getCurrentPosition() {
        boolean z;
        List<Video> list = this.LJLJJI;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0L;
        }
        long j = 0;
        while (C78842Uww.LJJ(0, this.LJLJJL).iterator().hasNext()) {
            j += ((Video) ListProtector.get(this.LJLJJI, ((AbstractC118224kU) r2).nextInt())).getDuration();
        }
        long currentPosition = ((C46263IDr) this.LJLILLLLZI).LIZ.LJJJJIZL().getCurrentPosition() + j;
        if (currentPosition < 0) {
            return 0L;
        }
        return currentPosition;
    }

    @Override // X.IEZ
    public final long getDuration() {
        boolean z;
        List<Video> list = this.LJLJJI;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0L;
        }
        long j = 0;
        while (this.LJLJJI.iterator().hasNext()) {
            j += r4.next().getDuration();
        }
        if (j <= 0) {
            long duration = ((C46263IDr) this.LJLILLLLZI).LIZ.LJJJJIZL().getDuration();
            if (duration > 0) {
                return duration;
            }
            return -1L;
        }
        return j;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        this.LJLIL.onBuffering(z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        this.LJLIL.onDecoderBuffering(z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        C56462Jm c56462Jm = ((C46263IDr) this.LJLILLLLZI).LIZ.LLILLIZIL;
        if (c56462Jm != null) {
            c56462Jm.LIZ = 3;
        }
        if (this.LJLJL) {
            this.LJLJL = false;
        } else {
            this.LJLIL.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        List<Video> list = this.LJLJJI;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return;
        }
        this.LJLJJL = (this.LJLJJL + 1) % ((ArrayList) this.LJLJJI).size();
        Video LIZ = LIZ();
        if (LIZ != null) {
            this.LJLJL = true;
            C46263IDr c46263IDr = (C46263IDr) this.LJLILLLLZI;
            C2MA LJJIJIIJI = c46263IDr.LIZ.LJJIJIIJI();
            if (LJJIJIIJI != null && LJJIJIIJI.LLLJ() != null) {
                c46263IDr.LIZ.LJJJJIZL().setSurface(LJJIJIIJI.LLLJ().getSurface());
                c46263IDr.LIZ.LJJJJIZL().LJIJI(LIZ, null, false, true);
            }
        }
        if (this.LJLJJL == 0) {
            if (this.LJLJJLL == 0) {
                this.LJLIL.onPlayCompletedFirstTime(str);
            }
            this.LJLIL.onPlayCompleted(str);
            this.LJLJJLL++;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        this.LJLIL.onPlayFailed(ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        this.LJLIL.onPlayProgressChange(f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        C56462Jm c56462Jm = ((C46263IDr) this.LJLILLLLZI).LIZ.LLILLIZIL;
        if (c56462Jm != null) {
            c56462Jm.LIZ = 1;
        }
        if (this.LJLJJL == 0 && this.LJLJJLL == 0) {
            this.LJLIL.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        if (this.LJLJJL == 0 && this.LJLJJLL == 0) {
            this.LJLIL.onRenderFirstFrame(it4);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        List<Video> list;
        VideoUrlModel playAddr;
        this.LJLJL = false;
        C56462Jm c56462Jm = ((C46263IDr) this.LJLILLLLZI).LIZ.LLILLIZIL;
        if (c56462Jm != null) {
            c56462Jm.LIZ = 2;
        }
        if (this.LJLJJL == 0 && this.LJLJJLL == 0) {
            this.LJLIL.onRenderReady(iph);
        }
        if (this.LJLJJLL != 0 || (list = this.LJLJJI) == null || ((ArrayList) list).isEmpty() || this.LJLJJL + 1 >= ((ArrayList) this.LJLJJI).size() || (playAddr = ((Video) ListProtector.get(this.LJLJJI, this.LJLJJL + 1)).getPlayAddr()) == null) {
            return;
        }
        this.LJLILLLLZI.getClass();
        C47242IgQ.LIZ().LJIIJJI(C51029K0z.LJJJJI(playAddr));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        C56462Jm c56462Jm = ((C46263IDr) this.LJLILLLLZI).LIZ.LLILLIZIL;
        if (c56462Jm != null) {
            c56462Jm.LIZ = 2;
        }
        this.LJLIL.onResumePlay(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        this.LJLIL.onRetryOnError(ipg);
    }

    public C46296IEy(OnUIPlayListener originOnUIPlayListener, C46263IDr c46263IDr) {
        o.LJIIIZ(originOnUIPlayListener, "originOnUIPlayListener");
        this.LJLIL = originOnUIPlayListener;
        this.LJLILLLLZI = c46263IDr;
        this.LJLJJI = new ArrayList();
    }
}
