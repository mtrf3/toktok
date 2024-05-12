package com.ss.android.ugc.aweme.crossplatform.business;

import X.C58096Mr6;
import X.C59314NPq;
import android.app.Activity;
import com.ss.android.ugc.aweme.crossplatform.activity.MainMixActivityContainer;

/* loaded from: classes11.dex */
public class MixActivityContainerProvider implements IMixActivityContainerProvider {
    public static IMixActivityContainerProvider LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IMixActivityContainerProvider.class, false);
        if (LIZ != null) {
            return (IMixActivityContainerProvider) LIZ;
        }
        if (C58096Mr6.p == null) {
            synchronized (IMixActivityContainerProvider.class) {
                if (C58096Mr6.p == null) {
                    C58096Mr6.p = new MixActivityContainerProvider();
                }
            }
        }
        return C58096Mr6.p;
    }

    @Override // com.ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider
    public final MainMixActivityContainer LIZ(Activity activity, C59314NPq c59314NPq) {
        return new MainMixActivityContainer(activity, c59314NPq);
    }
}
