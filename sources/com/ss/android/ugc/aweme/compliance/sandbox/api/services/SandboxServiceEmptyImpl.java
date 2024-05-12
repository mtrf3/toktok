package com.ss.android.ugc.aweme.compliance.sandbox.api.services;

import X.C64797Pbt;
import X.EnumC40383Ft5;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.InterfaceC37231EjL;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SandboxServiceEmptyImpl implements ISandboxService {
    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public InterfaceC37231EjL getAppToAppService() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public void hookWebView() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public void initDFIDNetMonitor() {
    }

    public boolean isAGDataFlow(String str) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public InterfaceC37216Ej6 orbuSandboxTTNetInterceptor() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public void activeOrInActiveOrbu(EnumC40383Ft5 action) {
        o.LJIIIZ(action, "action");
    }

    public InterfaceC37216Ej6 dataFlowIDInterceptor(String bizScene) {
        o.LJIIIZ(bizScene, "bizScene");
        return new InterfaceC37216Ej6() { // from class: com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService$dataFlowIDInterceptor$1
            @Override // X.InterfaceC37216Ej6
            public final C64797Pbt intercept(FBZ fbz) {
                F7S f7s = (F7S) fbz;
                return f7s.LIZ(f7s.LIZJ);
            }
        };
    }
}
