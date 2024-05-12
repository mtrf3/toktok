package X;

import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.camera.TECamera;
import com.ss.android.vesdk.video.TEVideoDataInterface;

/* loaded from: classes12.dex */
public class P6M implements X01 {
    public final /* synthetic */ C84092WzQ LIZ;

    public P6M(C84092WzQ c84092WzQ) {
        this.LIZ = c84092WzQ;
    }

    @Override // X.X01
    public final void LIZ(int i) {
        Q4K.LJ("onPreviewSurface: ret = ", i, "TERecorder");
    }

    @Override // X.X01
    public final void LIZIZ(int i) {
        Q4K.LJ("onOpenGLDestroy...ret:", i, "TERecorder");
        this.LIZ.LJJZZIII.LIZIZ();
        this.LIZ.LIZJ.release();
        this.LIZ.LJJZZI.release();
        TEVideoDataInterface tEVideoDataInterface = this.LIZ.LIZLLL;
        if (tEVideoDataInterface != null) {
            tEVideoDataInterface.destroy();
            this.LIZ.LIZLLL = null;
        }
        this.LIZ.LJI(1001, 0, 0.0f, "Render Env Destroy.");
        this.LIZ.LJIIL(1001, 0, 0.0f, "Render Env Destroy.");
    }

    @Override // X.X01
    public final void LIZLLL(double d) {
        P4Q.LJI("TERecorder", "onOpenGLDrawBefore...");
        C84092WzQ c84092WzQ = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Render Draw Before: ");
        LIZ.append(d);
        c84092WzQ.LJIIL(1004, 0, 0.0f, X1D.LIZIZ(LIZ));
    }

    @Override // X.X01
    public final void LJ(int i) {
        Q4K.LJ("CAMERA_COST onOpenGLCreate...ret:", i, "TERecorder");
        this.LIZ.LIZJ.createOESTextureIfNeed();
        TECamera tECamera = this.LIZ.LJJZZI;
        if (tECamera != null) {
            tECamera.createOESTextureIfNeed();
        }
        TEVideoDataInterface tEVideoDataInterface = this.LIZ.LIZLLL;
        if (tEVideoDataInterface != null) {
            tEVideoDataInterface.onGLEnvInited();
        }
        C84092WzQ c84092WzQ = this.LIZ;
        InterfaceC84100WzY interfaceC84100WzY = c84092WzQ.LJI;
        if (interfaceC84100WzY != null) {
            c84092WzQ.LIZIZ(interfaceC84100WzY, false);
        } else {
            c84092WzQ.LJI(1000, 0, 0.0f, "Render Env Created.");
            this.LIZ.LJIIL(1000, 0, 0.0f, "Render Env Created.");
        }
    }

    @Override // X.X01
    public final void LIZJ(double d, int i) {
        P4Q.LJI("TERecorder", "onOpenGLDrawAfter...");
        if (VEConfigCenter.getInstance().getValue("ve_titan_camera_cpu_opt", false).booleanValue()) {
            this.LIZ.LJIIL(1005, 0, (float) d, "Render Draw After");
            return;
        }
        C84092WzQ c84092WzQ = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Render Draw After，timeStamp: ");
        LIZ.append(d);
        c84092WzQ.LJIIL(1005, 0, 0.0f, X1D.LIZIZ(LIZ));
    }
}
