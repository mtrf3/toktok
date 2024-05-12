package X;

import java.util.SortedMap;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ebi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36758Ebi {
    public static final /* synthetic */ InterfaceC74236TBo[] LJIIJ;
    public final C62822Ol8 LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final SortedMap<String, String> LJFF;
    public final SortedMap<String, String> LJI;
    public final JSONObject LJII;
    public final boolean LJIIIIZZ;
    public final java.util.Map<String, String> LJIIIZ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C36758Ebi.class), "str", "getStr()Ljava/lang/String;");
        C65352Pkq.LIZ.getClass();
        LJIIJ = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(C36758Ebi.class), "jsonObject", "getJsonObject()Lorg/json/JSONObject;"), new TBT(C65352Pkq.LIZ(C36758Ebi.class), "hashCode", "getHashCode()I")};
    }

    public final int hashCode() {
        return ((Number) this.LIZJ.getValue()).intValue();
    }

    public final String toString() {
        return (String) this.LIZ.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C36758Ebi(org.json.JSONObject r10) {
        /*
            r9 = this;
            java.lang.String r0 = "jsonObject"
            kotlin.jvm.internal.o.LJIIJ(r10, r0)
            java.lang.String r0 = "url"
            java.lang.String r2 = r10.optString(r0)
            java.lang.String r0 = "jsonObject.optString(\"url\")"
            kotlin.jvm.internal.o.LJFF(r2, r0)
            java.lang.String r1 = "method"
            java.lang.String r0 = "get"
            java.lang.String r3 = r10.optString(r1, r0)
            java.lang.String r0 = "jsonObject.optString(\"method\", \"get\")"
            kotlin.jvm.internal.o.LJFF(r3, r0)
            java.lang.String r0 = "headers"
            org.json.JSONObject r0 = r10.optJSONObject(r0)
            r8 = 0
            if (r0 == 0) goto L56
            java.util.SortedMap r4 = X.C36748EbY.LIZLLL(r0)
        L2a:
            java.lang.String r0 = "params"
            org.json.JSONObject r0 = r10.optJSONObject(r0)
            if (r0 == 0) goto L54
            java.util.SortedMap r5 = X.C36748EbY.LIZLLL(r0)
        L36:
            java.lang.String r0 = "data"
            org.json.JSONObject r6 = r10.optJSONObject(r0)
            java.lang.String r1 = "needCommonParams"
            r0 = 0
            boolean r7 = r10.optBoolean(r1, r0)
            java.lang.String r0 = "extras"
            org.json.JSONObject r0 = r10.optJSONObject(r0)
            if (r0 == 0) goto L4f
            java.util.SortedMap r8 = X.C36748EbY.LIZLLL(r0)
        L4f:
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        L54:
            r5 = r8
            goto L36
        L56:
            r4 = r8
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36758Ebi.<init>(org.json.JSONObject):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C36758Ebi)) {
            return false;
        }
        C36758Ebi c36758Ebi = (C36758Ebi) obj;
        if (!o.LJ(this.LIZLLL, c36758Ebi.LIZLLL) || !o.LJ(this.LJ, c36758Ebi.LJ) || !o.LJ(this.LJFF, c36758Ebi.LJFF) || !o.LJ(this.LJI, c36758Ebi.LJI) || !o.LJ(this.LJII, c36758Ebi.LJII) || this.LJIIIIZZ != c36758Ebi.LJIIIIZZ || !o.LJ(this.LJIIIZ, c36758Ebi.LJIIIZ)) {
            return false;
        }
        return true;
    }

    public C36758Ebi(String url, String method, SortedMap<String, String> sortedMap, SortedMap<String, String> sortedMap2, JSONObject jSONObject, boolean z, java.util.Map<String, String> map) {
        o.LJIIJ(url, "url");
        o.LJIIJ(method, "method");
        this.LIZLLL = url;
        this.LJ = method;
        this.LJFF = sortedMap;
        this.LJI = sortedMap2;
        this.LJII = jSONObject;
        this.LJIIIIZZ = z;
        this.LJIIIZ = map;
        this.LIZ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 80));
        this.LIZIZ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 79));
        this.LIZJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 78));
    }
}
