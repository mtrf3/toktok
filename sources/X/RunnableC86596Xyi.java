package X;

import android.util.Base64;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Xyi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC86596Xyi implements Runnable {
    public final /* synthetic */ java.util.Map<String, Object> LJLIL;
    public final /* synthetic */ InterfaceC86610Xyw LJLILLLLZI;
    public final /* synthetic */ HashMap<String, Object> LJLJI;
    public final /* synthetic */ EnumC37844EtE LJLJJI;
    public final /* synthetic */ C86603Xyp LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ Object LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ int LJLJLLL;
    public final /* synthetic */ boolean LJLL;
    public final /* synthetic */ Integer LJLLI;
    public final /* synthetic */ String LJLLILLLL;
    public final /* synthetic */ CompletionBlock<InterfaceC86614Xz0> LJLLJ;
    public final /* synthetic */ String LJLLL;

    public RunnableC86596Xyi(java.util.Map map, InterfaceC86610Xyw interfaceC86610Xyw, HashMap hashMap, EnumC37844EtE enumC37844EtE, C86603Xyp c86603Xyp, String str, Object obj, String str2, int i, boolean z, Integer num, String str3, C37356ElM c37356ElM, String str4) {
        this.LJLIL = map;
        this.LJLILLLLZI = interfaceC86610Xyw;
        this.LJLJI = hashMap;
        this.LJLJJI = enumC37844EtE;
        this.LJLJJL = c86603Xyp;
        this.LJLJJLL = str;
        this.LJLJL = obj;
        this.LJLJLJ = str2;
        this.LJLJLLL = i;
        this.LJLL = z;
        this.LJLLI = num;
        this.LJLLILLLL = str3;
        this.LJLLJ = c37356ElM;
        this.LJLLL = str4;
    }

    public final void LIZ() {
        String str;
        String str2;
        C76800UCe c76800UCe = null;
        if (this.LJLIL.containsKey("content-type")) {
            Object obj = this.LJLIL.get("content-type");
            if (obj instanceof String) {
                str = (String) obj;
            }
            str = null;
        } else {
            if (this.LJLIL.containsKey("Content-Type")) {
                Object obj2 = this.LJLIL.get("Content-Type");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                }
            }
            str = null;
        }
        String url = this.LJLILLLLZI.getUrl();
        HashMap<String, Object> hashMap = this.LJLJI;
        EnumC37844EtE type = this.LJLJJI;
        o.LJIIIZ(url, "url");
        o.LJIIIZ(type, "type");
        EZO ezo = new EZO(url);
        if (hashMap != null) {
            try {
                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                    String name = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        int intValue = ((Number) value).intValue();
                        o.LJIIJ(name, "name");
                        ezo.LIZ.put(name, String.valueOf(intValue));
                    } else if (value instanceof Long) {
                        long longValue = ((Number) value).longValue();
                        o.LJIIJ(name, "name");
                        ezo.LIZ.put(name, String.valueOf(longValue));
                    } else if (value instanceof Double) {
                        double doubleValue = ((Number) value).doubleValue();
                        o.LJIIJ(name, "name");
                        ezo.LIZ.put(name, String.valueOf(doubleValue));
                    } else if (value instanceof String) {
                        ezo.LIZ(name, (String) value);
                    } else if (value instanceof Boolean) {
                        ezo.LIZ(name, value.toString());
                    } else if (value instanceof java.util.Map) {
                        String jSONObject = new JSONObject((java.util.Map) value).toString();
                        o.LJIIIIZZ(jSONObject, "JSONObject(value).toString()");
                        ezo.LIZ(name, jSONObject);
                    } else if (value instanceof Object[]) {
                        String jSONArray = new JSONArray(value).toString();
                        o.LJIIIIZZ(jSONArray, "JSONArray(value).toString()");
                        ezo.LIZ(name, jSONArray);
                    }
                }
                c76800UCe = C76800UCe.LIZ;
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(c76800UCe);
        if (type == EnumC37844EtE.WEB) {
            str2 = "h5";
        } else if (type == EnumC37844EtE.LYNX) {
            str2 = "lynx";
        } else {
            str2 = "";
        }
        ezo.LIZ("request_tag_from", str2);
        String LIZIZ = ezo.LIZIZ();
        C86601Xyn c86601Xyn = new C86601Xyn(this.LJLILLLLZI, this.LJLLJ, this.LJLJJI, this.LJLJJL, this.LJLLL);
        C86605Xyr c86605Xyr = new C86605Xyr(this.LJLLJ);
        C86603Xyp c86603Xyp = this.LJLJJL;
        String str3 = this.LJLJJLL;
        java.util.Map<String, Object> map = this.LJLIL;
        Object obj3 = this.LJLJL;
        String str4 = this.LJLJLJ;
        int i = this.LJLJLLL;
        boolean z = this.LJLL;
        int intValue2 = this.LJLLI.intValue();
        String str5 = this.LJLLILLLL;
        c86603Xyp.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry2 : map.entrySet()) {
            String key = entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Object[]) {
                String jSONArray2 = new JSONArray(value2).toString();
                o.LJIIIIZZ(jSONArray2, "JSONArray(value).toString()");
                linkedHashMap.put(key, jSONArray2);
            } else {
                linkedHashMap.put(key, value2.toString());
            }
        }
        linkedHashMap.put("x-tt-dataflow-id", String.valueOf(intValue2));
        if (str5 != null) {
            linkedHashMap.put("x-tt-hybrid-referer", str5);
        }
        if (o.LJ(str3, "GET")) {
            C86597Xyj c86597Xyj = C86597Xyj.LIZ;
            Boolean bool = Boolean.FALSE;
            IHostNetworkDepend LJIIIIZZ = C86603Xyp.LJIIIIZZ();
            c86597Xyj.getClass();
            C86597Xyj.LIZJ(LIZIZ, linkedHashMap, z, bool, c86601Xyn, LJIIIIZZ);
            return;
        }
        if (!o.LJ(str3, "POST")) {
            return;
        }
        if (str == null) {
            str = "application/x-www-form-urlencoded";
        }
        linkedHashMap.put("Content-Type", str);
        if (obj3 instanceof String) {
            if (o.LJ(str4, "base64")) {
                C86597Xyj c86597Xyj2 = C86597Xyj.LIZ;
                Boolean bool2 = Boolean.FALSE;
                byte[] decode = Base64.decode((String) obj3, 0);
                o.LJIIIIZZ(decode, "decode(body, Base64.DEFAULT)");
                IHostNetworkDepend LJIIIIZZ2 = C86603Xyp.LJIIIIZZ();
                c86597Xyj2.getClass();
                C86597Xyj.LJIIJ(LIZIZ, linkedHashMap, str, z, bool2, decode, c86605Xyr, LJIIIIZZ2);
                return;
            }
            C86597Xyj c86597Xyj3 = C86597Xyj.LIZ;
            Boolean bool3 = Boolean.FALSE;
            byte[] bytes = ((String) obj3).getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            IHostNetworkDepend LJIIIIZZ3 = C86603Xyp.LJIIIIZZ();
            c86597Xyj3.getClass();
            C86597Xyj.LJIIIZ(LIZIZ, linkedHashMap, str, z, bool3, bytes, c86601Xyn, LJIIIIZZ3);
            return;
        }
        if (obj3 instanceof java.util.Map) {
            C86597Xyj c86597Xyj4 = C86597Xyj.LIZ;
            Boolean bool4 = Boolean.FALSE;
            JSONObject jSONObject2 = new JSONObject((java.util.Map) obj3);
            IHostNetworkDepend LJIIIIZZ4 = C86603Xyp.LJIIIIZZ();
            Integer valueOf = Integer.valueOf(i);
            c86597Xyj4.getClass();
            C86597Xyj.LJIIIIZZ(LIZIZ, linkedHashMap, str, z, bool4, jSONObject2, c86601Xyn, LJIIIIZZ4, valueOf);
            return;
        }
        if (obj3 instanceof Object[]) {
            C86597Xyj c86597Xyj5 = C86597Xyj.LIZ;
            Boolean bool5 = Boolean.FALSE;
            String jSONArray3 = new JSONArray(obj3).toString();
            o.LJIIIIZZ(jSONArray3, "JSONArray(body).toString()");
            byte[] bytes2 = jSONArray3.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes2, "this as java.lang.String).getBytes(charset)");
            IHostNetworkDepend LJIIIIZZ5 = C86603Xyp.LJIIIIZZ();
            c86597Xyj5.getClass();
            C86597Xyj.LJIIIZ(LIZIZ, linkedHashMap, str, z, bool5, bytes2, c86601Xyn, LJIIIIZZ5);
            return;
        }
        C86597Xyj c86597Xyj6 = C86597Xyj.LIZ;
        Boolean bool6 = Boolean.FALSE;
        JSONObject jSONObject3 = new JSONObject();
        IHostNetworkDepend LJIIIIZZ6 = C86603Xyp.LJIIIIZZ();
        Integer valueOf2 = Integer.valueOf(i);
        c86597Xyj6.getClass();
        C86597Xyj.LJIIIIZZ(LIZIZ, linkedHashMap, str, z, bool6, jSONObject3, c86601Xyn, LJIIIIZZ6, valueOf2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
