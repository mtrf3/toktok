package com.bytedance.pumbaa.pdp.adapter;

import X.C65935PuF;
import X.C66000PvI;
import X.C66207Pyd;
import X.C66213Pyj;
import X.C66215Pyl;
import X.C66216Pym;
import X.C66219Pyp;
import X.C66226Pyw;
import X.ExecutorC64417PPx;
import X.HandlerThreadC64418PPy;
import X.InterfaceC66217Pyn;
import X.InterfaceC66218Pyo;
import com.bytedance.pumbaa.pdp.adapter.api.IPDPPumbaaService;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PDPPumbaaService implements IPDPPumbaaService {
    @Override // com.bytedance.pumbaa.pdp.adapter.api.IPDPPumbaaService, com.bytedance.pumbaa.base.ICommonService
    public final void updateSettings() {
    }

    @Override // com.bytedance.pumbaa.pdp.adapter.api.IPDPPumbaaService, com.bytedance.pumbaa.base.ICommonService
    public final void init(C65935PuF appInfo, Object obj, Object obj2, Object obj3) {
        boolean z;
        C66226Pyw proxy = (C66226Pyw) obj;
        o.LJIIIZ(appInfo, "appInfo");
        o.LJIIIZ(proxy, "proxy");
        C66219Pyp.LIZ = proxy;
        if (appInfo.LJLJJL || o.LJ(appInfo.LJLJJI, "local_test")) {
            z = true;
        } else {
            z = false;
        }
        C66215Pyl.LIZ = z;
        HandlerThreadC64418PPy.LIZ();
        ExecutorC64417PPx executorC64417PPx = HandlerThreadC64418PPy.LJLJJL;
        o.LJIIIIZZ(executorC64417PPx, "MonitorThread.getExecutor()");
        C66215Pyl.LIZIZ = executorC64417PPx;
        C66216Pym<InterfaceC66218Pyo> c66216Pym = C66215Pyl.LIZJ;
        c66216Pym.LIZ.add(C66213Pyj.LIZ);
        c66216Pym.LIZ.add(C66207Pyd.LIZIZ);
        C66216Pym<InterfaceC66217Pyn> c66216Pym2 = C66215Pyl.LIZLLL;
        c66216Pym2.LIZ.add(C66000PvI.LJI);
    }
}
