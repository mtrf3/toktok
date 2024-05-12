package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PHK implements PHL {
    public final PHL LIZ;

    @Override // X.PHL
    public final C65548Po0<PHI> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // X.PHL
    public final long LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LJII() {
        return this.LIZ.LJII();
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // X.PHL
    public final void clear() {
        this.LIZ.clear();
    }

    @Override // X.PHL
    public final void start() {
        this.LIZ.start();
    }

    public PHK() {
        if (C09970aH.LJIIIIZZ()) {
            this.LIZ = new PHJ();
        } else {
            this.LIZ = new PHU();
        }
    }

    @Override // X.PHL
    public final void LIZLLL(double d) {
        this.LIZ.LIZLLL(d);
    }

    @Override // X.PHL
    public final void LJI(String str) {
        this.LIZ.LJI(str);
    }

    @Override // X.PHL
    public final void LJIIJ(JSONObject jSONObject) {
        this.LIZ.LJIIJ(jSONObject);
    }

    @Override // X.PHL
    public final void LJIIJJI(double d) {
        this.LIZ.LJIIJJI(d);
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LJIILIIL(String str) {
        return this.LIZ.LJIILIIL(str);
    }

    @Override // X.PHL
    public final void LJJIZ(String str) {
        this.LIZ.LJJIZ(str);
    }

    @Override // X.PHL
    public final void LJ(String str, JSONObject jSONObject) {
        this.LIZ.LJ(str, jSONObject);
    }

    @Override // X.PHL
    public final void LJIIIIZZ(long j, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BizTrafficStats.trafficStats ");
            LIZ.append(j);
            LIZ.append(", ");
            LIZ.append(str);
            LIZ.append(", ");
            LIZ.append(str2);
            C64028PAy.LIZLLL("APM-Traffic-Detail", X1D.LIZIZ(LIZ));
        }
        this.LIZ.LJIIIIZZ(j, str, str2, str3, jSONObject, jSONObject2);
    }
}
