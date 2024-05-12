package com.ss.android.ugc.aweme.services;

import X.AbstractC68941R3x;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C10K;
import X.C16880lQ;
import X.C19N;
import X.C26337AVh;
import X.C2YO;
import X.C35260Dse;
import X.C58096Mr6;
import X.C61851OPf;
import X.C73969T1h;
import X.C76800UCe;
import X.C78939UyV;
import X.C78983UzD;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.EnumC78973Uz3;
import X.InterfaceC63892P5s;
import X.InterfaceC65784Pro;
import X.InterfaceC92693kP;
import X.QQE;
import X.QQI;
import X.QQN;
import X.R41;
import X.R47;
import X.R4V;
import X.R51;
import X.R7H;
import X.RBV;
import X.RCL;
import X.RCN;
import X.RCO;
import X.RCS;
import X.RCU;
import X.T16;
import X.V86;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.account.experiment.AccountBindingsService;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity;
import com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.services.model.BindServiceData;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class BindService extends BaseBindService {
    public InterfaceC63892P5s mVerificationService;

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void setAuthorzieBindResult(RCU rcu) {
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void showThirdPartyAccountManagerActivity(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public boolean emailPopUpFunctionSwitch() {
        return C19N.LJ("user_bind_email_function_switch", false);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public InterfaceC63892P5s getVerificationService() {
        if (this.mVerificationService == null) {
            this.mVerificationService = new VerificationService();
        }
        return this.mVerificationService;
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public boolean shouldShowEmailPopUpInFeed() {
        if (C35260Dse.LIZ() == 1 || C35260Dse.LIZ() == 2 || C35260Dse.LIZ() == 3) {
            return true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("feed");
        LIZ.append(C61851OPf.LIZIZ);
        if (C61851OPf.LIZ.getBoolean(X1D.LIZIZ(LIZ), false)) {
            return true;
        }
        C61851OPf.LIZLLL(true);
        return false;
    }

    public static IBindService createIBindServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IBindService.class, z);
        if (LIZ != null) {
            return (IBindService) LIZ;
        }
        if (C58096Mr6.B5 == null) {
            synchronized (IBindService.class) {
                if (C58096Mr6.B5 == null) {
                    C58096Mr6.B5 = new BindService();
                }
            }
        }
        return C58096Mr6.B5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0027. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean shouldShowEmailPopUp(java.lang.Integer r17, X.InterfaceC65784Pro<X.C76800UCe> r18) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.BindService.shouldShowEmailPopUp(java.lang.Integer, X.Pro):boolean");
    }

    public static Object lambda$showEmailPopUp$2(ActivityC45651qj activity, Integer num, InterfaceC65784Pro interfaceC65784Pro) {
        int intValue = num.intValue();
        o.LJIIIZ(activity, "activity");
        try {
            InterfaceC92693kP LJJJLL = AbstractC73672Svk.LJIIJ(C26337AVh.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new RCL(intValue, activity), RCO.LJLIL, new RCS());
            RCN.LIZIZ = interfaceC65784Pro;
            RCN.LIZJ.LIZ(LJJJLL);
            return null;
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void bindPlatform(Activity activity, String str, Bundle bundle) {
        super.bindPlatform(activity, str, bundle);
        Intent intent = new Intent(activity, (Class<?>) AuthorizeActivity.class);
        intent.putExtra("platform", str);
        intent.putExtra("is_auth_for_bind", true);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C16880lQ.LJFF(activity, 10, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void changeUnverifiedEmail(Activity activity, String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        super.changeUnverifiedEmail(activity, str, bundle2);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("enter_from", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("_change_unverified_email");
        bundle2.putString("enter_from_item", X1D.LIZIZ(LIZ));
        CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.INPUT_EMAIL_CHANGE, EnumC69116RAq.CHANGE_EMAIL, bundle2, null, null, Boolean.FALSE);
    }

    public void onUnbindResult(R47 r47, int i, String str) {
        int i2;
        if (r47 != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("error_code", i);
            bundle.putString("error_message", str);
            if (i == 0) {
                i2 = 1;
            } else {
                i2 = 3;
            }
            r47.onResult(18, i2, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void showEmailPopUp(final ActivityC45651qj activityC45651qj, final Integer num, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        try {
            C10K.LIZJ(new Callable() { // from class: X.RCP
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return BindService.lambda$showEmailPopUp$2(ActivityC45651qj.this, num, interfaceC65784Pro);
                }
            });
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void unbindPhone(Activity activity, ArrayList<String> arrayList, String str) {
        super.unbindPhone(activity, arrayList, str);
        UnbindPhoneOrEmailActivity.LLIIJLIL(activity, arrayList, str, Boolean.FALSE, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void unbindPlatform(final Activity activity, String str, final R47 r47) {
        super.unbindPlatform(activity, str, r47);
        Context LLLLJ = C16880lQ.LLLLJ(activity);
        QQE<QQI> qqe = new QQE<QQI>() { // from class: com.ss.android.ugc.aweme.services.BindService.2
            @Override // X.QQE
            public void onResponse(QQI qqi) {
                if (qqi.LIZIZ) {
                    new R7H(activity).LJJIII("normal", new AbstractC68941R3x() { // from class: com.ss.android.ugc.aweme.services.BindService.2.1
                        @Override // X.AbstractC67055QTj
                        public void onSuccess(R4V r4v) {
                            R41.LJIILIIL(r4v.LJIIIZ);
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            BindService.this.onUnbindResult(r47, 0, null);
                        }

                        @Override // X.AbstractC67055QTj
                        public void onError(R4V r4v, int i) {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            BindService.this.onUnbindResult(r47, 0, null);
                        }
                    });
                } else {
                    BindService.this.onUnbindResult(r47, qqi.LIZLLL, qqi.LJFF);
                }
            }
        };
        QQN qqn = new QQN();
        qqn.LIZJ("platform", str);
        qqn.LIZ = C78939UyV.LIZIZ("/passport/auth/unbind/");
        new R51(LLLLJ, qqn.LJFF(), qqe).LJIIIZ();
    }

    public static /* synthetic */ void lambda$setPassword$1(R47 r47, int i, int i2, Object obj) {
        if (r47 != null) {
            r47.onResult(i, 1, obj);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindMobile(Activity activity, String str, Bundle bundle, R47 r47) {
        bindMobile(activity, str, "", bundle, r47);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void changeEmail(Activity activity, String str, Bundle bundle, R47 r47) {
        Bundle bundle2 = bundle;
        super.changeEmail(activity, str, bundle2, r47);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("enter_from", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("_change_email");
        bundle2.putString("enter_from_item", X1D.LIZIZ(LIZ));
        RBV.LJIIJ(bundle2, R41.LIZJ().getEmail());
        CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.VERIFY_EMAIL_BEFORE_CHANGE, EnumC69116RAq.CHANGE_EMAIL, bundle2, r47, null, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void changeEmailVerifyByPassword(Activity activity, String str, Bundle bundle, R47 r47) {
        super.changeEmailVerifyByPassword(activity, str, bundle, r47);
        changeEmailVerifyWithStep(activity, str, bundle, EnumC69113RAn.VERIFY_PASSWORD, r47);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void changeEmailVerifyByPhone(Activity activity, String str, Bundle bundle, R47 r47) {
        super.changeEmailVerifyByPhone(activity, str, bundle, r47);
        RBV.LJIILIIL(bundle, R41.LIZJ().getBindPhone());
        changeEmailVerifyWithStep(activity, str, bundle, EnumC69113RAn.PHONE_SMS_VERIFY, r47);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void modifyMobile(Activity activity, String str, Bundle bundle, R47 r47) {
        modifyMobileInner(activity, str, bundle, 0, r47);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void modifyMobileVerifyByEmail(Activity activity, String str, Bundle bundle, R47 r47) {
        String email = R41.LIZJ().getEmail();
        if (!TextUtils.isEmpty(email)) {
            RBV.LJIIJ(bundle, email);
        }
        modifyMobileInner(activity, str, bundle, 1, r47);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void modifyMobileVerifyByPassword(Activity activity, String str, Bundle bundle, R47 r47) {
        modifyMobileInner(activity, str, bundle, 2, r47);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void unbindEmail(Activity activity, boolean z, ArrayList<String> arrayList, String str) {
        super.unbindEmail(activity, z, arrayList, str);
        UnbindPhoneOrEmailActivity.LLIIJI(activity, z, arrayList, str, Boolean.FALSE, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void verifyEmail(Activity activity, String str, Bundle bundle, R47 r47) {
        Bundle bundle2 = bundle;
        super.verifyEmail(activity, str, bundle2, r47);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("enter_from", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("_verify_email");
        bundle2.putString("enter_from_item", X1D.LIZIZ(LIZ));
        if (bundle2.getString("enter_method") == null || bundle2.getString("enter_method").isEmpty()) {
            bundle2.putString("enter_method", "email_verification");
        }
        String email = R41.LIZJ().getEmail();
        if (!TextUtils.isEmpty(email)) {
            RBV.LJIIJ(bundle2, email);
        }
        CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.CONFIRM_EMAIL_BEFORE_VERIFY, EnumC69116RAq.VERIFY, bundle2, r47, null, Boolean.FALSE);
    }

    private void changeEmailVerifyWithStep(Activity activity, String str, Bundle bundle, EnumC69113RAn enumC69113RAn, R47 r47) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("enter_from", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("_change_email");
        bundle2.putString("enter_from_item", X1D.LIZIZ(LIZ));
        RBV.LJIIJ(bundle2, R41.LIZJ().getEmail());
        CommonFlowActivity.Companion.LIZIZ(activity, enumC69113RAn, EnumC69116RAq.CHANGE_EMAIL, bundle2, r47, null, Boolean.FALSE);
    }

    private void modifyMobileInner(Activity context, String str, Bundle bundle, int i, R47 r47) {
        EnumC69113RAn enumC69113RAn;
        super.modifyMobile(context, str, bundle, r47);
        o.LJIIIZ(context, "context");
        if (i != 1) {
            if (i != 2) {
                enumC69113RAn = EnumC69113RAn.PHONE_SMS_VERIFY;
            } else {
                enumC69113RAn = EnumC69113RAn.VERIFY_PASSWORD;
            }
        } else if (AccountBindingsService.LIZJ().LIZ()) {
            enumC69113RAn = EnumC69113RAn.VERIFY_EMAIL_BEFORE_CHANGE;
        } else {
            enumC69113RAn = EnumC69113RAn.EMAIL_SMS_VERIFY;
        }
        Intent putExtra = new Intent(context, (Class<?>) BindOrModifyPhoneActivity.class).putExtra("current_scene", EnumC69116RAq.MODIFY_PHONE.getValue()).putExtra("next_page", enumC69113RAn.getValue()).putExtra("enter_method", "change_bind_phone_click");
        o.LJIIIIZZ(putExtra, "Intent(context, BindOrMo… CHANGE_BIND_PHONE_CLICK)");
        if (!TextUtils.isEmpty(str)) {
            putExtra.putExtra("ENTER_REASON", str);
        }
        if (context.getIntent().getBooleanExtra("is_from_prompt", false)) {
            if (context.getIntent().hasExtra("enter_method")) {
                putExtra.putExtra("enter_method", C16880lQ.LLJJIJIIJIL(context.getIntent(), "enter_method"));
            }
            putExtra.putExtra("page", "prompt_user_confirm");
        }
        if (bundle != null) {
            putExtra.putExtras(bundle);
        }
        C16880lQ.LIZIZ(context, putExtra);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindEmail(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
        Bundle bundle2 = bundle;
        super.bindEmail(activity, str, str2, bundle2, r47);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("enter_from", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("_bind_email");
        bundle2.putString("enter_from_item", X1D.LIZIZ(LIZ));
        if (str2 != null) {
            bundle2.putString("enter_method", str2);
        }
        if ("security_alert".equals(str)) {
            bundle2.putInt("email_source", V86.DYABindEmailSourceTypeSecurityAlertToast.getValue());
            bundle2.putInt("phone_number_source", EnumC78973Uz3.DYABindPhoneNumberSourceTypeTypeSecurityAlertToast.getValue());
        }
        CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.INPUT_EMAIL_BIND, EnumC69116RAq.BIND_EMAIL, bundle2, r47, null, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindMobile(Activity context, String str, String str2, Bundle bundle, R47 r47) {
        super.bindMobile(context, str, str2, bundle, r47);
        if (bundle == null) {
            bundle = new Bundle();
        }
        int i = bundle.getInt("current_scene", -1);
        if (i != -1) {
            bundle.putInt("last_scene", i);
            bundle.remove("current_scene");
            bundle.remove("next_page");
            bundle.remove("current_page");
        }
        o.LJIIIZ(context, "context");
        Intent putExtra = new Intent(context, (Class<?>) BindOrModifyPhoneActivity.class).putExtra("current_scene", EnumC69116RAq.BIND_PHONE.getValue()).putExtra("next_page", EnumC69113RAn.INPUT_PHONE_BIND.getValue()).putExtra("enter_method", "first_bind_phone_click");
        o.LJIIIIZZ(putExtra, "Intent(context, BindOrMo…, FIRST_BIND_PHONE_CLICK)");
        putExtra.putExtras(bundle);
        if (!TextUtils.isEmpty(str)) {
            putExtra.putExtra("ENTER_REASON", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            putExtra.putExtra("enter_method", str2);
        }
        if ("security_alert".equals(str)) {
            putExtra.putExtra("email_source", V86.DYABindEmailSourceTypeSecurityAlertToast.getValue());
            putExtra.putExtra("phone_number_source", EnumC78973Uz3.DYABindPhoneNumberSourceTypeTypeSecurityAlertToast.getValue());
        }
        C16880lQ.LIZIZ(context, putExtra);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void bindMobileOrEmail(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("use_phone", true);
        bundle.putBoolean("use_email", true);
        bindMobile(activity, str, str2, bundle, r47);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindMobileOrEmailAndSetPwd(final Activity activity, final String str, final String str2, Bundle bundle, final R47 r47) {
        bindMobileOrEmail(activity, str, str2, bundle, new R47() { // from class: X.RCQ
            @Override // X.R47
            public final void onResult(int i, int i2, Object obj) {
                BindService.this.lambda$bindMobileOrEmailAndSetPwd$0(r47, activity, str, str2, i, i2, obj);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void bindTOTP(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
        super.bindTOTP(activity, str, str2, bundle, r47);
        CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.TOTP_BIND, EnumC69116RAq.BIND_TOTP, new BindServiceData(bundle, str, "_bind_TOTP", str2).getUpdatedActivityData(), r47, null, Boolean.FALSE);
    }

    public void setPassword(Activity activity, String str, String str2, String str3, final R47 r47) {
        R41.LIZIZ.LJII().setPasswordForMT(activity, str, str2, str3, null, new R47() { // from class: X.RCR
            @Override // X.R47
            public final void onResult(int i, int i2, Object obj) {
                BindService.lambda$setPassword$1(R47.this, i, i2, obj);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void unbindPhoneV2(Activity activity, ArrayList<String> arrayList, String str, boolean z, Bundle bundle) {
        super.unbindPhoneV2(activity, arrayList, str, z, bundle);
        UnbindPhoneOrEmailActivity.LLIIJLIL(activity, arrayList, str, Boolean.valueOf(z), bundle);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void updateTOTP(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
        super.updateTOTP(activity, str, str2, bundle, r47);
        CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.TOTP_BIND, EnumC69116RAq.UPDATE_TOTP, new BindServiceData(bundle, str, "_update_TOTP", str2).getUpdatedActivityData(), r47, null, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void verifyEmailForTicket(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
        Bundle bundle2 = bundle;
        super.verifyEmailForTicket(activity, str, str2, bundle2, r47);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        RBV.LJIIJ(bundle2, R41.LIZJ().getEmail());
        CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.VERIFY_EMAIL_FOR_TICKET, EnumC69116RAq.VERIFY, bundle2, r47, null, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void verifyMobileForTicket(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
        Bundle bundle2 = bundle;
        super.verifyMobileForTicket(activity, str, str2, bundle2, r47);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        RBV.LJIILIIL(bundle2, R41.LIZJ().getBindPhone());
        CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.VERIFY_PHONE_FOR_TICKET, EnumC69116RAq.VERIFY, bundle2, r47, null, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void verifyTOTP(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
        super.verifyTOTP(activity, str, str2, bundle, r47);
        CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.VERIFY_TOTP, EnumC69116RAq.VERIFY_TOTP, new BindServiceData(bundle, str, "_verify_TOTP", str2).getUpdatedActivityData(), r47, null, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void unbindEmailV2(Activity activity, boolean z, ArrayList<String> arrayList, String str, boolean z2, Bundle bundle) {
        super.unbindEmailV2(activity, z, arrayList, str, z2, bundle);
        UnbindPhoneOrEmailActivity.LLIIJI(activity, z, arrayList, str, Boolean.valueOf(z2), bundle);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void verifyEmailWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, R47 r47) {
        Bundle bundle2 = bundle;
        super.verifyEmailForTicket(activity, str, str2, bundle2, r47);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        RBV.LJIIJ(bundle2, str3);
        CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.VERIFY_EMAIL_FOR_TICKET, EnumC69116RAq.VERIFY, bundle2, r47, null, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void verifyMobileWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, R47 r47) {
        Bundle bundle2 = bundle;
        super.verifyMobileForTicket(activity, str, str2, bundle2, r47);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        RBV.LJIILIIL(bundle2, str3);
        CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.VERIFY_PHONE_FOR_TICKET, EnumC69116RAq.VERIFY, bundle2, r47, null, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$bindMobileOrEmailAndSetPwd$0(final R47 r47, final Activity activity, final String str, final String str2, final int i, final int i2, final Object obj) {
        if (i2 != 1) {
            if (r47 != null) {
                r47.onResult(i, i2, obj);
                return;
            }
            return;
        }
        if (i != 7) {
            final String str3 = "email";
            if (0 == 0) {
                R41.LIZIZ.LJFF().getSetPasswordStatus(new C2YO() { // from class: com.ss.android.ugc.aweme.services.BindService.1
                    @Override // X.C2YO
                    public void onUpdateFailed(String str4) {
                        if (!R41.LIZIZ.LJFF().hasCurUserSetPassword()) {
                            BindService.this.setPassword(activity, str3, str, str2, r47);
                            return;
                        }
                        R47 r472 = r47;
                        if (r472 == null) {
                            return;
                        }
                        r472.onResult(i, i2, obj);
                    }

                    @Override // X.C2YO
                    public void onUpdateSuccess(boolean z) {
                        if (!z) {
                            BindService.this.setPassword(activity, str3, str, str2, r47);
                            return;
                        }
                        R47 r472 = r47;
                        if (r472 == null) {
                            return;
                        }
                        r472.onResult(i, i2, obj);
                    }
                });
                return;
            }
        }
        if (r47 != null) {
            r47.onResult(i, i2, obj);
        }
    }
}
