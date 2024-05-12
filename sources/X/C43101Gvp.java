package X;

import java.io.File;

/* renamed from: X.Gvp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43101Gvp extends AbstractC43051Gv1 {
    @Override // X.AbstractC43051Gv1
    public final String LJIIIIZZ() {
        return "ve_get_images_cache";
    }

    @Override // X.AbstractC43051Gv1
    public final long LJIIJJI() {
        C43099Gvn c43099Gvn = new C43099Gvn(null, null, 3);
        if (LIZLLL().exists()) {
            C39532FfM c39532FfM = new C39532FfM(3);
            c39532FfM.LIZ(c43099Gvn);
            c39532FfM.LIZLLL(LIZLLL());
        }
        return c43099Gvn.LIZJ;
    }

    @Override // X.InterfaceC37286EkE
    public final File LIZLLL() {
        return C62850Ola.LJ().LIZJ(EnumC43650HBe.VE_GET_IMAGES_CACHE, "", true);
    }

    @Override // X.AbstractC43051Gv1
    public final boolean LJFF() {
        if (!LIZLLL().exists()) {
            return true;
        }
        C43098Gvm c43098Gvm = new C43098Gvm((java.util.Set) null, 3);
        c43098Gvm.LIZJ = true;
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
