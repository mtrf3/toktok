package Y;

import X.C16880lQ;
import X.C36779Ec3;
import X.C36780Ec4;
import X.C64923Pdv;
import X.EJ6;
import X.EYV;
import X.F1E;
import X.F1F;
import X.FVP;
import X.ORZ;
import X.QJY;
import X.WM7;
import android.content.Context;
import com.ss.android.common.applog.AppLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ACallableS7S2200000_6 implements Callable {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS7S2200000_6 aCallableS7S2200000_6) {
        String str;
        List list;
        String LIZLLL = C36780Ec4.LIZLLL(aCallableS7S2200000_6.s0);
        String LIZLLL2 = C36780Ec4.LIZLLL(aCallableS7S2200000_6.s0);
        JSONObject jSONObject = (JSONObject) aCallableS7S2200000_6.l2;
        F1F f1f = new F1F("post", LIZLLL2, jSONObject);
        String str2 = "";
        try {
            String str3 = aCallableS7S2200000_6.s1;
            if (str3 != null) {
                Map map = (Map) aCallableS7S2200000_6.l3;
                if (map != null) {
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(new EJ6((String) entry.getKey(), (String) entry.getValue()));
                    }
                    list = ORZ.LLJILJILJ(arrayList);
                } else {
                    list = null;
                }
                str = EYV.LIZIZ(LIZLLL, jSONObject, str3, list);
            } else {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject2 = (JSONObject) aCallableS7S2200000_6.l2;
                if (jSONObject2 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        String value = ((JSONObject) aCallableS7S2200000_6.l2).optString(key, "");
                        o.LJIIIIZZ(key, "key");
                        o.LJIIIIZZ(value, "value");
                        hashMap.put(key, value);
                    }
                }
                QJY.LJI(hashMap, true);
                String str4 = C36780Ec4.LJLILLLLZI.doPost(aCallableS7S2200000_6.s0, hashMap).execute().LIZIZ;
                o.LJIIIIZZ(str4, "JS_API.doPost(url, map).execute().body()");
                str = str4;
            }
            str2 = str;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("code", 1);
            jSONObject3.put("response", new JSONObject(str2));
            jSONObject3.put("_raw", str2);
            return new C36779Ec3(f1f, new F1E(null, jSONObject3));
        } catch (C64923Pdv e) {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("code", 0);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("errCode", e.getStatusCode());
                jSONObject5.put("message", e.getMessage());
                jSONObject4.put("error", jSONObject5);
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            return new C36779Ec3(f1f, new F1E(e, jSONObject4));
        } catch (Exception e3) {
            JSONObject jSONObject6 = new JSONObject();
            try {
                jSONObject6.put("code", 0);
                jSONObject6.put("response", new JSONObject(str2));
                jSONObject6.put("_raw", str2);
            } catch (JSONException e4) {
                C16880lQ.LLLLIIL(e4);
            }
            return new C36779Ec3(f1f, new F1E(e3, jSONObject6));
        }
    }

    public static final Object call$1(ACallableS7S2200000_6 aCallableS7S2200000_6) {
        JSONObject jSONObject = (JSONObject) aCallableS7S2200000_6.l2;
        String str = aCallableS7S2200000_6.s0;
        String str2 = aCallableS7S2200000_6.s1;
        Context context = (Context) aCallableS7S2200000_6.l3;
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.get(next));
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("event", str);
        jSONObject2.put("session_id", FVP.LIZIZ);
        jSONObject2.put(WM7.SCENE_SERVICE, str2);
        AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_recordMiscLog(context, "app_perf", jSONObject2);
        return null;
    }

    public ACallableS7S2200000_6(Context context, String str, JSONObject jSONObject, int i) {
        this.$t = i;
        this.l2 = jSONObject;
        this.s0 = str;
        this.s1 = "low_retain";
        this.l3 = context;
    }

    public ACallableS7S2200000_6(String str, String str2, Map map, JSONObject jSONObject, int i) {
        this.$t = i;
        this.s0 = str;
        this.l2 = jSONObject;
        this.s1 = str2;
        this.l3 = map;
    }
}
