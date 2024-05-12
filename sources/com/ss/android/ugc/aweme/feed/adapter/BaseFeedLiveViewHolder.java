package com.ss.android.ugc.aweme.feed.adapter;

import X.AnonymousClass901;
import X.C107794Kx;
import X.C108814Ov;
import X.C174036sJ;
import X.C187227Wk;
import X.C2067689o;
import X.C209108Io;
import X.C222688oa;
import X.C2305392z;
import X.C232629Ba;
import X.C27740Aue;
import X.C2MA;
import X.C2NL;
import X.C2QN;
import X.C2U8;
import X.C35214Dru;
import X.C35810E3q;
import X.C36531EVj;
import X.C56682Ki;
import X.C9BZ;
import X.C9CI;
import X.EnumC47177IfN;
import X.FIK;
import X.IPG;
import X.IPH;
import X.IQE;
import X.IT4;
import X.ITW;
import X.InterfaceC222408o8;
import X.InterfaceC222698ob;
import X.InterfaceC222708oc;
import X.InterfaceC55219Lln;
import X.InterfaceC56362Jc;
import X.InterfaceC57312Mt;
import X.OJM;
import X.UW2;
import android.content.Context;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.experiment.PreloadWidgetsData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class BaseFeedLiveViewHolder extends LiveRecyclableWidget implements C2MA, InterfaceC222708oc, InterfaceC222408o8, InterfaceC56362Jc {
    public final Fragment LJLIL;
    public final Context LJLILLLLZI;
    public Aweme LJLJI;
    public LiveRoomStruct LJLJJI;
    public double LJLJJL;

    @Override // X.C2MA
    public final void A7(String str, String str2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void A8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void C7(View.OnTouchListener onTouchListener) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void D7(long j, long j2, long j3, long j4, int i, long j5, int i2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean D8() {
        return false;
    }

    @Override // X.InterfaceC222708oc
    public final ViewGroup Dp() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ void E8(int i, Aweme aweme) {
    }

    @Override // X.InterfaceC222708oc
    public final void F5() {
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
    public /* synthetic */ boolean I8() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void J7(boolean z, boolean z2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void J8(int i) {
    }

    @Override // X.InterfaceC222708oc
    public final /* synthetic */ boolean Jk0() {
        return false;
    }

    @Override // X.C2MA
    public /* synthetic */ boolean K7() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void L5(String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void L8(int i, String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void LIZJ() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void LJII(C56682Ki c56682Ki) {
    }

    @Override // X.C2MA, X.InterfaceC54061LJp
    public final InterfaceC57312Mt LJIIIIZZ() {
        return null;
    }

    @Override // X.C2MA
    public void LJJIII(int i) {
    }

    @Override // X.C2MA
    public void LJJIJIIJIL(int i) {
    }

    @Override // X.InterfaceC56362Jc
    public void LJJJJJ(int i, boolean z) {
    }

    @Override // X.InterfaceC222408o8
    public void LJJJJLL() {
    }

    @Override // X.InterfaceC222708oc
    public final /* synthetic */ void LLJJIII() {
    }

    @Override // X.C2MA
    public final /* synthetic */ InterfaceC222698ob LLJJIJIL() {
        return null;
    }

    @Override // X.InterfaceC222708oc
    public final /* synthetic */ void LLLI() {
    }

    @Override // X.C2MA
    public final InterfaceC222708oc LLLJ() {
        return this;
    }

    @Override // X.C2MA
    public final /* synthetic */ void N8(long j, long j2, int i, long j3, long j4, long j5, int i2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void O7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean O8() {
        return false;
    }

    @Override // X.C2MA
    public void P7(C9BZ c9bz) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void P8(int i, String str) {
    }

    @Override // X.C2MA
    public final void Q7(String enterMethodValue) {
        o.LJIIIZ(enterMethodValue, "enterMethodValue");
    }

    @Override // X.C2MA
    public /* synthetic */ boolean R7() {
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
    public void U7(C232629Ba c232629Ba) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void U8() {
    }

    @Override // X.InterfaceC222708oc
    public final int UU() {
        return 2;
    }

    @Override // X.C2MA
    public final /* synthetic */ void V7(boolean z) {
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
    public final /* synthetic */ C2MA Y6() {
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
    public void Z1(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void Z6(C209108Io c209108Io) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void Z8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void a7(boolean z) {
    }

    @Override // X.C2MA
    public final void a8() {
    }

    @Override // X.C2MA
    public final void b2(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void b7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void b8(String str) {
    }

    @Override // X.C2MA
    public final void c2(long j) {
    }

    @Override // X.C2MA
    public final void c7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void c8(Aweme aweme) {
    }

    @Override // X.C2MA
    public final void c9(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void checkViewHolderState() {
    }

    @Override // X.InterfaceC222708oc
    public final boolean d4() {
        return true;
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

    @Override // X.InterfaceC222708oc
    public final void eg(boolean z) {
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

    @Override // X.C2MA
    public int getAwemeType() {
        return 101;
    }

    @Override // X.InterfaceC222708oc
    public final Surface getSurface() {
        return null;
    }

    @Override // X.InterfaceC222708oc
    public final View getVideoView() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ C2MA getViewHolderByAwemeId(String str) {
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
    public final AnonymousClass901 j3() {
        return null;
    }

    @Override // X.C2MA
    public void j5(C107794Kx c107794Kx) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void j7() {
    }

    @Override // X.C2MA
    public final void j8() {
        DoFrameController.LIZIZ = 0;
        C2NL.LIZ.LJ();
    }

    @Override // X.C2MA
    public final /* synthetic */ void k7(View view) {
    }

    @Override // X.C2MA
    public final void m6(Aweme aweme) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void m7(C108814Ov c108814Ov) {
    }

    @Override // X.InterfaceC222708oc
    public final void n() {
    }

    @Override // X.C2MA
    public /* synthetic */ void n8(boolean z) {
    }

    @Override // X.C2MA
    public /* synthetic */ void o6(C2QN c2qn) {
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
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C222688oa.LIZLLL(this, str, z);
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

    @Override // X.C2MA
    public void onDestroyView() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C222688oa.LJIIJ(this, i, j, j2, map);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, ITW itw) {
        C222688oa.LJIIJJI(this, str, itw);
    }

    @Override // X.C2MA
    public final void onPageSelected(int i) {
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
    public final void onPlayFailed(IPG ipg) {
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
    public final /* synthetic */ void onRenderFirstFrame(String str, IT4 it4) {
        C222688oa.LJJIJLIJ(this, str, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C222688oa.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
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

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
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
    public final /* synthetic */ boolean q7() {
        return false;
    }

    @Override // X.C2MA
    public final /* synthetic */ void r5(int i, int i2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ ImageView s7() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ void s8(boolean z, boolean z2) {
    }

    @Override // X.C2MA
    public void t7(boolean z) {
    }

    @Override // X.C2MA
    public final void t8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ boolean u7() {
        return true;
    }

    @Override // X.C2MA
    public final void u8(boolean z, boolean z2) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void v7(boolean z) {
    }

    @Override // X.C2MA
    public final void w1() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void x7(float f, float f2, int i) {
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
    public final void B7() {
        UW2 uw2 = InterfaceC55219Lln.LJJ;
        Context context = this.LJLILLLLZI;
        uw2.getClass();
        OJM<SurfaceView> ojm = UW2.LIZIZ.get(context);
        if (ojm != null) {
            Iterator<SurfaceView> it = ojm.iterator();
            while (it.hasNext()) {
                C27740Aue.LJIIIZ(8, it.next());
            }
        }
        OJM<InterfaceC55219Lln> ojm2 = UW2.LIZJ.get(context);
        if (ojm2 != null) {
            Iterator<InterfaceC55219Lln> it2 = ojm2.iterator();
            while (it2.hasNext()) {
                InterfaceC55219Lln next = it2.next();
                if (next.getAweme() != null) {
                    Aweme aweme = next.getAweme();
                    o.LJI(aweme);
                    Video video = aweme.getVideo();
                    o.LJI(video);
                    next.ug(video);
                }
            }
        }
    }

    @Override // X.C2MA
    public final void Z7() {
        C35810E3q.LJIIJ(1000L);
        C35810E3q.LJFF(C2305392z.LIZIZ());
        if (C36531EVj.LJII) {
            C35810E3q.LJ(C2305392z.LIZ());
        }
        if (C35214Dru.LIZIZ) {
            C35810E3q.LJIIJJI(2000L);
        }
        C2NL.LIZ.LJFF();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        FIK.LIZ.getClass();
        return ((PreloadWidgetsData) FIK.LIZJ.getValue()).enableRecycleWidget;
    }

    @Override // X.C2MA
    public void unBind() {
        this.LJLJJL = -1.0d;
    }

    @Override // X.C2MA
    public final Aweme O1() {
        return getAweme();
    }

    @Override // X.C2MA, X.InterfaceC54061LJp
    public final Aweme getCurrentAweme() {
        return getAweme();
    }

    @Override // X.C2MA
    public final IQE I7() {
        return IQE.INITIALIZED;
    }

    @Override // X.InterfaceC56362Jc
    public final double a6() {
        return this.LJLJJL;
    }

    @Override // X.C2MA
    public Aweme getAweme() {
        return this.LJLJI;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget
    public final Context getContext() {
        return this.LJLILLLLZI;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
    }

    @Override // X.C2MA
    public final void B8(boolean z) {
        LJJIJIIJIL(2);
    }

    @Override // X.C2MA
    public final void LIZLLL(Aweme aweme) {
        this.LJLJI = aweme;
        if (aweme != null) {
            LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
            if (newLiveRoomData == null) {
                RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
                if (roomFeedCellStruct != null) {
                    newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData();
                } else {
                    newLiveRoomData = null;
                }
            }
            this.LJLJJI = newLiveRoomData;
        }
    }

    @Override // X.C2MA
    public void l8(int i) {
        C2U8.LIZ(new C9CI(this.LJLJI));
        C2U8.LIZ(new SuperEntranceEvent(0, false));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        Video video;
        Aweme aweme = this.LJLJI;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            this.LJLJJL = ((f / 100) * video.getDuration()) / 1000.0d;
        }
    }

    public BaseFeedLiveViewHolder(View view, Fragment fragment) {
        this.LJLIL = fragment;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        this.LJLILLLLZI = context;
        this.LJLJJL = -1.0d;
    }

    @Override // X.C2MA
    public void LLLZ(int i, Aweme aweme) {
        LIZLLL(aweme);
    }
}
