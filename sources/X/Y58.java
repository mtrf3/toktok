package X;

import android.content.Context;
import android.hardware.Camera;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y58 {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public Camera LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public Y57 LJFF;
    public boolean LJI;
    public final C62822Ol8 LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;

    public static void LIZ(Camera camera) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-1240779995321578154");
        if (c03880Dg.LIZJ(100102, "android/hardware/Camera", "startPreview", camera, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100102, "android/hardware/Camera", "startPreview", null, objArr, camera, c65300Pk0, false);
        } else {
            camera.startPreview();
            c03880Dg.LIZIZ(100102, "android/hardware/Camera", "startPreview", null, objArr, camera, c65300Pk0, true);
        }
    }

    public final Camera.Parameters LIZIZ() {
        Camera.Parameters parameters = null;
        try {
            Camera camera = this.LIZJ;
            if (camera == null) {
                return null;
            }
            parameters = camera.getParameters();
            return parameters;
        } catch (Exception e) {
            C0NB.LJI("LiveCoverCameraProxy", e);
            return parameters;
        }
    }

    public final void LIZLLL() {
        Camera camera = this.LIZJ;
        if (camera != null) {
            camera.setPreviewCallback(null);
            C03880Dg c03880Dg = new C03880Dg(2);
            Object[] objArr = new Object[0];
            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-1240779995321578154");
            if (c03880Dg.LIZJ(100103, "android/hardware/Camera", "stopPreview", camera, objArr, "void", c65300Pk0).LIZ) {
                c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera, c65300Pk0, false);
            } else {
                camera.stopPreview();
                c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera, c65300Pk0, true);
            }
            C62006OVe.LIZIZ(camera, C78857UxB.LJJIIJ(1476788484, "bpea-live_cover_camera_release"));
        }
        this.LIZJ = null;
        this.LJ = false;
    }

    public final Y57 LIZJ() {
        List<String> supportedFlashModes;
        Y57 y57 = Y57.values()[(this.LJFF.ordinal() + 1) % Y57.values().length];
        this.LJFF = y57;
        Camera.Parameters LIZIZ = LIZIZ();
        if (LIZIZ != null && (supportedFlashModes = LIZIZ.getSupportedFlashModes()) != null && supportedFlashModes.contains(y57.getMode())) {
            return y57;
        }
        if (y57 == Y57.OFF) {
            return y57;
        }
        return LIZJ();
    }

    public final void LJ(Camera.Parameters parameters) {
        try {
            Camera camera = this.LIZJ;
            if (camera != null) {
                camera.setParameters(parameters);
            }
        } catch (Exception e) {
            C0NB.LJI("LiveCoverCameraProxy", e);
        }
    }

    public final void LJFF(Y57 flashMode) {
        List<String> supportedFlashModes;
        Camera.Parameters parameters;
        o.LJIIIZ(flashMode, "flashMode");
        Camera.Parameters LIZIZ = LIZIZ();
        if (LIZIZ != null && (supportedFlashModes = LIZIZ.getSupportedFlashModes()) != null && supportedFlashModes.contains(flashMode.getMode())) {
            Camera camera = this.LIZJ;
            if (camera != null) {
                parameters = camera.getParameters();
                if (parameters != null) {
                    parameters.setFlashMode(flashMode.getMode());
                }
            } else {
                parameters = null;
            }
            LJ(parameters);
        }
    }

    public Y58(Context context, DataChannel dataChannel, boolean z) {
        int i;
        this.LIZ = context;
        this.LIZIZ = dataChannel;
        if (z) {
            Integer LIZIZ = InterfaceC30442Bx8.LJIIIZ.LIZIZ();
            o.LJIIIIZZ(LIZIZ, "{\n        LivePluginProp…RA_TYPE.commonValue\n    }");
            i = LIZIZ.intValue();
        } else {
            i = 0;
        }
        this.LIZLLL = i;
        this.LJFF = Y57.OFF;
        this.LJII = C221108m2.LIZIZ(C84722XMw.INSTANCE);
        this.LJIIIZ = true;
    }
}
