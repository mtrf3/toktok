package X;

import org.json.JSONObject;

/* renamed from: X.PGj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64169PGj implements Comparable {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;

    public JSONObject LIZJ() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.LJLIL;
            if (str.contains(C64160PGa.LLI)) {
                str = str.replace(C64160PGa.LLI, "internal");
            } else if (str.contains(C64160PGa.LLIFFJFJJ)) {
                str = str.replace(C64160PGa.LLIFFJFJJ, "external");
            }
            jSONObject.put("name", str);
            jSONObject.put("size", this.LJLILLLLZI);
            int i = this.LJLJI;
            if (i > 0) {
                jSONObject.put("num", i);
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public C64169PGj() {
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        long j = this.LJLILLLLZI;
        long j2 = ((C64169PGj) obj).LJLILLLLZI;
        if (j == j2) {
            return 0;
        }
        if (j > j2) {
            return 1;
        }
        return -1;
    }

    public C64169PGj(int i, long j, String str) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
    }
}
