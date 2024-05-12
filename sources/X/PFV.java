package X;

import android.content.SharedPreferences;
import android.os.Process;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class PFV extends AbstractRunnableC64070PCo {
    public PFV() {
        super(0L);
    }

    public static void LIZ() {
        PBP pbp = PBP.LJFF;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) PC2.LIZ;
        if (!copyOnWriteArrayList.contains(pbp)) {
            copyOnWriteArrayList.add(pbp);
        }
        PDY.LIZJ.LIZIZ = new C64151PFr();
        PG7 pg7 = C38467F7v.LIZ;
        synchronized (pg7) {
            if (!pg7.LIZ) {
                pg7.LIZ = true;
                pg7.LIZJ(((PG1) PGH.LIZ(PG1.class)).getConfig());
            }
        }
        if (PC5.LJJIIZ()) {
            PGE pge = PGE.LJ;
            if (!pge.LIZIZ) {
                pge.LIZIZ = true;
                InterfaceC64159PFz interfaceC64159PFz = (InterfaceC64159PFz) PGH.LIZ(InterfaceC64159PFz.class);
                if (interfaceC64159PFz != null) {
                    pge.LIZIZ(interfaceC64159PFz.getConfig());
                }
            }
        }
        C64171PGl c64171PGl = C64156PFw.LIZ;
        c64171PGl.getClass();
        if (!((Boolean) C34231Dc3.LIZ.getValue()).booleanValue() && c64171PGl.LIZ.compareAndSet(false, true)) {
            c64171PGl.LJ = (PG9) PGH.LIZ(PG9.class);
            c64171PGl.LIZLLL = SharedPreferencesC37314Ekg.LIZIZ(C78248UnM.LJLJJI, "apm_cpu_front");
            if (PC5.LJJIIZ()) {
                c64171PGl.LIZ();
                C64071PCp.LIZ(PD6.CPU).LIZJ(new C64137PFd(c64171PGl));
            }
            SharedPreferences.Editor edit = c64171PGl.LIZLLL.edit();
            String LJIJJ = PC5.LJIJJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(Process.myPid());
            LIZ.append(",");
            LIZ.append(c64171PGl.LJ.isForeground());
            edit.putString(LJIJJ, X1D.LIZIZ(LIZ)).apply();
            c64171PGl.LJ.LIZ(new PD9(c64171PGl));
            PGH.LIZ(PGC.class);
        }
        C09990aJ.LIZ.getClass();
        PGH.LIZ(PEP.class);
        if (PC5.LJJIIZ()) {
            C36592EXs.LIZ();
            PFH pfh = PFG.LIZ;
            if (pfh != null) {
                long j = pfh.LIZ;
                if (j > 0) {
                    long j2 = C09970aH.LJIILIIL;
                    if (j2 == 0 || j < j2) {
                        C09970aH.LJIILIIL = j;
                    }
                }
            }
        }
        if (PC5.LJJIIZ()) {
            PFX pfx = PFX.LJI;
            if (pfx.LIZIZ) {
                return;
            }
            pfx.LIZIZ = true;
            PG0 pg0 = (PG0) PGH.LIZ(PG0.class);
            if (pg0 != null) {
                pfx.LIZIZ(pg0.getConfig());
            }
            pfx.LJ = new PFW();
            C64071PCp.LIZ(PD6.LIGHT_WEIGHT).LIZJ(pfx.LJ);
        }
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
}
