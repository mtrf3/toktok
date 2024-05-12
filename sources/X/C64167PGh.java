package X;

import org.json.JSONObject;

/* renamed from: X.PGh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64167PGh implements Comparable {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public final /* synthetic */ C64162PGc LJLJJI;

    public final String LIZJ() {
        String str = this.LJLIL;
        String LJII = this.LJLJJI.LJII(str);
        if (LJII != null) {
            str = LJII;
        }
        if (str.contains(this.LJLJJI.LIZ)) {
            return str.replace(this.LJLJJI.LIZ, "internal");
        }
        if (!str.contains(this.LJLJJI.LIZJ)) {
            return str;
        }
        return str.replace(this.LJLJJI.LIZJ, "external");
    }

    public JSONObject LIZLLL() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", LIZJ());
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

    public C64167PGh(C64162PGc c64162PGc) {
        this.LJLJJI = c64162PGc;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        long j = this.LJLILLLLZI;
        long j2 = ((C64167PGh) obj).LJLILLLLZI;
        if (j == j2) {
            return 0;
        }
        if (j > j2) {
            return 1;
        }
        return -1;
    }

    public C64167PGh(C64162PGc c64162PGc, String str, long j, int i) {
        this.LJLJJI = c64162PGc;
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
    }
}
