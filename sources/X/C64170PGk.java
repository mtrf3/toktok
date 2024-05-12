package X;

import org.json.JSONObject;

/* renamed from: X.PGk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64170PGk extends C64169PGj {
    public final String LJLJJI;
    public final long LJLJJL;
    public final int LJLJJLL;
    public final long LJLJL;

    @Override // X.C64169PGj
    public final JSONObject LIZJ() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.LJLJJI;
            if (str.contains(C64160PGa.LLI)) {
                str = str.replace(C64160PGa.LLI, "internal");
            } else if (str.contains(C64160PGa.LLIFFJFJJ)) {
                str = str.replace(C64160PGa.LLIFFJFJJ, "external");
            }
            jSONObject.put("name", str);
            jSONObject.put("size", this.LJLJJL);
            int i = this.LJLJJLL;
            if (i > 0) {
                jSONObject.put("num", i);
            }
            jSONObject.put("outdate_interval", this.LJLJL);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.C64169PGj, java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.LJLJL;
        long j2 = ((C64170PGk) obj).LJLJL;
        if (j == j2) {
            return 0;
        }
        if (j > j2) {
            return 1;
        }
        return -1;
    }

    public C64170PGk(int i, long j, long j2, String str) {
        this.LJLJJI = str;
        this.LJLJJL = j;
        this.LJLJJLL = i;
        this.LJLJL = j2;
    }
}
