package com.bytedance.frameworks.baselib.network.http.cronet;

/* loaded from: classes12.dex */
public interface ICronetDepend {
    String getSsCookieKey();

    void loggerD(String str, String str2);

    boolean loggerDebug();

    void setAdapter(ICronetDepend iCronetDepend);
}
