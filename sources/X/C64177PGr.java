package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PGr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64177PGr {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public long LJFF;
    public long LJI;
    public C39762Fj4 LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public StackTraceElement[] LJIIJ;
    public StackTraceElement[] LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public C64181PGv LJIILJJIL;

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msg", C45439HsR.LJII(this.LJIIIIZZ));
            jSONObject.put("cpuDuration", this.LJI);
            jSONObject.put("duration", this.LJFF);
            jSONObject.put("type", this.LIZLLL);
            jSONObject.put("messageCount", this.LJ);
            jSONObject.put("lastDuration", this.LIZIZ - this.LIZJ);
            jSONObject.put("start", this.LIZ);
            jSONObject.put("end", this.LIZIZ);
            LIZ(jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public final void LIZ(JSONObject jSONObject) {
        boolean z;
        StackTraceElement[] stackTraceElementArr = this.LJIIJ;
        if (stackTraceElementArr != null) {
            jSONObject.put("block_stack", C45439HsR.LJIIIIZZ(stackTraceElementArr));
        }
        jSONObject.put("block_uuid", this.LJIILIIL);
        StackTraceElement[] stackTraceElementArr2 = this.LJIIJJI;
        if (stackTraceElementArr2 != null) {
            jSONObject.put("sblock_stack", C45439HsR.LJIIIIZZ(stackTraceElementArr2));
        }
        jSONObject.put("sblock_uuid", this.LJIILIIL);
        if (TextUtils.isEmpty(this.LJIIL)) {
            jSONObject.put("evil_msg", this.LJIIL);
        }
        if (this.LJIILJJIL != null) {
            z = true;
        } else {
            z = false;
        }
        jSONObject.put("belong_frame", z);
        C64181PGv c64181PGv = this.LJIILJJIL;
        if (c64181PGv != null) {
            jSONObject.put("vsyncDelayTime", this.LIZJ - (c64181PGv.LIZ / 1000000));
            jSONObject.put("doFrameTime", (this.LJIILJJIL.LIZIZ / 1000000) - this.LIZJ);
            C64181PGv c64181PGv2 = this.LJIILJJIL;
            jSONObject.put("inputHandlingTime", (c64181PGv2.LIZJ / 1000000) - (c64181PGv2.LIZIZ / 1000000));
            C64181PGv c64181PGv3 = this.LJIILJJIL;
            jSONObject.put("animationsTime", (c64181PGv3.LIZLLL / 1000000) - (c64181PGv3.LIZJ / 1000000));
            C64181PGv c64181PGv4 = this.LJIILJJIL;
            jSONObject.put("performTraversalsTime", (c64181PGv4.LJ / 1000000) - (c64181PGv4.LIZLLL / 1000000));
            jSONObject.put("drawTime", this.LIZIZ - (this.LJIILJJIL.LJ / 1000000));
        }
        C39762Fj4 c39762Fj4 = this.LJII;
        if (c39762Fj4 != null) {
            jSONObject.put("service_name", c39762Fj4.LIZ);
            jSONObject.put("service_what", this.LJII.LIZIZ);
            jSONObject.put("service_time", this.LJII.LIZJ);
            jSONObject.put("service_thread", this.LJII.LJ);
            jSONObject.put("service_token", this.LJII.LIZLLL);
        }
    }
}
