package X;

import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QQO {
    public static QQO LIZIZ;
    public final C66874QMk LIZ = PushMultiProcessSharedProvider.LIZLLL(QM0.LIZ);

    public static synchronized QQO LIZ() {
        QQO qqo;
        synchronized (QQO.class) {
            if (LIZIZ == null) {
                synchronized (QQO.class) {
                    if (LIZIZ == null) {
                        LIZIZ = new QQO();
                    }
                }
            }
            qqo = LIZIZ;
        }
        return qqo;
    }

    public final void LIZIZ(java.util.Map<String, String> map) {
        Logger.debug();
        try {
            String LJ = this.LIZ.LJ("ssids");
            if (!C38354F3m.LJ(LJ) && !C38354F3m.LJ(LJ)) {
                JSONObject jSONObject = new JSONObject(LJ);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = JSONObjectProtectorUtils.getString(jSONObject, next);
                    if (!C38354F3m.LJ(next) && !C38354F3m.LJ(string)) {
                        ((HashMap) map).put(next, string);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
