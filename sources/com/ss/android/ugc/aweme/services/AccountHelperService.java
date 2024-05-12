package com.ss.android.ugc.aweme.services;

import X.C158056If;
import X.C16880lQ;
import X.C38354F3m;
import X.C58096Mr6;
import X.C9WE;
import X.EFJ;
import X.FLJ;
import X.LV0;
import X.OBI;
import X.R41;
import X.RBW;
import X.RCW;
import X.RCX;
import X.X1D;
import Y.AgS123S0100000_6;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.webkit.WebView;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgLoginBanner;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AccountHelperService implements IAccountHelperService {
    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public void recommendAppUponAuth(Context context, String str) {
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public MainActivityLifecycle getHpasDialog() {
        return new MainActivityLifecycle() { // from class: com.ss.android.ugc.aweme.services.AccountHelperService$getHpasDialog$1
            @Override // com.ss.android.ugc.aweme.services.MainActivityLifecycle
            public void onDestroy() {
                RCX rcx = RCX.LJLJL;
                if (rcx != null) {
                    rcx.dismiss();
                }
                RCX.LJLJL = null;
            }

            @Override // com.ss.android.ugc.aweme.services.MainActivityLifecycle
            public void onResume() {
                RCX rcx;
                RCX rcx2 = RCX.LJLJL;
                if (rcx2 != null && rcx2.LJLJJL && R41.LIZIZ.LJIIL().getTwoStepVerificationStatusFromLocal() == 1 && (rcx = RCX.LJLJL) != null) {
                    rcx.dismiss();
                }
            }

            @Override // com.ss.android.ugc.aweme.services.MainActivityLifecycle
            public void onCreate(Activity activity) {
                o.LJIIIZ(activity, "activity");
                try {
                    if (RBW.LJLLI.LJI()) {
                        int twoStepVerificationStatusFromLocal = R41.LIZIZ.LJIIL().getTwoStepVerificationStatusFromLocal();
                        if (twoStepVerificationStatusFromLocal == -1) {
                            R41.LIZIZ.LJIIL().getTwoStepVerificationStatusFromNetwork().LIZLLL(new AgS123S0100000_6(activity, 25));
                        } else if (twoStepVerificationStatusFromLocal == 0) {
                            RCW.LIZ(activity);
                        }
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public UrlModel getLoginViewBanner() {
        com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel urlModel;
        try {
            UgLoginBanner LIZIZ = LV0.LJII.LIZIZ();
            if (LIZIZ != null) {
                urlModel = LIZIZ.getResourceUrl();
            } else {
                urlModel = null;
            }
            return LV0.LJIIIIZZ(urlModel);
        } catch (C158056If unused) {
            return new UrlModel();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public String getLoginViewTitleForMoneyGrowth() {
        try {
            UgLoginBanner LIZIZ = LV0.LJII.LIZIZ();
            if (LIZIZ != null && LIZIZ.getText() != null) {
                String text = LIZIZ.getText();
                o.LJIIIIZZ(text, "ugLoginBanner.text");
                return text;
            }
            return "";
        } catch (C158056If unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public String getUserApi() {
        return ProfileServiceImpl.LIZ().getUserApi();
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public String selfUserApi() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(EFJ.LIZJ);
        LIZ.append(ProfileServiceImpl.LIZ().getUserPath(true));
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public String userPermissionApi() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(EFJ.LIZJ);
        LIZ.append(ProfileServiceImpl.LIZ().getUserPermissionsPath());
        return X1D.LIZIZ(LIZ);
    }

    public static IAccountHelperService createIAccountHelperServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IAccountHelperService.class, z);
        if (LIZ != null) {
            return (IAccountHelperService) LIZ;
        }
        if (C58096Mr6.x5 == null) {
            synchronized (IAccountHelperService.class) {
                if (C58096Mr6.x5 == null) {
                    C58096Mr6.x5 = new AccountHelperService();
                }
            }
        }
        return C58096Mr6.x5;
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public void AppsFlyerUtilsTrackLoginSuccess(String str) {
        UgCommonServiceImpl.LJIJ().LJIILIIL();
        FLJ.LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public void appendCommonParams(StringBuilder sb) {
        o.LJIIIZ(sb, "sb");
        AppLog.appendCommonParams(sb, false);
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public Dialog getChangeIllegalUsernameDialog(Activity activity, User user) {
        o.LJIIIZ(activity, "activity");
        return new C9WE(activity, user);
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public void loadWebViewUrl(String str, WebView webView) {
        if (webView == null || C38354F3m.LJ(str)) {
            return;
        }
        OBI.LIZ(webView, str);
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public void friendUploadToken(String str, String str2, String str3) {
        FriendsServiceImpl.LJJJJ().LJJIFFI(str, str2, str3);
    }
}
