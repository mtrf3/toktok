package com.ss.android.ugc.aweme.ecommerce;

import X.AbstractC40122Fos;
import X.C38150EyA;
import X.C39919Flb;
import X.C40116Fom;
import X.C40120Foq;
import X.C40124Fou;
import X.C40197Fq5;
import X.C40342FsQ;
import X.C40343FsR;
import X.C47261Igj;
import X.C58096Mr6;
import X.C73322uG;
import X.F3T;
import X.InterfaceC38012Evw;
import X.InterfaceC38186Eyk;
import X.InterfaceC40118Foo;
import X.ORS;
import X.ORZ;
import android.content.Context;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.router.EcomHybridInterceptor;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEComHybridLynxBehaviorService;
import com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomHybridSparkMatchService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import lh3.IDaS86S0000000_10;

/* loaded from: classes7.dex */
public final class ECommerceHybridServiceImpl implements IECommerceHybridService {
    public final List<ISparkRouterInterceptor> LIZ = C47261Igj.LJJIJIIJI(new C39919Flb(), C73322uG.LJLIL);
    public final List<IDaS86S0000000_10> LIZIZ = C47261Igj.LJJIJ(new IDaS86S0000000_10(127));

    public static IECommerceHybridService LJIIIIZZ() {
        Object LIZ = C58096Mr6.LIZ(IECommerceHybridService.class, false);
        if (LIZ != null) {
            return (IECommerceHybridService) LIZ;
        }
        if (C58096Mr6.D == null) {
            synchronized (IECommerceHybridService.class) {
                if (C58096Mr6.D == null) {
                    C58096Mr6.D = new ECommerceHybridServiceImpl();
                }
            }
        }
        return C58096Mr6.D;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService
    public final void LIZLLL() {
        if (!C40120Foq.LIZ) {
            C40116Fom c40116Fom = new C40116Fom();
            C40343FsR.LJIILJJIL.getClass();
            C40343FsR.LIZLLL.add(c40116Fom);
            LiveOuterService.LJJJLL().LJIIIZ(c40116Fom);
            C40342FsQ.LJI(new C40124Fou());
            Set services = ServiceManager.get().getServices(InterfaceC40118Foo.class);
            o.LJIIIIZZ(services, "get().getServices(IEComH…luginService::class.java)");
            Iterator it = services.iterator();
            while (it.hasNext()) {
                for (AbstractC40122Fos abstractC40122Fos : ((InterfaceC40118Foo) it.next()).LIZ()) {
                    C40343FsR.LJIILJJIL.getClass();
                    C40342FsQ.LJI(abstractC40122Fos);
                }
            }
            C40120Foq.LIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService
    public final List<IInterceptor> LJ() {
        return C47261Igj.LJJIJ(new EcomHybridInterceptor());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService
    public final List<C40197Fq5> LJFF() {
        List<IDaS86S0000000_10> list = this.LIZIZ;
        Set services = ServiceManager.get().getServices(IEComHybridLynxBehaviorService.class);
        o.LJIIIIZZ(services, "get().getServices(IEComH…aviorService::class.java)");
        ArrayList arrayList = new ArrayList();
        Iterator it = services.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((IEComHybridLynxBehaviorService) it.next()).LIZ(), arrayList);
        }
        return ORZ.LLIIIZ(arrayList, list);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService
    public final List<ISparkRouterInterceptor> LIZJ() {
        Set services = ServiceManager.get().getServices(IEcomHybridSparkMatchService.class);
        o.LJIIIIZZ(services, "get().getServices(IEcomH…MatchService::class.java)");
        ArrayList arrayList = new ArrayList();
        Iterator it = services.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((IEcomHybridSparkMatchService) it.next()).LIZ(), arrayList);
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService
    public final List<InterfaceC38186Eyk> LIZ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        ArrayList arrayList = new ArrayList();
        Set services = ServiceManager.get().getServices(IEcommerceInternalJSBridgeService.class);
        o.LJIIIIZZ(services, "get().getServices(IEcomm…ridgeService::class.java)");
        Iterator it = services.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((IEcommerceInternalJSBridgeService) it.next()).LIZ(providerFactory));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService
    public final List<ISparkRouterInterceptor> LJI(String str) {
        List<ISparkRouterInterceptor> list = this.LIZ;
        Set services = ServiceManager.get().getServices(IEComHybridSparkInterceptorService.class);
        o.LJIIIIZZ(services, "get().getServices(IEComH…eptorService::class.java)");
        ArrayList arrayList = new ArrayList();
        Iterator it = services.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((IEComHybridSparkInterceptorService) it.next()).LIZ(str), arrayList);
        }
        return ORZ.LLIIIZ(arrayList, list);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService
    public final Map<String, InterfaceC38012Evw> LIZIZ(C38150EyA c38150EyA, WeakReference<Context> weakReference) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set services = ServiceManager.get().getServices(IEcommerceInternalJSBridgeService.class);
        o.LJIIIIZZ(services, "get().getServices(IEcomm…ridgeService::class.java)");
        Iterator it = services.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(((IEcommerceInternalJSBridgeService) it.next()).LIZIZ(c38150EyA));
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService
    public final InterfaceC38012Evw LJII(C38150EyA c38150EyA, WeakReference<Context> weakReference, String name) {
        o.LJIIIZ(name, "name");
        Set<IEcommerceInternalJSBridgeService> services = ServiceManager.get().getServices(IEcommerceInternalJSBridgeService.class);
        o.LJIIIIZZ(services, "get().getServices(IEcomm…ridgeService::class.java)");
        for (IEcommerceInternalJSBridgeService iEcommerceInternalJSBridgeService : services) {
            if (iEcommerceInternalJSBridgeService.LIZJ(c38150EyA, name) != null) {
                return iEcommerceInternalJSBridgeService.LIZJ(c38150EyA, name);
            }
        }
        return null;
    }
}
