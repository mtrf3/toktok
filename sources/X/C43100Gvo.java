package X;

import java.io.File;

/* renamed from: X.Gvo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43100Gvo extends AbstractC43051Gv1 {
    @Override // X.AbstractC43051Gv1
    public final String LJIIIIZZ() {
        return "new_cache";
    }

    @Override // X.InterfaceC37286EkE
    public final File LIZLLL() {
        return new File(C60903NvH.LJIIJJI().LJJIJL().getFileProvider().cacheDir());
    }

    @Override // X.AbstractC43051Gv1
    public final long LJIIJJI() {
        C43099Gvn c43099Gvn = new C43099Gvn(null, null, 3);
        if (LIZLLL().exists()) {
            C39532FfM c39532FfM = new C39532FfM(3);
            c39532FfM.LIZ(c43099Gvn);
            c39532FfM.LIZLLL(LIZLLL());
        }
        return c43099Gvn.LIZJ + 0;
    }

    @Override // X.AbstractC43051Gv1
    public final boolean LJFF() {
        if (!LIZLLL().exists()) {
            return true;
        }
        C43098Gvm c43098Gvm = new C43098Gvm((java.util.Set) null, 3);
        C39532FfM c39532FfM = new C39532FfM(3);
        c39532FfM.LIZ(c43098Gvm);
        c39532FfM.LIZLLL(LIZLLL());
        c43098Gvm.LIZIZ();
        return true;
    }

    @Override // X.AbstractC43051Gv1
    public final EnumC42718Gpe LJII() {
        return EnumC42718Gpe.CACHE;
    }
}
