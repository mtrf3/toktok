package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EsX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37801EsX {
    public static final C37800EsW LJIIIIZZ = new C37800EsW();
    public final int LIZ = 20;
    public volatile C37801EsX LIZIZ;
    public volatile String LIZJ;
    public volatile JSONObject LIZLLL;
    public volatile long LJ;
    public volatile long LJFF;
    public volatile boolean LJI;
    public volatile boolean LJII;

    public final JSONObject LIZ() {
        long j;
        int i = 0;
        C37801EsX c37801EsX = this;
        while (c37801EsX.LIZIZ != null && i <= this.LIZ) {
            i++;
            c37801EsX = c37801EsX.LIZIZ;
            o.LJI(c37801EsX);
        }
        if (o.LJ(c37801EsX, this)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("start", c37801EsX.LJ);
        C37801EsX c37801EsX2 = this.LIZIZ;
        if (c37801EsX2 != null) {
            j = c37801EsX2.LJFF;
        } else {
            j = this.LJ;
        }
        jSONObject.put("end", j);
        jSONObject.put("count", i);
        return jSONObject;
    }
}
