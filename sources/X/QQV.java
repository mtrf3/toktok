package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public class QQV {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;

    public QQV() {
    }

    public QQV(int i) {
    }

    public static QQV LIZ(String str) {
        QQV qqv = new QQV();
        try {
            JSONObject jSONObject = new JSONObject(str);
            qqv.LIZ = jSONObject.optLong("launch", 0L);
            qqv.LIZIZ = jSONObject.optLong("leave", 0L);
            qqv.LIZJ = jSONObject.optLong("badge", 0L);
        } catch (Throwable unused) {
        }
        return qqv;
    }
}
