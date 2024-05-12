package X;

import android.content.Context;

/* renamed from: X.Q6r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66465Q6r {
    public static final C66465Q6r LJIILLIIL = new C66465Q6r();
    public Context LIZ;
    public PPA LIZIZ;
    public boolean LIZJ;
    public final C66472Q6y LIZLLL = new C66472Q6y();
    public final Q71 LJ = new Q71();
    public final Q72 LJFF = new Q72();
    public final Q73 LJI = new Q73();
    public final Q74 LJII = new Q74();
    public final Q75 LJIIIIZZ = new Q75();
    public final Q76 LJIIIZ = new Q76();
    public final Q77 LJIIJ = new Q77();
    public final Q78 LJIIJJI = new Q78();
    public final C66473Q6z LJIIL = new C66473Q6z();
    public final Q70 LJIILIIL = new Q70();
    public final Q7A LJIILJJIL = new Q7A();
    public final C66471Q6x LJIILL = new C66471Q6x();

    public final synchronized void LIZIZ() {
        if (!this.LIZJ) {
            C66472Q6y c66472Q6y = this.LIZLLL;
            C66461Q6n LIZLLL = C66461Q6n.LIZLLL();
            c66472Q6y.LIZJ(Boolean.valueOf(LIZLLL.LIZ.getBoolean("enable", this.LIZLLL.LIZ().booleanValue())));
            this.LJ.LIZJ(Integer.valueOf(C66461Q6n.LIZLLL().LIZ(this.LJ.LIZ().intValue(), "maxCrashCount")));
            this.LJFF.LIZJ(Integer.valueOf(C66461Q6n.LIZLLL().LIZ(this.LJFF.LIZ().intValue(), "clearDataThreshold")));
            this.LJI.LIZJ(Long.valueOf(C66461Q6n.LIZLLL().LIZIZ(this.LJI.LIZ().longValue(), "maxStartStageDuration")));
            this.LJII.LIZJ(Long.valueOf(C66461Q6n.LIZLLL().LIZIZ(this.LJII.LIZ().longValue(), "requestQuietPeriod")));
            this.LJIIIIZZ.LIZJ(Long.valueOf(C66461Q6n.LIZLLL().LIZIZ(this.LJIIIIZZ.LIZ().longValue(), "protectedPeriod")));
            this.LJIIIZ.LIZJ(Long.valueOf(C66461Q6n.LIZLLL().LIZIZ(this.LJIIIZ.LIZ().longValue(), "accumulativeCrashCount")));
            this.LJIIJ.LIZJ(Long.valueOf(C66461Q6n.LIZLLL().LIZIZ(this.LJIIJ.LIZ().longValue(), "maxCrashInQuietCount")));
            this.LJIIJJI.LIZJ(Long.valueOf(C66461Q6n.LIZLLL().LIZIZ(this.LJIIJJI.LIZ().longValue(), "smartRequestQuietPeriod")));
            this.LJIIL.LIZJ(Long.valueOf(C66461Q6n.LIZLLL().LIZIZ(this.LJIIL.LIZ().longValue(), "smartAccumulativeCrashCount")));
            this.LJIILIIL.LIZJ(Long.valueOf(C66461Q6n.LIZLLL().LIZIZ(this.LJIILIIL.LIZ().longValue(), "smartMaxCrashInQuietCount")));
            this.LJIILJJIL.LIZJ(C66461Q6n.LIZLLL().LIZJ("cloudExceptionList", this.LJIILJJIL.LIZ()));
            C66471Q6x c66471Q6x = this.LJIILL;
            C66461Q6n LIZLLL2 = C66461Q6n.LIZLLL();
            c66471Q6x.LIZJ(Float.valueOf(LIZLLL2.LIZ.getFloat("stackSameThreshold", this.LJIILL.LIZ().floatValue())));
            this.LIZJ = true;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("<loadData> finish Config=");
            LIZ.append(LJIILLIIL);
            PSY.LJ(X1D.LIZIZ(LIZ));
        }
    }

    public final long LIZ() {
        return this.LJIIIIZZ.LIZ().longValue();
    }

    public final void LIZJ() {
        C66461Q6n LIZLLL = C66461Q6n.LIZLLL();
        LIZLLL.LIZ.edit().putBoolean("enable", this.LIZLLL.LIZ().booleanValue()).apply();
        C66461Q6n.LIZLLL().LJFF(this.LJ.LIZ().intValue(), "maxCrashCount");
        C66461Q6n.LIZLLL().LJFF(this.LJFF.LIZ().intValue(), "clearDataThreshold");
        C66461Q6n.LIZLLL().LJI(this.LJI.LIZ().longValue(), "maxStartStageDuration");
        C66461Q6n.LIZLLL().LJI(this.LJII.LIZ().longValue(), "requestQuietPeriod");
        C66461Q6n.LIZLLL().LJI(this.LJIIIIZZ.LIZ().longValue(), "protectedPeriod");
        C66461Q6n.LIZLLL().LJI(this.LJIIIZ.LIZ().longValue(), "accumulativeCrashCount");
        C66461Q6n.LIZLLL().LJI(this.LJIIJ.LIZ().longValue(), "maxCrashInQuietCount");
        C66461Q6n.LIZLLL().LJI(this.LJIIJJI.LIZ().longValue(), "smartRequestQuietPeriod");
        C66461Q6n.LIZLLL().LJI(this.LJIIL.LIZ().longValue(), "smartAccumulativeCrashCount");
        C66461Q6n.LIZLLL().LJI(this.LJIILIIL.LIZ().longValue(), "smartMaxCrashInQuietCount");
        C66461Q6n.LIZLLL().LJII("cloudExceptionList", this.LJIILJJIL.LIZ());
        C66461Q6n LIZLLL2 = C66461Q6n.LIZLLL();
        LIZLLL2.LIZ.edit().putFloat("stackSameThreshold", this.LJIILL.LIZ().floatValue()).apply();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("<saveData> finish Config=");
        LIZ.append(LJIILLIIL);
        PSY.LJ(X1D.LIZIZ(LIZ));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SafeModeConfig{enable=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", maxCrashCount=");
        LIZ.append(this.LJ);
        LIZ.append(", maxStartStageDuration=");
        LIZ.append(this.LJI);
        LIZ.append(", requestQuietPeriod=");
        LIZ.append(this.LJII);
        LIZ.append(", protectedPeriod=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", accumulativeCrashCount=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", maxCrashInQuietCount=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", smartRequestQuietPeriod=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", smartAccumulativeCrashCount=");
        LIZ.append(this.LJIIL);
        LIZ.append(", smartMaxCrashInQuietCount=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", cloudExceptionList=");
        LIZ.append(this.LJIILJJIL);
        LIZ.append(", stackSameThreshold=");
        LIZ.append(this.LJIILL);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
