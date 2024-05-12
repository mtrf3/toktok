package com.ss.android.ugc.aweme.compliance.sandbox.serviceimpl;

import X.C37793EsP;
import X.C37802EsY;
import X.C37803EsZ;
import X.C38507F9j;
import X.C38508F9k;
import X.C39914FlW;
import X.C58096Mr6;
import X.C64708PaS;
import X.C86019XpP;
import X.EXK;
import X.EnumC40383Ft5;
import X.FXY;
import X.InterfaceC37216Ej6;
import X.InterfaceC37231EjL;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.pumbaa.network.adapter.NetworkServiceImpl;
import com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService;
import com.ss.android.ugc.aweme.compliance.sandbox.network.OrbuSandboxTTNetInterceptor;
import com.ss.android.ugc.tiktok.security.ClientSecurityServiceImpl;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SandboxServiceImpl implements ISandboxService {
    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final void hookWebView() {
        Forest LIZ = C39914FlW.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.setChannel("tiktok_webview_hook");
        requestParams.setBundle("hook.js");
        LIZ.fetchResourceAsync("", requestParams, C38508F9k.LJLIL);
        EXK.LIZJ(new C37803EsZ());
        IClientSecurityService LJIILIIL = ClientSecurityServiceImpl.LJIILIIL();
        if (LJIILIIL != null) {
            LJIILIIL.init();
        }
        EXK.LIZLLL(new C37793EsP());
        EXK.LIZJ(new C37802EsY());
        EXK.LIZJ(new C38507F9j());
    }

    public static ISandboxService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ISandboxService.class, false);
        if (LIZ != null) {
            return (ISandboxService) LIZ;
        }
        if (C58096Mr6.g == null) {
            synchronized (ISandboxService.class) {
                if (C58096Mr6.g == null) {
                    C58096Mr6.g = new SandboxServiceImpl();
                }
            }
        }
        return C58096Mr6.g;
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final InterfaceC37216Ej6 orbuSandboxTTNetInterceptor() {
        return new OrbuSandboxTTNetInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final void initDFIDNetMonitor() {
        NetworkServiceImpl.LJIILIIL().LJII(new C64708PaS());
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final InterfaceC37231EjL getAppToAppService() {
        return FXY.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final void activeOrInActiveOrbu(EnumC40383Ft5 action) {
        o.LJIIIZ(action, "action");
        C86019XpP.LIZ(action);
    }
}
