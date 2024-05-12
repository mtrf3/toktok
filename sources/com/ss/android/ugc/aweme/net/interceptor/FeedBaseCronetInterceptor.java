package com.ss.android.ugc.aweme.net.interceptor;

import X.C64797Pbt;
import X.FBZ;
import X.InterfaceC37216Ej6;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;

/* loaded from: classes7.dex */
public class FeedBaseCronetInterceptor implements InterfaceC37216Ej6 {
    public boolean LIZIZ() {
        return true;
    }

    public C64797Pbt LIZ(FBZ fbz) {
        return fbz.LIZ(fbz.request());
    }

    @Override // X.InterfaceC37216Ej6
    public C64797Pbt intercept(FBZ fbz) {
        Request request = fbz.request();
        if (LIZIZ() && request != null && request.getUrl() != null) {
            String url = request.getUrl();
            if (!TextUtils.isEmpty(url) && (url.contains("/aweme/v1/feed/") || url.contains("/aweme/v2/feed/"))) {
                return LIZ(fbz);
            }
        }
        return fbz.LIZ(fbz.request());
    }
}
