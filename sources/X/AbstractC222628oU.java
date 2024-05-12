package X;

import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.8oU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC222628oU implements InterfaceC222698ob {
    public final C222588oQ LJLIL;
    public C2MA LJLILLLLZI;
    public EnumC215438ct LJLJI;
    public final List<AbstractC221978nR> LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public Aweme LJLJL;
    public UserStory LJLJLJ;
    public final String LJLJLLL;
    public String LJLL;
    public final String LJLLI;
    public final java.util.Set<String> LJLLILLLL;
    public DataCenter LJLLJ;

    @Override // X.InterfaceC222698ob
    public abstract void KJ(int i, String str);

    public abstract int LIZ();

    public abstract int LIZIZ();

    public abstract void LIZLLL(int i, boolean z);

    public abstract void LJI();

    @Override // X.InterfaceC222708oc
    public final /* synthetic */ void LLJJIII() {
    }

    @Override // X.InterfaceC222708oc
    public final /* synthetic */ void LLLI() {
    }

    @Override // X.InterfaceC222698ob
    public final void N7(InterfaceC47667InH interfaceC47667InH) {
    }

    @Override // X.InterfaceC222698ob
    public final void O(boolean z) {
    }

    @Override // X.InterfaceC222708oc
    public final int UU() {
        return 3;
    }

    @Override // X.InterfaceC222698ob
    public final void V3(boolean z) {
    }

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

    @Override // X.InterfaceC222708oc
    public final void F5() {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.n();
        }
    }

    @Override // X.InterfaceC222708oc
    public final boolean Jk0() {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            return LLJJIJIL.Jk0();
        }
        return false;
    }

    @Override // X.InterfaceC222708oc
    public final boolean d4() {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            return LLJJIJIL.d4();
        }
        return false;
    }

    @Override // X.InterfaceC222708oc
    public final Surface getSurface() {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            return LLJJIJIL.getSurface();
        }
        return null;
    }

    @Override // X.InterfaceC222698ob
    public final InterfaceC47247IgV getSurfaceHolder() {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            return LLJJIJIL.getSurfaceHolder();
        }
        return null;
    }

    @Override // X.InterfaceC222708oc
    public final View getVideoView() {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            return LLJJIJIL.getVideoView();
        }
        return null;
    }

    @Override // X.InterfaceC222708oc
    public final void n() {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.n();
        }
    }

    @Override // X.InterfaceC222708oc
    public final ViewGroup Dp() {
        ViewParent viewParent;
        View videoView = getVideoView();
        if (videoView != null) {
            viewParent = videoView.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) viewParent;
    }

    @Override // X.InterfaceC222708oc
    public final void G60(int i) {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.G60(i);
        }
    }

    public final void LIZJ(InterfaceC88472Yns<? super AbstractC221978nR, C76800UCe> interfaceC88472Yns) {
        Iterator it = ((ArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            interfaceC88472Yns.invoke(it.next());
        }
    }

    public final void LJFF(String str) {
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        int hashCode = str.hashCode();
        if (hashCode != -2015881337) {
            if (hashCode != 1431203431) {
                if (hashCode != 1753337067 || !str.equals("story_collection_play") || (aweme3 = this.LJLJL) == null) {
                    return;
                }
                C222578oP.LJIILIIL(LIZ(), LIZIZ(), aweme3, this.LJLIL.LJIIIZ, this.LJLLI);
                return;
            }
            if (!str.equals("story_collection_play_finish") || (aweme2 = this.LJLJL) == null) {
                return;
            }
            C222578oP.LJIILL(LIZ(), LIZIZ(), aweme2, this.LJLIL.LJIIIZ, this.LJLLI);
            return;
        }
        if (!str.equals("story_collection_play_end") || (aweme = this.LJLJL) == null) {
            return;
        }
        C222578oP.LJIILJJIL(aweme, LIZ(), LIZIZ(), this.LJLIL.LJIIIZ, this.LJLLILLLL.size(), this.LJLLI);
    }

    @Override // X.InterfaceC222698ob
    public final void LJJIFFI(DataCenter dataCenter) {
        o.LJIIIZ(dataCenter, "dataCenter");
        this.LJLLJ = dataCenter;
    }

    @Override // X.InterfaceC222728oe
    public final void LLIIIILZ(OnUIPlayListener onUIPlayListener) {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.LLIIIILZ(onUIPlayListener);
        }
    }

    @Override // X.InterfaceC222698ob
    public void Qg0(int i) {
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null) {
            c2ma.l8(i);
        }
    }

    @Override // X.InterfaceC222708oc
    public final void Y2(Aweme aweme) {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.Y2(aweme);
        }
    }

    @Override // X.InterfaceC222698ob
    public void Zo(boolean z) {
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null) {
            c2ma.t7(z);
        }
    }

    @Override // X.InterfaceC222708oc
    public final void eg(boolean z) {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.eg(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.onDecoderBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.onPlayFailed(ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.onRenderFirstFrame(it4);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        InterfaceC222698ob LLJJIJIL;
        C2MA c2ma = this.LJLILLLLZI;
        if (c2ma != null && (LLJJIJIL = c2ma.LLJJIJIL()) != null) {
            LLJJIJIL.onRetryOnError(ipg);
        }
    }

    public final void LJ(EnumC222138nh type, C2K7 c2k7) {
        o.LJIIIZ(type, "type");
        this.LJLIL.LIZIZ.onInternalEvent(new C50420Jqa(60, new C57432Nf(type, c2k7)));
    }

    public AbstractC222628oU(ViewGroup viewGroup, InterfaceC47667InH listener, C222588oQ params) {
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(params, "params");
        this.LJLIL = params;
        this.LJLJI = EnumC215438ct.LOOP_CURRENT_USER;
        this.LJLJJI = new ArrayList();
        this.LJLJJL = -1;
        this.LJLJJLL = -1;
        this.LJLJLLL = params.LJ.param.getEventType();
        params.LJ.param.getFrom();
        this.LJLL = "";
        this.LJLLI = C78596Usy.LJJIIZ(params.LJ.param);
        this.LJLLILLLL = new LinkedHashSet();
    }
}
