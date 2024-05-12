package com.bytedance.lynx.hybrid.resource.config;

import X.C16880lQ;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.O1M;
import X.O26;
import com.bytedance.lynx.hybrid.service.IResourceService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class IHybridResourceLoader {
    public final String TAG = C16880lQ.LJLLJ(getClass());
    public IResourceService service;

    public abstract void cancelLoad();

    public abstract void loadAsync(O26 o26, O1M o1m, InterfaceC88472Yns<? super O26, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2);

    public abstract O26 loadSync(O26 o26, O1M o1m);

    public final IResourceService getService() {
        IResourceService iResourceService = this.service;
        if (iResourceService != null) {
            return iResourceService;
        }
        o.LJIJI("service");
        throw null;
    }

    public String getTAG() {
        return this.TAG;
    }

    public final void setService(IResourceService iResourceService) {
        o.LJIIJ(iResourceService, "<set-?>");
        this.service = iResourceService;
    }
}
