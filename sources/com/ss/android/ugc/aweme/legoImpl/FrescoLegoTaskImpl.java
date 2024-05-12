package com.ss.android.ugc.aweme.legoImpl;

import X.C1DD;
import X.C66699QFr;
import X.C81713W5d;
import X.EE1;
import X.EU2;
import X.WBB;
import com.ss.android.legoapi.freso.IFrescoLegoTaskApi;
import com.ss.android.ugc.aweme.legoImpl.task.FrescoTask;

/* loaded from: classes15.dex */
public final class FrescoLegoTaskImpl implements IFrescoLegoTaskApi {
    @Override // com.ss.android.legoapi.freso.IFrescoLegoTaskApi
    public final EE1 LIZ() {
        return new FrescoTask();
    }

    @Override // com.ss.android.legoapi.freso.IFrescoLegoTaskApi
    public final void LIZIZ() {
        if (EU2.LIZ()) {
            C81713W5d.LIZIZ = new C1DD();
        }
        C66699QFr.LIZJ = new WBB();
    }
}
