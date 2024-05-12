package com.ss.android.ugc.aweme.shortvideo;

import X.C58096Mr6;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.tools.AVApi;

/* loaded from: classes13.dex */
public class AVApiImpl implements AVApi {
    public static AVApi LIZJ() {
        Object LIZ = C58096Mr6.LIZ(AVApi.class, false);
        if (LIZ != null) {
            return (AVApi) LIZ;
        }
        return new AVApiImpl();
    }

    @Override // com.ss.android.ugc.aweme.tools.AVApi
    public final String LIZ() {
        return Api.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.tools.AVApi
    public final Object LIZIZ(String str, Class cls) {
        return Api.LIZLLL(0, str, cls, null, null, null);
    }
}
