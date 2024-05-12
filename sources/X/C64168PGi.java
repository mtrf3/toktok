package X;

import org.json.JSONObject;

/* renamed from: X.PGi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64168PGi extends C64167PGh {
    public final String LJLJJL;
    public final long LJLJJLL;
    public final int LJLJL;
    public final long LJLJLJ;
    public final /* synthetic */ C64162PGc LJLJLLL;

    private String LIZJ() {
        String str = this.LJLJJL;
        String LJII = this.LJLJLLL.LJII(str);
        if (LJII != null) {
            str = LJII;
        }
        if (str.contains(this.LJLJLLL.LIZ)) {
            return str.replace(this.LJLJLLL.LIZ, "internal");
        }
        if (!str.contains(this.LJLJLLL.LIZJ)) {
            return str;
        }
        return str.replace(this.LJLJLLL.LIZJ, "external");
    }

    @Override // X.C64167PGh
    public final JSONObject LIZLLL() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", LIZJ());
            jSONObject.put("size", this.LJLJJLL);
            int i = this.LJLJL;
            if (i > 0) {
                jSONObject.put("num", i);
            }
            jSONObject.put("outdate_interval", this.LJLJLJ);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.C64167PGh, java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.LJLJLJ;
        long j2 = ((C64168PGi) obj).LJLJLJ;
        if (j == j2) {
            return 0;
        }
        if (j > j2) {
            return 1;
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64168PGi(C64162PGc c64162PGc, String str, long j, int i, long j2) {
        super(c64162PGc);
        this.LJLJLLL = c64162PGc;
        this.LJLJJL = str;
        this.LJLJJLL = j;
        this.LJLJL = i;
        this.LJLJLJ = j2;
    }
}
