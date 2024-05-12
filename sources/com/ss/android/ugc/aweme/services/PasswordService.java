package com.ss.android.ugc.aweme.services;

import X.C16880lQ;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.EnumC78973Uz3;
import X.R41;
import X.R47;
import X.RBV;
import X.RC1;
import X.V86;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.PasswordService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PasswordService extends BasePasswordService {
    @Override // com.ss.android.ugc.aweme.services.BasePasswordService, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.services.BasePasswordService, X.RCK
    public void setPassword(Activity activity, Bundle bundle, R47 r47) {
        super.setPassword(activity, bundle, r47);
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//account/login/signup_or_login");
        buildRoute.withParam(bundle);
        buildRoute.withParam("next_page", EnumC69113RAn.CREATE_PASSWORD_FOR_PHONE.getValue());
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.services.BasePasswordService, X.RCK
    public void verifyPassword(Activity activity, String str, Bundle bundle, R47 r47) {
        super.verifyPassword(activity, str, bundle, r47);
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//account/login/signup_or_login");
        buildRoute.withParam("enter_from", str);
        buildRoute.withParam("next_page", EnumC69113RAn.VERIFY_PASSWORD.getValue());
        if (bundle != null) {
            buildRoute.withParam(bundle);
        }
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.services.BasePasswordService, X.RCK
    public void changePassword(final Activity activity, final String str, final String str2, Bundle bundle, final R47 r47) {
        final Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        if (R41.LIZ().isChildrenMode()) {
            super.changePassword(activity, str, str2, bundle2, r47);
            SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//account/login/signup_or_login");
            buildRoute.withParam(bundle2);
            buildRoute.withParam("next_page", EnumC69113RAn.CHANGE_PASSWORD_FOR_CHILDREN.getValue());
            buildRoute.open();
            return;
        }
        User LIZJ = R41.LIZJ();
        bundle2.putBoolean("from_changePwd", true);
        String bindPhone = LIZJ.getBindPhone();
        if (!TextUtils.isEmpty(bindPhone)) {
            RBV.LJIILIIL(bundle2, bindPhone);
            bundle2.putString("enter_from_item", "change_password");
            CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.PHONE_SMS_CHANGE_PASSWORD, EnumC69116RAq.CHANGE_PASSWORD, bundle2, r47, null, Boolean.FALSE);
            return;
        }
        String email = LIZJ.getEmail();
        if (!TextUtils.isEmpty(email)) {
            if (LIZJ.isEmailVerified()) {
                RBV.LJIIJ(bundle2, email);
                CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.EMAIL_SMS_CHANGE_PASSWORD, EnumC69116RAq.CHANGE_PASSWORD, bundle2, r47, null, Boolean.FALSE);
                return;
            } else {
                bundle2.putBoolean("use_phone", true);
                bundle2.putBoolean("use_email", true);
                R41.LIZIZ().verifyEmail(activity, str, bundle2, new R47() { // from class: X.RCI
                    @Override // X.R47
                    public final void onResult(int i, int i2, Object obj) {
                        PasswordService.lambda$changePassword$0(bundle2, activity, r47, i, i2, obj);
                    }
                });
                return;
            }
        }
        bundle2.putInt("email_source", V86.DYABindEmailSourceTypeAccountManagementPassword.getValue());
        bundle2.putInt("phone_number_source", EnumC78973Uz3.DYABindPhoneNumberSourceTypeAccountManagementPassword.getValue());
        R41.LIZIZ().bindMobileOrEmail(activity, str, str2, bundle2, new R47() { // from class: X.RCJ
            @Override // X.R47
            public final void onResult(int i, int i2, Object obj) {
                PasswordService.this.lambda$changePassword$1(bundle2, activity, str, str2, r47, i, i2, obj);
            }
        });
    }

    public static /* synthetic */ void lambda$changePassword$0(Bundle bundle, Activity activity, R47 r47, int i, int i2, Object obj) {
        if (i2 == 1) {
            bundle.putAll((Bundle) obj);
            CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.CHANGE_PASSWORD, EnumC69116RAq.CHANGE_PASSWORD, bundle, r47, null, Boolean.FALSE);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BasePasswordService, X.RCK
    public void setPasswordForMT(Activity activity, String str, String str2, String str3, Bundle bundle, R47 r47) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_from", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle2.putString("enter_method", str3);
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("platform", str);
        }
        CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.CHANGE_PASSWORD, EnumC69116RAq.CHANGE_PASSWORD, bundle2, r47, null, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$changePassword$1(Bundle bundle, Activity activity, String str, String str2, R47 r47, int i, int i2, Object obj) {
        String str3;
        if (i2 == 1) {
            if (obj instanceof RC1) {
                try {
                    RBV.LJIILL(bundle, new JSONObject(((RC1) obj).LJLILLLLZI).optString("ticket", ""));
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            } else {
                bundle.putAll((Bundle) obj);
            }
            if (i == 7) {
                str3 = "phone";
            } else {
                str3 = "email";
            }
            setPasswordForMT(activity, str3, str, str2, bundle, r47);
        }
    }
}
