package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Gve, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43090Gve extends AbstractC43051Gv1 {
    @Override // X.AbstractC43051Gv1
    public final String LJI() {
        return "av-mvtheme";
    }

    @Override // X.AbstractC43051Gv1
    public final String LJIIIIZZ() {
        return "mv-theme";
    }

    @Override // X.InterfaceC37286EkE
    public final File LIZLLL() {
        StringBuilder LIZ = X1D.LIZ();
        String absolutePath = C60903NvH.LJ.getFilesDir().getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "getApplication().filesDir.absolutePath");
        LIZ.append(C78966Uyw.LJIJJLI(absolutePath));
        LIZ.append("mvtheme");
        return C60903NvH.LJIIJJI().LJJIJL().getFileProvider().LIZJ(X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC43051Gv1
    public final boolean LJFF() {
        if (!LIZLLL().exists()) {
            return true;
        }
        C43098Gvm c43098Gvm = new C43098Gvm((java.util.Set<String>) GXW.LIZIZ(), (java.util.Set<String>) C77275UUl.LJII("contact_video"));
        c43098Gvm.LIZJ = true;
        C39532FfM c39532FfM = new C39532FfM(3);
        c39532FfM.LIZ(c43098Gvm);
        c39532FfM.LIZLLL(LIZLLL());
        c43098Gvm.LIZIZ();
        return true;
    }

    @Override // X.AbstractC43051Gv1
    public final long LJIIJJI() {
        C43099Gvn c43099Gvn = new C43099Gvn(GXW.LIZIZ(), null, 2);
        if (LIZLLL().exists()) {
            C39532FfM c39532FfM = new C39532FfM(3);
            c39532FfM.LIZ(c43099Gvn);
            c39532FfM.LIZLLL(LIZLLL());
        }
        return c43099Gvn.LIZJ + 0;
    }

    @Override // X.AbstractC43051Gv1
    public final EnumC42718Gpe LJII() {
        return EnumC42718Gpe.RESOURCE;
    }
}
