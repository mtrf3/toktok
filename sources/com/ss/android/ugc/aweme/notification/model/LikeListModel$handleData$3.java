package com.ss.android.ugc.aweme.notification.model;

import X.AbstractC65781Prl;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes10.dex */
public final class LikeListModel$handleData$3 extends AbstractC65781Prl implements InterfaceC88472Yns<DiggInfo, User> {
    public static final LikeListModel$handleData$3 INSTANCE = new LikeListModel$handleData$3();

    public LikeListModel$handleData$3() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final User invoke(DiggInfo diggInfo) {
        if (diggInfo != null) {
            return diggInfo.user;
        }
        return null;
    }
}
