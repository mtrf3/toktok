package com.ss.android.ugc.aweme.feed.adapter;

import X.ActivityC45651qj;
import X.C108814Ov;
import X.C174036sJ;
import X.C2067689o;
import X.C209108Io;
import X.C212428Vi;
import X.C221108m2;
import X.C222588oQ;
import X.C222688oa;
import X.C222718od;
import X.C2L4;
import X.C2MA;
import X.C2QN;
import X.C35168DrA;
import X.C55096Ljo;
import X.C56682Ki;
import X.C56742Ko;
import X.C60392Yp;
import X.C62822Ol8;
import X.C76965UIn;
import X.C78983UzD;
import X.C78996UzQ;
import X.C8K4;
import X.C8MQ;
import X.C8VR;
import X.C8W0;
import X.C91Z;
import X.C9K4;
import X.C9K6;
import X.EnumC47177IfN;
import X.IPG;
import X.IPH;
import X.IQE;
import X.IT4;
import X.ITW;
import X.InterfaceC213058Xt;
import X.InterfaceC214448bI;
import X.InterfaceC222698ob;
import X.InterfaceC55100Ljs;
import X.InterfaceC55219Lln;
import X.InterfaceC55235Lm3;
import X.OSZ;
import X.X1D;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemReusedContainer;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.interaction.FeedInteractionAreaContainer;
import com.ss.android.ugc.feed.platform.container.scope.CommonVideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS92S0300000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class VideoBaseCell extends AssemReusedContainer<VideoBaseCell, VideoItemParams> implements InterfaceC55219Lln, InterfaceC213058Xt<VideoBaseCell, VideoItemParams>, C91Z, C2L4 {
    public final C222588oQ LJLLILLLL;
    public VideoItemParams LJLLJ;
    public Aweme LJLLL;
    public int LJLLLL;
    public Fragment LJLLLLLL;
    public FeedVideoAssem LJLZ;
    public final FeedInteractionAreaContainer LJZ;
    public ReusedUIAssem<?> LJZI;

    @Override // X.C2MA
    public /* synthetic */ void A8() {
    }

    @Override // X.C2MA
    public /* synthetic */ void C7(View.OnTouchListener onTouchListener) {
    }

    @Override // X.C2MA
    public /* synthetic */ void D7(long j, long j2, long j3, long j4, int i, long j5, int i2) {
    }

    @Override // X.C2MA
    public /* synthetic */ boolean D8() {
        return false;
    }

    @Override // X.C2MA
    public /* synthetic */ void E8(int i, Aweme aweme) {
    }

    @Override // X.C2MA
    public /* synthetic */ void F8() {
    }

    @Override // X.C2MA
    public /* synthetic */ void G7(boolean z) {
    }

    public /* synthetic */ boolean Ho0() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean I8() {
        return false;
    }

    @Override // X.C2MA
    public /* synthetic */ void J7(boolean z, boolean z2) {
    }

    @Override // X.C2MA
    public /* synthetic */ void J8(int i) {
    }

    @Override // X.InterfaceC222708oc
    public /* synthetic */ boolean Jk0() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean K7() {
        return false;
    }

    @Override // X.C2MA
    public /* synthetic */ void L5(String str) {
    }

    @Override // X.C2MA
    public /* synthetic */ void L8(int i, String str) {
    }

    @Override // X.C2MA
    public /* synthetic */ void LIZJ() {
    }

    @Override // X.C2MA
    public /* synthetic */ void LJII(C56682Ki c56682Ki) {
    }

    public /* synthetic */ void LJIIJJI() {
    }

    @Override // X.InterfaceC57312Mt
    public /* synthetic */ void LJIILIIL() {
    }

    @Override // X.InterfaceC57312Mt
    public /* synthetic */ boolean LJIJI() {
        return false;
    }

    @Override // X.InterfaceC57312Mt
    public /* synthetic */ void LJJ() {
    }

    @Override // X.InterfaceC57312Mt
    public /* synthetic */ OSZ LJJIIJZLJL() {
        return null;
    }

    @Override // X.InterfaceC57312Mt
    public /* synthetic */ void LJJIJL(OSZ osz) {
    }

    @Override // X.InterfaceC57312Mt
    public /* synthetic */ void LJJJI() {
    }

    @Override // X.InterfaceC47667InH
    public /* synthetic */ void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC57312Mt
    public /* synthetic */ void LJJJJJL() {
    }

    public /* synthetic */ void LJLIIL(C8K4 c8k4) {
    }

    public abstract ReusedUIAssem<?> LJLJI();

    public int LJLJJLL() {
        return 3;
    }

    public /* synthetic */ View LJLJL(String str) {
        return null;
    }

    @Override // X.InterfaceC222708oc
    public final /* synthetic */ void LLJJIII() {
    }

    @Override // X.C2MA
    public /* synthetic */ InterfaceC222698ob LLJJIJIL() {
        return null;
    }

    @Override // X.InterfaceC222708oc
    public final /* synthetic */ void LLLI() {
    }

    @Override // X.C2MA
    public /* synthetic */ void N8(long j, long j2, int i, long j3, long j4, long j5, int i2) {
    }

    @Override // X.C2MA
    public /* synthetic */ void O7() {
    }

    @Override // X.C2MA
    public /* synthetic */ boolean O8() {
        return false;
    }

    @Override // X.C2MA
    public /* synthetic */ void P8(int i, String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean R7() {
        return false;
    }

    @Override // X.C2MA
    public /* synthetic */ boolean S7() {
        return false;
    }

    @Override // X.C2MA
    public /* synthetic */ void U8() {
    }

    @Override // X.C2MA
    public /* synthetic */ void V7(boolean z) {
    }

    @Override // X.C2MA
    public /* synthetic */ View V8(String str, boolean z) {
        return null;
    }

    public /* synthetic */ C2067689o X8() {
        return null;
    }

    @Override // X.C2MA
    public /* synthetic */ C2MA Y6() {
        return null;
    }

    @Override // X.C2MA
    public /* synthetic */ void Y7(C174036sJ c174036sJ) {
    }

    @Override // X.C2MA
    public /* synthetic */ boolean Y8() {
        return false;
    }

    public /* synthetic */ void Z6(C209108Io c209108Io) {
    }

    @Override // X.C2MA
    public /* synthetic */ void Z7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void Z8() {
    }

    @Override // X.C2MA
    public /* synthetic */ void a7(boolean z) {
    }

    @Override // X.C2MA
    public /* synthetic */ void a8() {
    }

    @Override // X.C2MA
    public /* synthetic */ void b7() {
    }

    @Override // X.C2MA
    public /* synthetic */ void b8(String str) {
    }

    @Override // X.C2MA
    public /* synthetic */ void c8(Aweme aweme) {
    }

    @Override // X.C2MA
    public /* synthetic */ void checkViewHolderState() {
    }

    @Override // X.C2MA
    public /* synthetic */ boolean d7() {
        return true;
    }

    @Override // X.C2MA
    public /* synthetic */ void d9() {
    }

    @Override // X.C2MA
    public /* synthetic */ boolean e7() {
        return false;
    }

    @Override // X.C2MA
    public /* synthetic */ void e8(int i, String str) {
    }

    @Override // X.C2MA
    public /* synthetic */ void e9(boolean z) {
    }

    @Override // X.C2MA
    public /* synthetic */ void f7(int i, int i2, String str, String str2) {
    }

    @Override // X.C2MA
    public /* synthetic */ void f8(String str) {
    }

    @Override // X.C2MA
    public /* synthetic */ boolean f9() {
        return false;
    }

    @Override // X.C2MA
    public /* synthetic */ void g7(Map map) {
    }

    public String gR() {
        return "cell_feed";
    }

    @Override // X.InterfaceC57312Mt
    public /* synthetic */ View getRootView() {
        return null;
    }

    @Override // X.C2MA
    public /* synthetic */ C2MA getViewHolderByAwemeId(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C222688oa.LIZ(this);
    }

    @Override // X.C2MA
    public /* synthetic */ boolean i7() {
        return true;
    }

    @Override // X.C2MA
    public final /* synthetic */ void j7() {
    }

    @Override // X.C2MA
    public /* synthetic */ void j8() {
    }

    @Override // X.C2MA
    public /* synthetic */ void m7(C108814Ov c108814Ov) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void n8(boolean z) {
    }

    @Override // X.C2MA
    public /* synthetic */ void o6(C2QN c2qn) {
    }

    @Override // X.C2MA
    public /* synthetic */ void o8(int i, String str, boolean z) {
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
    public /* synthetic */ void onBuffering(boolean z) {
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C222688oa.LJIIJ(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, ITW itw) {
        C222688oa.LJIIJJI(this, str, itw);
    }

    public /* synthetic */ void onPausePlay(String str) {
        C222688oa.LJIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, IPH iph) {
        C222688oa.LJIILIIL(this, str, iph);
    }

    public /* synthetic */ void onPlayCompleted(String str) {
        C222688oa.LJIILJJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C222688oa.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C222688oa.LJIILLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, IPH iph) {
        C222688oa.LJIIZILJ(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onPlayFailed(IPG ipg) {
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

    public /* synthetic */ void onPlayPrepare(String str) {
        C222688oa.LJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C222688oa.LJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onPlayProgressChange(float f) {
        C222688oa.LJJI(this, f);
    }

    public /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C222688oa.LJJIFFI(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C222688oa.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onPlayStop(String str) {
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
    public /* synthetic */ void onPlaying(String str) {
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

    public /* synthetic */ void onPreparePlay(String str) {
        C222688oa.LJJIJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, IPH iph) {
        C222688oa.LJJIJL(this, str, iph);
    }

    public /* synthetic */ void onRenderFirstFrame(IT4 it4) {
        C222688oa.LJJIL(this, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onRenderFirstFrame(String str, IT4 it4) {
        C222688oa.LJJIJLIJ(this, str, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C222688oa.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onRenderReady(IPH iph) {
        C222688oa.LJJJ(this, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onResumePlay(String str) {
        C222688oa.LJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onRetryOnError(IPG ipg) {
        C222688oa.LJJJJI(this, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, IPG ipg) {
        C222688oa.LJJJJ(this, str, ipg);
    }

    public /* synthetic */ void onSeekEnd(String str, boolean z) {
        C222688oa.LJJJJIZL(this, str, z);
    }

    public /* synthetic */ void onSeekStart(String str, int i, float f) {
        C222688oa.LJJJJJ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onSpeedChanged(String str, float f) {
        C222688oa.LJJJJJL(this, str, f);
    }

    @Override // X.InterfaceC47667InH
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        C222688oa.LJJJJL(this, str, enumC47177IfN, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C222688oa.LJJJJLI(this, str, i, i2);
    }

    @Override // X.C2MA
    public final /* synthetic */ void p8() {
    }

    @Override // X.C2MA
    public /* synthetic */ boolean q7() {
        return false;
    }

    @Override // X.C2MA
    public /* synthetic */ void r5(int i, int i2) {
    }

    @Override // X.C2MA
    public /* synthetic */ ImageView s7() {
        return null;
    }

    @Override // X.C2MA
    public /* synthetic */ void s8(boolean z, boolean z2) {
    }

    @Override // X.C2MA
    public /* synthetic */ boolean u7() {
        return true;
    }

    @Override // X.C2MA
    public /* synthetic */ void v7(boolean z) {
    }

    public /* synthetic */ void w8(boolean z) {
    }

    @Override // X.C2MA
    public /* synthetic */ void x7(float f, float f2, int i) {
    }

    @Override // X.C2MA
    public /* synthetic */ void x8(String str) {
    }

    @Override // X.C2MA
    public /* synthetic */ void y8(int i, String str, String str2) {
    }

    @Override // X.C2MA
    public /* synthetic */ View.OnTouchListener z() {
        return null;
    }

    @Override // X.C8VZ
    public final LifecycleOwner GW() {
        return this.LJLLILLLL.LIZJ;
    }

    @Override // X.C91Z
    public final Fragment Ks0() {
        return this.LJLLILLLL.LIZJ;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public final LifecycleOwner LJJLI() {
        return this.LJLLILLLL.LIZJ;
    }

    public void LJLJJL() {
        if (this.LJLZ != null) {
            return;
        }
        this.LJLZ = new FeedVideoAssem(this.LJLLILLLL.LJ, C222718od.LJLIL, LJLJJLL(), null);
    }

    @Override // X.C8VZ
    public final ActivityC45651qj getActivity() {
        return this.LJLLILLLL.LIZJ.mo49getActivity();
    }

    @Override // X.C8VZ
    public final View getContainerView() {
        return this.LJLLILLLL.LIZ;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        InterfaceC55100Ljs interfaceC55100Ljs = this.LJLLILLLL.LJIIL;
        if (interfaceC55100Ljs != null) {
            return C55096Ljo.LJIJ(interfaceC55100Ljs);
        }
        return null;
    }

    @Override // X.C2L4
    public List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(CommonVideoCellScope.class);
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return new ViewModelStore();
    }

    public Aweme O1() {
        return getAweme();
    }

    @Override // X.C2MA, X.InterfaceC54061LJp
    public Aweme getCurrentAweme() {
        return getAweme();
    }

    @Override // X.C2MA
    public IQE I7() {
        return IQE.INITIALIZED;
    }

    public void unBind() {
        LJLIIIL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoBaseCell(C222588oQ params) {
        super(params.LJIILL);
        Lifecycle.State state;
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        o.LJIIIZ(params, "params");
        this.LJLLILLLL = params;
        View view = params.LIZ;
        try {
            ReusedUIAssem<?> LJLJI = LJLJI();
            LJJLL(LJLJI, view, this);
            this.LJZI = LJLJI;
            FeedInteractionAreaContainer.LLI.getClass();
            FeedInteractionAreaContainer feedInteractionAreaContainer = new FeedInteractionAreaContainer();
            View findViewById = params.LIZ.findViewById(R.id.niu);
            o.LJIIIIZZ(findViewById, "params.view.findViewById(R.id.widget_container)");
            feedInteractionAreaContainer.LL = findViewById;
            BaseFeedPageParams baseFeedPageParams = params.LJ;
            o.LJIIIZ(baseFeedPageParams, "<set-?>");
            feedInteractionAreaContainer.LLD = baseFeedPageParams;
            feedInteractionAreaContainer.setParent(this);
            this.LJZ = feedInteractionAreaContainer;
        } catch (Exception e) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Assem.Supervisor==null >>>eventType:");
                LIZ.append(this.LJLLILLLL.LJIIIZ);
                LIZ.append(", activity state:");
                ActivityC45651qj activity = getActivity();
                Lifecycle.State state2 = null;
                if (activity != null && (lifecycle2 = activity.getLifecycle()) != null) {
                    state = lifecycle2.getCurrentState();
                } else {
                    state = null;
                }
                LIZ.append(state);
                LIZ.append(",paren state:");
                Fragment fragment = this.LJLLILLLL.LIZJ;
                if (fragment != null && (lifecycle = fragment.getLifecycle()) != null) {
                    state2 = lifecycle.getCurrentState();
                }
                LIZ.append(state2);
                LIZ.append(",activity:");
                LIZ.append(getActivity());
                LIZ.append(", fragment:");
                LIZ.append(this.LJLLILLLL.LIZJ);
                LIZ.append(' ');
                System.out.println((Object) X1D.LIZIZ(LIZ));
            } catch (Exception unused) {
            }
            throw e;
        }
    }

    @Override // X.C2MA
    public void B8(boolean z) {
        LJJIJIIJIL(2);
    }

    public void LIZLLL(Aweme aweme) {
        if (C35168DrA.LIZ()) {
            C9K4 c9k4 = C9K4.LIZ;
            C56742Ko c56742Ko = new C56742Ko();
            c56742Ko.LIZ("VideoBaseCell.bindData", "source");
            C9K4.LJ(c9k4, c56742Ko.LIZ, C78996UzQ.LJIIL(aweme), C9K6.BIND_DATA, 24);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bind pos:");
        LIZ.append(this.LJLLLL);
        C60392Yp.LIZIZ("LFeedView", X1D.LIZIZ(LIZ));
    }

    public final void LJLIL(int i) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList2;
        ReusedUIAssem<?> reusedUIAssem = this.LJZI;
        if (reusedUIAssem instanceof RootCellComponent) {
            o.LJII(reusedUIAssem, "null cannot be cast to non-null type com.ss.android.ugc.feed.platform.cell.RootCellComponent");
            Aweme aweme = this.LJLLL;
            AssemSupervisor LIZJ = C212428Vi.LIZJ(reusedUIAssem);
            if (LIZJ != null && (copyOnWriteArrayList2 = LIZJ.LJLLI) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<C8W0> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    C8W0 next = it.next();
                    if (next instanceof C8MQ) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((C8MQ) it2.next()).v0(i, aweme);
                }
            }
            AssemSupervisor LIZJ2 = C212428Vi.LIZJ(reusedUIAssem);
            if (LIZJ2 != null && (copyOnWriteArrayList = LIZJ2.LJLLI) != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<C8W0> it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    C8W0 next2 = it3.next();
                    if (next2 instanceof BaseContainer) {
                        arrayList2.add(next2);
                    }
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    ((BaseContainer) it4.next()).b4(i, aweme);
                }
            }
        }
    }

    @Override // X.C2MA
    public void k7(View view) {
        LJLJJL();
        ReusedUIAssem<?> reusedUIAssem = this.LJZI;
        if (reusedUIAssem != null) {
            C8VR.LIZ(reusedUIAssem, new AqS107S0300000_3((ReusedUIAssem) reusedUIAssem, (ReusedUIAssem<?>) this, (VideoBaseCell) view, (View) 10));
            AssemSupervisor LIZJ = C212428Vi.LIZJ(reusedUIAssem);
            C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS92S0300000_3(this, (VideoBaseCell) reusedUIAssem, (ReusedUIAssem<?>) LIZJ, (AssemSupervisor) 3));
            if (LIZJ != null && reusedUIAssem.getParent().getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                try {
                    this.LJZ.e4();
                    return;
                } catch (Exception e) {
                    System.out.println(LIZIZ.getValue());
                    throw e;
                }
            }
            C78983UzD.LJIILL((String) LIZIZ.getValue());
        }
    }

    public void l8(int i) {
        if (C35168DrA.LIZ()) {
            C9K4 c9k4 = C9K4.LIZ;
            C56742Ko c56742Ko = new C56742Ko();
            c56742Ko.LIZ("VideoBaseCell.onViewHolderSelected", "source");
            C9K4.LJ(c9k4, c56742Ko.LIZ, C78996UzQ.LJIIL(getAweme()), C9K6.PAGE_SELECTED, 24);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onViewHolderSelected:");
        LIZ.append(i);
        C60392Yp.LIZIZ("LFeedView", X1D.LIZIZ(LIZ));
    }

    public final void LJLJLLL(int i, VideoItemParams videoItemParams) {
        InterfaceC214448bI cq0;
        Set<AssemViewModel<?>> LIZ;
        FeedBaseHolderViewModel feedBaseHolderViewModel;
        LJLIL(i);
        this.LJZ.b4(i, this.LJLLL);
        LJJZ(i, videoItemParams);
        if (videoItemParams != null && (cq0 = cq0()) != null && (LIZ = cq0.LIZ()) != null) {
            for (AssemViewModel<?> assemViewModel : LIZ) {
                if ((assemViewModel instanceof FeedBaseHolderViewModel) && (feedBaseHolderViewModel = (FeedBaseHolderViewModel) assemViewModel) != null) {
                    feedBaseHolderViewModel.gv0(videoItemParams);
                }
            }
        }
    }

    @Override // X.C2MA
    public void LLLZ(int i, Aweme aweme) {
        LIZLLL(aweme);
    }
}
