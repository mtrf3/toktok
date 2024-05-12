package com.ss.android.ugc.aweme.services.interceptor;

import com.bytedance.retrofit2.client.Request;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public final class ForcePhoneVerificationInterceptor implements IInterceptor {
    @Override // com.ss.android.ugc.aweme.services.interceptor.IInterceptor
    public Map<String, String> tryToIntercept(String str, Request request, String str2, int i, Map<String, String> map) {
        ForcePhoneVerificationManager.INSTANCE.interceptParam(str2, map);
        return new LinkedHashMap();
    }
}
