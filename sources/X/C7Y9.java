package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: X.7Y9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7Y9 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        IUserService createIUserServicebyMonsterPlugin;
        User currentUser;
        if (C00F.LIZ(31744, 0, "show_music_new_release_tag", true) == 0 && ((createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false)) == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null || currentUser.getShowArtistPlaylist() != 1)) {
            return false;
        }
        return true;
    }
}
