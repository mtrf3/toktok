package com.ss.android.ugc.aweme.notification.creator.service;

import X.C55888Lwa;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.notification.NotificationFragment;
import com.ss.android.ugc.aweme.notification.creator.CreatorNotificationFragment;

/* loaded from: classes5.dex */
public final class NotificationFragmentServiceImpl implements INotificationFragmentService {
    @Override // com.ss.android.ugc.aweme.notification.creator.service.INotificationFragmentService
    public final AbsFragment LIZ() {
        if (C55888Lwa.LIZIZ.LJJI(false)) {
            return new CreatorNotificationFragment();
        }
        return new NotificationFragment();
    }
}
