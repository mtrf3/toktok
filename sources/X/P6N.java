package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.camera.TECamera;

/* loaded from: classes12.dex */
public class P6N implements InterfaceC63916P6q {
    public final /* synthetic */ TECamera LJLIL;

    public P6N(TECamera tECamera) {
        this.LJLIL = tECamera;
    }

    @Override // X.P7S
    public final void LIZJ(Object obj) {
        TECamera tECamera = this.LJLIL;
        tECamera.nativeExtFrameDataAttached(tECamera.mHandle, obj);
    }

    @Override // X.InterfaceC63916P6q
    public final void LJFF(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("canReleaseSurfaceTexture, canRelease = ");
        LIZ.append(z);
        P4Q.LJFF("TECamera", X1D.LIZIZ(LIZ));
        this.LJLIL.mbCanReleaseSurfaceTexture = z;
    }

    @Override // X.P7P
    public final void onFrameCaptured(P6E p6e) {
        if (this.LJLIL.mCameraSetting.getOutputMode() == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME && this.LJLIL.mCameraSetting.getCameraFacing().ordinal() != p6e.LJII.LJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getCameraFacing:");
            LIZ.append(this.LJLIL.mCameraSetting.getCameraFacing().ordinal());
            LIZ.append("  frameFacing:");
            C01R.LIZJ(LIZ, p6e.LJII.LJ, LIZ, "TECamera");
            return;
        }
        TECamera tECamera = this.LJLIL;
        tECamera.mCanDropFrame = p6e.LJI;
        if (!tECamera.mHasFirstFrameCaptured) {
            tECamera.mHasFirstFrameCaptured = true;
        }
        tECamera.mCapturePipeline.getClass();
        TECamera tECamera2 = this.LJLIL;
        P3Y p3y = p6e.LJII;
        int i = p3y.LJ;
        tECamera2.mUseFront = i;
        int i2 = 0;
        if (tECamera2.isFirstOpen) {
            tECamera2.originFacing = i;
            TEFrameSizei tEFrameSizei = p3y.LIZ;
            tECamera2.originFrameWidth = tEFrameSizei.width;
            tECamera2.originFrameHeight = tEFrameSizei.height;
            tECamera2.setCameraParams(p6e);
            this.LJLIL.isFirstOpen = false;
        } else {
            if (i == tECamera2.originFacing) {
                TEFrameSizei tEFrameSizei2 = p3y.LIZ;
                if (tEFrameSizei2.width == tECamera2.originFrameWidth && tEFrameSizei2.height == tECamera2.originFrameHeight) {
                    tECamera2.setCameraParams(p6e);
                }
            }
            P4Q.LIZ("TECamera", "facing change...");
            this.LJLIL.setCameraParams(p6e);
            if (VEConfigCenter.getInstance().getValue("ve_enable_camera_switch_camera1_optimize", false).booleanValue()) {
                TECamera tECamera3 = this.LJLIL;
                if (tECamera3.mUseFront != tECamera3.originFacing) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Switch camera do not need to drop, current facing = ");
                    LIZ2.append(this.LJLIL.mUseFront);
                    LIZ2.append(", originFacing = ");
                    C01R.LIZJ(LIZ2, this.LJLIL.originFacing, LIZ2, "TECamera");
                    this.LJLIL.mDropFrame = 0;
                    TECamera tECamera4 = this.LJLIL;
                    tECamera4.originFacing = tECamera4.mUseFront;
                    TEFrameSizei tEFrameSizei3 = p6e.LJII.LIZ;
                    tECamera4.originFrameWidth = tEFrameSizei3.width;
                    tECamera4.originFrameHeight = tEFrameSizei3.height;
                }
            }
            if (C65429Pm5.LJFF("ve_enable_preview_size_change_opt1", false)) {
                TEFrameSizei tEFrameSizei4 = p6e.LJII.LIZ;
                int i3 = tEFrameSizei4.width;
                TECamera tECamera5 = this.LJLIL;
                if (i3 != tECamera5.originFrameWidth || tEFrameSizei4.height != tECamera5.originFrameHeight) {
                    P4Q.LJFF("TECamera", "Change preview size do not need to drop");
                    this.LJLIL.mDropFrame = 0;
                    TECamera tECamera42 = this.LJLIL;
                    tECamera42.originFacing = tECamera42.mUseFront;
                    TEFrameSizei tEFrameSizei32 = p6e.LJII.LIZ;
                    tECamera42.originFrameWidth = tEFrameSizei32.width;
                    tECamera42.originFrameHeight = tEFrameSizei32.height;
                }
            }
            this.LJLIL.mDropFrame = 1;
            TECamera tECamera422 = this.LJLIL;
            tECamera422.originFacing = tECamera422.mUseFront;
            TEFrameSizei tEFrameSizei322 = p6e.LJII.LIZ;
            tECamera422.originFrameWidth = tEFrameSizei322.width;
            tECamera422.originFrameHeight = tEFrameSizei322.height;
        }
        TECamera tECamera6 = this.LJLIL;
        if (tECamera6.mDropFrame > 0) {
            if (tECamera6.mHandle != 0) {
                TECamera tECamera7 = this.LJLIL;
                tECamera7.nativeNotifyCameraFrameAvailable(tECamera7.mHandle, 1);
            }
            this.LJLIL.mDropFrame--;
            return;
        }
        if (tECamera6.mHandle == 0) {
            return;
        }
        TECamera tECamera8 = this.LJLIL;
        long j = tECamera8.mHandle;
        if (!this.LJLIL.mEnableNotify) {
            i2 = 2;
        }
        tECamera8.nativeNotifyCameraFrameAvailable(j, i2);
    }

    @Override // X.P7P
    public final void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
        TECamera tECamera = this.LJLIL;
        tECamera.mTextureHolder.LIZIZ = surfaceTexture;
        tECamera.mSurfaceTexture = surfaceTexture;
    }

    @Override // X.InterfaceC63916P6q, X.P7S
    public final void LIZ(SurfaceTexture surfaceTexture, boolean z) {
        onNewSurfaceTexture(surfaceTexture);
        C63897P5x c63897P5x = this.LJLIL.mTextureHolder;
        c63897P5x.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setNeedAttachToGLContext, needAttachToGLContext = ");
        LIZ.append(z);
        P4Q.LJFF("TextureHolder", X1D.LIZIZ(LIZ));
        c63897P5x.LIZJ = z;
        if (z) {
            c63897P5x.LIZLLL = 1;
        } else {
            c63897P5x.LIZLLL = 0;
        }
    }
}
