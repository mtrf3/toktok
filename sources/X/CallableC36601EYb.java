package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EYb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC36601EYb<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ java.util.Map<String, String> LJLJJI;
    public final /* synthetic */ C36602EYc LJLJJL;

    public CallableC36601EYb(String str, String str2, JSONObject jSONObject, java.util.Map<String, String> map, C36602EYc c36602EYc) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = jSONObject;
        this.LJLJJI = map;
        this.LJLJJL = c36602EYc;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        List list;
        try {
            String str2 = this.LJLIL;
            if (str2 != null) {
                String str3 = this.LJLILLLLZI;
                JSONObject jSONObject = this.LJLJI;
                java.util.Map<String, String> map = this.LJLJJI;
                if (map != null) {
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        arrayList.add(new EJ6(entry.getKey(), entry.getValue()));
                    }
                    list = ORZ.LLJILJILJ(arrayList);
                } else {
                    list = null;
                }
                str = EYV.LIZIZ(str3, jSONObject, str2, list);
            } else {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject2 = this.LJLJI;
                if (jSONObject2 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        String value = this.LJLJI.optString(key, "");
                        o.LJIIIIZZ(key, "key");
                        o.LJIIIIZZ(value, "value");
                        hashMap.put(key, value);
                    }
                }
                String str4 = this.LJLJJL.LJLIL.doPost(this.LJLILLLLZI, hashMap).execute().LIZIZ;
                o.LJIIIIZZ(str4, "sApi.doPost(url, map).execute().body()");
                str = str4;
            }
            byte[] bytes = str.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            return new C36605EYf(true, bytes, null);
        } catch (Throwable th) {
            return new C36605EYf(false, null, th);
        }
    }
}
