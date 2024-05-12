package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControlComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JD7 implements InterfaceC87433YTd {
    public final /* synthetic */ EarphonePlayerControlComponent LIZ;

    @Override // X.InterfaceC87433YTd
    public final String LIZIZ() {
        return "common_feed";
    }

    @Override // X.InterfaceC87433YTd
    public final void LIZ() {
        InterfaceC46330IGg playerManager;
        Boolean bool;
        Boolean bool2;
        Aweme aweme;
        String str;
        InterfaceC46330IGg playerManager2;
        com.bytedance.hox.Hox hox;
        IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LIZ.LJLIL.getValue();
        if (iPlayerComponentAbility == null || (playerManager = iPlayerComponentAbility.getPlayerManager()) == null || !playerManager.isPaused() || !o.LJ(C55096Ljo.LJIIIIZZ(this.LIZ), C84763XOl.LJIIIIZZ())) {
            return;
        }
        String str2 = (String) this.LIZ.LJLJJI.getValue();
        String str3 = null;
        if (str2 != null && (hox = (com.bytedance.hox.Hox) this.LIZ.LJLJI.getValue()) != null) {
            bool = Boolean.valueOf(hox.wv0(str2));
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.FALSE)) {
            return;
        }
        YTW.LIZLLL("common_feed");
        IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) this.LIZ.LJLIL.getValue();
        if (iPlayerComponentAbility2 != null) {
            iPlayerComponentAbility2.tryResumePlay();
        }
        IPlayerComponentAbility iPlayerComponentAbility3 = (IPlayerComponentAbility) this.LIZ.LJLIL.getValue();
        if (iPlayerComponentAbility3 != null && (playerManager2 = iPlayerComponentAbility3.getPlayerManager()) != null) {
            bool2 = Boolean.valueOf(playerManager2.isPlaying());
        } else {
            bool2 = null;
        }
        YTW.LIZJ(bool2, "common_feed");
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this.LIZ), IFeedPanelPlatformAbility.class, null);
        if (iFeedPanelPlatformAbility != null) {
            aweme = iFeedPanelPlatformAbility.getCurrentAweme();
        } else {
            aweme = null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", C56509MFt.LIZLLL(this.LIZ.getPanelContext()));
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        if (aweme != null) {
            str3 = aweme.getAuthorUid();
        }
        c188727au.LJIIIZ("author_id", str3);
        FMX.LJIIL("earphone_play_continue", c188727au.LIZ);
    }

    public JD7(EarphonePlayerControlComponent earphonePlayerControlComponent) {
        this.LIZ = earphonePlayerControlComponent;
    }
}
