package X;

import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoViewModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS63S1100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N5J extends RecyclerView.ViewHolder implements IZ2, InterfaceC46540IOi {
    public final View LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final CommerceMusicLogger LJLJI;
    public final CommerceMusicSubstituteMusicVideoViewModel LJLJJI;
    public final InterfaceC88472Yns<MusicModel, C76800UCe> LJLJJL;
    public Long LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final XLM LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    @Override // X.IZ2
    public final void Q2() {
    }

    @Override // X.IZ2
    public final /* synthetic */ Surface getSurface() {
        return null;
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onBuffering(String str, boolean z) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onBuffering(boolean z) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPausePlay(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayCompleted(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayFailed(IPG ipg) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayPause(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayPrepare(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayProgressChange(float f) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayRelease(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
    public final /* synthetic */ void onPreRenderReady(String str) {
        C196987oE.LIZ(this, str);
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPreparePlay(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onRenderFirstFrame(IT4 it4) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onRenderFirstFrame(String str, IT4 it4) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onRenderReady(IPH iph) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onResumePlay(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onRetryOnError(IPG ipg) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onRetryOnError(String str, IPG ipg) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
    }

    public final InterfaceC197777pV L() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-player>(...)");
        return (InterfaceC197777pV) value;
    }

    @Override // X.IZ2
    public final FrameLayout LJJLIIIJLJLI() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-playerView>(...)");
        return (FrameLayout) value;
    }

    @Override // X.InterfaceC46540IOi
    public final void onPlayStop(String str) {
        CommerceMusicLogger commerceMusicLogger = this.LJLJI;
        N4C.LIZ.getClass();
        commerceMusicLogger.LJIILJJIL(N4C.LJIIIIZZ, new AqS63S1100000_10(this, str, 6));
    }

    @Override // X.InterfaceC46540IOi
    public final void onPlaying(String str) {
        this.LJLJJLL = Long.valueOf(SystemClock.uptimeMillis());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public N5J(View view, LifecycleOwner lifecycleOwner, CommerceMusicLogger logger, CommerceMusicSubstituteMusicVideoViewModel viewModel, InterfaceC88472Yns<? super MusicModel, C76800UCe> navigateToShoot) {
        super(view);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(logger, "logger");
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(navigateToShoot, "navigateToShoot");
        this.LJLIL = view;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = logger;
        this.LJLJJI = viewModel;
        this.LJLJJL = navigateToShoot;
        this.LJLJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 586));
        this.LJLJLJ = V8H.LIZ(-1);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 587));
        this.LJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 476));
        this.LJLLI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 585));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 584));
        this.LJLLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 583));
    }
}
