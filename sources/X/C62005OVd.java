package X;

import android.content.Context;
import android.hardware.Camera;
import java.io.IOException;

/* renamed from: X.OVd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C62005OVd implements InterfaceC61185Nzp {
    public static Camera LJI() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {0};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Camera;", "4464013384043896199");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100100, "android/hardware/Camera", "open", Camera.class, objArr, "android.hardware.Camera", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100100, "android/hardware/Camera", "open", null, objArr, Camera.class, c65300Pk0, false);
            return (Camera) LIZJ.LIZIZ;
        }
        Camera open = Camera.open(0);
        c03880Dg.LIZIZ(100100, "android/hardware/Camera", "open", open, objArr, Camera.class, c65300Pk0, true);
        return open;
    }

    public static void LJII(Camera camera) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "4464013384043896199");
        if (c03880Dg.LIZJ(100101, "android/hardware/Camera", "release", camera, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100101, "android/hardware/Camera", "release", null, objArr, camera, c65300Pk0, false);
        } else {
            camera.release();
            c03880Dg.LIZIZ(100101, "android/hardware/Camera", "release", null, objArr, camera, c65300Pk0, true);
        }
    }

    public static void LJIIIIZZ(Camera camera) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "4464013384043896199");
        if (c03880Dg.LIZJ(100103, "android/hardware/Camera", "stopPreview", camera, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera, c65300Pk0, false);
        } else {
            camera.stopPreview();
            c03880Dg.LIZIZ(100103, "android/hardware/Camera", "stopPreview", null, objArr, camera, c65300Pk0, true);
        }
    }

    @Override // X.InterfaceC61185Nzp
    public int LIZ(Context context) {
        return 0;
    }

    @Override // X.InterfaceC61185Nzp
    public int LIZJ(Context context) {
        return 0;
    }

    @Override // X.InterfaceC61185Nzp
    public int LIZLLL(Context context) {
        return 0;
    }

    @Override // X.InterfaceC61185Nzp
    public int LJ(Context context) {
        return 0;
    }

    @Override // X.InterfaceC61185Nzp
    public int LJFF(Context context) {
        return 0;
    }

    public static void LJIIIZ(Camera camera) {
        try {
            camera.setPreviewTexture(null);
            LJIIIIZZ(camera);
        } catch (IOException | RuntimeException unused) {
        } catch (Throwable th) {
            try {
                LJII(camera);
            } catch (Exception unused2) {
            }
            throw th;
        }
        try {
            LJII(camera);
        } catch (Exception unused3) {
        }
    }

    @Override // X.InterfaceC61185Nzp
    public int LIZIZ(Context context) {
        if (Boolean.TRUE.equals(C34086DZi.LIZ.getValue())) {
            OHI.LIZ.getClass();
            if (!OHI.LJ(context, "android.permission.CAMERA")) {
                return -1;
            }
            return 0;
        }
        if (Camera.getNumberOfCameras() < 1) {
            return -1;
        }
        Camera camera = null;
        try {
            try {
                Camera.getCameraInfo(0, new Camera.CameraInfo());
                camera = LJI();
                if (camera != null) {
                    camera.setParameters(camera.getParameters());
                    LJIIIZ(camera);
                }
                return 0;
            } catch (RuntimeException e) {
                C198517qh c198517qh = new C198517qh();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Camera permission denied. ");
                LIZ.append(android.util.Log.getStackTraceString(e));
                c198517qh.LIZ.put("errorDesc", X1D.LIZIZ(LIZ));
                C09900aA.LJIIJJI("aweme_open_camera_error_rate", -1001, c198517qh.LJ());
                if (camera == null) {
                    return -1;
                }
                LJIIIZ(camera);
                return -1;
            }
        } catch (Throwable th) {
            if (camera != null) {
                LJIIIZ(camera);
            }
            throw th;
        }
    }
}
