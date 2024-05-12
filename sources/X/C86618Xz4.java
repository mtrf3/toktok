package X;

import Y.ARunnableS1S1301000_15;
import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend;

/* renamed from: X.Xz4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86618Xz4 extends AbstractC86604Xyq {
    public final IHostPermissionDepend LJIIIIZZ() {
        IHostPermissionDepend iHostPermissionDepend;
        C86291Xtn c86291Xtn = (C86291Xtn) LJII(C86291Xtn.class);
        if (c86291Xtn != null && (iHostPermissionDepend = c86291Xtn.LJIIIZ) != null) {
            return iHostPermissionDepend;
        }
        C86291Xtn c86291Xtn2 = C86291Xtn.LJIIL;
        if (c86291Xtn2 != null) {
            return c86291Xtn2.LJIIIZ;
        }
        return null;
    }

    public static void LJIIIZ(Context context, String str, EnumC86625XzB enumC86625XzB, String str2, int i, java.util.Map map, InterfaceC86630XzG interfaceC86630XzG) {
        boolean z;
        if (enumC86625XzB == EnumC86625XzB.image) {
            z = true;
        } else {
            z = false;
        }
        VFS.LIZ().post(new ARunnableS1S1301000_15(interfaceC86630XzG, map, C45877HzV.LIZIZ(context, str, "image/jpeg", Boolean.valueOf(z)), str2, i, 1));
    }
}
