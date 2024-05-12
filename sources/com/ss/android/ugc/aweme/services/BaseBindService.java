package com.ss.android.ugc.aweme.services;

import X.ActivityC45651qj;
import X.C29S;
import X.C58725N2z;
import X.C68736QyK;
import X.C68737QyL;
import X.C76800UCe;
import X.InterfaceC63892P5s;
import X.InterfaceC65644PpY;
import X.InterfaceC65784Pro;
import X.R47;
import X.RCT;
import X.RCU;
import X.RCV;
import X.RCY;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.account.bean.BindKey;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class BaseBindService implements GenericLifecycleObserver, IBindService {
    public boolean mKeepCallback;
    public LifecycleOwner mLifeOwner;
    public R47 mResult;

    public void bind(C29S c29s, RCV rcv, RCT rct) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void bindEmail(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
    }

    public void bindMobileOrEmail(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void bindMobileOrEmailAndSetPwd(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
    }

    public void bindPlatform(Activity activity, String str, Bundle bundle) {
    }

    public void bindTOTP(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void changeEmail(Activity activity, String str, Bundle bundle, R47 r47) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void changeEmailVerifyByPassword(Activity activity, String str, Bundle bundle, R47 r47) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void changeEmailVerifyByPhone(Activity activity, String str, Bundle bundle, R47 r47) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void changeUnverifiedEmail(Activity activity, String str, Bundle bundle) {
    }

    public void checkVcdPhoneRequired(InterfaceC65644PpY<Boolean, C76800UCe> interfaceC65644PpY) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ boolean emailPopUpFunctionSwitch();

    public BindKey getBindToken(Context context, RCV rcv) {
        return null;
    }

    public abstract /* synthetic */ InterfaceC63892P5s getVerificationService();

    public IBindService keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ void modifyMobileVerifyByEmail(Activity activity, String str, Bundle bundle, R47 r47);

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ void modifyMobileVerifyByPassword(Activity activity, String str, Bundle bundle, R47 r47);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public void returnAuthorizeResult(String str, boolean z) {
    }

    public abstract /* synthetic */ void setAuthorzieBindResult(RCU rcu);

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ boolean shouldShowEmailPopUp(Integer num, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ boolean shouldShowEmailPopUpInFeed();

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ void showEmailPopUp(ActivityC45651qj activityC45651qj, Integer num, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    public abstract /* synthetic */ void showThirdPartyAccountManagerActivity(Activity activity);

    public void syncAllVideos(Context context, RCV rcv, RCT rct) {
    }

    public void unBind(Context context, RCV rcv, RCT rct) {
    }

    public void unBindWithApi(Context context, RCV rcv) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void unbindEmail(Activity activity, boolean z, ArrayList<String> arrayList, String str) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void unbindEmailV2(Activity activity, boolean z, ArrayList<String> arrayList, String str, boolean z2, Bundle bundle) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void unbindPhone(Activity activity, ArrayList<String> arrayList, String str) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void unbindPhoneV2(Activity activity, ArrayList<String> arrayList, String str, boolean z, Bundle bundle) {
    }

    public void unbindPlatform(Activity activity, String str, R47 r47) {
    }

    public void updateTOTP(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void verifyEmail(Activity activity, String str, Bundle bundle, R47 r47) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void verifyEmailForTicket(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
    }

    public void verifyEmailWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, R47 r47) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void verifyMobileForTicket(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
    }

    public void verifyMobileWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, R47 r47) {
    }

    public void verifyTOTP(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
    }

    public Map<String, RCY> getBoundSocialPlatforms() {
        HashMap hashMap = new HashMap();
        for (C68737QyL c68737QyL : C68736QyK.LIZLLL.LIZIZ) {
            if (c68737QyL.LIZJ) {
                String str = c68737QyL.LIZ;
                hashMap.put(str, new RCY(str, c68737QyL.LIZLLL, c68737QyL.LJ, c68737QyL.LJFF));
            }
        }
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public List<String> getSocialPlatformNames() {
        C68737QyL[] c68737QyLArr = C68736QyK.LIZLLL.LIZIZ;
        if (c68737QyLArr == null || c68737QyLArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C68737QyL c68737QyL : c68737QyLArr) {
            arrayList.add(c68737QyL.LIZ);
        }
        return arrayList;
    }

    public boolean hasPlatformBound() {
        C68736QyK c68736QyK = C68736QyK.LIZLLL;
        c68736QyK.getClass();
        c68736QyK.LIZIZ(C58725N2z.LIZ);
        C68737QyL[] c68737QyLArr = c68736QyK.LIZIZ;
        for (C68737QyL c68737QyL : c68737QyLArr) {
            if (c68737QyL.LIZJ) {
                return true;
            }
        }
        return false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        LifecycleOwner lifecycleOwner = this.mLifeOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
        this.mLifeOwner = null;
        this.mResult = null;
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public Intent getAuthorizeActivityStartIntent(Context context) {
        return new Intent(context, (Class<?>) AuthorizeActivity.class);
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public boolean isPlatformBound(String str) {
        return C68736QyK.LIZLLL.LIZ(str);
    }

    public void returnResult(int i, int i2, Object obj) {
        R47 r47 = this.mResult;
        if (r47 != null) {
            r47.onResult(i, i2, obj);
        }
        this.mResult = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.IBindService
    public void bindMobile(Activity activity, String str, Bundle bundle, R47 r47) {
        this.mResult = r47;
        if (!this.mKeepCallback && (activity instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
            this.mLifeOwner = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.IBindService
    public void modifyMobile(Activity activity, String str, Bundle bundle, R47 r47) {
        this.mResult = r47;
        if (!this.mKeepCallback && (activity instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
            this.mLifeOwner = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.IBindService
    public void bindMobile(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
        this.mResult = r47;
        if (!this.mKeepCallback && (activity instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
            this.mLifeOwner = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }
}
