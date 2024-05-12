package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;

/* loaded from: classes5.dex */
public final class AUD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, ActivityC45651qj activityC45651qj, User user, AvatarPresenter avatarPresenter) {
        String str;
        UrlModel avatarVideoUri;
        if (activityC45651qj != null) {
            Aweme LIZIZ = LNH.LIZIZ(activityC45651qj);
            if (LIZIZ == null || (str = LIZIZ.getGroupId()) == null) {
                str = "";
            }
            if (view == null) {
                return;
            }
            AUA aua = new AUA(activityC45651qj, view, avatarPresenter.getHeadUploadHelper(), user, str);
            if (user != null && (avatarVideoUri = user.getAvatarVideoUri()) != null && avatarVideoUri.getUrlList() != null && avatarVideoUri.getUrlList().size() > 0) {
                new C43256GyK().LIZ(activityC45651qj, AUF.LIZ);
            } else {
                aua.LJ.LIZ();
            }
        }
    }
}
