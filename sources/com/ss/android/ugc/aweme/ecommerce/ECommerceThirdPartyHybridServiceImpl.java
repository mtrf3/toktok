package com.ss.android.ugc.aweme.ecommerce;

import com.ss.android.ugc.aweme.ecommerce.router.IThirdPartySparkRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEComThirdPartyHybridSparkInterceptorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ECommerceThirdPartyHybridServiceImpl implements IECommerceThirdPartyHybridService {
    @Override // com.ss.android.ugc.aweme.ecommerce.IECommerceThirdPartyHybridService
    public final List<IThirdPartySparkRouterInterceptor> LIZ(String str) {
        ArrayList arrayList = new ArrayList();
        Set services = ServiceManager.get().getServices(IEComThirdPartyHybridSparkInterceptorService.class);
        o.LJIIIIZZ(services, "get().getServices(IEComT…eptorService::class.java)");
        Iterator it = services.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((IEComThirdPartyHybridSparkInterceptorService) it.next()).LIZ(str));
        }
        return arrayList;
    }
}
