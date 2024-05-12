package X;

import android.app.Application;
import kotlin.jvm.internal.o;

/* renamed from: X.WbF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82593WbF {
    public static C82594WbG LIZ() {
        return (C82594WbG) C82594WbG.LIZ.getValue();
    }

    public static InterfaceC84498XEg LIZIZ() {
        if (C82594WbG.LIZIZ == null) {
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            InterfaceC84498XEg LIZ = C84488XDw.LIZ(application, null);
            C60903NvH.LJIIJJI().initDownloadableModel();
            C82594WbG.LIZIZ = LIZ;
        }
        return C82594WbG.LIZIZ;
    }
}
