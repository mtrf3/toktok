package X;

import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.service.IPhotosViewHolderType;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.2RC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2RC implements C2MA, IPhotosViewHolderType {
    public final Aweme LJLIL;
    public final C222678oZ LJLILLLLZI = new InterfaceC222708oc() { // from class: X.8oZ
        @Override // X.InterfaceC222708oc
        public final ViewGroup Dp() {
            return null;
        }

        @Override // X.InterfaceC222708oc
        public final void F5() {
        }

        @Override // X.InterfaceC222708oc
        public final void G60(int i) {
        }

        @Override // X.InterfaceC222708oc
        public final /* synthetic */ boolean Jk0() {
            return false;
        }

        @Override // X.InterfaceC222708oc
        public final /* synthetic */ void LLJJIII() {
        }

        @Override // X.InterfaceC222708oc
        public final /* synthetic */ void LLLI() {
        }

        @Override // X.InterfaceC222708oc
        public final int UU() {
            return 1;
        }

        @Override // X.InterfaceC222708oc
        public final void Y2(Aweme aweme) {
        }

        @Override // X.InterfaceC222708oc
        public final boolean d4() {
            return true;
        }

        @Override // X.InterfaceC222708oc
        public final void eg(boolean z) {
        }

        @Override // X.InterfaceC222708oc
        public final Surface getSurface() {
            return null;
        }

        @Override // X.InterfaceC222708oc
        public final View getVideoView() {
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

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, java.util.Map map) {
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
        public final void onPlayCompleted(String str) {
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
    };

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
    public final void B8(boolean z) {
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

    @Override // X.C2MA
    public final /* synthetic */ void E8(int i, Aweme aweme) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void F8() {
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
    public final /* synthetic */ void L5(String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void L8(int i, String str) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void LIZJ() {
    }

    @Override // X.C2MA
    public final void LIZLLL(Aweme aweme) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void LJII(C56682Ki c56682Ki) {
    }

    @Override // X.C2MA, X.InterfaceC54061LJp
    public final InterfaceC57312Mt LJIIIIZZ() {
        return null;
    }

    @Override // X.C2MA
    public final /* synthetic */ void LJIIJJI() {
        throw null;
    }

    @Override // X.C2MA
    public final void LJJIII(int i) {
    }

    @Override // X.C2MA
    public final void LJJIJIIJIL(int i) {
    }

    @Override // X.C2MA
    public final /* synthetic */ InterfaceC222698ob LLJJIJIL() {
        return null;
    }

    @Override // X.C2MA
    public final void LLLZ(int i, Aweme aweme) {
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
    public final void P7(C9BZ c9bz) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void P8(int i, String str) {
    }

    @Override // X.C2MA
    public final void Q7(String enterMethodValue) {
        o.LJIIIZ(enterMethodValue, "enterMethodValue");
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
    public final void Z1(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void Z6(C209108Io c209108Io) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void Z7() {
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

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final boolean declineReport() {
        return true;
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

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void fadeInWidgetContainer() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void g7(java.util.Map map) {
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final int getCurrentPlayPosition() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final boolean getIsMuted() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final long getSavedDuration() {
        return 0L;
    }

    @Override // X.C2MA
    public final /* synthetic */ C2MA getViewHolderByAwemeId(String str) {
        return null;
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
    public final void j5(C107794Kx c107794Kx) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void j7() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void j8() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void k7(View view) {
    }

    @Override // X.C2MA
    public final void l8(int i) {
    }

    @Override // X.C2MA
    public final void m6(Aweme aweme) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void m7(C108814Ov c108814Ov) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void n8(boolean z) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void o6(C2QN c2qn) {
    }

    @Override // X.C2MA
    public final /* synthetic */ void o8(int i, String str, boolean z) {
    }

    @Override // X.C2MA
    public final void onDestroyView() {
    }

    @Override // X.C2MA
    public final void onPageSelected(int i) {
    }

    @Override // X.C2MA
    public final void onPause() {
    }

    @Override // X.C2MA
    public final void onResume() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void p8() {
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void permitEventReport() {
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

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void saveDuration(long j) {
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void setStartTime(long j) {
    }

    @Override // X.C2MA
    public final void t7(boolean z) {
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
    public final void unBind() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void v7(boolean z) {
    }

    @Override // X.C2MA
    public final void w1() {
    }

    @Override // X.C2MA
    public final /* synthetic */ void w8(boolean z) {
        throw null;
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
    public final int getAwemeType() {
        Aweme aweme = this.LJLIL;
        if (aweme != null) {
            return aweme.getAwemeType();
        }
        return 150;
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

    @Override // X.C2MA
    public final InterfaceC222708oc LLLJ() {
        return this.LJLILLLLZI;
    }

    @Override // X.C2MA
    public final Aweme getAweme() {
        return this.LJLIL;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8oZ] */
    public C2RC(Aweme aweme) {
        this.LJLIL = aweme;
    }
}
