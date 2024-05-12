package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.OHd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61641OHd implements InterfaceC61645OHh {
    public static final java.util.Map<String, Class<? extends AbstractC61642OHe>> LIZ;
    public static final java.util.Map<String, InterfaceC61646OHi> LIZIZ;
    public static final C61641OHd LIZJ = new C61641OHd();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ = linkedHashMap;
        LIZIZ = new ConcurrentHashMap();
        linkedHashMap.put(EnumC61643OHf.CONFIG.getValue(), C61638OHa.class);
        linkedHashMap.put(EnumC61643OHf.PLACEHOLDER.getValue(), C61639OHb.class);
        linkedHashMap.put(EnumC61643OHf.INVALID.getValue(), C61644OHg.class);
        linkedHashMap.put(EnumC61643OHf.ENTRY_VERIFY.getValue(), C61640OHc.class);
    }

    @Override // X.InterfaceC61645OHh
    public final InterfaceC61646OHi LIZ(String conditionConfig) {
        o.LJIIJ(conditionConfig, "conditionConfig");
        java.util.Map<String, InterfaceC61646OHi> map = LIZIZ;
        InterfaceC61646OHi interfaceC61646OHi = (InterfaceC61646OHi) ((ConcurrentHashMap) map).get(conditionConfig);
        if (interfaceC61646OHi != null) {
            return interfaceC61646OHi;
        }
        JSONObject jSONObject = new JSONObject(conditionConfig);
        Class cls = (Class) ((LinkedHashMap) LIZ).get(JSONObjectProtectorUtils.getString(jSONObject, "type"));
        if (cls != null) {
            InterfaceC61646OHi interfaceC61646OHi2 = (InterfaceC61646OHi) cls.newInstance();
            AbstractC61642OHe abstractC61642OHe = (AbstractC61642OHe) interfaceC61646OHi2;
            abstractC61642OHe.getClass();
            abstractC61642OHe.LIZ = jSONObject;
            abstractC61642OHe.LIZIZ(jSONObject.optJSONObject("params"));
            ((ConcurrentHashMap) map).put(conditionConfig, interfaceC61646OHi2);
            return interfaceC61646OHi2;
        }
        return interfaceC61646OHi;
    }
}
