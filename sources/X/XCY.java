package X;

import com.ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XCY implements InterfaceC84447XCh {
    public final XCG LIZ;
    public final InterfaceC88474Ynu<String, String, java.util.Map<String, Effect>, InterfaceC84451XCl, C76800UCe> LIZIZ;

    public XCY(XCG effectConfig, C84443XCd c84443XCd) {
        o.LJIIJ(effectConfig, "effectConfig");
        this.LIZ = effectConfig;
        this.LIZIZ = c84443XCd;
    }

    @Override // X.InterfaceC84447XCh
    public final void LIZ(List<? extends Effect> list, InterfaceC84451XCl interfaceC84451XCl) {
        List<String> url_prefix;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Effect effect = (Effect) it.next();
            Integer url_sub_type = effect.getIcon_url().getUrl_sub_type();
            if (url_sub_type != null && url_sub_type.intValue() == 1 && ((url_prefix = effect.getIcon_url().getUrl_prefix()) == null || url_prefix.isEmpty())) {
                String uri = effect.getIcon_url().getUri();
                if (uri != null) {
                    linkedHashMap.put(uri, effect);
                }
            }
        }
        XCK xck = this.LIZ.LJIILJJIL;
        if (xck != null) {
            String str = xck.LIZ;
            String str2 = xck.LIZIZ;
            if (str2 != null && str != null && (!linkedHashMap.isEmpty())) {
                this.LIZIZ.invoke(str, str2, linkedHashMap, interfaceC84451XCl);
                return;
            }
        }
        interfaceC84451XCl.onSuccess();
    }
}
