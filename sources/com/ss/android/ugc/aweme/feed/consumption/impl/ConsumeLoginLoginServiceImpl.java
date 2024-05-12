package com.ss.android.ugc.aweme.feed.consumption.impl;

import X.C58096Mr6;
import X.C86918Y9i;
import X.C9XT;
import com.ss.android.ugc.aweme.feed.consume.IFeedConsumeLoginService;

/* loaded from: classes7.dex */
public final class ConsumeLoginLoginServiceImpl implements IFeedConsumeLoginService {
    public static IFeedConsumeLoginService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IFeedConsumeLoginService.class, false);
        if (LIZ != null) {
            return (IFeedConsumeLoginService) LIZ;
        }
        if (C58096Mr6.C0 == null) {
            synchronized (IFeedConsumeLoginService.class) {
                if (C58096Mr6.C0 == null) {
                    C58096Mr6.C0 = new ConsumeLoginLoginServiceImpl();
                }
            }
        }
        return C58096Mr6.C0;
    }

    @Override // com.ss.android.ugc.aweme.feed.consume.IFeedConsumeLoginService
    public final void LIZ() {
        C86918Y9i.LIZ().execute(C9XT.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.feed.consume.IFeedConsumeLoginService
    public final void LIZIZ() {
        C86918Y9i.LIZ().execute(C9XT.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.feed.consume.IFeedConsumeLoginService
    public final void LIZJ() {
        C86918Y9i.LIZ().execute(C9XT.LJLIL);
    }
}
