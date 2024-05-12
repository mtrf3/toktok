package X;

import com.ss.android.ugc.aweme.audiomode.fullepisodev2.notification.BackgroundAudioService;
import kotlin.jvm.internal.o;

/* renamed from: X.XNn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84739XNn implements InterfaceC85091XaR {
    public final /* synthetic */ BackgroundAudioService LIZ;

    @Override // X.InterfaceC85091XaR
    public final void LIZJ(InterfaceC85083XaJ interfaceC85083XaJ) {
    }

    @Override // X.InterfaceC85091XaR
    public final void onBufferingUpdate(float f) {
    }

    @Override // X.InterfaceC85091XaR
    public final void onPrepare() {
    }

    @Override // X.InterfaceC85091XaR
    public final void onPrepared() {
    }

    @Override // X.InterfaceC85091XaR
    public final void onRenderStart() {
    }

    @Override // X.InterfaceC85091XaR
    public final void onVideoSizeChanged(int i, int i2) {
    }

    @Override // X.InterfaceC85091XaR
    public final void onCompletion() {
        C84742XNq c84742XNq = this.LIZ.LJLJLLL;
        if (c84742XNq != null) {
            c84742XNq.LJ();
        } else {
            o.LJIJI("xAndroidSessionController");
            throw null;
        }
    }

    public C84739XNn(BackgroundAudioService backgroundAudioService) {
        this.LIZ = backgroundAudioService;
    }

    @Override // X.InterfaceC85091XaR
    public final void LIZ(C85079XaF errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
    }

    @Override // X.InterfaceC85091XaR
    public final void LIZIZ(EnumC85066Xa2 loadingState) {
        o.LJIIIZ(loadingState, "loadingState");
    }

    @Override // X.InterfaceC85091XaR
    public final void LJ(XOX currentState) {
        o.LJIIIZ(currentState, "currentState");
        this.LIZ.LIZ();
    }

    @Override // X.InterfaceC85091XaR
    public final void onPlaybackTimeChanged(long j) {
        C84742XNq c84742XNq = this.LIZ.LJLJLLL;
        if (c84742XNq != null) {
            c84742XNq.LJ();
        } else {
            o.LJIJI("xAndroidSessionController");
            throw null;
        }
    }

    @Override // X.InterfaceC85091XaR
    public final void LIZLLL(EnumC80000VaW seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
    }
}
