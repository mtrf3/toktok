package X;

import android.hardware.Camera;

/* renamed from: X.OVg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62008OVg implements InterfaceC63834P3m<Camera> {
    public final /* synthetic */ int LIZ;

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, android.hardware.Camera] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, android.hardware.Camera] */
    @Override // X.InterfaceC63834P3m
    public final Camera invoke() {
        int i = this.LIZ;
        if (i >= 0) {
            C03880Dg c03880Dg = new C03880Dg(2);
            Object[] objArr = {Integer.valueOf(i)};
            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Camera;", "-7120959812329755620");
            C39519Ff9 LIZJ = c03880Dg.LIZJ(100100, "android/hardware/Camera", "open", Camera.class, objArr, "android.hardware.Camera", c65300Pk0);
            if (LIZJ.LIZ) {
                c03880Dg.LIZIZ(100100, "android/hardware/Camera", "open", null, objArr, Camera.class, c65300Pk0, false);
                return LIZJ.LIZIZ;
            }
            Camera open = Camera.open(i);
            c03880Dg.LIZIZ(100100, "android/hardware/Camera", "open", open, objArr, Camera.class, c65300Pk0, true);
            return open;
        }
        C03880Dg c03880Dg2 = new C03880Dg(2);
        Object[] objArr2 = new Object[0];
        C65300Pk0 c65300Pk02 = new C65300Pk0(false, "()Landroid/hardware/Camera;", "-7120959812329755620");
        C39519Ff9 LIZJ2 = c03880Dg2.LIZJ(100100, "android/hardware/Camera", "open", Camera.class, objArr2, "android.hardware.Camera", c65300Pk02);
        if (LIZJ2.LIZ) {
            c03880Dg2.LIZIZ(100100, "android/hardware/Camera", "open", null, objArr2, Camera.class, c65300Pk02, false);
            return LIZJ2.LIZIZ;
        }
        Camera open2 = Camera.open();
        c03880Dg2.LIZIZ(100100, "android/hardware/Camera", "open", open2, objArr2, Camera.class, c65300Pk02, true);
        return open2;
    }

    public C62008OVg(int i) {
        this.LIZ = i;
    }
}
