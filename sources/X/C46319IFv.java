package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import kotlin.jvm.internal.o;

/* renamed from: X.IFv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46319IFv implements InterfaceC59776Nd6 {
    public final OnUIPlayListener LIZ;

    public C46319IFv(OnUIPlayListener onUIPlayListener) {
        o.LJIIIZ(onUIPlayListener, "onUIPlayListener");
        this.LIZ = onUIPlayListener;
    }

    @Override // X.InterfaceC59776Nd6
    public final void onPausePlay(String str) {
        this.LIZ.onPausePlay(str);
    }

    @Override // X.InterfaceC59776Nd6
    public final void onPlayCompleted(String str) {
        this.LIZ.onPlayCompleted(str);
    }

    @Override // X.InterfaceC59776Nd6
    public final void onResumePlay(String str) {
        this.LIZ.onResumePlay(str);
    }

    @Override // X.InterfaceC59776Nd6
    public final void LIZ(long j, String str) {
        this.LIZ.onRenderReady(new IPH(str, j));
    }

    @Override // X.InterfaceC59776Nd6
    public final void onPlayProgressChange(String str, long j, long j2) {
        this.LIZ.onPlayProgressChange(str, j, j2);
    }
}
