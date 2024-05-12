package X;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O08 {
    public final long LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final long LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public Boolean LJIIJ;

    public final void LIZ(JSONObject jSONObject) {
        jSONObject.put("access_key", this.LIZLLL);
        jSONObject.put("channel", this.LIZJ);
        jSONObject.put("stats_type", this.LIZIZ);
        jSONObject.put("clean_duration", this.LJI);
        String str = this.LJIIIZ;
        if (str == null) {
            str = "null";
        }
        jSONObject.put("clean_group", str);
        long j = this.LIZ;
        if (j != 0) {
            jSONObject.put("id", j);
        }
        int i = this.LJII;
        if (i != 0) {
            jSONObject.put("req_type", i);
        }
        int i2 = this.LJ;
        if (i2 != 0) {
            jSONObject.put("clean_type", i2);
        }
        int i3 = this.LJFF;
        if (i3 != 0) {
            jSONObject.put("clean_strategy", i3);
        }
        int i4 = this.LJIIIIZZ;
        if (i4 != 0) {
            jSONObject.put("expire_time_type", i4);
        }
        Boolean bool = this.LJIIJ;
        if (bool != null) {
            jSONObject.put("allow_update", bool.booleanValue() ? 1 : 0);
        }
    }

    public O08(String str, String str2, int i, int i2, long j, long j2, int i3) {
        this.LIZJ = str2;
        this.LIZLLL = str;
        this.LJ = i;
        this.LJFF = 1;
        this.LJI = j2;
        this.LIZIZ = i2;
        this.LIZ = j;
        this.LJII = i3;
    }

    public O08(int i, String str, String str2, int i2, long j, String str3, int i3) {
        this.LIZLLL = str;
        this.LIZJ = str2;
        this.LJI = j;
        this.LIZIZ = i;
        this.LJIIIIZZ = i2;
        this.LJ = i3;
        this.LJIIIZ = str3;
    }
}
