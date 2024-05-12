package X;

import java.util.EmptyStackException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ifv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47211Ifv implements InterfaceC46540IOi {
    public final /* synthetic */ C47205Ifp LJLIL;

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
    public final /* synthetic */ void onPlayStop(String str) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC46540IOi
    public final /* synthetic */ void onPlaying(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
    public final /* synthetic */ void onPreRenderReady(String str) {
        C196987oE.LIZ(this, str);
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

    public C47211Ifv(C47205Ifp c47205Ifp) {
        this.LJLIL = c47205Ifp;
    }

    @Override // X.InterfaceC46540IOi
    public final void onPreparePlay(String str) {
        String str2;
        C47205Ifp c47205Ifp = this.LJLIL;
        c47205Ifp.getClass();
        String str3 = null;
        try {
            str2 = c47205Ifp.LIZLLL.peek();
        } catch (EmptyStackException unused) {
            str2 = null;
        }
        o.LJIILLIIL(str2, "onPreparePlay:");
        InterfaceC46732IVs LIZ = C13870gZ.LIZ();
        C47205Ifp c47205Ifp2 = this.LJLIL;
        c47205Ifp2.getClass();
        try {
            str3 = c47205Ifp2.LIZLLL.peek();
        } catch (EmptyStackException unused2) {
        }
        LIZ.makeCurrentScene(str3);
    }
}
