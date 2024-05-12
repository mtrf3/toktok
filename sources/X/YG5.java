package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class YG5 implements YG6 {
    public static final YG5 LIZIZ = new YG5();
    public final /* synthetic */ YG6 LIZ = C87030YDq.LIZIZ.adUtilsService();

    @Override // X.YG6
    public final void closeProfilePopUpWebPage(Activity activity) {
        this.LIZ.closeProfilePopUpWebPage(activity);
    }

    @Override // X.YG6
    public final AW4 createFakeUserProfileFragment() {
        return this.LIZ.createFakeUserProfileFragment();
    }

    @Override // X.YG6
    public final AW4 createNewFakeUserProfileFragment() {
        return this.LIZ.createNewFakeUserProfileFragment();
    }

    @Override // X.YG6
    public final void feedLiveProfileAvatarOpen(Context context, Aweme aweme, int i, User user) {
        this.LIZ.feedLiveProfileAvatarOpen(context, aweme, 50, user);
    }

    @Override // X.YG6
    public final InterfaceC59609NaP getAdFlutterLandPageUtil() {
        return this.LIZ.getAdFlutterLandPageUtil();
    }

    @Override // X.YG6
    public final NOH getAdLynxLandPageUtil() {
        return this.LIZ.getAdLynxLandPageUtil();
    }

    @Override // X.YG6
    public final JSONObject getExtJson(Context context, Aweme aweme, String str) {
        return this.LIZ.getExtJson(context, aweme, "");
    }

    @Override // X.YG6
    public final void onProfileWebPageHide(Context context, Aweme aweme, String str) {
        this.LIZ.onProfileWebPageHide(context, aweme, str);
    }

    @Override // X.YG6
    public final void onProfileWebPageShow(Context context, Aweme aweme, String str) {
        this.LIZ.onProfileWebPageShow(context, aweme, str);
    }

    @Override // X.YG6
    public final boolean openProfilePopUpWebPageInSixTwoMode(Context context, Aweme aweme, String str) {
        return this.LIZ.openProfilePopUpWebPageInSixTwoMode(context, aweme, str);
    }

    @Override // X.YG6
    public final boolean openProfilePopUpWebPageInTwoExpandMode(Context context, Aweme aweme, String str) {
        return this.LIZ.openProfilePopUpWebPageInTwoExpandMode(context, aweme, str);
    }

    @Override // X.YG6
    public final boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str) {
        return this.LIZ.openProfilePopUpWebPageInTwoMode(context, aweme, str);
    }

    @Override // X.YG6
    public final boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str, boolean z) {
        return this.LIZ.openProfilePopUpWebPageInTwoMode(context, aweme, str, z);
    }

    @Override // X.YG6
    public final boolean openTopViewLive(Context context, Aweme aweme, int i, InterfaceC59418NTq interfaceC59418NTq) {
        return this.LIZ.openTopViewLive(context, aweme, i, interfaceC59418NTq);
    }

    @Override // X.YG6
    public final boolean shouldShowAdBrowser(Aweme aweme) {
        return this.LIZ.shouldShowAdBrowser(aweme);
    }

    @Override // X.YG6
    public final boolean shouldShowBioEmail() {
        return this.LIZ.shouldShowBioEmail();
    }

    @Override // X.YG6
    public final boolean shouldShowBioUrl() {
        return this.LIZ.shouldShowBioUrl();
    }

    @Override // X.YG6
    public final boolean shouldShowFakeUserProfile(Aweme aweme) {
        return this.LIZ.shouldShowFakeUserProfile(aweme);
    }
}
