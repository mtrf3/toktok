package com.ss.android.ugc.aweme.live.notification.repository;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64986Pew;
import X.InterfaceC64987Pex;

/* loaded from: classes5.dex */
public final class NotificationGameApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes5.dex */
    public interface RealApi {
        @InterfaceC195787mI
        @E4T("/tiktok/v1/ad/notice/update/")
        AbstractC73672Svk<NotificationGameStatus> changeOptions(@InterfaceC64987Pex("enable_notice") boolean z, @InterfaceC64987Pex("creative_id") String str, @InterfaceC64986Pew("log_id") String str2);
    }
}
