package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsFeedEmptyRetrySetting;

/* renamed from: X.LXi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54418LXi extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C54418LXi LJLIL = new C54418LXi();

    public C54418LXi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        FriendsFeedEmptyRetrySetting.FriendsTabEmptyRetryModel friendsTabEmptyRetryModel = FriendsFeedEmptyRetrySetting.LIZ;
        FriendsFeedEmptyRetrySetting.FriendsTabEmptyRetryModel friendsTabEmptyRetryModel2 = (FriendsFeedEmptyRetrySetting.FriendsTabEmptyRetryModel) LIZLLL.LJIIIIZZ("friends_tab_empty_retry", FriendsFeedEmptyRetrySetting.FriendsTabEmptyRetryModel.class, friendsTabEmptyRetryModel);
        if (friendsTabEmptyRetryModel2 != null) {
            friendsTabEmptyRetryModel = friendsTabEmptyRetryModel2;
        }
        return Integer.valueOf(friendsTabEmptyRetryModel.refreshRetryTimes);
    }
}
