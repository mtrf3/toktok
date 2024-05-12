package com.ss.android.ugc.aweme.compliance.sandbox.api.services;

import X.EnumC40383Ft5;
import X.InterfaceC37216Ej6;
import X.InterfaceC37231EjL;

/* loaded from: classes7.dex */
public interface ISandboxService {
    void activeOrInActiveOrbu(EnumC40383Ft5 enumC40383Ft5);

    InterfaceC37231EjL getAppToAppService();

    void hookWebView();

    void initDFIDNetMonitor();

    InterfaceC37216Ej6 orbuSandboxTTNetInterceptor();
}
