package X;

import android.content.Context;
import android.hardware.Camera;

/* loaded from: classes12.dex */
public final class PPS implements PPW {
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public Camera LJ;
    public Camera.CameraInfo LJFF;
    public final Context LJI;
    public int LIZ = -1;
    public final PPT LJII = (PPT) VEZ.LIZIZ().LIZ(PPT.class);

    public static Camera LIZ(int i) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Camera;", "993235234398672878");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100100, "android/hardware/Camera", "open", Camera.class, objArr, "android.hardware.Camera", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100100, "android/hardware/Camera", "open", null, objArr, Camera.class, c65300Pk0, false);
            return (Camera) LIZJ.LIZIZ;
        }
        Camera open = Camera.open(i);
        c03880Dg.LIZIZ(100100, "android/hardware/Camera", "open", open, objArr, Camera.class, c65300Pk0, true);
        return open;
    }

    public PPS(Context context) {
        this.LJI = context;
    }
}
