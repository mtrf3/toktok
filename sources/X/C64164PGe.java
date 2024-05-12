package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PGe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64164PGe {
    public String LIZ;
    public long LIZIZ;
    public float LIZJ;
    public boolean LIZLLL;
    public String LJ = "normal";
    public List<C64164PGe> LJFF = new ArrayList();

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.LIZ;
            if (str != null) {
                if (str.contains(C64160PGa.LLI)) {
                    str = str.replace(C64160PGa.LLI, "internal");
                } else if (str.contains(C64160PGa.LLIFFJFJJ)) {
                    str = str.replace(C64160PGa.LLIFFJFJJ, "external");
                }
            }
            jSONObject.put("path", str);
            jSONObject.put("size", this.LIZIZ);
            jSONObject.put("size_rate", this.LIZJ);
            jSONObject.put("is_folder", this.LIZLLL);
            jSONObject.put("report_type", this.LJ);
            if (!((ArrayList) this.LJFF).isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((ArrayList) this.LJFF).iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C64164PGe) it.next()).LIZ());
                }
                jSONObject.put("next_disk", jSONArray);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }
}
