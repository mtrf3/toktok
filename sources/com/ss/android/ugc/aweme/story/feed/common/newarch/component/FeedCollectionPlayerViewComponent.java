package com.ss.android.ugc.aweme.story.feed.common.newarch.component;

import X.C221138m5;
import X.C222688oa;
import X.C2K0;
import X.C2MA;
import X.C55096Ljo;
import X.EnumC215438ct;
import X.EnumC47177IfN;
import X.IPG;
import X.IPH;
import X.IT4;
import X.ITW;
import X.InterfaceC222698ob;
import X.InterfaceC47247IgV;
import X.InterfaceC47667InH;
import X.KR8;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionPlayerViewAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.feed.platform.cell.component.playerview.CellPlayerViewComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class FeedCollectionPlayerViewComponent extends CellPlayerViewComponent implements InterfaceC222698ob, FeedCollectionPlayerViewAbility {
    public final C221138m5 LLD;
    public final C221138m5 LLF;

    @Override // X.InterfaceC222708oc
    public final void F5() {
    }

    @Override // X.InterfaceC222708oc
    public final void G60(int i) {
    }

    @Override // X.InterfaceC222728oe
    public final void LLIIIILZ(OnUIPlayListener onUIPlayListener) {
    }

    @Override // X.InterfaceC222708oc
    public final /* synthetic */ void LLJJIII() {
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionPlayerViewAbility
    public final InterfaceC222698ob LLJJIJIL() {
        return this;
    }

    @Override // X.InterfaceC222708oc
    public final /* synthetic */ void LLLI() {
    }

    @Override // X.InterfaceC222698ob
    public final void LLLZ(int i, Aweme aweme) {
    }

    @Override // X.InterfaceC222698ob
    public final void Qg0(int i) {
    }

    @Override // X.InterfaceC222708oc
    public final int UU() {
        return 3;
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

    @Override // com.ss.android.ugc.feed.platform.cell.component.playerview.CellPlayerViewComponent
    /* renamed from: b4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
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
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJIIIIZZ(this, str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C222688oa.LJIIIZ(this, z);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void onDestroyView() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C222688oa.LJIIJ(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, ITW itw) {
        C222688oa.LJIIJJI(this, str, itw);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str) {
        C222688oa.LJIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, IPH iph) {
        C222688oa.LJIILIIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str) {
        C222688oa.LJIILJJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C222688oa.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C222688oa.LJIILLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, IPH iph) {
        C222688oa.LJIIZILJ(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(IPG ipg) {
        C222688oa.LJIJJ(this, ipg);
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
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C222688oa.LJJI(this, f);
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
    public final /* synthetic */ void onPreparePlay(String str) {
        C222688oa.LJJIJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, IPH iph) {
        C222688oa.LJJIJL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(IT4 it4) {
        C222688oa.LJJIL(this, it4);
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
    public final /* synthetic */ void onResumePlay(String str) {
        C222688oa.LJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
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

    @Override // com.ss.android.ugc.feed.platform.cell.component.playerview.CellPlayerViewComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.playerview.CellPlayerViewComponent, X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1516453084) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC222698ob
    public final void r5(int i, int i2) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8XO
    public final void unBind() {
    }

    public FeedCollectionPlayerViewComponent() {
        new LinkedHashMap();
        this.LLD = KR8.LJIIJJI(new AqS153S0100000_3(this, 888));
        this.LLF = KR8.LJIIJJI(new AqS153S0100000_3(this, 887));
    }

    public final InterfaceC222698ob c4() {
        C2MA curViewHolder;
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) this.LLD.getValue();
        if (feedCollectionViewPagerAbility != null && (curViewHolder = feedCollectionViewPagerAbility.getCurViewHolder()) != null) {
            return curViewHolder.LLJJIJIL();
        }
        return null;
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
    public final boolean Jk0() {
        InterfaceC222698ob c4 = c4();
        if (c4 != null) {
            return c4.Jk0();
        }
        return false;
    }

    @Override // X.InterfaceC222708oc
    public final boolean d4() {
        InterfaceC222698ob c4 = c4();
        if (c4 != null) {
            return c4.d4();
        }
        return false;
    }

    @Override // X.InterfaceC222708oc
    public final Surface getSurface() {
        InterfaceC222698ob c4 = c4();
        if (c4 != null) {
            return c4.getSurface();
        }
        return null;
    }

    @Override // X.InterfaceC222698ob
    public final InterfaceC47247IgV getSurfaceHolder() {
        InterfaceC222698ob c4 = c4();
        if (c4 != null) {
            return c4.getSurfaceHolder();
        }
        return null;
    }

    @Override // X.InterfaceC222708oc
    public final View getVideoView() {
        InterfaceC222698ob c4 = c4();
        if (c4 != null) {
            return c4.getVideoView();
        }
        return null;
    }

    @Override // X.InterfaceC222698ob
    public final void onPagePause() {
        InterfaceC222698ob c4 = c4();
        if (c4 != null) {
            c4.onPagePause();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.playerview.CellPlayerViewComponent, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
        CommonCellAbility commonCellAbility = (CommonCellAbility) this.LLF.getValue();
        if (commonCellAbility != null) {
            commonCellAbility.t70(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.playerview.CellPlayerViewComponent, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
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
        InterfaceC222698ob c4 = c4();
        if (c4 != null) {
            c4.N7(interfaceC47667InH);
        }
    }

    @Override // X.InterfaceC222698ob
    public final void O(boolean z) {
        InterfaceC222698ob c4 = c4();
        if (c4 != null) {
            c4.O(z);
        }
    }

    @Override // X.InterfaceC222698ob
    public final void V3(boolean z) {
        InterfaceC222698ob c4 = c4();
        if (c4 != null) {
            c4.V3(z);
        }
    }

    @Override // X.InterfaceC222708oc
    public final void eg(boolean z) {
        InterfaceC222698ob c4 = c4();
        if (c4 != null) {
            c4.eg(z);
        }
    }

    @Override // X.InterfaceC222698ob
    public final void KJ(int i, String aid) {
        o.LJIIIZ(aid, "aid");
    }
}
