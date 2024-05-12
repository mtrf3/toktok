package com.ss.android.ugc.aweme.net.interceptor;

import X.C38556FBg;
import X.C56662Kg;
import X.C64797Pbt;
import X.FBZ;

/* loaded from: classes7.dex */
public class EnsureMainActivityCronetInterceptor extends FeedBaseCronetInterceptor {
    @Override // com.ss.android.ugc.aweme.net.interceptor.FeedBaseCronetInterceptor
    public final boolean LIZIZ() {
        C56662Kg.LIZ().LJFF("feed_network_to_ensure_main_interceptor", false);
        return !C38556FBg.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.net.interceptor.FeedBaseCronetInterceptor
    public final C64797Pbt LIZ(FBZ fbz) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!C38556FBg.LIZIZ) {
            Object obj = C38556FBg.LIZ;
            synchronized (obj) {
                if (!C38556FBg.LIZIZ) {
                    try {
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        C56662Kg.LIZ().LIZLLL(System.currentTimeMillis() - currentTimeMillis, "ensure_main_activity_interceptor_duration");
        return fbz.LIZ(fbz.request());
    }
}
