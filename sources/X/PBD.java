package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class PBD extends AbstractRunnableC64070PCo {
    public final /* synthetic */ PBE LJLJJI;

    public final void LIZ() {
        String[] LIZJ;
        PBE pbe = this.LJLJJI;
        pbe.getClass();
        try {
            if (pbe.LIZLLL != null) {
                pbe.LIZLLL.LIZ();
            }
        } catch (Throwable th) {
            C64028PAy.LIZJ("APM-Slardar", "flushPersistentBuffer", th);
        }
        pbe.LIZIZ();
        C64049PBt<PBF> c64049PBt = pbe.LIZJ;
        if (c64049PBt != null && !c64049PBt.LIZ()) {
            pbe.LIZJ.LIZIZ.clear();
        }
        if (pbe.LIZLLL == null || (LIZJ = pbe.LIZLLL.LIZJ()) == null || LIZJ.length == 0) {
            return;
        }
        List asList = Arrays.asList(LIZJ);
        for (int i = 0; i < asList.size(); i++) {
            File file = new File(O5Y.LJIL(), (String) ListProtector.get(asList, i));
            if (file.exists()) {
                C16880lQ.LLLZZIL(file);
            }
        }
        PC2.LIZ(new PBC());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public PBD(PBE pbe) {
        this.LJLJJI = pbe;
    }
}
