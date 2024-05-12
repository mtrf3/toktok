package X;

import org.json.JSONObject;
import ujb.o;
import ujb.s;

/* renamed from: X.BlC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29702BlC {
    public final String LIZ;
    public final JSONObject LIZIZ;
    public final JSONObject LIZJ;
    public int LIZLLL;
    public String LJ;
    public String LJFF;
    public boolean LJI;
    public boolean LJII;

    public final void LJIIIZ() {
        String str;
        String str2;
        if (this.LIZJ.length() > 0 || this.LJI) {
            this.LIZJ.put("page", this.LJ);
            if (o.LJJJJ(this.LIZ, "_all", false)) {
                if (o.LJJJJ(this.LIZ, "_error", false)) {
                    str2 = s.LJLIIIL(this.LIZ, "all");
                } else if (!o.LJJJJ(this.LIZ, "_all", false)) {
                    StringBuilder LIZ = X1D.LIZ();
                    str2 = JBR.LJFF(LIZ, this.LIZ, "_all", LIZ);
                } else {
                    str2 = this.LIZ;
                }
                C0K2.LJIIIIZZ(str2, this.LIZLLL, this.LIZJ);
            }
            if (this.LJII || o.LJJJJ(this.LIZ, "_error", false)) {
                if (this.LIZLLL != 0) {
                    if (o.LJJJJ(this.LIZ, "_all", false)) {
                        str = s.LJLIIIL(this.LIZ, "error");
                    } else if (!o.LJJJJ(this.LIZ, "_error", false)) {
                        str = AnonymousClass073.LIZIZ(new StringBuilder(), this.LIZ, "_error");
                    } else {
                        str = this.LIZ;
                    }
                    C0K2.LJIIIIZZ(str, this.LIZLLL, this.LIZJ);
                } else {
                    C0NB.LJ(this.LJFF, "slardar error log should not be reported with success status");
                }
            }
            if (!this.LJII && !o.LJJJJ(this.LIZ, "_all", false) && !o.LJJJJ(this.LIZ, "_error", false)) {
                C0NB.LJ(this.LJFF, "slardar log's service name " + this.LIZ + " must end with _all or _error, please call all() or error() method before submit");
            }
            this.LIZIZ.put("slardar", true);
        }
        C0NB.LIZIZ(this.LJFF, this.LIZIZ.toString());
    }

    public C29702BlC(String logName) {
        kotlin.jvm.internal.o.LJIIIZ(logName, "logName");
        this.LIZ = logName;
        JSONObject jSONObject = new JSONObject();
        this.LIZIZ = jSONObject;
        this.LIZJ = new JSONObject();
        this.LIZLLL = -1;
        this.LJ = "";
        this.LJFF = "LiveBusinessLog";
        jSONObject.put("log_name", logName);
    }

    public final void LJ(String str) {
        this.LJ = str;
        this.LIZIZ.put("page", str);
    }

    public final void LJIIIIZZ(int i) {
        this.LIZLLL = i;
        if (i != -1) {
            this.LIZIZ.put("status", i);
        }
    }

    public final void LIZ(Integer num, String str) {
        int i;
        JSONObject jSONObject = this.LIZIZ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        jSONObject.put(str, i);
    }

    public final void LIZIZ(Long l, String str) {
        long j;
        JSONObject jSONObject = this.LIZIZ;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        jSONObject.put(str, j);
    }

    public final void LIZJ(String str, Float f) {
        if (f == null || Float.isNaN(f.floatValue()) || Float.isInfinite(f.floatValue())) {
            this.LIZIZ.put(str, Float.valueOf(0.0f));
        } else {
            this.LIZIZ.put(str, f);
        }
    }

    public final void LIZLLL(String str, String str2) {
        JSONObject jSONObject = this.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put(str, str2);
    }

    public final void LJFF(Integer num, String str) {
        int i;
        JSONObject jSONObject = this.LIZIZ;
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        jSONObject.put(str, i);
        JSONObject jSONObject2 = this.LIZJ;
        if (num != null) {
            i2 = num.intValue();
        }
        jSONObject2.put(str, i2);
    }

    public final void LJI(Long l, String str) {
        long j;
        JSONObject jSONObject = this.LIZIZ;
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        jSONObject.put(str, j);
        JSONObject jSONObject2 = this.LIZJ;
        if (l != null) {
            j2 = l.longValue();
        }
        jSONObject2.put(str, j2);
    }

    public final void LJII(String str, String str2) {
        String str3;
        JSONObject jSONObject = this.LIZIZ;
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        jSONObject.put(str, str3);
        JSONObject jSONObject2 = this.LIZJ;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject2.put(str, str2);
    }
}
