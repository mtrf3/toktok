package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: X.7Y8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7Y8 {
    public static boolean LIZ() {
        User currentUser;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        return (createIUserServicebyMonsterPlugin == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null || currentUser.getShowArtistPlaylist() != 1) ? false : true;
    }
}
