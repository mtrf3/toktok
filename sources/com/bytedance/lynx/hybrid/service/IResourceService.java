package com.bytedance.lynx.hybrid.service;

import X.AbstractC40201Fq9;
import X.C76800UCe;
import X.EnumC61253O2f;
import X.FD3;
import X.InterfaceC61488OBg;
import X.InterfaceC88472Yns;
import X.O1M;
import X.O26;
import X.O2J;
import X.O31;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IResourceService extends InterfaceC61488OBg {
    void cancel(O31 o31);

    IResourceService copyAndModifyConfig(AbstractC40201Fq9 abstractC40201Fq9);

    void deleteResource(O26 o26);

    /* synthetic */ String getBid();

    Map<String, String> getPreloadConfigs();

    O2J getResourceConfig();

    void init(FD3 fd3);

    O31 loadAsync(String str, O1M o1m, InterfaceC88472Yns<? super O26, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2);

    O26 loadSync(String str, O1M o1m);

    @Override // X.InterfaceC61488OBg
    /* synthetic */ void onRegister(String str);

    @Override // X.InterfaceC61488OBg
    /* synthetic */ void onUnRegister();

    void registerConfig(String str, GeckoConfig geckoConfig);

    void registerCustomLoader(Class<? extends IHybridResourceLoader> cls, EnumC61253O2f enumC61253O2f);

    void unRegisterConfig(String str);

    void unregisterCustomLoader(Class<? extends IHybridResourceLoader> cls, EnumC61253O2f enumC61253O2f);
}
