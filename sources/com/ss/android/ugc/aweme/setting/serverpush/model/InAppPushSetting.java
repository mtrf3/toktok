package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C85952XoK;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes16.dex */
public final class InAppPushSetting extends F9E implements Serializable {
    public static final C85952XoK Companion = new C85952XoK();

    @InterfaceC65349Pkn("in_app_active_status_push")
    public final int inAppActiveStatusPush;

    @InterfaceC65349Pkn("in_app_comment_push")
    public final int inAppCommentPush;

    @InterfaceC65349Pkn("in_app_digg_push")
    public final int inAppDiggPush;

    @InterfaceC65349Pkn("in_app_follow_push")
    public final int inAppFollowPush;

    @InterfaceC65349Pkn("in_app_friends_post_push")
    public final int inAppFriendsPostPush;

    @InterfaceC65349Pkn("in_app_im_push")
    public final int inAppImPush;

    @InterfaceC65349Pkn("in_app_mention_push")
    public final int inAppMentionPush;

    @InterfaceC65349Pkn("in_app_other_channel_push")
    public final int inAppOtherPush;

    @InterfaceC65349Pkn("in_app_profile_viewer_push")
    public final int inAppProfileViewPush;

    public static /* synthetic */ InAppPushSetting copy$default(InAppPushSetting inAppPushSetting, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = inAppPushSetting.inAppDiggPush;
        }
        if ((i10 & 2) != 0) {
            i2 = inAppPushSetting.inAppCommentPush;
        }
        if ((i10 & 4) != 0) {
            i3 = inAppPushSetting.inAppFollowPush;
        }
        if ((i10 & 8) != 0) {
            i4 = inAppPushSetting.inAppMentionPush;
        }
        if ((i10 & 16) != 0) {
            i5 = inAppPushSetting.inAppImPush;
        }
        if ((i10 & 32) != 0) {
            i6 = inAppPushSetting.inAppActiveStatusPush;
        }
        if ((i10 & 64) != 0) {
            i7 = inAppPushSetting.inAppOtherPush;
        }
        if ((i10 & 128) != 0) {
            i8 = inAppPushSetting.inAppProfileViewPush;
        }
        if ((i10 & 256) != 0) {
            i9 = inAppPushSetting.inAppFriendsPostPush;
        }
        return inAppPushSetting.copy(i, i2, i3, i4, i5, i6, i7, i8, i9);
    }

    public final InAppPushSetting copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        return new InAppPushSetting(i, i2, i3, i4, i5, i6, i7, i8, i9);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.inAppDiggPush), Integer.valueOf(this.inAppCommentPush), Integer.valueOf(this.inAppFollowPush), Integer.valueOf(this.inAppMentionPush), Integer.valueOf(this.inAppImPush), Integer.valueOf(this.inAppActiveStatusPush), Integer.valueOf(this.inAppOtherPush), Integer.valueOf(this.inAppProfileViewPush), Integer.valueOf(this.inAppFriendsPostPush)};
    }

    public final int getInAppActiveStatusPush() {
        return this.inAppActiveStatusPush;
    }

    public final int getInAppCommentPush() {
        return this.inAppCommentPush;
    }

    public final int getInAppDiggPush() {
        return this.inAppDiggPush;
    }

    public final int getInAppFollowPush() {
        return this.inAppFollowPush;
    }

    public final int getInAppFriendsPostPush() {
        return this.inAppFriendsPostPush;
    }

    public final int getInAppImPush() {
        return this.inAppImPush;
    }

    public final int getInAppMentionPush() {
        return this.inAppMentionPush;
    }

    public final int getInAppOtherPush() {
        return this.inAppOtherPush;
    }

    public final int getInAppProfileViewPush() {
        return this.inAppProfileViewPush;
    }

    public InAppPushSetting(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.inAppDiggPush = i;
        this.inAppCommentPush = i2;
        this.inAppFollowPush = i3;
        this.inAppMentionPush = i4;
        this.inAppImPush = i5;
        this.inAppActiveStatusPush = i6;
        this.inAppOtherPush = i7;
        this.inAppProfileViewPush = i8;
        this.inAppFriendsPostPush = i9;
    }
}
