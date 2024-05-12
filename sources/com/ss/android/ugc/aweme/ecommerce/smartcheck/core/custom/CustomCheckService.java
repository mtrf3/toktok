package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.custom;

import X.C221108m2;
import X.C35562DxW;
import X.C35772E2e;
import X.C35774E2g;
import X.C35775E2h;
import X.C62822Ol8;
import X.E92;
import X.InterfaceC35773E2f;
import X.InterfaceC67352kd;
import X.ORY;
import X.ORZ;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.api.ICustomChecker;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CustomCheckService implements ISmartCheckService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C35772E2e.LJLIL);

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final C35775E2h getServiceInfo() {
        return new C35775E2h("custom", C35774E2g.LIZ.get("custom"));
    }

    public CustomCheckService() {
        if (!C35562DxW.LIZ().getEnable() || (!((Map) r1.getValue()).isEmpty())) {
            return;
        }
        Set<ICustomChecker> services = ServiceManager.get().getServices(ICustomChecker.class);
        o.LJFF(services, "ServiceManager.get().get…ices(SERVICE::class.java)");
        for (ICustomChecker iCustomChecker : services) {
            Annotation[] annotations = iCustomChecker.getClass().getAnnotations();
            o.LJIIIIZZ(annotations, "checker.javaClass.annotations");
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : annotations) {
                if (annotation instanceof InterfaceC35773E2f) {
                    arrayList.add(annotation);
                }
            }
            InterfaceC35773E2f interfaceC35773E2f = (InterfaceC35773E2f) ORZ.LJLLLL(arrayList);
            if (interfaceC35773E2f != null) {
                if (!((Map) this.LIZ.getValue()).containsKey(interfaceC35773E2f.mainKey())) {
                    ((Map) this.LIZ.getValue()).put(interfaceC35773E2f.mainKey(), new ArrayList());
                }
                List list = (List) ((Map) this.LIZ.getValue()).get(interfaceC35773E2f.mainKey());
                if (list != null) {
                    list.add(new CustomCheckRule(interfaceC35773E2f.mainKey(), iCustomChecker, ORY.LJJZZIII(interfaceC35773E2f.moreKeys())));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final Object LIZ(E92 e92) {
        if (!C35562DxW.LIZ().getEnable()) {
            return Boolean.FALSE;
        }
        CustomCheckRule LIZLLL = LIZLLL(e92);
        if (LIZLLL != null) {
            LIZLLL.getChecker().LIZ(e92);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final boolean LIZIZ(E92 info) {
        o.LJIIIZ(info, "info");
        if (LIZLLL(info) != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final Object LIZJ(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return Boolean.valueOf(C35562DxW.LIZ().getEnable());
    }

    public final CustomCheckRule LIZLLL(E92 e92) {
        List list = (List) ((Map) this.LIZ.getValue()).get(e92.LIZJ);
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            CustomCheckRule customCheckRule = (CustomCheckRule) obj2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(customCheckRule.getMainKey());
            List<String> moreKeys = customCheckRule.getMoreKeys();
            if (moreKeys != null) {
                arrayList.addAll(moreKeys);
            }
            e92.LIZIZ = ORZ.LLD(arrayList, ".", null, null, null, 62);
            List<String> moreKeys2 = customCheckRule.getMoreKeys();
            if (moreKeys2 == null || moreKeys2.isEmpty() || ((Set) e92.LJ.getValue()).containsAll(customCheckRule.getMoreKeys())) {
                obj = obj2;
                break;
            }
        }
        return (CustomCheckRule) obj;
    }
}
