package com.ss.android.ugc.aweme.profile.service;

import X.AbstractC53764L8e;
import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C38333F2r;
import X.C76800UCe;
import X.F30;
import X.InterfaceC54056LJk;
import X.InterfaceC56526MGk;
import X.InterfaceC57288Me4;
import X.InterfaceC57518Mhm;
import X.InterfaceC88472Yns;
import X.InterfaceC88475Ynv;
import X.MF9;
import X.YFN;
import X.YG6;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes16.dex */
public interface IProfileDependentComponentService {
    YG6 adUtilsService();

    <T> T apiExecuteGetJSONObject(int i, String str, Class<T> cls, String str2, F30 f30, boolean z, String str3);

    <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3, Object obj);

    YFN bridgeService();

    RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, InterfaceC56526MGk interfaceC56526MGk, boolean z);

    MF9 favoritesMobUtilsService();

    AbstractC53764L8e getDiscoverTabProtocol();

    /* renamed from: getNotificationManagerHandleSystemCamera */
    InterfaceC88472Yns<Boolean, C76800UCe> mo152getNotificationManagerHandleSystemCamera();

    AbstractC53764L8e getProfileTabProtocol();

    InterfaceC88475Ynv<Activity, Fragment, Integer, String, String, C76800UCe> getStartCameraActivity();

    void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle);

    void gotoCropActivity(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle);

    String hexDigest(String str);

    boolean isDetailActivity(Activity activity);

    boolean isEnableSettingDiskManager();

    boolean isUserProfileActivity(Activity activity);

    void logShowProfileDiskManagerGuideView();

    InterfaceC54056LJk mainAnimViewModel(ActivityC45651qj activityC45651qj);

    AbstractC73672Svk<Boolean> needShowDiskManagerGuideView();

    boolean onAntiCrawlerEvent(String str);

    AbstractC73638SvC<BaseResponse> setPrivateSettingItem(String str, int i);

    boolean shouldDoCaptcha(Exception exc);

    boolean shouldUseRecyclerPartialUpdate();

    void showCaptchaDialog(FragmentManager fragmentManager, C38333F2r c38333F2r, InterfaceC57518Mhm interfaceC57518Mhm);

    void startDiskManagerActivity(Context context);

    void startDownloadControlSettingActivity(Activity activity, int i);

    void startHeaderDetailActivity(Activity activity, Bundle bundle);

    void startHeaderDetailActivity(Activity activity, View view, User user, boolean z);

    void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2);

    void startHeaderDetailActivity(Activity activity, View view, String str, User user);

    void watchFromProfile(Context context, User user, boolean z, InterfaceC57288Me4 interfaceC57288Me4);

    void watchFromProfile(Context context, User user, boolean z, InterfaceC57288Me4 interfaceC57288Me4, SlimRoom slimRoom);
}
