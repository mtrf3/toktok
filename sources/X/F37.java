package X;

import com.bytedance.android.monitor.HybridMonitor;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class F37 {
    public String LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public JSONObject LIZLLL;
    public JSONObject LJ;
    public JSONObject LJFF;
    public JSONObject LJI;
    public boolean LJII;
    public K1E LJIIIIZZ;

    public final F38 LIZ() {
        F38 f38 = new F38();
        f38.LIZJ = this.LIZJ;
        f38.LIZ = this.LIZ;
        f38.LIZIZ = this.LIZIZ;
        f38.LIZLLL = this.LIZLLL;
        f38.LJ = this.LJ;
        JSONObject jSONObject = this.LJFF;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        f38.LJFF = jSONObject;
        f38.LJI = null;
        JSONObject jSONObject2 = this.LJI;
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        f38.LJII = jSONObject2;
        f38.LJIIIIZZ = this.LJII;
        K1E k1e = this.LJIIIIZZ;
        if (k1e == null) {
            k1e = HybridMonitor.getInstance().getCustomReportMonitor();
        }
        f38.LJIIIZ = k1e;
        return f38;
    }

    public F37(String str) {
        this.LIZJ = str;
    }
}
