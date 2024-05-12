package com.ss.android.legoimpl;

import X.EE1;
import com.ss.android.legoapi.abtest.IABLegoTaskApi;
import com.ss.android.sdk.app.AbTestSdkInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ABTask;
import com.ss.android.ugc.aweme.legoImp.task.ConfigSyncInitTask;

/* loaded from: classes7.dex */
public final class ABLegoTaskImpl implements IABLegoTaskApi {
    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final EE1 LIZ() {
        return new AbTestSdkInitTask();
    }

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final EE1 LIZIZ() {
        return new ABTask();
    }

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final EE1 LIZJ() {
        return new ConfigSyncInitTask();
    }
}
