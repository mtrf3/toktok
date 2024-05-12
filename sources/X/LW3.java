package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabLocalCacheConfig;

/* loaded from: classes10.dex */
public final class LW3 extends AbstractC65781Prl implements InterfaceC65784Pro<FriendsTabLocalCacheConfig> {
    public static final LW3 LJLIL = new LW3();

    public LW3() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final FriendsTabLocalCacheConfig invoke() {
        FriendsTabLocalCacheConfig friendsTabLocalCacheConfig;
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            FriendsTabLocalCacheConfig friendsTabLocalCacheConfig2 = LW4.LIZ;
            FriendsTabLocalCacheConfig friendsTabLocalCacheConfig3 = (FriendsTabLocalCacheConfig) LIZLLL.LJIIIIZZ("tt_friends_tab_local_cache_config", FriendsTabLocalCacheConfig.class, friendsTabLocalCacheConfig2);
            FriendsTabLocalCacheConfig friendsTabLocalCacheConfig4 = friendsTabLocalCacheConfig2;
            if (friendsTabLocalCacheConfig3 != null) {
                friendsTabLocalCacheConfig4 = friendsTabLocalCacheConfig3;
            }
            C3C5.m7constructorimpl(friendsTabLocalCacheConfig4);
            friendsTabLocalCacheConfig = friendsTabLocalCacheConfig4;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            friendsTabLocalCacheConfig = LIZ;
        }
        if (C3C5.m10exceptionOrNullimpl(friendsTabLocalCacheConfig) == null) {
            return friendsTabLocalCacheConfig;
        }
        return LW4.LIZ;
    }
}
