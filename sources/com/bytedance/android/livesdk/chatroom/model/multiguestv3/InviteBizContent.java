package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class InviteBizContent extends F9E {

    @InterfaceC65349Pkn("invite_source")
    public int inviteSource;

    @InterfaceC65349Pkn("invitee_user_info")
    public User inviteeUserInfo;

    @InterfaceC65349Pkn("anchor_setting_info")
    public MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;

    @InterfaceC65349Pkn("operator_link_admin_type")
    public int operatorLinkAdminType;

    @InterfaceC65349Pkn("operator_user_info")
    public User operatorUserInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InviteBizContent() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 31
            r0 = r8
            r3 = r1
            r4 = r2
            r5 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.model.multiguestv3.InviteBizContent.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.multiLiveAnchorPanelSettings, Integer.valueOf(this.inviteSource), this.operatorUserInfo, Integer.valueOf(this.operatorLinkAdminType), this.inviteeUserInfo};
    }

    public InviteBizContent(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, int i, User user, int i2, User user2) {
        this.multiLiveAnchorPanelSettings = multiLiveAnchorPanelSettings;
        this.inviteSource = i;
        this.operatorUserInfo = user;
        this.operatorLinkAdminType = i2;
        this.inviteeUserInfo = user2;
    }

    public /* synthetic */ InviteBizContent(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, int i, User user, int i2, User user2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : multiLiveAnchorPanelSettings, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : user, (i3 & 8) == 0 ? i2 : 0, (i3 & 16) == 0 ? user2 : null);
    }
}
