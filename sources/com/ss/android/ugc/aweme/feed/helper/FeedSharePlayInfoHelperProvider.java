package com.ss.android.ugc.aweme.feed.helper;

import X.C58096Mr6;
import X.JHI;
import com.ss.android.ugc.aweme.search.IFeedSharePlayInfoHelperProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FeedSharePlayInfoHelperProvider implements IFeedSharePlayInfoHelperProvider {
    public static IFeedSharePlayInfoHelperProvider LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IFeedSharePlayInfoHelperProvider.class, false);
        if (LIZ != null) {
            return (IFeedSharePlayInfoHelperProvider) LIZ;
        }
        if (C58096Mr6.F0 == null) {
            synchronized (IFeedSharePlayInfoHelperProvider.class) {
                if (C58096Mr6.F0 == null) {
                    C58096Mr6.F0 = new FeedSharePlayInfoHelperProvider();
                }
            }
        }
        return C58096Mr6.F0;
    }

    @Override // com.ss.android.ugc.aweme.search.IFeedSharePlayInfoHelperProvider
    public final JHI LIZ() {
        JHI LIZ = JHI.LIZ();
        o.LJIIIIZZ(LIZ, "inst()");
        return LIZ;
    }
}
