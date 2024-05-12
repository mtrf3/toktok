package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPreloadStrategySettings;

/* loaded from: classes10.dex */
public final class LID extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final LID LJLIL = new LID();

    public LID() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        FriendsTabPreloadStrategySettings.LIZ.getClass();
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        FriendsTabPreloadStrategySettings.FriendsTabPreloadStrategyModel friendsTabPreloadStrategyModel = FriendsTabPreloadStrategySettings.LIZIZ;
        FriendsTabPreloadStrategySettings.FriendsTabPreloadStrategyModel friendsTabPreloadStrategyModel2 = (FriendsTabPreloadStrategySettings.FriendsTabPreloadStrategyModel) LIZLLL.LJIIIIZZ("friends_tab_preload_strategy_setting", FriendsTabPreloadStrategySettings.FriendsTabPreloadStrategyModel.class, friendsTabPreloadStrategyModel);
        if (friendsTabPreloadStrategyModel2 != null) {
            friendsTabPreloadStrategyModel = friendsTabPreloadStrategyModel2;
        }
        boolean z = true;
        if (friendsTabPreloadStrategyModel.enableCompensateOnForeground != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
