package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostLogDepend;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.N7l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58841N7l extends AbstractC58842N7m {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        boolean z;
        IHostLogDepend iHostLogDepend;
        InterfaceC58843N7n interfaceC58843N7n = (InterfaceC58843N7n) xBaseParamModel;
        o.LJIIJ(type, "type");
        String eventName = interfaceC58843N7n.getEventName();
        if (eventName == null || eventName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            C31626Cb8.LIZ(c37356ElM, -3, null, 6);
            return;
        }
        java.util.Map<String, Object> params = interfaceC58843N7n.getParams();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (params != null) {
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        C86289Xtl c86289Xtl = C86289Xtl.LJFF;
        if (c86289Xtl != null && (iHostLogDepend = c86289Xtl.LJ) != null) {
            iHostLogDepend.onEventV3Map(eventName, linkedHashMap);
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        }
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC58844N7o.class, str), "");
    }
}
