package X;

import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Feo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC39498Feo implements Runnable {
    public final /* synthetic */ C39496Fem LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C39492Fei LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public RunnableC39498Feo(C39496Fem c39496Fem, String str, C39492Fei c39492Fei, boolean z, String str2) {
        this.LJLIL = c39496Fem;
        this.LJLILLLLZI = str;
        this.LJLJI = c39492Fei;
        this.LJLJJI = z;
        this.LJLJJL = str2;
    }

    public final void LIZ() {
        java.util.Map<String, String> map;
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject = new JSONObject();
        String str5 = this.LJLILLLLZI;
        if (str5 != null) {
            jSONObject.put("risk_id", str5);
        }
        C39492Fei c39492Fei = this.LJLJI;
        if (c39492Fei != null && (str4 = c39492Fei.LJLIL) != null) {
            jSONObject.put("router", str4);
        }
        C39492Fei c39492Fei2 = this.LJLJI;
        if (c39492Fei2 != null && (str3 = c39492Fei2.LJLJJI) != null) {
            jSONObject.put("router_host", str3);
        }
        C39492Fei c39492Fei3 = this.LJLJI;
        if (c39492Fei3 != null && (str2 = c39492Fei3.LJLJI) != null) {
            jSONObject.put("router_scheme", str2);
        }
        C39492Fei c39492Fei4 = this.LJLJI;
        if (c39492Fei4 != null && (str = c39492Fei4.LJLJJLL) != null) {
            jSONObject.put("router_path", str);
        }
        C39492Fei c39492Fei5 = this.LJLJI;
        if (c39492Fei5 != null && (map = c39492Fei5.LJLJL) != null && (!map.isEmpty())) {
            if (this.LJLJJI) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next().getKey(), "");
                }
                jSONObject.put("router_querys", linkedHashMap);
            } else {
                jSONObject.put("router_querys", map);
            }
        }
        jSONObject.put(WM7.SCENE_SERVICE, this.LJLJJL);
        IEventMonitor iEventMonitor = this.LJLIL.LIZ;
        if (iEventMonitor != null) {
            iEventMonitor.monitorCommonLog("rasp_risk_router", jSONObject);
        }
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
