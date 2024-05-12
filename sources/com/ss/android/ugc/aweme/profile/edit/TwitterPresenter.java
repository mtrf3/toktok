package com.ss.android.ugc.aweme.profile.edit;

import X.ActivityC45651qj;
import X.C09900aA;
import X.C188727au;
import X.C198517qh;
import X.C1E5;
import X.C244309iM;
import X.C244319iN;
import X.C244329iO;
import X.C2NU;
import X.C36922EeM;
import X.C38816FLg;
import X.C66504Q8e;
import X.C82544WaS;
import X.C9WB;
import X.EF7;
import X.EnumC243849hc;
import X.FMX;
import X.HG3;
import X.QBA;
import X.QBC;
import X.QBH;
import X.QBJ;
import X.QBM;
import X.QBN;
import X.QBP;
import X.RBX;
import Y.ARunnableS47S0100000_11;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.lobby.auth.AuthResult;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.edit.TwitterPresenter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public class TwitterPresenter implements WeakHandler.IHandler, QBC {
    public static final boolean DEBUG = false;
    public ActivityC45651qj mActivity;
    public WeakHandler mHandler = new WeakHandler(this);
    public boolean mIsLinkAction;
    public QBP mTwitterView;

    public void authTwitter() {
        this.mIsLinkAction = true;
        QBJ qbj = new QBJ(this.mActivity);
        qbj.LIZ = "twitter";
        qbj.LIZJ = this;
        QBH qbh = new QBH(qbj);
        QBA.LIZIZ().getClass();
        QBA.LIZJ(qbh);
    }

    public void unBindTwitter() {
        this.mIsLinkAction = false;
        C38816FLg.LJ(new ARunnableS47S0100000_11(new QBN(this), 49));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        User user;
        if (this.mTwitterView == null) {
            return;
        }
        Object obj = message.obj;
        boolean z = false;
        if (!(obj instanceof Exception) && obj != null) {
            if (obj instanceof UserResponse) {
                user = ((UserResponse) obj).getUser();
            } else {
                user = (User) obj;
            }
            if (message.what == 112) {
                ((RBX) HG3.LJIILL()).updateCurUser(user);
                if (this.mIsLinkAction) {
                    this.mTwitterView.or(user.getTwitterName());
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("platform", "twitter");
                    FMX.LJIIL("social_account_bind_success", c188727au.LIZ);
                    C244329iO c244329iO = new C244329iO("click_save", C9WB.SOCIAL_ACCOUNT_BIND);
                    c244329iO.LJI = EnumC243849hc.TWITTER;
                    C244309iM.LJ(new C244319iN(c244329iO));
                } else {
                    this.mTwitterView.or(null);
                    C188727au c188727au2 = new C188727au();
                    c188727au2.LJIIIZ("platform", "twitter");
                    FMX.LJIIL("social_account_unbind_success", c188727au2.LIZ);
                    C244329iO c244329iO2 = new C244329iO("click_save", C9WB.SOCIAL_ACCOUNT_UNBIND);
                    c244329iO2.LJI = EnumC243849hc.TWITTER;
                    C244309iM.LJ(new C244319iN(c244329iO2));
                }
                EF7.LIZIZ();
                try {
                    z = C2NU.LIZ.LIZIZ();
                } catch (Exception unused) {
                }
                if (z) {
                    C198517qh LJ = C1E5.LJ();
                    LJ.LIZ.put("app_language", SettingServiceImpl.LIZ().getAppLanguage());
                    LJ.LIZ.put("platform", "twitter");
                    C09900aA.LJIIJJI("aweme_thirdparty_login_error_rate", 1, LJ.LJ());
                    return;
                }
                return;
            }
        }
        logFailure("Failed to retrieve data from TikTok server", "sycn_user_info");
        this.mTwitterView.or(null);
    }

    @Override // X.QBC
    public void onAuthResult(AuthResult authResult) {
        String str;
        if (authResult.mIsSuccessful) {
            final String str2 = authResult.mUid;
            final String string = authResult.mBundle.getString("username");
            final String str3 = authResult.mToken;
            final String str4 = authResult.mTokenSecret;
            C82544WaS.LIZ(new Runnable() { // from class: X.QBO
                @Override // java.lang.Runnable
                public final void run() {
                    TwitterPresenter.this.lambda$onAuthResult$0(str2, string, str3, str4);
                }
            });
            return;
        }
        C66504Q8e c66504Q8e = authResult.mErrorCause;
        if (c66504Q8e == null) {
            str = "";
        } else {
            str = c66504Q8e.getMessage();
        }
        QBP qbp = this.mTwitterView;
        if (qbp != null) {
            qbp.or(null);
        }
        if (c66504Q8e == null || TextUtils.equals(str, "Authorization failed, request was canceled.") || TextUtils.equals(str, "Failed to get authorization, bundle incomplete")) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : c66504Q8e.getStackTrace()) {
            sb.append(stackTraceElement.toString());
        }
        sb.append(c66504Q8e.getMessage());
        String sb2 = sb.toString();
        EF7.LIZIZ();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                C198517qh LJ = C1E5.LJ();
                LJ.LIZ.put("app_language", SettingServiceImpl.LIZ().getAppLanguage());
                LJ.LIZ.put("platform", "twitter");
                LJ.LIZ.put("errorDesc", String.valueOf(sb2));
                LJ.LIZ.put("errorUrl", "");
                C09900aA.LJIIJJI("aweme_thirdparty_login_error_rate", 0, LJ.LJ());
            }
        } catch (Exception unused) {
        }
        C36922EeM.LJFF(c66504Q8e);
        logFailure(c66504Q8e.getMessage(), c66504Q8e.getErrorStage());
    }

    public void logFailure(String errorMessage, String str) {
        String string;
        ActivityC45651qj activity = this.mActivity;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(errorMessage, "errorMessage");
        if (s.LJJJLZIJ(errorMessage, "request was canceled", false)) {
            string = activity.getString(R.string.s7n, "Twitter");
            o.LJIIIIZZ(string, "{\n                activi…l, TWITTER)\n            }");
        } else if (s.LJJJLZIJ(errorMessage, "Failed to store data", false) || s.LJJJLZIJ(errorMessage, "Failed to retrieve data", false)) {
            string = activity.getString(R.string.s7p, "Twitter");
            o.LJIIIIZZ(string, "{\n                activi…n, TWITTER)\n            }");
        } else {
            string = activity.getString(R.string.s7o, "Twitter", "Twitter");
            o.LJIIIIZZ(string, "{\n                activi…R, TWITTER)\n            }");
        }
        QBP qbp = this.mTwitterView;
        if (qbp != null) {
            qbp.kE(string);
        }
        if (this.mIsLinkAction) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("platform", "twitter");
            c188727au.LJIIIZ("error_desc", errorMessage);
            c188727au.LJIIIZ("error_code", str);
            FMX.LJIIL("social_account_bind_failure", c188727au.LIZ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindTwitter, reason: merged with bridge method [inline-methods] */
    public void lambda$onAuthResult$0(String str, String str2, String str3, String str4) {
        this.mIsLinkAction = true;
        C38816FLg.LJ(new ARunnableS47S0100000_11(new QBM(this, str, str2, str3, str4), 49));
    }
}
