package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.FnY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40040FnY implements InterfaceC86860Y7c {
    public static String LIZ;
    public static final C40040FnY LIZIZ = new C40040FnY();

    @Override // X.InterfaceC86860Y7c
    public final void init(Context context) {
        StringBuilder LIZ2 = X1D.LIZ();
        File LLIIJLIL = C16880lQ.LLIIJLIL(context);
        o.LJFF(LLIIJLIL, "context.filesDir");
        LIZ2.append(LLIIJLIL.getAbsolutePath());
        LIZ2.append("/");
        LIZ2.append("hybrid_settings_downloader");
        LIZ = X1D.LIZIZ(LIZ2);
    }

    @Override // X.InterfaceC86860Y7c
    public final void LIZ(String str, Y7V y7v) {
        String LIZ2 = C38353F3l.LIZ(str);
        if (LIZ2 != null) {
            String str2 = LIZ;
            if (str2 != null) {
                C40041FnZ c40041FnZ = new C40041FnZ(y7v, new File(str2, LIZ2));
                C39836FkG.LJII.getClass();
                DownloadTask with = C84261X5d.with(C38262Ezy.LIZ().LIZIZ());
                with.url(str);
                with.name(LIZ2);
                String str3 = LIZ;
                if (str3 != null) {
                    with.savePath(str3);
                    with.addListenerToSameTask(true);
                    with.deleteCacheIfCheckFailed(true);
                    with.retryCount(2);
                    with.autoSetHashCodeForSameTask(true);
                    with.ttnetProtectTimeout(20000L);
                    with.subThreadListener(c40041FnZ);
                    with.download();
                    return;
                }
                o.LJIJI("downloaderDir");
                throw null;
            }
            o.LJIJI("downloaderDir");
            throw null;
        }
    }
}
