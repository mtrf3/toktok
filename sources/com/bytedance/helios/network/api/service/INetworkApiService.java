package com.bytedance.helios.network.api.service;

import X.C65896Ptc;
import X.C65902Pti;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public interface INetworkApiService {
    void addCookies(C65902Pti c65902Pti, Map<String, String> map);

    void addHeaders(C65902Pti c65902Pti, Map<String, String> map);

    Object addInterceptor(Object obj);

    void addQueries(C65902Pti c65902Pti, Map<String, String> map);

    void copyResponseBody(C65902Pti c65902Pti);

    void dropRequest(C65902Pti c65902Pti, int i, String str);

    String getContentSubType(C65902Pti c65902Pti);

    String getContentType(C65902Pti c65902Pti);

    Map<String, String> getCookies(C65902Pti c65902Pti);

    String getDomain(C65902Pti c65902Pti);

    Map<String, List<String>> getHeaders(C65902Pti c65902Pti);

    String getMethod(C65902Pti c65902Pti);

    String getPath(C65902Pti c65902Pti);

    Map<String, List<String>> getQueries(C65902Pti c65902Pti);

    String getRequestBody(C65902Pti c65902Pti);

    String getResContentSubType(C65902Pti c65902Pti);

    String getResContentType(C65902Pti c65902Pti);

    String getResponseBody(C65902Pti c65902Pti);

    Map<String, List<String>> getResponseHeaders(C65902Pti c65902Pti);

    String getScheme(C65902Pti c65902Pti);

    String getUrl(C65902Pti c65902Pti);

    void initNetworkStackEvent(C65896Ptc c65896Ptc);

    void removeCookies(C65902Pti c65902Pti, List<String> list, boolean z);

    void removeHeaders(C65902Pti c65902Pti, List<String> list, boolean z);

    void removeQueries(C65902Pti c65902Pti, List<String> list, boolean z);

    void replaceCookies(C65902Pti c65902Pti, Map<String, ReplaceConfig> map, boolean z);

    void replaceDomain(C65902Pti c65902Pti, Map<String, ReplaceConfig> map);

    void replaceHeaders(C65902Pti c65902Pti, Map<String, ReplaceConfig> map, boolean z);

    void replacePath(C65902Pti c65902Pti, Map<String, ReplaceConfig> map);

    void replaceQueries(C65902Pti c65902Pti, Map<String, ReplaceConfig> map, boolean z);

    void replaceScheme(C65902Pti c65902Pti, Map<String, ReplaceConfig> map);
}
