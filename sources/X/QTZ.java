package X;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class QTZ {
    public long LIZ;
    public final java.util.Map<String, C67046QTa> LIZIZ = new HashMap();
    public String LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public final JSONObject LJIIL;
    public final JSONObject LJIILIIL;
    public final JSONObject LJIILJJIL;

    public QTZ() {
    }

    public QTZ(JSONObject jSONObject) {
        this.LJIILIIL = jSONObject;
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        this.LJIIL = optJSONObject;
        this.LJIILJJIL = optJSONObject;
    }

    public QTZ(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LJIILIIL = jSONObject;
        this.LJIIL = jSONObject.optJSONObject("data");
        this.LJIILJJIL = jSONObject2;
    }
}
