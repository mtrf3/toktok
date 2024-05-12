package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.N6z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58829N6z extends N73 {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        N72 n72 = (N72) xBaseParamModel;
        o.LJIIIZ(type, "type");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map<String, Object> params = n72.getParams();
        if (params != null) {
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        linkedHashMap.put("inc_position", "h5");
        C26408AYa.LJII(n72.getEvent(), linkedHashMap, 4);
        if (n72.getTerminateFlow()) {
            C26408AYa.LJ();
            C26408AYa.LIZIZ = null;
        }
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(N70.class, null), "");
    }
}
