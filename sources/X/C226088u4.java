package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.assem.friendstab.FriendsTabEducateConfig;

/* renamed from: X.8u4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226088u4 extends AbstractC65781Prl implements InterfaceC65784Pro<FriendsTabEducateConfig> {
    public static final C226088u4 LJLIL = new C226088u4();

    public C226088u4() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final FriendsTabEducateConfig invoke() {
        FriendsTabEducateConfig friendsTabEducateConfig;
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            FriendsTabEducateConfig friendsTabEducateConfig2 = C226078u3.LIZ;
            FriendsTabEducateConfig friendsTabEducateConfig3 = (FriendsTabEducateConfig) LIZLLL.LJIIIIZZ("tt_friends_tab_educate_config", FriendsTabEducateConfig.class, friendsTabEducateConfig2);
            FriendsTabEducateConfig friendsTabEducateConfig4 = friendsTabEducateConfig2;
            if (friendsTabEducateConfig3 != null) {
                friendsTabEducateConfig4 = friendsTabEducateConfig3;
            }
            C3C5.m7constructorimpl(friendsTabEducateConfig4);
            friendsTabEducateConfig = friendsTabEducateConfig4;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            friendsTabEducateConfig = LIZ;
        }
        if (C3C5.m10exceptionOrNullimpl(friendsTabEducateConfig) == null) {
            return friendsTabEducateConfig;
        }
        return C226078u3.LIZ;
    }
}
