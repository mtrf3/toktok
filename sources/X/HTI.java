package X;

import com.ss.android.ugc.aweme.app.PushCameraBlurActivity;

/* loaded from: classes8.dex */
public final class HTI implements InterfaceC44080HRs {
    public final /* synthetic */ PushCameraBlurActivity LIZ;

    @Override // X.InterfaceC44080HRs
    public final void onFailed() {
        this.LIZ.finish();
    }

    @Override // X.InterfaceC44080HRs
    public final void onSuccess() {
        this.LIZ.finish();
    }

    public HTI(PushCameraBlurActivity pushCameraBlurActivity) {
        this.LIZ = pushCameraBlurActivity;
    }
}
