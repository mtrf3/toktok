package X;

import android.hardware.Camera;

/* renamed from: X.OVf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62007OVf extends AbstractC65781Prl implements InterfaceC88472Yns<C66300Q0i, Camera> {
    public static final C62007OVf LJLIL = new C62007OVf();

    public C62007OVf() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, android.hardware.Camera] */
    @Override // X.InterfaceC88472Yns
    public final Camera invoke(C66300Q0i c66300Q0i) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Landroid/hardware/Camera;", "8001604037625503659");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100100, "android/hardware/Camera", "open", Camera.class, objArr, "android.hardware.Camera", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100100, "android/hardware/Camera", "open", null, objArr, Camera.class, c65300Pk0, false);
            return LIZJ.LIZIZ;
        }
        Camera open = Camera.open();
        c03880Dg.LIZIZ(100100, "android/hardware/Camera", "open", open, objArr, Camera.class, c65300Pk0, true);
        return open;
    }
}
