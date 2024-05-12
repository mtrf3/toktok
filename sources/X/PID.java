package X;

import Y.ARunnableS47S0100000_11;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PID implements PIT, PIR {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public String LIZLLL;
    public String LJ;
    public final PIC LJFF;
    public String LJI;
    public java.util.Map<String, String> LJII;
    public boolean LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public PIP LJIIJJI;

    public final JSONObject LJIIIIZZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", this.LIZIZ);
            jSONObject.put("span_id", this.LIZJ);
            jSONObject.put("operation_name", this.LIZ);
            if (!TextUtils.isEmpty(this.LIZLLL)) {
                jSONObject.put("parent_id", this.LIZLLL);
            }
            if (!TextUtils.isEmpty(this.LJ)) {
                jSONObject.put("reference_id", this.LJ);
            }
            jSONObject.put("start_timestamp", this.LJIIIZ);
            jSONObject.put("finish_timestamp", this.LJIIJ);
            java.util.Map<String, String> map = this.LJII;
            if (map != null && !((HashMap) map).isEmpty()) {
                jSONObject.put("tags", new JSONObject(this.LJII));
            }
            if (C17N.LJJIIZI(null)) {
                jSONObject.put("thread_id", this.LJI);
                jSONObject.put("is_finished", 1);
                PIP pip = this.LJIIJJI;
                if (pip != null) {
                    jSONObject.put("movingline", pip.LIZ());
                }
                return jSONObject;
            }
            new JSONArray();
            throw null;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // X.PIO
    public final String LIZJ() {
        byte LIZJ;
        PIC pic = this.LJFF;
        PIE pie = pic.LIZJ;
        String str = pie.LIZJ;
        boolean z = this.LJIIIIZZ;
        if (pie.LJFF) {
            LIZJ = 1;
        } else {
            LIZJ = C64082PDa.LIZIZ().LIZJ(pic.LIZJ.LIZ, z);
        }
        String LLLZ = C16880lQ.LLLZ("%02x", new Object[]{Byte.valueOf(LIZJ)});
        StringBuilder LIZLLL = C1FL.LIZLLL("03", "-", str, "-");
        return C025908h.LIZIZ(LIZLLL, this.LIZJ, "-", LLLZ, LIZLLL);
    }

    public final void LJII() {
        String str = this.LJI;
        if (str == null || str.isEmpty()) {
            this.LJI = C16880lQ.LLLLIIIILLL().getName();
        }
        this.LJIIJ = System.currentTimeMillis();
        F9U.LIZ.LIZJ(new ARunnableS47S0100000_11(this, 100));
    }

    @Override // X.PIO
    public final String LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.PIO
    public final String LIZLLL() {
        return this.LIZ;
    }

    @Override // X.PIO
    public final long getStartTime() {
        return this.LJIIIZ;
    }

    @Override // X.PIO
    public final PID LJ(String str) {
        this.LJ = str;
        return this;
    }

    @Override // X.PIO
    public final PID LJFF(String str) {
        this.LIZLLL = str;
        return this;
    }

    @Override // X.PIO
    public final void LJI(PIP pip) {
        this.LJIIJJI = pip;
    }

    @Override // X.PIR
    public final void LIZ(long j, long j2) {
        String str = this.LJI;
        if (str == null || str.isEmpty()) {
            this.LJI = C16880lQ.LLLLIIIILLL().getName();
        }
        this.LJIIIZ = j;
        this.LJIIJ = j2;
        F9U.LIZ.LIZJ(new ARunnableS47S0100000_11(this, 99));
    }

    public PID(String str, PIC pic, long j) {
        this.LIZ = str;
        this.LJFF = pic;
        this.LIZIZ = "tracer_window_span";
        this.LIZJ = C16880lQ.LLLZ("%016x", new Object[]{Long.valueOf(j)});
    }

    public PID(String str, String str2, PIC pic) {
        String LIZ = C63887P5n.LIZ();
        this.LIZ = str;
        this.LJFF = pic;
        this.LIZIZ = str2;
        this.LIZJ = LIZ;
    }
}
