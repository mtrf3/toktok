package X;

import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Gkh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42411Gkh {
    public final String LIZ;
    public long LIZIZ;

    public abstract String LIZ();

    public void LIZLLL() {
        this.LIZIZ = System.currentTimeMillis();
    }

    public AbstractC42411Gkh(String str) {
        this.LIZ = str;
    }

    public void LJ(String str, String fullFilePath) {
        o.LJIIIZ(fullFilePath, "fullFilePath");
        EF7.LIZIZ();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                long currentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("duration", Long.valueOf(currentTimeMillis));
                c198517qh.LIZ.put("tools_use_downloader", Boolean.TRUE);
                c198517qh.LIZ.put("from", this.LIZ);
                c198517qh.LIZ.put("url", LIZ());
                c198517qh.LIZ.put("cur_url", str);
                C09900aA.LJIIJJI("aweme_download_error_rate", 0, c198517qh.LJ());
            }
        } catch (Exception unused) {
        }
    }

    public void LIZIZ(Exception exc, Integer num, String str) {
        int i;
        String LJII;
        EF7.LIZIZ();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", LIZ());
                    jSONObject.put("from", this.LIZ);
                    jSONObject.put("tools_use_downloader", true);
                    if (exc == null) {
                        LJII = "null exception";
                    } else {
                        LJII = J7I.LJII(exc);
                    }
                    jSONObject.put("exception", LJII);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                C09900aA.LJIIJJI("aweme_download_error_rate", 1, jSONObject);
            }
        } catch (Exception unused) {
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        C1GE.LJIILJJIL(i, str, LIZ(), this.LIZ);
    }

    public void LIZJ(int i, long j, long j2) {
    }
}
