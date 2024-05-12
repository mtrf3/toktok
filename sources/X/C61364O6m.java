package X;

import java.util.List;
import org.json.JSONArray;

/* renamed from: X.O6m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61364O6m {
    public static C61364O6m LIZ;

    public static List LIZ() {
        JSONArray jSONArray;
        long currentTimeMillis = System.currentTimeMillis();
        String LJIIIIZZ = O76.LJI().LJIIIIZZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("load splashAdData from local time : ");
        LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
        X1D.LIZIZ(LIZ2);
        try {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!C78886Uxe.LJJIIZI(LJIIIIZZ)) {
                jSONArray = new JSONArray(LJIIIIZZ);
            } else {
                jSONArray = new JSONArray();
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("generate json array time : ");
            LIZ3.append(System.currentTimeMillis() - currentTimeMillis2);
            X1D.LIZIZ(LIZ3);
            List<O7E> LIZ4 = O77.LIZ(jSONArray, 0L, true);
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("parseSplashAdList time : ");
            LIZ5.append(System.currentTimeMillis() - currentTimeMillis2);
            X1D.LIZIZ(LIZ5);
            return LIZ4;
        } catch (Exception unused) {
            return null;
        }
    }
}
