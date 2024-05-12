package X;

import android.app.Application;
import kotlin.jvm.internal.o;

/* renamed from: X.6gT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166696gT {
    public static C169416kr LIZ() {
        return (C169416kr) C169416kr.LIZJ.getValue();
    }

    public static InterfaceC84498XEg LIZIZ() {
        if (C169416kr.LIZLLL == null) {
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            InterfaceC84498XEg LIZ = C84488XDw.LIZ(application, null);
            C60903NvH.LJIIJJI().initDownloadableModel();
            C169416kr.LIZLLL = LIZ;
        }
        return C169416kr.LIZLLL;
    }
}
