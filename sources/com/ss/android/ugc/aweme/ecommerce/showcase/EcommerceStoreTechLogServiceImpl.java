package com.ss.android.ugc.aweme.ecommerce.showcase;

import X.C58096Mr6;
import X.C78685UuP;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreTechLogService;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class EcommerceStoreTechLogServiceImpl implements IEcommerceStoreTechLogService {
    public static IEcommerceStoreTechLogService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IEcommerceStoreTechLogService.class, false);
        if (LIZ != null) {
            return (IEcommerceStoreTechLogService) LIZ;
        }
        if (C58096Mr6.b0 == null) {
            synchronized (IEcommerceStoreTechLogService.class) {
                if (C58096Mr6.b0 == null) {
                    C58096Mr6.b0 = new EcommerceStoreTechLogServiceImpl();
                }
            }
        }
        return C58096Mr6.b0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreTechLogService
    public final void LIZ(String userId, String enterFrom, String str, Map map, boolean z) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(enterFrom, "enterFrom");
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("is_self", z ? 1 : 0);
        jSONObject.put("author_id", userId);
        jSONObject.put("enter_from", enterFrom);
        jSONObject.put("subpage_name", str);
        C78685UuP.LJJLIIIJL("rd_tiktokec_enter_page", jSONObject);
    }
}
