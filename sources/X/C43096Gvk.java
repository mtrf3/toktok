package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;

/* renamed from: X.Gvk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43096Gvk extends AbstractC43051Gv1 {
    @Override // X.AbstractC43051Gv1
    public final String LJI() {
        return "av-moji";
    }

    @Override // X.AbstractC43051Gv1
    public final String LJIIIIZZ() {
        return "person-effect";
    }

    @Override // X.AbstractC43051Gv1
    public final boolean LJFF() {
        Keva.getRepo("personal_effect").clear();
        FileUtils.INSTANCE.removeDir(C135045Rs.LIZ());
        return true;
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

    @Override // X.InterfaceC37286EkE
    public final File LIZLLL() {
        return C60903NvH.LJIIJJI().LJJIJL().getFileProvider().LIZJ(C135045Rs.LIZ());
    }

    @Override // X.AbstractC43051Gv1
    public final EnumC42718Gpe LJII() {
        return EnumC42718Gpe.RESOURCE;
    }
}
