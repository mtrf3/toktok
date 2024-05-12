package com.ss.android.ugc.aweme.ecommerce.core.jsb;

import X.C113554cx;
import X.C37677EqX;
import X.C38150EyA;
import X.C43126GwE;
import X.C47261Igj;
import X.C58871N8p;
import X.C71045RuT;
import X.C71804SGa;
import X.C78984UzE;
import X.C86420Xvs;
import X.F3T;
import X.HUF;
import X.InterfaceC37666EqM;
import X.InterfaceC38012Evw;
import X.InterfaceC38186Eyk;
import X.N9R;
import X.NA8;
import X.OK6;
import X.SGU;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TransactionEcommerceJSBridgeServiceImpl implements IEcommerceInternalJSBridgeService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final List<Class<? extends InterfaceC37666EqM>> LIZLLL() {
        return C47261Igj.LJJIJIIJI(NA8.class, N9R.class, C71045RuT.class, C71804SGa.class, SGU.class, C43126GwE.class, HUF.class, C37677EqX.class, C86420Xvs.class, OK6.class, C78984UzE.class, C58871N8p.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final List<InterfaceC38186Eyk> LIZ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PhoneCountryCodeTranslateMethodBullet(providerFactory));
        arrayList.add(new GetInfoByOCRMethodBullet(providerFactory));
        arrayList.add(new UpdateNonceMethodBullet(providerFactory));
        arrayList.add(new PrefetchSchemaBulletMethod(providerFactory));
        arrayList.add(new IXLruCacheGetBulletMethod(providerFactory));
        arrayList.add(new IXLruCacheSetBulletMethod(providerFactory));
        arrayList.add(new GetSmsOtpMethodBullet(providerFactory));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final Map LIZIZ(C38150EyA c38150EyA) {
        if (c38150EyA == null) {
            return C113554cx.LJJJLIIL();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("phoneCountryCodeTranslate", new PhoneCountryCodeTranslateMethod(c38150EyA.LJ));
        linkedHashMap.put("pipo.getInfoByOcr", new GetInfoByOCRMethod(c38150EyA.LJ));
        linkedHashMap.put("pipo.updateNonce", new UpdateNonceMethod(c38150EyA.LJ));
        linkedHashMap.put("prefetchSchema", new PrefetchSchemaJavaMethod(c38150EyA.LJ));
        linkedHashMap.put("webcast_i18n.lruCacheGet", new IXLruCacheGetH5Method(c38150EyA.LJ));
        linkedHashMap.put("webcast_i18n.lruCacheSet", new IXLruCacheSetH5Method(c38150EyA.LJ));
        linkedHashMap.put("getSmsOtp", new GetSmsOtpMethod(c38150EyA.LJ));
        return linkedHashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService
    public final InterfaceC38012Evw LIZJ(C38150EyA c38150EyA, String name) {
        o.LJIIIZ(name, "name");
        switch (name.hashCode()) {
            case 91457904:
                if (name.equals("pipo.updateNonce")) {
                    return new UpdateNonceMethod(c38150EyA.LJ);
                }
                return null;
            case 797569544:
                if (name.equals("getSmsOtp")) {
                    return new GetSmsOtpMethod(c38150EyA.LJ);
                }
                return null;
            case 812977784:
                if (name.equals("prefetchSchema")) {
                    return new PrefetchSchemaJavaMethod(c38150EyA.LJ);
                }
                return null;
            case 823739129:
                if (name.equals("pipo.getInfoByOcr")) {
                    return new GetInfoByOCRMethod(c38150EyA.LJ);
                }
                return null;
            case 917322655:
                if (name.equals("webcast_i18n.lruCacheGet")) {
                    return new IXLruCacheGetH5Method(c38150EyA.LJ);
                }
                return null;
            case 917334187:
                if (name.equals("webcast_i18n.lruCacheSet")) {
                    return new IXLruCacheSetH5Method(c38150EyA.LJ);
                }
                return null;
            case 1903134841:
                if (name.equals("phoneCountryCodeTranslate")) {
                    return new PhoneCountryCodeTranslateMethod(c38150EyA.LJ);
                }
                return null;
            default:
                return null;
        }
    }
}
