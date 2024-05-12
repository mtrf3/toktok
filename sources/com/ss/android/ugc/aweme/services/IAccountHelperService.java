package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes10.dex */
public interface IAccountHelperService {
    void AppsFlyerUtilsTrackLoginSuccess(String str);

    void appendCommonParams(StringBuilder sb);

    void friendUploadToken(String str, String str2, String str3);

    Dialog getChangeIllegalUsernameDialog(Activity activity, User user);

    MainActivityLifecycle getHpasDialog();

    UrlModel getLoginViewBanner();

    String getLoginViewTitleForMoneyGrowth();

    String getUserApi();

    void loadWebViewUrl(String str, WebView webView);

    void recommendAppUponAuth(Context context, String str);

    String selfUserApi();

    String userPermissionApi();
}
