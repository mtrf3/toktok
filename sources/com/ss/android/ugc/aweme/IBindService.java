package com.ss.android.ugc.aweme;

import X.ActivityC45651qj;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.R47;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public interface IBindService {
    void bindEmail(Activity activity, String str, String str2, Bundle bundle, R47 r47);

    void bindMobile(Activity activity, String str, Bundle bundle, R47 r47);

    void bindMobile(Activity activity, String str, String str2, Bundle bundle, R47 r47);

    void bindMobileOrEmailAndSetPwd(Activity activity, String str, String str2, Bundle bundle, R47 r47);

    void changeEmail(Activity activity, String str, Bundle bundle, R47 r47);

    void changeEmailVerifyByPassword(Activity activity, String str, Bundle bundle, R47 r47);

    void changeEmailVerifyByPhone(Activity activity, String str, Bundle bundle, R47 r47);

    void changeUnverifiedEmail(Activity activity, String str, Bundle bundle);

    boolean emailPopUpFunctionSwitch();

    Intent getAuthorizeActivityStartIntent(Context context);

    List<String> getSocialPlatformNames();

    boolean isPlatformBound(String str);

    void modifyMobile(Activity activity, String str, Bundle bundle, R47 r47);

    void modifyMobileVerifyByEmail(Activity activity, String str, Bundle bundle, R47 r47);

    void modifyMobileVerifyByPassword(Activity activity, String str, Bundle bundle, R47 r47);

    boolean shouldShowEmailPopUp(Integer num, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    boolean shouldShowEmailPopUpInFeed();

    void showEmailPopUp(ActivityC45651qj activityC45651qj, Integer num, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    void unbindEmail(Activity activity, boolean z, ArrayList<String> arrayList, String str);

    void unbindEmailV2(Activity activity, boolean z, ArrayList<String> arrayList, String str, boolean z2, Bundle bundle);

    void unbindPhone(Activity activity, ArrayList<String> arrayList, String str);

    void unbindPhoneV2(Activity activity, ArrayList<String> arrayList, String str, boolean z, Bundle bundle);

    void verifyEmail(Activity activity, String str, Bundle bundle, R47 r47);

    void verifyEmailForTicket(Activity activity, String str, String str2, Bundle bundle, R47 r47);

    void verifyMobileForTicket(Activity activity, String str, String str2, Bundle bundle, R47 r47);
}
