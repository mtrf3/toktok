package com.ss.android.ugc.aweme.story.feed.common.newarch;

import X.ActivityC45651qj;
import X.AnonymousClass901;
import X.C107794Kx;
import X.C108814Ov;
import X.C174036sJ;
import X.C187227Wk;
import X.C2067689o;
import X.C209108Io;
import X.C221108m2;
import X.C222588oQ;
import X.C222688oa;
import X.C232629Ba;
import X.C2L4;
import X.C2MA;
import X.C2QN;
import X.C30581Hy;
import X.C50420Jqa;
import X.C55096Ljo;
import X.C56682Ki;
import X.C62822Ol8;
import X.C76965UIn;
import X.C8NX;
import X.C8RL;
import X.C8VV;
import X.C9BZ;
import X.EnumC47177IfN;
import X.IPG;
import X.IPH;
import X.IQE;
import X.IT4;
import X.ITW;
import X.InterfaceC212878Xb;
import X.InterfaceC212998Xn;
import X.InterfaceC213058Xt;
import X.InterfaceC222598oR;
import X.InterfaceC222698ob;
import X.InterfaceC222708oc;
import X.InterfaceC47247IgV;
import X.InterfaceC55100Ljs;
import X.InterfaceC55235Lm3;
import X.InterfaceC57312Mt;
import X.OSZ;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryRootCellComponent;
import com.ss.android.ugc.feed.platform.container.scope.CommonVideoCellScope;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class BaseStoryViewHolder<R extends InterfaceC212998Xn<R, ITEM>, ITEM extends C8RL> extends AssemReusedContainer<R, ITEM> implements InterfaceC222598oR, InterfaceC213058Xt<R, ITEM>, ViewModelStoreOwner, C2L4 {
    public final C222588oQ LJLLILLLL;
    public final ActivityC45651qj LJLLJ;
    public final View LJLLL;
    public final Fragment LJLLLL;
    public final InterfaceC55235Lm3 LJLLLLLL;
    public final Fragment LJLZ;
    public Aweme LJZ;
    public int LJZI;
    public final StoryRootCellComponent LJZL;
    public boolean LL;
    public boolean LLD;
    public final C62822Ol8 LLF;
    public ReusedUIAssem<?> LLFF;

    @Override // X.C2MA
    public final void A7(String str, String str2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void A8() {
    }

    @Override // X.C2MA
    public final void B7() {
    }

    @Override // X.C2MA
    public /* synthetic */ void C7(View.OnTouchListener onTouchListener) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void D7(long j, long j2, long j3, long j4, int i, long j5, int i2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean D8() {
        return false;
    }

    @Override // X.InterfaceC222598oR, X.InterfaceC222708oc
    public void F5() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void F8() {
    }

    @Override // X.InterfaceC222708oc
    public final void G60(int i) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void G7(boolean z) {
    }

    @Override // X.C2MA
    public final void H8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean I8() {
        return false;
    }

    @Override // X.InterfaceC222598oR, X.InterfaceC57312Mt
    public void J3() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void J7(boolean z, boolean z2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void J8(int i) {
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

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void LIZJ() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void LJII(C56682Ki c56682Ki) {
    }

    @Override // X.C2MA, X.InterfaceC54061LJp
    public final InterfaceC57312Mt LJIIIIZZ() {
        return this;
    }

    @Override // X.C2MA
    public final /* synthetic */ void LJIIJJI() {
    }

    @Override // X.InterfaceC57312Mt
    public final /* synthetic */ void LJIILIIL() {
    }

    @Override // X.InterfaceC57312Mt
    public final void LJIJ() {
    }

    @Override // X.InterfaceC57312Mt
    public final /* synthetic */ boolean LJIJI() {
        return false;
    }

    @Override // X.InterfaceC57312Mt
    public final /* synthetic */ void LJJ() {
    }

    @Override // X.InterfaceC57312Mt
    public final /* synthetic */ OSZ LJJIIJZLJL() {
        return null;
    }

    @Override // X.InterfaceC57312Mt
    public final void LJJIJL(OSZ<Boolean, String> osz) {
    }

    @Override // X.InterfaceC57312Mt
    public final /* synthetic */ void LJJJI() {
    }

    @Override // X.InterfaceC57312Mt
    public final void LJJJIL() {
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void LJJJJ(int i, int i2) {
    }

    @Override // X.InterfaceC57312Mt
    public final void LJJJJIZL() {
    }

    @Override // X.InterfaceC57312Mt
    public final /* synthetic */ void LJJJJJL() {
    }

    @Override // X.InterfaceC57312Mt
    public final void LJJJLL(Aweme aweme) {
    }

    public abstract VideoItemParams LJLIIL(Aweme aweme);

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

    @Override // X.InterfaceC222598oR, X.C2MA
    public InterfaceC222708oc LLLJ() {
        return this;
    }

    @Override // X.C2MA
    public final /* synthetic */ void N8(long j, long j2, int i, long j3, long j4, long j5, int i2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean O8() {
        return false;
    }

    @Override // X.C2MA
    public final void P7(C9BZ c9bz) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void P8(int i, String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean R7() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean S7() {
        return false;
    }

    @Override // X.C2MA
    public final void T7(C187227Wk c187227Wk) {
    }

    @Override // X.C2MA
    public final void U7(C232629Ba c232629Ba) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void U8() {
    }

    @Override // X.InterfaceC222708oc
    public int UU() {
        return 1;
    }

    @Override // X.C2MA
    public final /* synthetic */ View V8(String str, boolean z) {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ C2067689o X8() {
        return null;
    }

    @Override // X.InterfaceC222708oc
    public void Y2(Aweme aweme) {
    }

    @Override // X.C2MA
    public /* synthetic */ C2MA Y6() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ void Y7(C174036sJ c174036sJ) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean Y8() {
        return false;
    }

    @Override // X.C2MA
    public final void Z1(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void Z6(C209108Io c209108Io) {
    }

    @Override // X.C2MA
    public /* synthetic */ void Z7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void Z8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void a7(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void a8() {
    }

    @Override // X.C2MA
    public final void b2(boolean z) {
    }

    @Override // X.C2MA
    public /* synthetic */ void b8(String str) {
    }

    @Override // X.C2MA
    public final void c2(long j) {
    }

    @Override // X.C2MA
    public final void c7() {
    }

    @Override // X.InterfaceC222598oR, X.C2MA
    public void c9(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void checkViewHolderState() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean d7() {
        return true;
    }

    @Override // X.C2MA
    public final void d8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void d9() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean e7() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void e8(int i, String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void e9(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void f7(int i, int i2, String str, String str2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void f8(String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean f9() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void g7(Map map) {
    }

    @Override // X.InterfaceC57312Mt
    public final /* synthetic */ View getRootView() {
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
    public final void h7(int i, long j) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean i7() {
        return true;
    }

    @Override // X.C2MA
    public AnonymousClass901 j3() {
        return null;
    }

    @Override // X.InterfaceC222598oR, X.C2MA
    public void j5(C107794Kx c107794Kx) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void j7() {
    }

    @Override // X.C2MA
    public /* synthetic */ void j8() {
    }

    @Override // X.InterfaceC222598oR, X.C2MA
    public void m6(Aweme aweme) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void m7(C108814Ov c108814Ov) {
    }

    @Override // X.InterfaceC222598oR, X.InterfaceC222708oc
    public void n() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void n8(boolean z) {
    }

    @Override // X.InterfaceC222598oR, X.InterfaceC57312Mt
    public void o2() {
    }

    @Override // X.C2MA
    public final void o6(C2QN c2qn) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void o8(int i, String str, boolean z) {
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
    public /* synthetic */ void onBuffering(String str, boolean z) {
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

    @Override // X.C2MA
    public final void onPageSelected(int i) {
    }

    @Override // X.C2MA
    public final void onPause() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onPausePlay(String str) {
        C222688oa.LJIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, IPH iph) {
        C222688oa.LJIILIIL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
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
    public /* synthetic */ void onPlayFailed(String str, IPG ipg) {
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
    public /* synthetic */ void onPlayProgressChange(float f) {
        C222688oa.LJJI(this, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
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
    public /* synthetic */ void onPreparePlay(String str) {
        C222688oa.LJJIJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onPreparePlay(String str, IPH iph) {
        C222688oa.LJJIJL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
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

    @Override // X.C2MA
    public final void onResume() {
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
    public final /* synthetic */ void onRetryOnError(IPG ipg) {
        C222688oa.LJJJJI(this, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, IPG ipg) {
        C222688oa.LJJJJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onSeekEnd(String str, boolean z) {
        C222688oa.LJJJJIZL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        C222688oa.LJJJJJ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onSpeedChanged(String str, float f) {
        C222688oa.LJJJJJL(this, str, f);
    }

    @Override // X.InterfaceC47667InH
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
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
    public final /* synthetic */ void r5(int i, int i2) {
    }

    @Override // X.C2MA
    public /* synthetic */ ImageView s7() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ void s8(boolean z, boolean z2) {
    }

    @Override // X.C2MA
    public final void t8() {
    }

    @Override // X.C2MA
    public /* synthetic */ boolean u7() {
        return true;
    }

    @Override // X.C2MA
    public final void u8(boolean z, boolean z2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void v7(boolean z) {
    }

    @Override // X.C2MA
    public void w1() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void w8(boolean z) {
    }

    @Override // X.C2MA
    public /* synthetic */ void x7(float f, float f2, int i) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void x8(String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void y8(int i, String str, String str2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ View.OnTouchListener z() {
        return null;
    }

    @Override // X.C2MA
    public final int getAwemeType() {
        Aweme aweme = this.LJZ;
        if (aweme != null) {
            return aweme.getAwemeType();
        }
        return 0;
    }

    public final Context getContext() {
        Context context = this.LJLLILLLL.LIZ.getContext();
        o.LJIIIIZZ(context, "producerParams.view.context");
        return context;
    }

    public List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(CommonVideoCellScope.class);
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return new ViewModelStore();
    }

    @Override // X.InterfaceC222598oR, X.C2MA
    public void onDestroyView() {
        StoryRootCellComponent storyRootCellComponent = this.LJZL;
        if (storyRootCellComponent != null) {
            storyRootCellComponent.onDestroyView();
        }
        InterfaceC222698ob LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL != null) {
            LLJJIJIL.onDestroyView();
        }
    }

    @Override // X.InterfaceC222708oc
    public final ViewGroup Dp() {
        InterfaceC222698ob LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL != null) {
            return LLJJIJIL.Dp();
        }
        return null;
    }

    @Override // X.InterfaceC222708oc
    public boolean Jk0() {
        InterfaceC222698ob LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL != null) {
            return LLJJIJIL.Jk0();
        }
        return false;
    }

    @Override // X.C2MA
    public Aweme O1() {
        return getAweme();
    }

    @Override // X.C2MA
    public void O7() {
        InterfaceC222698ob LLJJIJIL;
        InterfaceC222698ob LLJJIJIL2 = LLJJIJIL();
        if (LLJJIJIL2 != null && LLJJIJIL2.Jk0() && (LLJJIJIL = LLJJIJIL()) != null) {
            LLJJIJIL.V3(true);
        }
    }

    @Override // X.C2MA
    public final void b7() {
        InterfaceC222698ob LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL != null) {
            LLJJIJIL.onPagePause();
        }
    }

    @Override // X.InterfaceC222708oc
    public final boolean d4() {
        InterfaceC222698ob LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL == null || !LLJJIJIL.d4()) {
            return false;
        }
        return true;
    }

    @Override // X.C2MA, X.InterfaceC54061LJp
    public Aweme getCurrentAweme() {
        return getAweme();
    }

    @Override // X.InterfaceC222708oc
    public final Surface getSurface() {
        InterfaceC222698ob LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL != null) {
            return LLJJIJIL.getSurface();
        }
        return null;
    }

    @Override // X.InterfaceC222708oc
    public final View getVideoView() {
        InterfaceC222698ob LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL != null) {
            return LLJJIJIL.getVideoView();
        }
        return null;
    }

    @Override // X.C2MA
    public void unBind() {
        LJLIIIL();
        StoryRootCellComponent storyRootCellComponent = this.LJZL;
        if (storyRootCellComponent != null) {
            storyRootCellComponent.LJJJJ();
        }
        eg(false);
    }

    @Override // X.C8VZ
    public final LifecycleOwner GW() {
        return this.LJLLLL;
    }

    @Override // X.C2MA
    public final IQE I7() {
        return IQE.INITIALIZED;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public final LifecycleOwner LJJLI() {
        return this.LJLZ;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.C8XZ
    public final ReusedUIAssem<?> Yz() {
        return this.LLFF;
    }

    @Override // X.C8VZ
    public final ActivityC45651qj getActivity() {
        return this.LJLLJ;
    }

    @Override // X.C2MA
    public Aweme getAweme() {
        return this.LJZ;
    }

    @Override // X.C8VZ
    public final View getContainerView() {
        return this.LJLLL;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        return this.LJLLLLLL;
    }

    @Override // X.C2MA
    public final void B8(boolean z) {
        LJJIJIIJIL(2);
    }

    @Override // X.C2MA
    public void LIZLLL(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        this.LJZ = aweme;
        InterfaceC222698ob LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL != null) {
            LLJJIJIL.N7(this);
        }
        LJJZ(this.LJZI, LJLIIL(aweme));
    }

    @Override // X.C2MA
    public void LJJIII(int i) {
        StoryRootCellComponent storyRootCellComponent = this.LJZL;
        if (storyRootCellComponent != null) {
            storyRootCellComponent.LJJIII(i);
        }
    }

    @Override // X.C2MA
    public void LJJIJIIJIL(int i) {
        StoryRootCellComponent storyRootCellComponent = this.LJZL;
        if (storyRootCellComponent != null) {
            storyRootCellComponent.LJJIJIIJIL(i);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public final void LJL(ReusedUIAssem<?> reusedUIAssem) {
        this.LLFF = reusedUIAssem;
    }

    @Override // X.C2MA
    public final void Q7(String enterMethodValue) {
        o.LJIIIZ(enterMethodValue, "enterMethodValue");
    }

    @Override // X.C2MA
    public final void V7(boolean z) {
        InterfaceC222698ob LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL != null) {
            LLJJIJIL.O(z);
        }
    }

    @Override // X.C2MA
    public void c8(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        this.LJZ = aweme;
        InterfaceC222698ob LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL != null) {
            LLJJIJIL.N7(this);
        }
    }

    @Override // X.InterfaceC222708oc
    public final void eg(boolean z) {
        InterfaceC47247IgV surfaceHolder;
        InterfaceC47247IgV surfaceHolder2;
        this.LLD = z;
        if (z) {
            InterfaceC222698ob LLJJIJIL = LLJJIJIL();
            if (LLJJIJIL != null && (surfaceHolder2 = LLJJIJIL.getSurfaceHolder()) != null) {
                surfaceHolder2.O7();
                return;
            }
            return;
        }
        InterfaceC222698ob LLJJIJIL2 = LLJJIJIL();
        if (LLJJIJIL2 == null || (surfaceHolder = LLJJIJIL2.getSurfaceHolder()) == null) {
            return;
        }
        surfaceHolder.Q7();
    }

    @Override // X.C2MA
    public void k7(View view) {
        o.LJIIIZ(view, "view");
        C8VV.LJ(this, new AqS169S0100000_3((BaseStoryViewHolder) this, 427));
        ReusedUIAssem<?> reusedUIAssem = this.LLFF;
        if (reusedUIAssem != null) {
            LJJLL(reusedUIAssem, view, this);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.C2MA
    public void l8(int i) {
        InterfaceC222698ob LLJJIJIL;
        InterfaceC47247IgV surfaceHolder;
        InterfaceC222698ob LLJJIJIL2;
        this.LL = true;
        this.LJZI = i;
        InterfaceC222698ob LLJJIJIL3 = LLJJIJIL();
        if (LLJJIJIL3 != null && LLJJIJIL3.Jk0() && (LLJJIJIL2 = LLJJIJIL()) != null) {
            LLJJIJIL2.V3(true);
        }
        StoryRootCellComponent storyRootCellComponent = this.LJZL;
        if (storyRootCellComponent != null) {
            storyRootCellComponent.B2(i, getAweme());
        }
        String str = this.LJLLILLLL.LJ.eventType;
        if (str == null) {
            str = "";
        }
        if (C30581Hy.LJIL(str)) {
            if (this.LLD && (LLJJIJIL = LLJJIJIL()) != null && (surfaceHolder = LLJJIJIL.getSurfaceHolder()) != null) {
                surfaceHolder.resume();
            }
            this.LLD = false;
        }
    }

    @Override // X.C2MA
    public void t7(boolean z) {
        InterfaceC222698ob LLJJIJIL;
        this.LL = false;
        InterfaceC222698ob LLJJIJIL2 = LLJJIJIL();
        if (LLJJIJIL2 != null && LLJJIJIL2.Jk0() && (LLJJIJIL = LLJJIJIL()) != null) {
            LLJJIJIL.V3(false);
        }
        StoryRootCellComponent storyRootCellComponent = this.LJZL;
        if (storyRootCellComponent != null) {
            storyRootCellComponent.LLIILZL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseStoryViewHolder(C222588oQ producerParams, InterfaceC212878Xb<R, ITEM> interfaceC212878Xb) {
        super(interfaceC212878Xb);
        InterfaceC55235Lm3 interfaceC55235Lm3;
        o.LJIIIZ(producerParams, "producerParams");
        this.LJLLILLLL = producerParams;
        this.LJLLJ = producerParams.LIZJ.mo49getActivity();
        this.LJLLL = producerParams.LIZ;
        this.LJLLLL = producerParams.LIZJ;
        InterfaceC55100Ljs interfaceC55100Ljs = producerParams.LJIIL;
        if (interfaceC55100Ljs != null) {
            interfaceC55235Lm3 = C55096Ljo.LJIJ(interfaceC55100Ljs);
        } else {
            interfaceC55235Lm3 = null;
        }
        this.LJLLLLLL = interfaceC55235Lm3;
        this.LJLZ = producerParams.LIZJ;
        this.LJZI = -1;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS153S0100000_3((BaseStoryViewHolder) this, 872));
        this.LLF = LIZIZ;
        StoryRootCellComponent storyRootCellComponent = new StoryRootCellComponent((C8NX) LIZIZ.getValue());
        this.LJZL = storyRootCellComponent;
        this.LLFF = storyRootCellComponent;
    }

    @Override // X.C2MA
    public void E8(int i, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        this.LJZ = aweme;
        this.LJZI = i;
        LJJZ(i, LJLIIL(aweme));
        StoryRootCellComponent storyRootCellComponent = this.LJZL;
        if (storyRootCellComponent != null) {
            storyRootCellComponent.E1();
        }
    }

    @Override // X.InterfaceC47667InH
    public void LJJL(int i, int i2) {
        InterfaceC222698ob LLJJIJIL;
        InterfaceC222698ob LLJJIJIL2 = LLJJIJIL();
        if (LLJJIJIL2 != null && LLJJIJIL2.Jk0() && (LLJJIJIL = LLJJIJIL()) != null) {
            LLJJIJIL.V3(this.LL);
        }
        this.LJLLILLLL.LIZIZ.onInternalEvent(new C50420Jqa(0, getAweme()));
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public final void LJJZ(int i, ITEM item) {
        StoryRootCellComponent storyRootCellComponent = this.LJZL;
        if (storyRootCellComponent != null) {
            storyRootCellComponent.v0(i, getAweme());
        }
        super.LJJZ(i, item);
    }

    @Override // X.C2MA
    public final void LLLZ(int i, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        this.LJZI = i;
        LIZLLL(aweme);
    }
}
