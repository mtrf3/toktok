package com.ss.android.ugc.aweme.sync;

import X.C3GR;
import X.C67035QSp;
import X.InterfaceC67072QUa;
import Y.ARunnableS15S0100100_11;
import com.bytedance.sync.SyncSDK;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ByteSyncApiImpl implements IByteSyncApi {
    @Override // com.ss.android.ugc.aweme.sync.IByteSyncApi
    public final int LIZJ() {
        Integer num = C67035QSp.LIZIZ().monitorSampling;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.sync.IByteSyncApi
    public final boolean LIZIZ(C3GR bizId) {
        o.LJIIIZ(bizId, "bizId");
        return C67035QSp.LIZJ(bizId.getServerId());
    }

    @Override // com.ss.android.ugc.aweme.sync.IByteSyncApi
    public final void LIZ(C3GR bizId, InterfaceC67072QUa dataUpdateListener) {
        o.LJIIIZ(bizId, "bizId");
        o.LJIIIZ(dataUpdateListener, "dataUpdateListener");
        long serverId = bizId.getServerId();
        if (!C67035QSp.LIZJ(serverId) || C67035QSp.LIZLLL.containsKey(Long.valueOf(serverId))) {
            return;
        }
        SyncSDK.runAfterStart(new ARunnableS15S0100100_11(serverId, dataUpdateListener, 5));
    }
}
