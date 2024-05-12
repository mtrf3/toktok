package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import com.google.ar.core.CameraConfig;
import com.google.ar.core.CameraConfigFilter;
import com.google.ar.core.Config;
import com.google.ar.core.Session;
import com.google.ar.core.SharedCamera;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Vbi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80074Vbi {
    public static final String LJIIJ = C16880lQ.LJLLJ(C80074Vbi.class);
    public static final int LJIIJJI = 5;
    public Handler LIZ;
    public CameraDevice.StateCallback LIZIZ;
    public CameraCaptureSession.StateCallback LIZJ;
    public boolean LIZLLL;
    public SharedCamera LJ;
    public Session LJFF;
    public List<CameraConfig> LJI;
    public final Object LJII = new Object();
    public long LJIIIIZZ = 0;
    public final List<Long> LJIIIZ = new ArrayList();

    public final String LJ() {
        Session session = this.LJFF;
        if (session == null) {
            return null;
        }
        return session.getCameraConfig().getCameraId();
    }

    public final List<TEFrameSizei> LJII() {
        if (this.LJFF == null) {
            return null;
        }
        CameraConfigFilter cameraConfigFilter = new CameraConfigFilter(this.LJFF);
        cameraConfigFilter.setTargetFps(EnumSet.of(CameraConfig.TargetFps.TARGET_FPS_30));
        List<CameraConfig> supportedCameraConfigs = this.LJFF.getSupportedCameraConfigs(cameraConfigFilter);
        if (supportedCameraConfigs.isEmpty()) {
            return null;
        }
        this.LJI = supportedCameraConfigs;
        ArrayList arrayList = new ArrayList();
        for (CameraConfig cameraConfig : supportedCameraConfigs) {
            arrayList.add(new TEFrameSizei(cameraConfig.getTextureSize().getWidth(), cameraConfig.getTextureSize().getHeight()));
        }
        return arrayList;
    }

    public final SurfaceTexture LJIIIIZZ() {
        SharedCamera sharedCamera = this.LJ;
        if (sharedCamera == null) {
            return null;
        }
        return sharedCamera.getSurfaceTexture();
    }

    public final List<Surface> LJIIIZ() {
        SharedCamera sharedCamera = this.LJ;
        if (sharedCamera == null) {
            return null;
        }
        return sharedCamera.getArCoreSurfaces();
    }

    public final void LIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        Session session = this.LJFF;
        if (session != null) {
            session.close();
            this.LJFF = null;
        }
        this.LIZLLL = false;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LJI = null;
        String str = LJIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("close consume = ");
        LIZ.append(System.currentTimeMillis() - currentTimeMillis);
        C63922P6w.LIZLLL(str, X1D.LIZIZ(LIZ));
    }

    public final CameraDevice.StateCallback LJFF() {
        SharedCamera sharedCamera;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.LIZIZ == null && (sharedCamera = this.LJ) != null) {
            this.LIZIZ = sharedCamera.createARDeviceStateCallback(new VY4(), this.LIZ);
        }
        String str = LJIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getDevicesStateCallback consume = ");
        LIZ.append(System.currentTimeMillis() - currentTimeMillis);
        C63922P6w.LIZLLL(str, X1D.LIZIZ(LIZ));
        return this.LIZIZ;
    }

    public final CameraCaptureSession.StateCallback LJI() {
        SharedCamera sharedCamera;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.LIZJ == null && (sharedCamera = this.LJ) != null) {
            this.LIZJ = sharedCamera.createARSessionStateCallback(new C80075Vbj(this), this.LIZ);
        }
        String str = LJIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getDevicesStateCallback consume = ");
        LIZ.append(System.currentTimeMillis() - currentTimeMillis);
        C63922P6w.LIZLLL(str, X1D.LIZIZ(LIZ));
        return this.LIZJ;
    }

    public final void LJIIJJI() {
        long currentTimeMillis = System.currentTimeMillis();
        Session session = this.LJFF;
        if (session != null) {
            session.pause();
        }
        String str = LJIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pause consume = ");
        LIZ.append(System.currentTimeMillis() - currentTimeMillis);
        C63922P6w.LIZLLL(str, X1D.LIZIZ(LIZ));
    }

    public final void LIZIZ(TEFrameSizei tEFrameSizei) {
        if (this.LJFF != null) {
            for (CameraConfig cameraConfig : this.LJI) {
                if (cameraConfig.getTextureSize().getWidth() == tEFrameSizei.width && cameraConfig.getTextureSize().getHeight() == tEFrameSizei.height) {
                    this.LJFF.setCameraConfig(cameraConfig);
                    return;
                }
            }
        }
    }

    public final void LIZJ(int i) {
        Session session = this.LJFF;
        if (session != null) {
            session.setCameraTextureName(i);
        }
    }

    public final Config LIZLLL(VK8 vk8) {
        Session session = this.LJFF;
        if (session == null) {
            return null;
        }
        Config config = new Config(session);
        config.setAugmentedFaceMode(Config.AugmentedFaceMode.values()[vk8.LIZ.ordinal()]);
        config.setCloudAnchorMode(Config.CloudAnchorMode.values()[vk8.LIZIZ.ordinal()]);
        config.setDepthMode(Config.DepthMode.values()[vk8.LIZJ.ordinal()]);
        config.setFocusMode(Config.FocusMode.values()[vk8.LIZLLL.ordinal()]);
        config.setLightEstimationMode(Config.LightEstimationMode.values()[vk8.LJ.ordinal()]);
        config.setPlaneFindingMode(Config.PlaneFindingMode.values()[vk8.LJFF.ordinal()]);
        if (!this.LJFF.isDepthModeSupported(config.getDepthMode())) {
            String str = LJIIJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(config.getDepthMode().name());
            LIZ.append(" is not supported, fallback to DepthMode.DISABLED");
            C63922P6w.LIZ(str, X1D.LIZIZ(LIZ));
            config.setDepthMode(Config.DepthMode.DISABLED);
        }
        return config;
    }

    public final void LJIIL(CameraCaptureSession.CaptureCallback captureCallback) {
        long currentTimeMillis = System.currentTimeMillis();
        Session session = this.LJFF;
        if (session != null) {
            try {
                session.resume();
                this.LJ.setCaptureCallback(captureCallback, this.LIZ);
                C63922P6w.LIZLLL(LJIIJ, "ARCore resumed");
            } catch (Exception e) {
                String str = LJIIJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Failed to resume ARCore session");
                LIZ.append(e);
                C63922P6w.LIZ(str, X1D.LIZIZ(LIZ));
            }
        }
        String str2 = LJIIJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("resume consume = ");
        LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
        C63922P6w.LIZLLL(str2, X1D.LIZIZ(LIZ2));
    }

    public final void LJIIJ(Context context, C84134X0g c84134X0g) {
        if (this.LIZLLL) {
            C63922P6w.LIZLLL(LJIIJ, "init already...");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        VK8 vk8 = c84134X0g.LLJL;
        if (vk8 == null) {
            vk8 = new VK8();
        }
        if (vk8.LIZ == VK7.MESH3D) {
            c84134X0g.LJLJJI = 1;
        } else {
            c84134X0g.LJLJJI = 0;
        }
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(Session.Feature.SHARED_CAMERA);
            if (c84134X0g.LJLJJI == 1) {
                hashSet.add(Session.Feature.FRONT_CAMERA);
            }
            this.LJFF = new Session(context, hashSet);
            String str = LJIIJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("create session consume = ");
            LIZ.append(System.currentTimeMillis() - currentTimeMillis);
            C63922P6w.LIZLLL(str, X1D.LIZIZ(LIZ));
            this.LJFF.configure(LIZLLL(vk8));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("configure consume = ");
            LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
            LIZ2.append(", get id =");
            LIZ2.append(LJ());
            C63922P6w.LIZLLL(str, X1D.LIZIZ(LIZ2));
        } catch (Exception e) {
            C63922P6w.LIZJ(LJIIJ, "Failed to create ARCore session that supports camera sharing", e);
        }
        if (this.LJFF == null) {
            C63922P6w.LIZIZ(LJIIJ, "create ar session failed...");
            return;
        }
        LJII();
        LIZIZ(c84134X0g.LJZI);
        this.LJ = this.LJFF.getSharedCamera();
        this.LIZLLL = true;
    }

    public final void LJIILIIL(String str, List<Surface> list) {
        SharedCamera sharedCamera = this.LJ;
        if (sharedCamera != null) {
            sharedCamera.setAppSurfaces(str, list);
        }
    }
}
