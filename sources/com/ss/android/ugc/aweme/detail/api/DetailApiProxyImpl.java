package com.ss.android.ugc.aweme.detail.api;

import X.C58096Mr6;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DetailApiProxyImpl implements DetailApiProxy {
    public static DetailApiProxy LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(DetailApiProxy.class, false);
        if (LIZ != null) {
            return (DetailApiProxy) LIZ;
        }
        if (C58096Mr6.r == null) {
            synchronized (DetailApiProxy.class) {
                if (C58096Mr6.r == null) {
                    C58096Mr6.r = new DetailApiProxyImpl();
                }
            }
        }
        return C58096Mr6.r;
    }

    @Override // com.ss.android.ugc.aweme.detail.api.DetailApiProxy
    public final Aweme LIZ(String aid) {
        o.LJIIIZ(aid, "aid");
        Aweme LIZ = DetailApi.LIZ(0, 0, aid, "");
        o.LJIIIIZZ(LIZ, "queryAweme(aid, originType)");
        return LIZ;
    }
}
