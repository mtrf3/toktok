package X;

import com.bytedance.lynx.hybrid.settings.HybridSettings;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class Y7X implements InterfaceC86859Y7b {
    @Override // X.InterfaceC86859Y7b
    public final void LIZ(String reason) {
        ConcurrentHashMap concurrentHashMap;
        o.LJIIJ(reason, "reason");
        C39048FUe.LIZIZ.LIZ("hybrid settings fetch failed", EnumC39866Fkk.E, "Hybrid Settings");
        HybridSettings hybridSettings = HybridSettings.INSTANCE;
        concurrentHashMap = HybridSettings.settingsMap;
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC86859Y7b interfaceC86859Y7b = ((C86858Y7a) ((Map.Entry) it.next()).getValue()).LIZ;
            if (interfaceC86859Y7b != null) {
                interfaceC86859Y7b.LIZ(reason);
            }
        }
    }

    @Override // X.InterfaceC86859Y7b
    public final void LIZIZ(String str, JSONObject jSONObject) {
        ConcurrentHashMap concurrentHashMap;
        HybridSettings hybridSettings = HybridSettings.INSTANCE;
        concurrentHashMap = HybridSettings.settingsMap;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (jSONObject == null || str == null) {
                InterfaceC86859Y7b interfaceC86859Y7b = ((C86858Y7a) entry.getValue()).LIZ;
                if (interfaceC86859Y7b != null) {
                    interfaceC86859Y7b.LIZIZ(null, null);
                    return;
                }
                return;
            }
            HybridSettings hybridSettings2 = HybridSettings.INSTANCE;
            Object key = entry.getKey();
            o.LJFF(key, "entry.key");
            OSZ<JSONObject, String> extractConfig = hybridSettings2.extractConfig(jSONObject, (String) key);
            InterfaceC86859Y7b interfaceC86859Y7b2 = ((C86858Y7a) entry.getValue()).LIZ;
            if (interfaceC86859Y7b2 != null) {
                interfaceC86859Y7b2.LIZIZ(extractConfig.getSecond(), extractConfig.getFirst());
            }
            synchronized (this) {
                ((C86858Y7a) entry.getValue()).LIZIZ = extractConfig.getFirst();
            }
        }
    }

    @Override // X.InterfaceC86859Y7b
    public final void LIZJ(String content, JSONObject config) {
        ConcurrentHashMap concurrentHashMap;
        o.LJIIJ(config, "config");
        o.LJIIJ(content, "content");
        HybridSettings hybridSettings = HybridSettings.INSTANCE;
        concurrentHashMap = HybridSettings.settingsMap;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            HybridSettings hybridSettings2 = HybridSettings.INSTANCE;
            Object key = entry.getKey();
            o.LJFF(key, "entry.key");
            OSZ<JSONObject, String> extractConfig = hybridSettings2.extractConfig(config, (String) key);
            InterfaceC86859Y7b interfaceC86859Y7b = ((C86858Y7a) entry.getValue()).LIZ;
            if (interfaceC86859Y7b != null) {
                interfaceC86859Y7b.LIZJ(extractConfig.getSecond(), extractConfig.getFirst());
            }
            synchronized (this) {
                ((C86858Y7a) entry.getValue()).LIZIZ = extractConfig.getFirst();
            }
        }
    }
}
