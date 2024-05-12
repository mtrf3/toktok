package X;

import com.ss.bduploader.BDUploadUtil;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Gw4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43116Gw4 {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);

    public static void LIZ() {
        if (LIZ.compareAndSet(false, true)) {
            String LJIJI = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIJI();
            File LIZJ = C60903NvH.LJIIJJI().LJJIJL().getFileProvider().LIZJ(LJIJI);
            if (!LIZJ.exists() && !LIZJ.mkdirs()) {
                H78.LIZLLL("upload-config-dir", new Throwable("create upload config dir failed!"));
            }
            BDUploadUtil.setSDKConfigDir(LJIJI);
        }
    }

    public static int LIZIZ(int i) {
        C60903NvH.LJIIJJI().getPublishService().LJJIIJ().getClass();
        C41777GaT.LIZ();
        return i;
    }
}
