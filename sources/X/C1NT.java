package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1NT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NT extends C275816k {
    public int LIZJ;
    public final QXX LJI;
    public boolean LIZIZ = true;
    public List<String> LIZLLL = C78963Uyt.LJIIJJI(true);
    public List<String> LJ = C78963Uyt.LJIIJJI(false);
    public List<String> LJFF = new ArrayList();
    public int LJII = 10000;
    public boolean LJIIIIZZ = true;
    public final List<String> LJIIIZ = new ArrayList();

    public C1NT(C08650Vp c08650Vp) {
        this.LIZ = c08650Vp.LIZ;
        this.LIZJ = 0;
        this.LJI = c08650Vp.LIZIZ;
        SystemClock.uptimeMillis();
    }

    public final void LIZIZ(JSONObject jSONObject) {
        boolean z = true;
        try {
            this.LIZ = C275816k.LIZ(jSONObject, "is_enable", true);
        } catch (Throwable th) {
            th.getMessage();
        }
        try {
            this.LIZIZ = C275816k.LIZ(jSONObject, "store_when_offline", true);
            this.LIZJ = jSONObject.optInt("android_store_impl", 0);
            if (this.LIZLLL == null) {
                this.LIZLLL = new ArrayList();
            }
            ((ArrayList) this.LIZLLL).clear();
            JSONArray optJSONArray = jSONObject.optJSONArray("macro_standard");
            if (optJSONArray != null) {
                LIZJ(this.LIZLLL, optJSONArray);
                C78963Uyt.LJJJI(this.LIZLLL);
            } else {
                ((ArrayList) this.LIZLLL).addAll(C78963Uyt.LJIIJJI(true));
            }
            if (this.LJ == null) {
                this.LJ = new ArrayList();
            }
            ((ArrayList) this.LJ).clear();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("macro_non_standard");
            if (optJSONArray2 != null) {
                LIZJ(this.LJ, optJSONArray2);
                C78963Uyt.LJJJI(this.LJ);
            } else {
                ((ArrayList) this.LJ).addAll(C78963Uyt.LJIIJJI(false));
            }
            if (this.LJFF == null) {
                this.LJFF = new ArrayList();
            }
            ((ArrayList) this.LJFF).clear();
            LIZJ(this.LJFF, jSONObject.optJSONArray("macro_blocklist"));
            this.LJII = jSONObject.optInt("request_timeout", 10000);
            ((ArrayList) this.LJIIIZ).clear();
            LIZJ(this.LJIIIZ, jSONObject.optJSONArray("redirect_blocklist"));
        } catch (Throwable th2) {
            th2.getMessage();
        }
        SystemClock.uptimeMillis();
        if (jSONObject.optInt("enable_url_encode_compat", 1) != 1) {
            z = false;
        }
        this.LJIIIIZZ = z;
    }

    public static void LIZJ(List list, JSONArray jSONArray) {
        if (jSONArray == null || list == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    list.add(obj);
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
    }
}
