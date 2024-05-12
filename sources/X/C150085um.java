package X;

import android.app.Application;
import kotlin.jvm.internal.o;

/* renamed from: X.5um, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150085um {
    public static InterfaceC84498XEg LIZ() {
        if (C169426ks.LIZJ == null) {
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            InterfaceC84498XEg LIZ = C84488XDw.LIZ(application, null);
            C60903NvH.LJIIJJI().initDownloadableModel();
            C169426ks.LIZJ = LIZ;
        }
        return C169426ks.LIZJ;
    }
}
