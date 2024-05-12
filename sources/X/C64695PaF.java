package X;

import android.text.TextUtils;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PaF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64695PaF {
    public final String LIZIZ;
    public long LIZLLL;
    public IOException LJI;
    public int LIZ = -1;
    public final long LIZJ = System.currentTimeMillis();
    public int LJ = 0;
    public int LJFF = -1;
    public String LJII = "";
    public long LJIIIIZZ = -1;
    public Boolean LJIIIZ = Boolean.FALSE;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("host", this.LIZIZ);
            jSONObject.put("start", this.LIZJ);
            jSONObject.put("end", this.LIZLLL);
            jSONObject.put("net_error", this.LJ);
            jSONObject.put("code", this.LJFF);
            IOException iOException = this.LJI;
            if (iOException != null) {
                String message = iOException.getMessage();
                if (!TextUtils.isEmpty(message) && message.length() > 64) {
                    message = message.substring(0, 64);
                }
                jSONObject.put("exception", message);
            }
            jSONObject.put("dispatch", this.LJIIIIZZ);
            jSONObject.put("dpHost", this.LJII);
            if (this.LJIIIZ.booleanValue()) {
                jSONObject.put("sentAlready", true);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public C64695PaF(String str) {
        this.LIZIZ = str;
    }
}
