package X;

import com.bytedance.geckox.model.UpdatePackage;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class ODS {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public long LJJ;
    public int LJJI;
    public final java.util.Map<String, OE3> LJJIFFI = new HashMap();

    public final OE3 LIZ(String str, boolean z) {
        OE3 oe3 = (OE3) ((HashMap) this.LJJIFFI).get(str);
        if (oe3 == null) {
            oe3 = new OE3(str);
            ((HashMap) this.LJJIFFI).put(str, oe3);
            if (!z) {
                oe3.LJI = true;
                OC6.LIZLLL("gecko-debug-tag", "UpdateStatisticModel.getStageDataFromMap create by error");
            }
        }
        return oe3;
    }

    public final OE3 LIZIZ(UpdatePackage updatePackage, boolean z) {
        if (updatePackage.getZstdFallback()) {
            return LIZ("fallback_", z);
        }
        if (updatePackage.getUpdateWithPatch()) {
            return LIZ("patch_", z);
        }
        return LIZ("full_", z);
    }
}
