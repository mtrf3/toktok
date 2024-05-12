package com.ss.android.ugc.aweme.profile.edit;

import X.AWX;
import X.ActivityC45651qj;
import X.AnonymousClass073;
import X.C188727au;
import X.C244309iM;
import X.C244319iN;
import X.C244329iO;
import X.C2U8;
import X.C66504Q8e;
import X.C73969T1h;
import X.C76L;
import X.C770830u;
import X.C82544WaS;
import X.C9WB;
import X.E8M;
import X.EFJ;
import X.EnumC243849hc;
import X.FMX;
import X.HG3;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.QBA;
import X.QBC;
import X.QBH;
import X.QBI;
import X.QBJ;
import X.QBK;
import X.RunnableC45421Hs9;
import X.T16;
import X.X1D;
import Y.ARunnableS11S0101000_7;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.edit.api.InstagramAPI;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public class InstagramPresenter implements WeakHandler.IHandler, QBC {
    public static final String BIND_INSTAGRAM_URL = AnonymousClass073.LIZIZ(new StringBuilder(), Api.LIZ, "/aweme/v1/instagram/bind/");
    public static final boolean DEBUG = false;
    public ActivityC45651qj mActivity;
    public QBK mInsView;
    public boolean mIsLinkAction;
    public InstagramApi sApi = (InstagramApi) RetrofitFactory.LIZLLL().LIZ(EFJ.LIZJ).LJFF().LIZ.LIZ(InstagramApi.class);
    public WeakHandler mHandler = new WeakHandler(this);
    public IAccountUserService mAccountUserService = HG3.LJIILL();

    /* loaded from: classes5.dex */
    public interface InstagramApi {
        @E8M
        @InterfaceC195757mF
        C76L<String> doPost(@InterfaceC195747mE String str, @InterfaceC36229EJt Map<String, String> map);
    }

    public void authorize() {
        this.mIsLinkAction = true;
        QBJ qbj = new QBJ(this.mActivity);
        qbj.LIZ = "instagram";
        qbj.LIZJ = this;
        QBH qbh = new QBH(qbj);
        QBA.LIZIZ().getClass();
        QBA.LIZJ(qbh);
    }

    public void remove() {
        this.mIsLinkAction = false;
        unbindInstagram();
    }

    public /* synthetic */ void lambda$bindInstagram$0() {
        this.mInsView.l30(null);
    }

    public void unbindInstagram() {
        InstagramAPI.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        ((InstagramAPI) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(InstagramAPI.class)).unlink().LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LIZ(new QBI(this));
    }

    /* renamed from: bindInstagram */
    public void lambda$onAuthResult$1(String str) {
        String message;
        this.mIsLinkAction = true;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("code", Uri.encode(str));
            hashMap.put("new_flow", "true");
            String str2 = this.sApi.doPost(BIND_INSTAGRAM_URL, hashMap).get();
            if (!TextUtils.isEmpty(str2)) {
                String string = JSONObjectProtectorUtils.getString(new JSONObject(str2), "status_code");
                if (TextUtils.equals(string, CardStruct.IStatusCode.DEFAULT)) {
                    this.mAccountUserService.queryUser(this.mHandler);
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Failure response, status: ");
                LIZ.append(string);
                message = X1D.LIZIZ(LIZ);
            } else {
                message = "Empty response";
            }
        } catch (Exception e) {
            message = e.getMessage();
        }
        logFailure(message, "send_token_to_sever");
        if (this.mInsView != null) {
            C82544WaS.LIZJ(new ARunnableS11S0101000_7(6, this, 11));
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        User user;
        if (this.mInsView == null) {
            return;
        }
        Object obj = message.obj;
        if (!(obj instanceof Exception) && obj != null) {
            if (obj instanceof UserResponse) {
                user = ((UserResponse) obj).getUser();
            } else {
                user = (User) obj;
            }
            this.mInsView.l30(user.getInsId());
            int i = message.what;
            if (i == 6) {
                this.mAccountUserService.updateInsId(user.getInsId());
                C2U8.LIZ(new AWX(this.mAccountUserService.getCurUser()));
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("platform", "instagram");
                FMX.LJIIL("social_account_unbind_success", c188727au.LIZ);
                C244329iO c244329iO = new C244329iO("click_save", C9WB.SOCIAL_ACCOUNT_UNBIND);
                c244329iO.LJI = EnumC243849hc.INSTAGRAM;
                C244309iM.LJ(new C244319iN(c244329iO));
                return;
            }
            if (i == 112) {
                this.mAccountUserService.updateCurUser(user);
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("platform", "instagram");
                FMX.LJIIL("social_account_bind_success", c188727au2.LIZ);
                C244329iO c244329iO2 = new C244329iO("click_save", C9WB.SOCIAL_ACCOUNT_BIND);
                c244329iO2.LJI = EnumC243849hc.INSTAGRAM;
                C244309iM.LJ(new C244319iN(c244329iO2));
                return;
            }
        }
        if (message.what == 6) {
            this.mInsView.n10();
        } else {
            logFailure("Failed to retrieve data from TikTok server", "sycn_user_info");
            this.mInsView.l30(null);
        }
    }

    @Override // X.QBC
    public void onAuthResult(AuthResult authResult) {
        String str;
        QBK qbk = this.mInsView;
        if (qbk == null) {
            return;
        }
        String str2 = "redirect_and_get_token";
        if (!authResult.mIsSuccessful) {
            qbk.l30(null);
            C66504Q8e c66504Q8e = authResult.mErrorCause;
            if (c66504Q8e != null) {
                str = c66504Q8e.getMessage();
                str2 = c66504Q8e.getErrorStage();
            } else {
                str = "Lobby failed and no error info available";
            }
            logFailure(str, str2);
            return;
        }
        String string = authResult.mBundle.getString("code");
        if (!TextUtils.isEmpty(string)) {
            C82544WaS.LIZ(new RunnableC45421Hs9(3, this, string));
        } else {
            this.mInsView.l30(null);
            logFailure("Authorization code is missing", "redirect_and_get_token");
        }
    }

    private void logFailure(String errorMessage, String str) {
        String string;
        ActivityC45651qj activity = this.mActivity;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(errorMessage, "errorMessage");
        if (s.LJJJLZIJ(errorMessage, "Login flow cancelled", false)) {
            string = activity.getString(R.string.s7n, "Instagram");
            o.LJIIIIZZ(string, "{\n                activi…ernal, INS)\n            }");
        } else if (s.LJJJLZIJ(errorMessage, "No intent data received", false)) {
            string = activity.getString(R.string.s7o, "Instagram", "Instagram");
            o.LJIIIIZZ(string, "{\n                activi…, INS, INS)\n            }");
        } else if (s.LJJJLZIJ(errorMessage, "network not available", false)) {
            string = activity.getString(R.string.dtf);
            o.LJIIIIZZ(string, "{\n                activi…connection)\n            }");
        } else {
            string = activity.getString(R.string.s7p, "Instagram");
            o.LJIIIIZZ(string, "{\n                activi…known, INS)\n            }");
        }
        QBK qbk = this.mInsView;
        if (qbk != null) {
            qbk.CS(string);
        }
        if (this.mIsLinkAction) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("platform", "instagram");
            c188727au.LJIIIZ("error_desc", errorMessage);
            c188727au.LJIIIZ("error_code", str);
            FMX.LJIIL("social_account_bind_failure", c188727au.LIZ);
        }
    }
}
