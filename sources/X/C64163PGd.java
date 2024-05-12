package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PGd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64163PGd {
    public String LIZ;
    public long LIZIZ;
    public float LIZJ;
    public boolean LIZLLL;
    public String LJ = "normal";
    public List<C64163PGd> LJFF = new ArrayList();
    public final /* synthetic */ C64162PGc LJI;

    public final String LIZ() {
        String str = this.LIZ;
        String LJII = this.LJI.LJII(str);
        if (LJII != null) {
            str = LJII;
        }
        if (str.contains(this.LJI.LIZ)) {
            return str.replace(this.LJI.LIZ, "internal");
        }
        if (!str.contains(this.LJI.LIZJ)) {
            return str;
        }
        return str.replace(this.LJI.LIZJ, "external");
    }

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("path", LIZ());
            jSONObject.put("size", this.LIZIZ);
            jSONObject.put("size_rate", this.LIZJ);
            jSONObject.put("is_folder", this.LIZLLL);
            jSONObject.put("report_type", this.LJ);
            if (!this.LJFF.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<C64163PGd> it = this.LJFF.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().LIZIZ());
                }
                jSONObject.put("next_disk", jSONArray);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public C64163PGd(C64162PGc c64162PGc) {
        this.LJI = c64162PGc;
    }
}
