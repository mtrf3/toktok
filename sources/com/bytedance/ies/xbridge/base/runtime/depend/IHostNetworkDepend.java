package com.bytedance.ies.xbridge.base.runtime.depend;

import java.util.Map;

/* loaded from: classes7.dex */
public interface IHostNetworkDepend {
    XIRetrofit createRetrofit(String str, boolean z);

    Map<String, Object> getAPIParams();
}
