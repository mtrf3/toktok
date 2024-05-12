package X;

import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;

/* renamed from: X.H0i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43368H0i {
    public static final Object LIZ(String str, UploadImageConfig uploadImageConfig, InterfaceC67352kd<? super String> interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        C43859HJf c43859HJf = new C43859HJf(uploadImageConfig);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("iconPath=");
        LIZ.append(str);
        C15280iq.LJ("DiyProp", X1D.LIZIZ(LIZ));
        c43859HJf.LJIIIZ(new C43369H0j(c43859HJf, c84654XKg));
        c43859HJf.LJIIIIZZ(1, new String[]{str});
        H75 h75 = new H75();
        h75.LIZJ(uploadImageConfig);
        c43859HJf.LJIIJJI(h75.LIZLLL());
        C60903NvH.LJIIJJI().getApplicationService();
        c43859HJf.LJIIJ(C45039Hlz.LIZLLL());
        c43859HJf.LJIIL();
        return c84654XKg.LIZ();
    }
}
