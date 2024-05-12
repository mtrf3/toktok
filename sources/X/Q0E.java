package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q0E {
    public static final Q0G LIZ;
    public static final Q0G LIZIZ;
    public static final Q0K LIZJ;
    public static final C61647OHj LIZLLL;
    public static final C61647OHj LJ;

    static {
        Q0G q0g = new Q0G();
        LIZ = q0g;
        Q0G q0g2 = new Q0G();
        LIZIZ = q0g2;
        Q0K q0k = new Q0K();
        LIZJ = q0k;
        LIZLLL = new C61647OHj(q0g2, q0k);
        LJ = new C61647OHj(q0g2, q0g);
    }

    public static void LIZIZ() {
        Object LIZ2;
        try {
            if (Q0O.LIZ) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("start parse condition in  thread : ");
                Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                o.LJFF(LLLLIIIILLL, "Thread.currentThread()");
                LIZ3.append(LLLLIIIILLL.getName());
                Q0L.LIZ("preParseCondition", X1D.LIZIZ(LIZ3));
            }
            long nanoTime = System.nanoTime();
            LIZ(LIZ.LIZJ);
            LIZ(LIZIZ.LIZJ);
            LIZ(LIZJ.LIZJ);
            long nanoTime2 = System.nanoTime() - nanoTime;
            if (Q0O.LIZ) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("cost:");
                LIZ4.append(nanoTime2 / 1000);
                LIZ4.append("us");
                Q0L.LIZ("preParseCondition", X1D.LIZIZ(LIZ4));
            }
            LIZ2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        C3C5.m10exceptionOrNullimpl(LIZ2);
    }

    public static void LIZ(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            o.LJFF(keys, "this.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                C61641OHd c61641OHd = C61641OHd.LIZJ;
                String optString = jSONObject.optString(next);
                o.LJFF(optString, "optString(it)");
                c61641OHd.LIZ(optString);
            }
        }
    }

    public static void LIZJ(JSONObject jSONObject) {
        Object LIZ2;
        try {
            jSONObject.optString("limitVersion");
            jSONObject.optString("maxAppVersion");
            JSONObject optJSONObject = jSONObject.optJSONObject("certToLimit");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("limitToCondition");
            JSONObject optJSONObject3 = jSONObject.optJSONObject("conditions");
            Q0G q0g = LIZIZ;
            q0g.LIZ = optJSONObject;
            q0g.LIZIZ = optJSONObject2;
            q0g.LIZJ = optJSONObject3;
            LIZ2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        C3C5.m10exceptionOrNullimpl(LIZ2);
    }
}
