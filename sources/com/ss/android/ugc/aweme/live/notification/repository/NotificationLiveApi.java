package com.ss.android.ugc.aweme.live.notification.repository;

import X.AbstractC73672Svk;
import X.C26089ALt;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveStatus;

/* loaded from: classes5.dex */
public interface NotificationLiveApi {
    public static final C26089ALt LIZ = C26089ALt.LIZ;

    @InterfaceC195787mI
    @E4T("/webcast/user/relation/live_push_status/update/")
    AbstractC73672Svk<NotificationLiveStatus> changeOptions(@InterfaceC64987Pex("push_status") int i, @InterfaceC64987Pex("sec_to_user_id") String str);
}
