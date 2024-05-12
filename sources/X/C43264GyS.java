package X;

import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: X.GyS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43264GyS implements InterfaceC44417Hbx {
    @Override // X.InterfaceC44417Hbx
    public final User getCurrentUser() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            return createIUserServicebyMonsterPlugin.getCurrentUser();
        }
        return null;
    }

    @Override // X.InterfaceC44417Hbx
    public final boolean LIZ() {
        return AVExternalServiceImpl.LIZ().publishService().hasECCommerceAnchor();
    }

    @Override // X.InterfaceC44417Hbx
    public final boolean LIZJ() {
        return AVExternalServiceImpl.LIZ().commerceToolsService().usedCommerceSticker();
    }

    @Override // X.InterfaceC44417Hbx
    public final String getShootWay() {
        return AVExternalServiceImpl.LIZ().publishService().getShootWay();
    }

    @Override // X.InterfaceC44417Hbx
    public final boolean isChildrenMode() {
        return C6D8.LIZLLL();
    }

    @Override // X.InterfaceC44417Hbx
    public final boolean isCommerceChallenge() {
        return AVExternalServiceImpl.LIZ().commerceToolsService().isCommerceChallenge();
    }

    @Override // X.InterfaceC44417Hbx
    public final boolean isInShoutout() {
        return AVExternalServiceImpl.LIZ().publishService().isInShoutout();
    }

    @Override // X.InterfaceC44417Hbx
    public final boolean isSubOnlyVideo() {
        return AVExternalServiceImpl.LIZ().publishService().isSubOnlyVideo();
    }

    @Override // X.InterfaceC44417Hbx
    public final void LIZIZ(String str) {
        Aweme i6;
        IAwemeService LIZ = AwemeService.LIZ();
        if (LIZ == null || (i6 = LIZ.i6(str)) == null || !i6.isAd()) {
            return;
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("ad_music", "otherclick", i6.getAwemeRawAd());
        LIZLLL.LIZJ("ad_music_usage", "refer");
        LIZLLL.LJI();
    }
}
