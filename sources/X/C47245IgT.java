package X;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.SurfaceViewWrapper;
import kotlin.jvm.internal.AqS39S1000000_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.IgT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47245IgT implements InterfaceC222698ob {
    public final ViewGroup LJLIL;
    public final InterfaceC47667InH LJLILLLLZI;
    public final C222588oQ LJLJI;
    public final C47246IgU LJLJJI;

    @Override // X.InterfaceC222708oc
    public final void F5() {
    }

    @Override // X.InterfaceC222708oc
    public final void G60(int i) {
    }

    @Override // X.InterfaceC222728oe
    public final void LLIIIILZ(OnUIPlayListener onUIPlayListener) {
    }

    @Override // X.InterfaceC222698ob
    public final void LLLZ(int i, Aweme aweme) {
    }

    @Override // X.InterfaceC222698ob
    public final void Qg0(int i) {
    }

    @Override // X.InterfaceC222708oc
    public final int UU() {
        return 1;
    }

    @Override // X.InterfaceC222708oc
    public final void Y2(Aweme aweme) {
    }

    @Override // X.InterfaceC222698ob
    public final C2MA Y6() {
        return null;
    }

    @Override // X.InterfaceC222698ob
    public final void Zo(boolean z) {
    }

    @Override // X.InterfaceC222698ob
    public final C2MA getViewHolderByAwemeId(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C222688oa.LIZ(this);
    }

    @Override // X.InterfaceC222708oc
    public final void n() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJ(this, str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
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

    @Override // X.InterfaceC222698ob
    public final void onDestroyView() {
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
    public final void onPausePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, IPH iph) {
        C222688oa.LJIILIIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, IPH iph) {
        C222688oa.LJIIZILJ(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg, IPH iph) {
        C222688oa.LJIJI(this, str, ipg, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C222688oa.LJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
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
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C222688oa.LJJIIZI(this, str, i, jSONObject);
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
    public final void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, IPH iph) {
        C222688oa.LJJIJL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C222688oa.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
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
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C222688oa.LJJJJLI(this, str, i, i2);
    }

    @Override // X.InterfaceC222698ob
    public final void r5(int i, int i2) {
    }

    @Override // X.InterfaceC222698ob
    public final void unBind() {
    }

    @Override // X.InterfaceC222708oc
    public final boolean Jk0() {
        if (this.LJLJJI.P7() == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC222708oc
    public final void LLJJIII() {
        this.LJLJJI.LLJJIII();
    }

    @Override // X.InterfaceC222708oc
    public final void LLLI() {
        if (this.LJLJJI.getSurface() != null && this.LJLJJI.d4()) {
            this.LJLJJI.LLLI();
        }
    }

    @Override // X.InterfaceC222708oc
    public final boolean d4() {
        return this.LJLJJI.d4();
    }

    @Override // X.InterfaceC222708oc
    public final Surface getSurface() {
        return this.LJLJJI.getSurface();
    }

    @Override // X.InterfaceC222708oc
    public final View getVideoView() {
        return this.LJLJJI.getView();
    }

    @Override // X.InterfaceC222698ob
    public final void onPagePause() {
        this.LJLJJI.onPagePause();
    }

    @Override // X.InterfaceC222708oc
    public final ViewGroup Dp() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC222698ob
    public final InterfaceC47247IgV getSurfaceHolder() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC222698ob
    public final void HM(EnumC215438ct mode) {
        o.LJIIIZ(mode, "mode");
    }

    @Override // X.InterfaceC222698ob
    public final void LJJIFFI(DataCenter dataCenter) {
        o.LJIIIZ(dataCenter, "dataCenter");
    }

    @Override // X.InterfaceC222698ob
    public final void N7(InterfaceC47667InH interfaceC47667InH) {
        this.LJLJJI.N7(interfaceC47667InH);
    }

    @Override // X.InterfaceC222698ob
    public final void O(boolean z) {
        this.LJLJJI.O(z);
    }

    @Override // X.InterfaceC222698ob
    public final void V3(boolean z) {
        this.LJLJJI.V3(z);
    }

    @Override // X.InterfaceC222708oc
    public final void eg(boolean z) {
        if (z) {
            this.LJLJJI.O7();
        } else {
            this.LJLJJI.Q7();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        C222688oa.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        C222688oa.LJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
        C222688oa.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        C222688oa.LJJIII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        C222688oa.LJJIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        C222688oa.LJJJ(this, iph);
    }

    @Override // X.InterfaceC222698ob
    public final void KJ(int i, String aid) {
        o.LJIIIZ(aid, "aid");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
        C222688oa.LIZJ(this, str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        C222688oa.LIZLLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
        C222688oa.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg) {
        C222688oa.LJIJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        C222688oa.LJJIIZ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        C222688oa.LJJIJLIJ(this, str, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        C222688oa.LJJJJIZL(this, str, z);
    }

    public C47245IgT(ViewGroup rootView, InterfaceC47667InH listener, C222588oQ params) {
        int i;
        int i2;
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(params, "params");
        this.LJLIL = rootView;
        this.LJLILLLLZI = listener;
        this.LJLJI = params;
        Context context = rootView.getContext();
        if (DZ3.LIZ && C79004UzY.LJJIJIIJI(context)) {
            this.LJLJJI = C47246IgU.LIZ(rootView, false, true, 0, 0);
            return;
        }
        String str = params.LJIIIZ;
        Object obj = Boolean.FALSE;
        try {
            obj = new AqS39S1000000_1(str, 4).invoke();
        } catch (Throwable unused) {
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (C00F.LIZ(31744, 0, "feed_player_reuse_surface_texture", true) == 1) {
            ViewGroup viewGroup = this.LJLIL;
            C47246IgU c47246IgU = new C47246IgU();
            IXN ixn = IXN.LIZJ;
            if (ixn.isUseSurfaceControl() && booleanValue) {
                c47246IgU.LJLIL = new C47680InU(viewGroup);
            } else if (ixn.isUseSurfaceView() && booleanValue) {
                c47246IgU.LJLIL = new SurfaceViewWrapper(0, 0, viewGroup);
            } else {
                C47246IgU.LIZIZ(true, c47246IgU, viewGroup);
            }
            c47246IgU.getView().setTag(c47246IgU);
            this.LJLJJI = c47246IgU;
            return;
        }
        BaseFeedPageParams baseFeedPageParams = this.LJLJI.LJ;
        if (baseFeedPageParams == null || (i2 = baseFeedPageParams.videoWidth) <= 0 || (i = baseFeedPageParams.videoHeight) <= 0) {
            i = 0;
            i2 = 0;
        }
        ViewGroup viewGroup2 = this.LJLIL;
        if (booleanValue) {
            Object value = IZ8.M0.getValue();
            o.LJIIIIZZ(value, "<get-enableSurfaceViewForOppoBlackDevices>(...)");
            if (((Boolean) value).booleanValue()) {
                if (C47246IgU.LJLILLLLZI == -1) {
                    C47246IgU.LJLILLLLZI = 0;
                    try {
                        if (((Integer) Class.forName("android.os.SystemProperties").getDeclaredMethod("getInt", String.class, Integer.TYPE).invoke(null, "ro.oplus.display.reset_two_pq_layer", -1)).intValue() == 1) {
                            C47246IgU.LJLILLLLZI = 1;
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (C47246IgU.LJLILLLLZI == 0) {
                    booleanValue = false;
                }
            }
        }
        this.LJLJJI = C47246IgU.LIZ(viewGroup2, booleanValue, false, i2, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        C222688oa.LIZIZ(this, str, j, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        C222688oa.LJJIFFI(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        C222688oa.LJJJJJ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        C222688oa.LJJJJL(this, str, enumC47177IfN, i);
    }
}
