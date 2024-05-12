package X;

import android.content.Context;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.service.IPaidContentSdpTrailerService;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class J14 extends FrameLayout implements OnUIPlayListener {
    public final C62822Ol8 LJLIL;
    public J17 LJLILLLLZI;
    public Aweme LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C48478J0w LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;

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

    public final void setFirstPlaybackComplete(boolean z) {
    }

    private final IPaidContentSdpTrailerService getSdpTrailerService() {
        return (IPaidContentSdpTrailerService) this.LJLLI.getValue();
    }

    private final TuxIconView getSoundButton() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-soundButton>(...)");
        return (TuxIconView) value;
    }

    public final void LIZJ() {
        if (this.LJLJJLL) {
            getVideoViewComponent().LJI();
            getSoundButton().setIconRes(R.raw.icon_speaker_x_mark_fill_ltr);
        } else {
            getVideoViewComponent().LJIILIIL();
            getSoundButton().setIconRes(R.raw.icon_speaker_2_fill_ltr);
        }
    }

    public final AudioManager getAudioManager() {
        return (AudioManager) this.LJLIL.getValue();
    }

    public final FrameLayout getVideoPlayer() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-videoPlayer>(...)");
        return (FrameLayout) value;
    }

    public final VideoViewComponent getVideoViewComponent() {
        return (VideoViewComponent) this.LJLJL.getValue();
    }

    public final void LIZ() {
        getVideoViewComponent().pause();
        this.LJLJJL = true;
        J17 j17 = this.LJLILLLLZI;
        if (j17 != null) {
            j17.o3(0);
        }
    }

    public final float getCurrentProgress() {
        return (((float) getVideoViewComponent().LIZLLL()) * 1.0f) / ((float) getVideoViewComponent().LJ());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSdpTrailerService().LIZIZ();
    }

    public final J17 getDelegate() {
        return this.LJLILLLLZI;
    }

    public final boolean getHasPrepared() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        C222688oa.LJIILJJIL(this, str);
        if (getVideoViewComponent().LJFF()) {
            LIZ();
        }
    }

    public final void setDelegate(J17 j17) {
        this.LJLILLLLZI = j17;
    }

    public final void setHasPrepared(boolean z) {
        this.LJLJJI = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J14(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(C200027t8.INSTANCE);
        this.LJLJL = C221108m2.LIZIZ(J18.LJLIL);
        this.LJLJLJ = new C48478J0w(this);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 463));
        this.LJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 462));
        this.LJLLI = C221108m2.LIZIZ(A3I.LJLIL);
        FrameLayout.inflate(context, R.layout.aj1, this);
        getVideoPlayer().setVisibility(8);
        J17 j17 = this.LJLILLLLZI;
        if (j17 != null) {
            j17.o3(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.model.PaidVideoItem r10, int r11, int r12, int r13, int r14, X.J1A r15) {
        /*
            r9 = this;
            java.lang.String r0 = "candidateItem"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "soundButtonState"
            kotlin.jvm.internal.o.LJIIIZ(r15, r0)
            boolean r0 = r9.LJLJJI
            if (r0 == 0) goto Lf
            return
        Lf:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.getAweme()
            r9.LJLJI = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.getAweme()
            if (r0 == 0) goto L9a
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L9a
            X.J17 r0 = r9.LJLILLLLZI
            r4 = 8
            if (r0 == 0) goto L2a
            r0.o3(r4)
        L2a:
            android.widget.FrameLayout r0 = r9.getVideoPlayer()
            r3 = 0
            r0.setVisibility(r3)
            int[] r1 = X.J19.LIZ
            int r0 = r15.ordinal()
            r1 = r1[r0]
            r2 = 1
            if (r1 == r2) goto L9b
            r0 = 2
            if (r1 == r0) goto La3
            r0 = 3
            if (r1 != r0) goto Lb5
            com.ss.android.ugc.aweme.service.IPaidContentSdpTrailerService r1 = r9.getSdpTrailerService()
            X.J0w r0 = r9.LJLJLJ
            r1.LIZ(r0)
            com.bytedance.tux.icon.TuxIconView r0 = r9.getSoundButton()
            r0.setVisibility(r3)
        L53:
            com.bytedance.tux.icon.TuxIconView r4 = r9.getSoundButton()
            Y.ACListenerS28S0100000_8 r1 = new Y.ACListenerS28S0100000_8
            r0 = 18
            r1.<init>(r9, r0)
            X.C16880lQ.LJJJ(r4, r1)
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r1 = r9.getVideoViewComponent()
            android.widget.FrameLayout r0 = r9.getVideoPlayer()
            r1.LIZIZ(r0)
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r9.getVideoViewComponent()
            r0.LIZ(r9)
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r9.getVideoViewComponent()
            X.IWr r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L7e
            r0.LJJJLIIL()
        L7e:
            X.J16 r4 = new X.J16
            r8 = r12
            r7 = r11
            r6 = r14
            r5 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r9.post(r4)
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r9.getVideoViewComponent()
            X.IgU r1 = r0.LJLJI
            X.J15 r0 = new X.J15
            r0.<init>(r9, r10, r3)
            r1.N7(r0)
            r9.LJLJJI = r2
        L9a:
            return
        L9b:
            com.bytedance.tux.icon.TuxIconView r0 = r9.getSoundButton()
            r0.setVisibility(r4)
            goto Lb3
        La3:
            com.ss.android.ugc.aweme.service.IPaidContentSdpTrailerService r1 = r9.getSdpTrailerService()
            X.J0w r0 = r9.LJLJLJ
            r1.LIZ(r0)
            com.bytedance.tux.icon.TuxIconView r0 = r9.getSoundButton()
            r0.setVisibility(r3)
        Lb3:
            r3 = 1
            goto L53
        Lb5:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J14.LIZIZ(com.ss.android.ugc.aweme.model.PaidVideoItem, int, int, int, int, X.J1A):void");
    }
}
