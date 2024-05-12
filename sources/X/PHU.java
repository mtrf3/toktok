package X;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.bytedance.apm6.traffic.TrafficTransportService;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PHU implements PHL {
    public boolean LIZ;
    public PHW LIZIZ;
    public final PHY LIZJ = new PHY(this);

    @Override // X.PHL
    public final C65548Po0<PHI> LIZ() {
        return null;
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LIZIZ() {
        return null;
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LIZJ() {
        return null;
    }

    @Override // X.PHL
    public final void LIZLLL(double d) {
    }

    @Override // X.PHL
    public final long LJFF() {
        return 0L;
    }

    @Override // X.PHL
    public final void LJI(String str) {
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LJII() {
        return null;
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LJIIIZ() {
        return null;
    }

    @Override // X.PHL
    public final void LJIIJJI(double d) {
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LJIIL() {
        return null;
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LJIILIIL(String str) {
        return null;
    }

    @Override // X.PHL
    public final java.util.Map<String, J8T> LJIILJJIL() {
        return null;
    }

    @Override // X.PHL
    public final void clear() {
    }

    @Override // X.PHL
    public final void start() {
        if (C09970aH.LJII()) {
            C64028PAy.LIZLLL("APM-Traffic-Detail", "SubBiz start called");
        }
        this.LIZ = true;
        C80036Vb6.LJLIL = true;
        PHZ phz = new PHZ(this);
        Context context = C09970aH.LIZ;
        C16880lQ.LLLJL(context, new Intent(context, (Class<?>) TrafficTransportService.class), phz, 1);
        C64094PDm.LIZ.LJIIJ(this.LIZJ);
        C64089PDh.LJIIJ().LJLJLJ = new PHX(this);
    }

    @Override // X.PHL
    public final void LJIIJ(JSONObject jSONObject) {
        String jSONObject2;
        if (this.LIZIZ != null) {
            if (jSONObject == null) {
                jSONObject2 = "";
            } else {
                try {
                    jSONObject2 = jSONObject.toString();
                } catch (RemoteException | NullPointerException unused) {
                    return;
                }
            }
            this.LIZIZ.LJJLL(jSONObject2);
            if (C09970aH.LJII()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SubBiz httpImageApiTrafficStats extJson=");
                LIZ.append(jSONObject2);
                C64028PAy.LIZLLL("APM-Traffic-Detail", X1D.LIZIZ(LIZ));
            }
        }
    }

    @Override // X.PHL
    public final void LJJIZ(String str) {
        PHW phw = this.LIZIZ;
        if (phw != null) {
            try {
                phw.LJJIZ(str);
                if (C09970aH.LJII()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("SubBiz initCustomMetricBizTrafficStats ");
                    LIZ.append(str);
                    C64028PAy.LIZLLL("APM-Traffic-Detail", X1D.LIZIZ(LIZ));
                }
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // X.PHL
    public final void LJ(String str, JSONObject jSONObject) {
        String jSONObject2;
        if (this.LIZIZ != null) {
            if (jSONObject == null) {
                jSONObject2 = "";
            } else {
                try {
                    jSONObject2 = jSONObject.toString();
                } catch (RemoteException | NullPointerException unused) {
                    return;
                }
            }
            this.LIZIZ.LLJILJILJ(str, jSONObject2);
            if (C09970aH.LJII()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SubBiz httpApiTrafficStats url=");
                LIZ.append(str);
                LIZ.append(", extJson=");
                LIZ.append(jSONObject2);
                C64028PAy.LIZLLL("APM-Traffic-Detail", X1D.LIZIZ(LIZ));
            }
        }
    }

    @Override // X.PHL
    public final void LJIIIIZZ(long j, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        F9U.LIZ.LIZJ(new PHV(this, jSONObject, jSONObject2, j, str, str2, str3));
    }
}
