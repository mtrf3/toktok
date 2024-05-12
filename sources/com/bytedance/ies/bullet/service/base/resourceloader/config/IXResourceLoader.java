package com.bytedance.ies.bullet.service.base.resourceloader.config;

import X.C16880lQ;
import X.C39973FmT;
import X.C39976FmW;
import X.C60379Nmp;
import X.C76800UCe;
import X.EnumC39958FmE;
import X.InterfaceC39974FmU;
import X.InterfaceC88472Yns;
import X.O1I;
import X.O1L;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class IXResourceLoader implements InterfaceC39974FmU {
    public final String TAG = C16880lQ.LJLLJ(getClass());
    public C39976FmW loaderLogger;
    public IResourceLoaderService service;

    public abstract void cancelLoad();

    public abstract void loadAsync(O1I o1i, O1L o1l, InterfaceC88472Yns<? super O1I, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2);

    public abstract O1I loadSync(O1I o1i, O1L o1l);

    @Override // X.InterfaceC39974FmU
    public C39976FmW getLoggerWrapper() {
        C39976FmW c39976FmW = this.loaderLogger;
        if (c39976FmW != null) {
            return c39976FmW;
        }
        Object obj = this.service;
        if (obj != null) {
            return ((C60379Nmp) obj).getLoggerWrapper();
        }
        o.LJIJI("service");
        throw null;
    }

    public final IResourceLoaderService getService() {
        IResourceLoaderService iResourceLoaderService = this.service;
        if (iResourceLoaderService != null) {
            return iResourceLoaderService;
        }
        o.LJIJI("service");
        throw null;
    }

    public final C39976FmW getLoaderLogger() {
        return this.loaderLogger;
    }

    public String getTAG() {
        return this.TAG;
    }

    public final void setLoaderLogger(C39976FmW c39976FmW) {
        this.loaderLogger = c39976FmW;
    }

    public final void setService(IResourceLoaderService iResourceLoaderService) {
        o.LJIIJ(iResourceLoaderService, "<set-?>");
        this.service = iResourceLoaderService;
    }

    @Override // X.InterfaceC39974FmU
    public void printReject(Throwable e, String extraMsg) {
        o.LJIIJ(e, "e");
        o.LJIIJ(extraMsg, "extraMsg");
        C39973FmT.LIZJ(this, e, extraMsg);
    }

    @Override // X.InterfaceC39974FmU
    public void printLog(String msg, EnumC39958FmE logLevel, String subModule) {
        o.LJIIJ(msg, "msg");
        o.LJIIJ(logLevel, "logLevel");
        o.LJIIJ(subModule, "subModule");
        C39973FmT.LIZ(this, msg, logLevel, subModule);
    }
}
