package com.ss.android.ugc.aweme.legoImp;

import X.C16880lQ;
import X.C38995FSd;
import X.FGS;
import com.ss.android.ugc.aweme.base.ITaskManagerConfig;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public final class TaskManagerConfigImpl implements ITaskManagerConfig {
    @Override // com.ss.android.ugc.aweme.base.ITaskManagerConfig
    public final FGS LIZ() {
        FGS fgs = new FGS();
        ExecutorService LIZLLL = C38995FSd.LIZLLL();
        if (LIZLLL == null) {
            LIZLLL = C16880lQ.LLLLZ(4);
        }
        fgs.LIZ = LIZLLL;
        return fgs;
    }
}
