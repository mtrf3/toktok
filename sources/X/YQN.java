package X;

import android.hardware.Camera;

/* loaded from: classes16.dex */
public final class YQN implements Camera.AutoFocusCallback {
    public final /* synthetic */ C84151X0x LIZ;
    public final /* synthetic */ YQ4 LIZIZ;

    public YQN(YQ4 yq42, C84151X0x c84151X0x) {
        this.LIZIZ = yq42;
        this.LIZ = c84151X0x;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        String str;
        if (z) {
            C84151X0x c84151X0x = this.LIZ;
            str = "Camera Focus Succeed!";
            c84151X0x.LJIIJJI.LIZ(c84151X0x.LIZ(), this.LIZIZ.LIZIZ.LJLJJI, "Camera Focus Succeed!");
        } else {
            str = "Camera Focus Failed!";
            this.LIZ.LJIIJJI.LIZ(-1, this.LIZIZ.LIZIZ.LJLJJI, "Camera Focus Failed!");
        }
        C63922P6w.LIZLLL("TECamera1", str);
        if (this.LIZ.LJIIIIZZ && z) {
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFocusMode("continuous-video");
            camera.setParameters(parameters);
            YQ4 yq42 = this.LIZIZ;
            yq42.LJIIJ(yq42.LJJJJLL);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Error: focusAtPoint failed: ");
            LIZ.append(e.toString());
            String LIZIZ = X1D.LIZIZ(LIZ);
            C63922P6w.LIZIZ("TECamera1", LIZIZ);
            YQ4 yq43 = this.LIZIZ;
            yq43.LIZLLL.LJ(yq43.LJJIJLIJ, 1, -411, LIZIZ);
        }
    }
}
