package com.ss.android.ugc.aweme.sync;

import X.EE1;

/* loaded from: classes7.dex */
public final class ByteSyncInitProviderImpl implements IByteSyncInitProvider {
    @Override // com.ss.android.ugc.aweme.sync.IByteSyncInitProvider
    public final EE1 LIZ() {
        return new ByteSyncSdkInitTask();
    }
}
