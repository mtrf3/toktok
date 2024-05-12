package com.ss.android.ugc.aweme.services;

import X.AbstractC73672Svk;
import X.InterfaceC88472Yns;
import android.content.Context;
import com.ss.android.ugc.aweme.services.IExternalService;

/* loaded from: classes2.dex */
public interface ICreationToolsPluginService {
    void asyncService(Context context, InterfaceC88472Yns<? super Long, String> interfaceC88472Yns, boolean z, String str, IExternalService.ServiceLoadCallback serviceLoadCallback);

    void forcePreload(Context context, String str);

    boolean isReady();

    AbstractC73672Svk<PluginState> pluginState();

    void preload(Context context, String str);
}
