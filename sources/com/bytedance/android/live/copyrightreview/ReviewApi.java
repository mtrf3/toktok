package com.bytedance.android.live.copyrightreview;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.model.message.NotificationConfirmResponse;

/* loaded from: classes.dex */
public interface ReviewApi {
    @E8L("/webcast/review/notification_confirm")
    AbstractC73672Svk<C28467BFf<NotificationConfirmResponse>> confirmCopyright(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("confirm_type") int i, @InterfaceC64986Pew("confirm_value") int i2);

    @E8L("/webcast/review/notify_of_confirm_copyright/")
    AbstractC73672Svk<C28467BFf<Void>> notifyOfConfirmCopyright(@InterfaceC64986Pew("room_id") long j);
}
