package X;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import org.json.JSONObject;

/* renamed from: X.VMb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79605VMb {
    public String LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public JSONObject LIZLLL;
    public JSONObject LJ;
    public JSONObject LJFF;
    public JSONObject LJI;
    public JSONObject LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public int LJIIJ;
    public EnumC40073Fo5 LJIIJJI;
    public InterfaceC79582VLe LJIIL;

    public final C79604VMa LIZ() {
        C79604VMa c79604VMa = new C79604VMa();
        c79604VMa.LIZJ = this.LIZJ;
        c79604VMa.LJIIIZ = this.LJIIJJI;
        String str = this.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c79604VMa.LIZ = str;
        String str3 = this.LIZIZ;
        if (str3 != null) {
            str2 = str3;
        }
        c79604VMa.LIZIZ = str2;
        JSONObject jSONObject = this.LIZLLL;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        c79604VMa.LIZLLL = jSONObject;
        JSONObject jSONObject2 = this.LJ;
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        c79604VMa.LJ = jSONObject2;
        JSONObject jSONObject3 = this.LJFF;
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        c79604VMa.LJFF = jSONObject3;
        c79604VMa.LJIIJJI = this.LJIIJ;
        JSONObject jSONObject4 = this.LJI;
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        this.LJI = jSONObject4;
        c79604VMa.LJI = jSONObject4;
        JSONObject jSONObject5 = this.LJII;
        if (jSONObject5 == null) {
            jSONObject5 = new JSONObject();
        }
        c79604VMa.LJII = jSONObject5;
        c79604VMa.LJIIJ = this.LJIIIZ;
        c79604VMa.LJIIIIZZ = this.LJIIIIZZ;
        InterfaceC79582VLe interfaceC79582VLe = this.LJIIL;
        if (interfaceC79582VLe == null) {
            interfaceC79582VLe = HybridMultiMonitor.getInstance().getCustomReportMonitor();
        }
        c79604VMa.LJIIL = interfaceC79582VLe;
        return c79604VMa;
    }

    public C79605VMb(String str) {
        this.LIZJ = str;
    }

    public final void LIZIZ(int i) {
        if (i < 0 || i > 8) {
            i = 8;
        }
        this.LJIIJ = i;
    }
}
