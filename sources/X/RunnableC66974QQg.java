package X;

import android.app.Application;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QQg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66974QQg implements Runnable {
    public final String LJLIL;
    public final InterfaceC66984QQq LJLILLLLZI;

    public final void LIZ() {
        if (TextUtils.isEmpty(this.LJLIL)) {
            return;
        }
        Application application = QM0.LIZ;
        synchronized (C66975QQh.class) {
            C66975QQh.LIZ(application);
            java.util.Map<Integer, C66977QQj> map = C66975QQh.LIZ;
            if (map != null) {
                java.util.Map unmodifiableMap = Collections.unmodifiableMap(map);
                if (unmodifiableMap == null || unmodifiableMap.isEmpty()) {
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                for (C66977QQj c66977QQj : unmodifiableMap.values()) {
                    if (c66977QQj == null || c66977QQj.LJ <= 0 || TextUtils.isEmpty(c66977QQj.LIZLLL)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("invalid cache : ");
                        LIZ.append(c66977QQj);
                        X1D.LIZIZ(LIZ);
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("sender_id", c66977QQj.LJ);
                            jSONObject.put("token", c66977QQj.LIZLLL);
                            jSONArray.put(jSONObject);
                        } catch (JSONException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                }
                java.util.Map<String, String> LIZ2 = ((QRM) this.LJLILLLLZI).LIZ();
                ((HashMap) LIZ2).put("update_event", this.LJLIL);
                String LIZIZ = C36929EeT.LIZIZ(C73312Spw.LJFF("/service/1/update_token/"), LIZ2);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair("sender_token_list", jSONArray.toString()));
                int i = 0;
                do {
                    try {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("request url = ");
                        LIZ3.append(LIZIZ);
                        X1D.LIZIZ(LIZ3);
                        if ("success".equals(new JSONObject(AbstractC66805QJt.LIZ.LIZJ(LIZIZ, arrayList)).optString("message"))) {
                            return;
                        }
                    } catch (Throwable unused) {
                    }
                    i++;
                } while (i < 2);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            synchronized (RunnableC66976QQi.LJLJJLL) {
                LIZ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC66974QQg(InterfaceC66984QQq interfaceC66984QQq, String str) {
        this.LJLILLLLZI = interfaceC66984QQq;
        this.LJLIL = str;
    }
}
