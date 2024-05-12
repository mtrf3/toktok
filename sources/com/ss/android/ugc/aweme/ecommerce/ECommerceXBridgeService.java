package com.ss.android.ugc.aweme.ecommerce;

import X.InterfaceC37666EqM;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.xbridge.IECommerceXBridgeService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ECommerceXBridgeService implements IECommerceXBridgeService {
    @Override // com.ss.android.ugc.aweme.i18n.xbridge.IECommerceXBridgeService
    public final List<Class<? extends InterfaceC37666EqM>> LIZ() {
        ArrayList arrayList = new ArrayList();
        Set services = ServiceManager.get().getServices(IEcommerceInternalJSBridgeService.class);
        o.LJIIIIZZ(services, "get().getServices(IEcomm…ridgeService::class.java)");
        Iterator it = services.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((IEcommerceInternalJSBridgeService) it.next()).LIZLLL());
        }
        return arrayList;
    }
}
