package X;

import com.bytedance.android.livesdk.broadcast.video.VideoWidget;

/* renamed from: X.Bxh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30477Bxh implements InterfaceC30497By1 {
    public final /* synthetic */ VideoWidget LIZ;

    public C30477Bxh(VideoWidget videoWidget) {
        this.LIZ = videoWidget;
    }

    @Override // X.InterfaceC30497By1
    public final void onError(int i, int i2) {
        String str = VideoWidget.TAG;
        StringBuilder LIZJ = C06460Ne.LIZJ("CameraState onError status: ", i, ", ret: ", i2, ", msg: ");
        C1EW.LIZLLL(LIZJ, null, LIZJ, str);
        InterfaceC30497By1 interfaceC30497By1 = this.LIZ.stateListener;
        if (interfaceC30497By1 != null) {
            interfaceC30497By1.onError(i, i2);
        }
    }

    @Override // X.InterfaceC30497By1
    public final void onInfo(int i, int i2, int i3, String str) {
        if (i == 1) {
            VideoWidget videoWidget = this.LIZ;
            if (!videoWidget.mInitializedEffect) {
                videoWidget.mInitializedEffect = true;
                videoWidget.mHandler.post(new C0BU(2, this));
            }
        }
        InterfaceC30497By1 interfaceC30497By1 = this.LIZ.stateListener;
        if (interfaceC30497By1 != null) {
            interfaceC30497By1.onInfo(i, i2, i3, str);
        }
    }
}
