package X;

import java.io.File;

/* renamed from: X.GvZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43085GvZ extends AbstractC41473GPl {
    @Override // X.AbstractC43051Gv1
    public final String LJIIIIZZ() {
        return "CreativeTool-Cache";
    }

    @Override // X.InterfaceC37286EkE
    public final File LIZLLL() {
        return new File(C60903NvH.LJIIJJI().LJJIJL().getPathService().getCacheRoot());
    }

    @Override // X.AbstractC41473GPl
    public final void LJIILIIL() {
        if (!LIZLLL().exists()) {
            return;
        }
        C43068GvI c43068GvI = new C43068GvI(C60252Yb.LJLIL);
        C60903NvH.LJIIJJI().getPublishService().LJIILIIL();
        c43068GvI.addAll(C41958GdO.LJIIL());
        String LIZ = C60903NvH.LJIIJJI().LJJIIJZLJL().LIZ();
        if (LIZ != null) {
            c43068GvI.add(LIZ);
        }
        C43098Gvm c43098Gvm = new C43098Gvm(c43068GvI, 2);
        c43098Gvm.LIZJ = true;
        C39532FfM c39532FfM = new C39532FfM(3);
        c39532FfM.LIZ(c43098Gvm);
        c39532FfM.LIZLLL(LIZLLL());
        c43098Gvm.LIZIZ();
    }

    @Override // X.AbstractC41473GPl
    public final long LJIILJJIL() {
        if (!LIZLLL().exists()) {
            return 0L;
        }
        C43099Gvn c43099Gvn = new C43099Gvn(null, null, 3);
        C39532FfM c39532FfM = new C39532FfM(3);
        c39532FfM.LIZ(c43099Gvn);
        c39532FfM.LIZLLL(LIZLLL());
        return c43099Gvn.LIZJ;
    }

    @Override // X.AbstractC43051Gv1
    public final EnumC42718Gpe LJII() {
        return EnumC42718Gpe.CACHE;
    }
}
