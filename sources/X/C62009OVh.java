package X;

import android.hardware.Camera;

/* renamed from: X.OVh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62009OVh implements InterfaceC63834P3m<Object> {
    public final /* synthetic */ Camera LIZ;

    @Override // X.InterfaceC63834P3m
    public final Object invoke() {
        Camera camera = this.LIZ;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-7120959812329755620");
        if (c03880Dg.LIZJ(100101, "android/hardware/Camera", "release", camera, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100101, "android/hardware/Camera", "release", null, objArr, camera, c65300Pk0, false);
            return null;
        }
        camera.release();
        c03880Dg.LIZIZ(100101, "android/hardware/Camera", "release", null, objArr, camera, c65300Pk0, true);
        return null;
    }

    public C62009OVh(Camera camera) {
        this.LIZ = camera;
    }
}
