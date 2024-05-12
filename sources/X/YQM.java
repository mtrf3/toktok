package X;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes16.dex */
public class YQM extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ YQ7 LIZ;

    public YQM(YQ7 yq7) {
        this.LIZ = yq7;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        C63922P6w.LIZIZ("TECameraModeBase", "onConfigureFailed...");
        this.LIZ.LJJIIJZLJL();
        C87367YQp.LIZ("te_record_camera2_create_session_ret", 0L);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        P7J p7j;
        P7K p7k;
        P7T.LIZ("TECameraModeBase-onConfigured");
        long currentTimeMillis = System.currentTimeMillis();
        YQ7 yq7 = this.LIZ;
        long j = currentTimeMillis - yq7.LJJIJIIJI;
        yq7.LJJIJIIJIL = j;
        yq7.LJJIJIL = currentTimeMillis;
        yq7.LJJIIZI = false;
        YQ7 yq72 = this.LIZ;
        yq72.LJJJ = false;
        yq72.LIZLLL = cameraCaptureSession;
        YQ7 yq73 = this.LIZ;
        if (yq73.LJII.LLJILJILJ) {
            yq73.LJIIIZ();
            if (!this.LIZ.LJJJJJ) {
                this.LIZ.LJJIIJZLJL();
                p7j = this.LIZ.LJI.LJI;
                if (p7j != null && (p7k = p7j.LIZ) != null && p7k.LJFF() == EnumC63904P6e.ADD_SURFACE) {
                    this.LIZ.LJI.LLLLLLIL();
                }
                C87367YQp.LIZ("te_record_camera2_create_session_ret", 1L);
                C87367YQp.LIZ("te_record_camera2_create_session_cost", j);
                P7T.LIZIZ();
            }
        }
        this.LIZ.LJJJJ();
        p7j = this.LIZ.LJI.LJI;
        if (p7j != null) {
            this.LIZ.LJI.LLLLLLIL();
        }
        C87367YQp.LIZ("te_record_camera2_create_session_ret", 1L);
        C87367YQp.LIZ("te_record_camera2_create_session_cost", j);
        P7T.LIZIZ();
    }
}
