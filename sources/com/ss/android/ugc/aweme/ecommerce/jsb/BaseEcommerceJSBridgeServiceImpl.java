package com.ss.android.ugc.aweme.ecommerce.jsb;

import X.C113554cx;
import X.C38150EyA;
import X.C47261Igj;
import X.C71878SIw;
import X.F3T;
import X.InterfaceC37666EqM;
import X.InterfaceC38012Evw;
import X.InterfaceC38186Eyk;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BaseEcommerceJSBridgeServiceImpl implements IEcommerceInternalJSBridgeService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final List<Class<? extends InterfaceC37666EqM>> LIZLLL() {
        return C47261Igj.LJJIJ(C71878SIw.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final List<InterfaceC38186Eyk> LIZ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new OpenThirdPartyAppMethodBullet(providerFactory));
        arrayList.add(new CloseTopWebViewBulletMethod(providerFactory));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final Map LIZIZ(C38150EyA c38150EyA) {
        if (c38150EyA == null) {
            return C113554cx.LJJJLIIL();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("closeTopWebView", new CloseTopWebViewJavaMethod(c38150EyA.LJ));
        linkedHashMap.put("openThirdPartyApp", new OpenThirdPartyAppMethod(c38150EyA.LJ));
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final InterfaceC38012Evw LIZJ(C38150EyA c38150EyA, String name) {
        o.LJIIIZ(name, "name");
        if (o.LJ(name, "closeTopWebView")) {
            return new CloseTopWebViewJavaMethod(c38150EyA.LJ);
        }
        if (o.LJ(name, "openThirdPartyApp")) {
            return new OpenThirdPartyAppMethod(c38150EyA.LJ);
        }
        return null;
    }
}
