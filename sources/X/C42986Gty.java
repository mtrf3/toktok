package X;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Gty, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42986Gty extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "abnor_player";
    }

    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis() - LIZLLL();
        C43176Gx2.LIZ.getClass();
        List LJ = C43176Gx2.LJ(currentTimeMillis, "block");
        List<C43189GxF> LJ2 = C43176Gx2.LJ(currentTimeMillis, "error");
        JSONObject jSONObject = new JSONObject();
        if (!LJ.isEmpty()) {
            jSONObject.put("block_count", LJ.size());
        }
        if (!LJ2.isEmpty()) {
            jSONObject.put("error_count", LJ2.size());
            JSONArray jSONArray = new JSONArray();
            for (C43189GxF c43189GxF : LJ2) {
                if (c43189GxF != null) {
                    jSONArray.put(new JSONObject(c43189GxF.LIZLLL));
                }
            }
            jSONObject.put("error_code_msg", jSONArray);
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "result.toString()");
        return jSONObject2;
    }

    @Override // X.AbstractC43178Gx4
    public final boolean LIZ(String type) {
        o.LJIIIZ(type, "type");
        if (o.LJ(type, "block")) {
            return true;
        }
        return o.LJ(type, "error");
    }
}
