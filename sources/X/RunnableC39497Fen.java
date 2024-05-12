package X;

import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Fen, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC39497Fen implements Runnable {
    public final /* synthetic */ C39495Fel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C39492Fei LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    public RunnableC39497Fen(C39495Fel c39495Fel, String str, C39492Fei c39492Fei, boolean z, String str2, boolean z2) {
        this.LJLIL = c39495Fel;
        this.LJLILLLLZI = str;
        this.LJLJI = c39492Fei;
        this.LJLJJI = z;
        this.LJLJJL = str2;
        this.LJLJJLL = z2;
    }

    public final void LIZ() {
        Object obj;
        java.util.Map<String, String> map;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        JSONObject jSONObject = new JSONObject();
        Object obj6 = this.LJLILLLLZI;
        if (obj6 != null) {
            jSONObject.put("risk_id", obj6);
        }
        C39492Fei c39492Fei = this.LJLJI;
        if (c39492Fei != null && (obj5 = c39492Fei.LJLIL) != null) {
            jSONObject.put("url", obj5);
        }
        C39492Fei c39492Fei2 = this.LJLJI;
        if (c39492Fei2 != null && (obj4 = c39492Fei2.LJLJJI) != null) {
            jSONObject.put("host", obj4);
        }
        C39492Fei c39492Fei3 = this.LJLJI;
        if (c39492Fei3 != null && (obj3 = c39492Fei3.LJLJI) != null) {
            jSONObject.put("scheme", obj3);
        }
        C39492Fei c39492Fei4 = this.LJLJI;
        if (c39492Fei4 != null && (obj2 = c39492Fei4.LJLJJLL) != null) {
            jSONObject.put("path", obj2);
        }
        C39492Fei c39492Fei5 = this.LJLJI;
        if (c39492Fei5 != null && (map = c39492Fei5.LJLJL) != null && (!map.isEmpty())) {
            if (this.LJLJJI) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next().getKey(), "");
                }
                jSONObject.put("querys", linkedHashMap);
            } else {
                jSONObject.put("querys", map);
            }
        }
        C39492Fei LIZIZ = C35997EAv.LIZIZ(this.LJLJJL);
        if (LIZIZ != null && (obj = LIZIZ.LJLJJL) != null) {
            jSONObject.put("referer_host", obj);
        }
        jSONObject.put("seclink_installed", this.LJLJJLL ? 1 : 0);
        IEventMonitor iEventMonitor = this.LJLIL.LIZIZ;
        if (iEventMonitor != null) {
            iEventMonitor.monitorCommonLog("rasp_risk_webview", jSONObject);
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
