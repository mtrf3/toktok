package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class PermitBizContent extends F9E {

    @InterfaceC65349Pkn("expire_timestamp")
    public long expireTime;

    @InterfaceC65349Pkn("anchor_setting_info")
    public MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;

    @InterfaceC65349Pkn("operator_link_admin_type")
    public int operatorLinkAdminType;

    @InterfaceC65349Pkn("operator_user_info")
    public User operatorUserInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public PermitBizContent() {
        this(null, 0L, 0 == true ? 1 : 0, 0, 15, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.multiLiveAnchorPanelSettings, Long.valueOf(this.expireTime), this.operatorUserInfo, Integer.valueOf(this.operatorLinkAdminType)};
    }

    public PermitBizContent(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, long j, User user, int i) {
        this.multiLiveAnchorPanelSettings = multiLiveAnchorPanelSettings;
        this.expireTime = j;
        this.operatorUserInfo = user;
        this.operatorLinkAdminType = i;
    }

    public /* synthetic */ PermitBizContent(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, long j, User user, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : multiLiveAnchorPanelSettings, (i2 & 2) != 0 ? 0L : j, (i2 & 4) == 0 ? user : null, (i2 & 8) != 0 ? 0 : i);
    }
}
