package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsFeedEmptyRetrySetting;

/* renamed from: X.LXh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54417LXh extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C54417LXh LJLIL = new C54417LXh();

    public C54417LXh() {
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
        return Integer.valueOf(friendsTabEmptyRetryModel.loadMoreRetryTimes);
    }
}
