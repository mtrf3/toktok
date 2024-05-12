package com.bytedance.android.livesdkapi.host;

import X.ActivityC45651qj;
import X.C28443BEh;
import X.C44;
import X.InterfaceC05190Ih;
import X.InterfaceC06390Mx;
import X.InterfaceC29249Bdt;
import X.InterfaceC29373Bft;
import X.InterfaceC29386Bg6;
import X.InterfaceC29387Bg7;
import X.InterfaceC78482Ur8;
import X.InterfaceC78991UzL;
import X.InterfaceC78992UzM;
import X.InterfaceC78995UzP;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public interface IHostUser extends InterfaceC06390Mx {
    public static final int MESSAGE_NICKNAME_DUPLICATE = 20014;
    public static final int MESSAGE_NICKNAME_DUPLICATE_2 = 20041;

    void bindMobile(Activity activity, String str, String str2, Bundle bundle, InterfaceC78992UzM interfaceC78992UzM);

    void cacheUserBeforeEnterProfile(User user);

    void dismissCaptcha();

    void event(String str, String str2);

    Map<String, String> frameSign(String str, int i);

    List<C28443BEh> getAllFriends();

    InterfaceC05190Ih getCurUser();

    long getCurUserId();

    String getCurrentRegionCode();

    String getEmail();

    String getTTDisPlayName(String str, String str2);

    boolean interceptOperation(String str);

    boolean isDeleteByAgeGate();

    boolean isLogin();

    boolean isMinorMode();

    boolean isNeedProtectMinor();

    boolean isNewUser();

    void jumpLiveSquareWithLogin(Context context, String str, String str2, InterfaceC78482Ur8 interfaceC78482Ur8);

    void login(ActivityC45651qj activityC45651qj, InterfaceC29387Bg7 interfaceC29387Bg7, String str, String str2, int i, String str3, String str4, String str5);

    void observeAccountChange(InterfaceC29249Bdt interfaceC29249Bdt);

    void onFollowStatusChanged(int i, long j);

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void popCaptchaV2(Activity activity, String str, InterfaceC78991UzL interfaceC78991UzL);

    void registerCurrentUserUpdateListener(InterfaceC78995UzP interfaceC78995UzP);

    void registerFollowStatusListener(InterfaceC29386Bg6 interfaceC29386Bg6);

    void reportData(String str);

    void requestLivePermission(C44 c44, String str);

    void unFollowWithConfirm(Activity activity, int i, long j, InterfaceC29373Bft interfaceC29373Bft);
}
