package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public interface YG6 {
    void closeProfilePopUpWebPage(Activity activity);

    AW4 createFakeUserProfileFragment();

    AW4 createNewFakeUserProfileFragment();

    void feedLiveProfileAvatarOpen(Context context, Aweme aweme, int i, User user);

    InterfaceC59609NaP getAdFlutterLandPageUtil();

    NOH getAdLynxLandPageUtil();

    JSONObject getExtJson(Context context, Aweme aweme, String str);

    void onProfileWebPageHide(Context context, Aweme aweme, String str);

    void onProfileWebPageShow(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPageInSixTwoMode(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPageInTwoExpandMode(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str);

    boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str, boolean z);

    boolean openTopViewLive(Context context, Aweme aweme, int i, InterfaceC59418NTq interfaceC59418NTq);

    boolean shouldShowAdBrowser(Aweme aweme);

    boolean shouldShowBioEmail();

    boolean shouldShowBioUrl();

    boolean shouldShowFakeUserProfile(Aweme aweme);
}
