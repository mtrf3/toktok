package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class ODE {
    public OED LIZ;
    public OEN LIZIZ;
    public ODK LIZJ;

    public final void LIZ() {
        OED oed = this.LIZ;
        if (oed != null && oed.LIZ) {
            ConcurrentHashMap<String, Long> concurrentHashMap = OED.LIZLLL;
            if (concurrentHashMap.containsKey(oed.LIZIZ)) {
                if (System.currentTimeMillis() - concurrentHashMap.get(oed.LIZIZ).longValue() > 600000) {
                    concurrentHashMap.put(oed.LIZIZ, Long.valueOf(System.currentTimeMillis()));
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    OC6.LIZ("gecko-debug-tag", JBR.LJFF(LIZ, oed.LIZIZ, ":gecko update request control-throttle hit", LIZ), null);
                    C61543ODj c61543ODj = oed.LIZJ;
                    c61543ODj.LJ = 1;
                    c61543ODj.LJFF = 600;
                    throw new C36356EOq(600, "repeat gecko update request", new Throwable("Only one request with the same parameters is allowed in 600s"));
                }
            } else {
                concurrentHashMap.put(oed.LIZIZ, Long.valueOf(System.currentTimeMillis()));
            }
        }
        ODK odk = this.LIZJ;
        if (odk != null) {
            if (!odk.LIZ.get()) {
                ConcurrentHashMap<String, Long> concurrentHashMap2 = ODK.LJ;
                if (concurrentHashMap2.containsKey(odk.LIZJ)) {
                    concurrentHashMap2.remove(odk.LIZJ, Long.valueOf(concurrentHashMap2.get(odk.LIZJ).longValue()));
                }
            }
            if (odk.LIZ.get()) {
                ODK.LJ.remove(odk.LIZJ);
            }
        }
        OEN oen = this.LIZIZ;
        if (oen != null) {
            synchronized (oen) {
                if (System.currentTimeMillis() - OEN.LJ > 60000) {
                    OEN.LIZLLL = 0;
                }
                if (OEN.LIZLLL == 3 && oen.LIZJ == 1) {
                    oen.LIZ = true;
                    OEN.LJFF = System.currentTimeMillis();
                } else {
                    oen.LIZ = false;
                }
                if (!oen.LIZ || System.currentTimeMillis() - OEN.LJFF > 60000) {
                    oen.LIZ = false;
                } else {
                    OC6.LIZ("gecko-debug-tag", "gecko update request exception hit");
                    C61543ODj c61543ODj2 = oen.LIZIZ;
                    c61543ODj2.LJ = 1;
                    c61543ODj2.LJFF = 601;
                    throw new C36356EOq(601, "gecko update request is intercepted", new Throwable("gecko update request failed more than 3 times"));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Long] */
    public final void LIZIZ() {
        OED oed = this.LIZ;
        if (oed != null) {
            OED.LIZLLL.remove(oed.LIZIZ);
        }
        OEN oen = this.LIZIZ;
        if (oen != null) {
            synchronized (oen) {
                OEN.LIZLLL++;
                OEN.LJ = System.currentTimeMillis();
            }
        }
        ODK odk = this.LIZJ;
        if (odk != null) {
            if (!odk.LIZ.get() && odk.LIZIZ && System.currentTimeMillis() - ODK.LJFF.get() <= 1800000) {
                ODJ odj = new ODJ(odk);
                long currentTimeMillis = System.currentTimeMillis();
                odj.LIZIZ = Long.valueOf(currentTimeMillis);
                C61572OEm.LIZ.LIZIZ(odj, 60000L);
                ODK.LJ.put(odk.LIZJ, Long.valueOf(currentTimeMillis));
                StringBuilder LIZ = X1D.LIZ();
                OC6.LIZ("gecko-debug-tag", JBR.LJFF(LIZ, odk.LIZJ, ">>gecko update request retry hit", LIZ), null);
                return;
            }
            if (!odk.LIZ.get()) {
                return;
            }
            ODK.LJFF.set(System.currentTimeMillis());
        }
    }

    public final void LIZJ() {
        OED oed = this.LIZ;
        if (oed != null) {
            oed.getClass();
        }
        ODK odk = this.LIZJ;
        if (odk != null) {
            odk.getClass();
        }
        OEN oen = this.LIZIZ;
        if (oen != null) {
            synchronized (oen) {
                OEN.LIZLLL = 0;
            }
        }
    }
}
