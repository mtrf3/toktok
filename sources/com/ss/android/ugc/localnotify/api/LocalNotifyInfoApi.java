package com.ss.android.ugc.localnotify.api;

import X.AbstractC73672Svk;
import X.E7Z;
import X.E8M;

/* loaded from: classes7.dex */
public interface LocalNotifyInfoApi {
    public static final E7Z LIZ = E7Z.LIZ;

    @E8M("/cloudpush/client_notify/pull")
    AbstractC73672Svk<LocalNotifyInfoResponse> getLocalNotifyInfo();
}
