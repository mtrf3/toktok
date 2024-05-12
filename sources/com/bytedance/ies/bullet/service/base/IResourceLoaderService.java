package com.bytedance.ies.bullet.service.base;

import X.C76800UCe;
import X.EnumC60171NjT;
import X.InterfaceC60387Nmx;
import X.InterfaceC88472Yns;
import X.O1E;
import X.O1I;
import X.O1L;
import X.O25;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import java.util.Map;

/* loaded from: classes11.dex */
public interface IResourceLoaderService extends InterfaceC60387Nmx {
    void cancel(O25 o25);

    void deleteResource(O1I o1i);

    @Override // X.InterfaceC60387Nmx
    /* synthetic */ String getBid();

    Map<String, String> getPreloadConfigs();

    O1E getResourceConfig();

    void init(O1E o1e);

    O25 loadAsync(String str, O1L o1l, InterfaceC88472Yns<? super O1I, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2);

    O1I loadSync(String str, O1L o1l);

    @Override // X.InterfaceC60387Nmx
    /* synthetic */ void onRegister(String str);

    @Override // X.InterfaceC60387Nmx
    /* synthetic */ void onUnRegister();

    void registerConfig(String str, GeckoConfig geckoConfig);

    void registerCustomLoader(Class<? extends IXResourceLoader> cls, EnumC60171NjT enumC60171NjT);

    void unRegisterConfig(String str);

    void unregisterCustomLoader(Class<? extends IXResourceLoader> cls, EnumC60171NjT enumC60171NjT);
}
