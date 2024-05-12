package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.effectplatform.EffectStorageCleanServiceImpl;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.effect.IEffectStorageCleanService;
import java.io.File;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gvi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43094Gvi extends AbstractC43051Gv1 {
    @Override // X.AbstractC43051Gv1
    public final String LJI() {
        return "av-effect";
    }

    @Override // X.AbstractC43051Gv1
    public final String LJIIIIZZ() {
        return "effect";
    }

    @Override // X.AbstractC43051Gv1, X.InterfaceC37286EkE
    public final boolean LIZ() {
        IEffectStorageCleanService iEffectStorageCleanService;
        Object LIZ = C58096Mr6.LIZ(IEffectStorageCleanService.class, false);
        if (LIZ != null) {
            iEffectStorageCleanService = (IEffectStorageCleanService) LIZ;
        } else {
            if (C58096Mr6.o0 == null) {
                synchronized (IEffectStorageCleanService.class) {
                    if (C58096Mr6.o0 == null) {
                        C58096Mr6.o0 = new EffectStorageCleanServiceImpl();
                    }
                }
            }
            iEffectStorageCleanService = C58096Mr6.o0;
        }
        iEffectStorageCleanService.tryClean(new AqS173S0100000_7(this, 291));
        return true;
    }

    @Override // X.InterfaceC37286EkE
    public final File LIZLLL() {
        InterfaceC43105Gvt fileProvider = C60903NvH.LJIIJJI().LJJIJL().getFileProvider();
        File filesDir = C60903NvH.LJ.getFilesDir();
        o.LJIIIIZZ(filesDir, "getApplication().filesDir");
        return fileProvider.LIZIZ(filesDir, "effect");
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
        C169416kr LIZ = C166696gT.LIZ();
        LIZ.getClass();
        ((C43523H6h) C169416kr.LJ.getValue()).LIZ.LJIIIIZZ(-1);
        LIZ.LIZIZ = null;
        C82609WbV c82609WbV = (C82609WbV) C82609WbV.LIZJ.getValue();
        c82609WbV.getClass();
        ((C43523H6h) C82609WbV.LJ.getValue()).LIZ.LJIIIIZZ(-1);
        c82609WbV.LIZIZ = null;
        LiveOuterService.LJJJLL().LJJIJIL().cleanEffectCache();
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
