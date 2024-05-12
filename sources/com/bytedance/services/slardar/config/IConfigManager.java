package com.bytedance.services.slardar.config;

import X.InterfaceC64073PCr;
import X.InterfaceC64103PDv;
import com.bytedance.news.common.service.manager.IService;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public interface IConfigManager extends IService {
    void fetchConfig();

    int getConfigInt(String str, int i);

    JSONObject getConfigJSON(String str);

    boolean getLogTypeSwitch(String str);

    boolean getMetricTypeSwitch(String str);

    boolean getServiceSwitch(String str);

    boolean getSwitch(String str);

    boolean isConfigReady();

    String queryConfig();

    void registerConfigListener(InterfaceC64103PDv interfaceC64103PDv);

    void registerResponseConfigListener(InterfaceC64073PCr interfaceC64073PCr);

    void unregisterConfigListener(InterfaceC64103PDv interfaceC64103PDv);

    void unregisterResponseConfigListener(InterfaceC64073PCr interfaceC64073PCr);
}
