package com.ss.android.ugc.aweme.utils;

import X.C58096Mr6;
import X.InterfaceC48121Iub;
import X.PX2;
import X.PXY;
import X.PYC;
import X.PYR;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.interceptor.InterceptorProvider;
import com.ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet;
import com.ss.android.ugc.aweme.service.IComplianceOfflineService;
import java.util.ArrayList;
import java.util.List;
import yq4.a;

/* loaded from: classes12.dex */
public class InterceptorHolder implements InterceptorProvider {
    public static InterceptorProvider LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(InterceptorProvider.class, false);
        if (LIZ != null) {
            return (InterceptorProvider) LIZ;
        }
        if (C58096Mr6.U7 == null) {
            synchronized (InterceptorProvider.class) {
                if (C58096Mr6.U7 == null) {
                    C58096Mr6.U7 = new InterceptorHolder();
                }
            }
        }
        return C58096Mr6.U7;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.interceptor.InterceptorProvider
    public final List<InterfaceC48121Iub> LIZ() {
        ArrayList arrayList = new ArrayList();
        if (!PXY.LIZ().enable) {
            arrayList.add(new PX2());
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.interceptor.InterceptorProvider
    public final List LIZIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FeedRetryInterceptorTTNet());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.interceptor.InterceptorProvider
    public final void LIZJ() {
        PYR.LIZ(new PYC());
        PYR.LIZ(a.LJI().LIZ());
        PYR.LIZ(a.LJI().LJIJI());
        PYR.LIZ(a.LJI().LIZIZ());
        PYR.LIZ(a.LJI().LJII());
        IComplianceOfflineService iComplianceOfflineService = (IComplianceOfflineService) ServiceManager.get().getService(IComplianceOfflineService.class);
        if (iComplianceOfflineService != null) {
            iComplianceOfflineService.LIZ();
        }
    }
}
