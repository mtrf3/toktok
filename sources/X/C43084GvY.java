package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.GvY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43084GvY extends AbstractC43051Gv1 {
    @Override // X.AbstractC43051Gv1
    public final String LJI() {
        return "av-effect-model";
    }

    @Override // X.AbstractC43051Gv1
    public final String LJIIIIZZ() {
        return "effectmodel";
    }

    @Override // X.InterfaceC37286EkE
    public final File LIZLLL() {
        InterfaceC43105Gvt fileProvider = C60903NvH.LJIIJJI().LJJIJL().getFileProvider();
        File filesDir = C60903NvH.LJ.getFilesDir();
        o.LJIIIIZZ(filesDir, "getApplication().filesDir");
        return fileProvider.LIZIZ(filesDir, "effectmodel");
    }

    @Override // X.AbstractC43051Gv1
    public final boolean LJFF() {
        if (!LIZLLL().exists()) {
            return true;
        }
        C43098Gvm c43098Gvm = new C43098Gvm(GXW.LIZIZ(), 2);
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
    public final void LJIIL() {
        super.LJIIL();
        Keva repoFromSp = KevaImpl.getRepoFromSp(C5L7.LIZ(), "AVStoragePreferences", 0);
        o.LJIIIIZZ(repoFromSp, "getRepoFromSp(\n         …ants.MODE_SINGLE_PROCESS)");
        repoFromSp.storeBoolean("key_is_effect_storage_cleaning", true);
    }

    @Override // X.AbstractC43051Gv1
    public final EnumC42718Gpe LJII() {
        return EnumC42718Gpe.RESOURCE;
    }

    @Override // X.AbstractC43051Gv1
    public final void LJIIJ(boolean z) {
        super.LJIIJ(z);
        Keva repoFromSp = KevaImpl.getRepoFromSp(C5L7.LIZ(), "AVStoragePreferences", 0);
        o.LJIIIIZZ(repoFromSp, "getRepoFromSp(\n         …ants.MODE_SINGLE_PROCESS)");
        repoFromSp.storeBoolean("key_is_effect_storage_cleaning", false);
    }
}
