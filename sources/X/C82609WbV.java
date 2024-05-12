package X;

import android.app.Application;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import kotlin.jvm.internal.o;

/* renamed from: X.WbV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82609WbV {
    public static InterfaceC84498XEg LIZLLL;
    public final String LIZ = "voiceconversion";
    public CategoryPageModel LIZIZ;
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C82612WbY.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C82608WbU.LJLIL);

    public final void LIZ(InterfaceC82611WbX interfaceC82611WbX) {
        CategoryPageModel categoryPageModel = this.LIZIZ;
        if (categoryPageModel != null && !C79004UzY.LJJIFFI(categoryPageModel.getUrl_prefix())) {
            interfaceC82611WbX.LIZ(this.LIZIZ);
            return;
        }
        interfaceC82611WbX.LIZJ();
        if (LIZLLL == null) {
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            InterfaceC84498XEg LIZ = C84488XDw.LIZ(application, null);
            C60903NvH.LJIIJJI().initDownloadableModel();
            LIZLLL = LIZ;
        }
        InterfaceC84498XEg interfaceC84498XEg = LIZLLL;
        if (interfaceC84498XEg != null) {
            interfaceC84498XEg.LJJIIJZLJL(this.LIZ, new C82610WbW(this, interfaceC82611WbX));
        }
    }
}
