package X;

import android.text.TextUtils;
import java.util.HashMap;
import ms.bd.o.b;
import ms.bd.o.k;
import ms.bd.o.q2;
import org.json.JSONObject;

/* renamed from: X.Fi3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39699Fi3 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap<String, String> LIZLLL = q2.LIZLLL();
            jSONObject.put(q2.LJIIIIZZ, q2.LIZ());
            jSONObject.put(q2.LIZLLL, q2.LIZJ(q2.LIZ, LIZLLL));
            jSONObject.put(q2.LJ, q2.LIZJ(q2.LIZIZ, LIZLLL));
            jSONObject.put(q2.LJI, q2.LIZIZ((String) k.a(16777217, 0, 0L, "e96fc6", new byte[]{59, 40, 92, 1, 19, 37, 99, 14, 110, 53, 113, 40, 10, 1, 69, 50, 114, 29, 106, 121, 119, 43, 80, 93, 95, 49, 115, 72, 40, 53, 100, 46, 67, 0, 89, 48, 41, 27, 119, 35, 125, 53, 67, 29, 99, 44, 103, 0, 88, 48, 102, 62, 84})));
            jSONObject.put(q2.LJII, q2.LIZIZ((String) k.a(16777217, 0, 0L, "8bf920", new byte[]{102, 115, 12, 94, 66, 35, 62, 85, 62, 106, 44, 115, 90, 94, 20, 52, 47, 70, 58, 38, 42, 112, 0, 2, 14, 55, 46, 19, 120, 106, 57, 117, 19, 95, 8, 54, 116, 64, 39, 124, 32, 110, 19, 66, 50, 42, 50, 77, 8, 111, 59, 101, 4})));
            jSONObject.put(q2.LJFF, q2.LIZJ(q2.LIZJ, LIZLLL));
        } catch (Throwable unused) {
        }
        String jSONObject2 = jSONObject.toString();
        if (TextUtils.isEmpty(jSONObject2)) {
            return k.a(16777217, 0, 0L, "a3f4af", new byte[]{107, 44});
        }
        return jSONObject2.trim();
    }
}
