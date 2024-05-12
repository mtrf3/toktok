package com.ss.android.ugc.aweme.compliance.common.serviceimpl;

import X.C221108m2;
import X.C51029K0z;
import X.C58561Myb;
import X.C58562Myc;
import X.C62822Ol8;
import X.InterfaceC253409x2;
import X.X1D;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.services.hydrogen.IHydrogenService;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.HydrogenInterceptor;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class HydrogenServiceImpl implements IHydrogenService {
    public boolean LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C58562Myc.LJLIL);

    @Override // com.ss.android.ugc.aweme.compliance.api.services.hydrogen.IHydrogenService
    public final void LIZ(List<? extends InterfaceC253409x2> customConfigs) {
        o.LJIIIZ(customConfigs, "customConfigs");
        if (!this.LIZ) {
            this.LIZIZ.getValue().getClass();
            for (InterfaceC253409x2 interfaceC253409x2 : customConfigs) {
                HashMap<String, String> hashMap = C58561Myb.LIZ;
                Map<String, String> config = interfaceC253409x2.getConfig();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(config.size()));
                for (Map.Entry<String, String> entry : config.entrySet()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("aweme://hyd_action/");
                    LIZ.append(entry.getKey());
                    linkedHashMap.put(X1D.LIZIZ(LIZ), entry.getValue());
                }
                hashMap.putAll(linkedHashMap);
            }
            HydrogenInterceptor hydrogenInterceptor = new HydrogenInterceptor();
            hydrogenInterceptor.setRewriteMap(C58561Myb.LIZ);
            SmartRouter.addInterceptor(hydrogenInterceptor);
            this.LIZ = true;
        }
    }
}
