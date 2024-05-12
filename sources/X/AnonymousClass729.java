package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.729, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass729 {
    public static final /* synthetic */ int LIZ = 0;

    public static C62562cu LIZ(User user) {
        UrlModel avatarThumb;
        if (user == null) {
            return null;
        }
        if (user.getAvatarMedium() != null) {
            avatarThumb = user.getAvatarMedium();
        } else if (user.getAvatarLarger() != null) {
            avatarThumb = user.getAvatarLarger();
        } else {
            if (user.getAvatarThumb() != null) {
                avatarThumb = user.getAvatarThumb();
            }
            return null;
        }
        if (avatarThumb != null) {
            return new C62562cu(avatarThumb.getUrlList());
        }
        return null;
    }
}
