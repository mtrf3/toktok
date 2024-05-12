package X;

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
import com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService;
import com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.YDq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87030YDq implements IProfileDependentComponentService {
    public static final C87030YDq LIZIZ = new C87030YDq();
    public final /* synthetic */ IProfileDependentComponentService LIZ = ProfileDependentComponentImpl.createIProfileDependentComponentServicebyMonsterPlugin(false);

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final YG6 adUtilsService() {
        return this.LIZ.adUtilsService();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final <T> T apiExecuteGetJSONObject(int i, String url, Class<T> cls, String str, F30 f30, boolean z, String str2) {
        o.LJIIIZ(url, "url");
        return (T) this.LIZ.apiExecuteGetJSONObject(i, url, cls, str, f30, z, str2);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final <T> T apiExecuteGetJSONObject(String url, Class<T> cls, String str, boolean z, String str2, Object obj) {
        o.LJIIIZ(url, "url");
        return (T) this.LIZ.apiExecuteGetJSONObject(url, cls, str, z, str2, obj);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final YFN bridgeService() {
        return this.LIZ.bridgeService();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, InterfaceC56526MGk onHasMoreListener, boolean z) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(onHasMoreListener, "onHasMoreListener");
        return this.LIZ.buildBaseRecyclerView(recyclerView, onHasMoreListener, z);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final MF9 favoritesMobUtilsService() {
        return this.LIZ.favoritesMobUtilsService();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC53764L8e getDiscoverTabProtocol() {
        return this.LIZ.getDiscoverTabProtocol();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    /* renamed from: getNotificationManagerHandleSystemCamera */
    public final InterfaceC88472Yns<Boolean, C76800UCe> mo152getNotificationManagerHandleSystemCamera() {
        return this.LIZ.mo152getNotificationManagerHandleSystemCamera();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC53764L8e getProfileTabProtocol() {
        return this.LIZ.getProfileTabProtocol();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final InterfaceC88475Ynv<Activity, Fragment, Integer, String, String, C76800UCe> getStartCameraActivity() {
        return this.LIZ.getStartCameraActivity();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void gotoCropActivity(Activity activity, String originalUrl, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(originalUrl, "originalUrl");
        this.LIZ.gotoCropActivity(activity, originalUrl, z, f, i, 10002, i3, i4, i5, z2, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void gotoCropActivity(Fragment fragment, String originalUrl, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(originalUrl, "originalUrl");
        this.LIZ.gotoCropActivity(fragment, originalUrl, z, f, i, 10002, i3, i4, i5, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final String hexDigest(String string) {
        o.LJIIIZ(string, "string");
        return this.LIZ.hexDigest(string);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean isDetailActivity(Activity activity) {
        return this.LIZ.isDetailActivity(activity);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean isEnableSettingDiskManager() {
        return this.LIZ.isEnableSettingDiskManager();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean isUserProfileActivity(Activity activity) {
        return this.LIZ.isUserProfileActivity(activity);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void logShowProfileDiskManagerGuideView() {
        this.LIZ.logShowProfileDiskManagerGuideView();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final InterfaceC54056LJk mainAnimViewModel(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.mainAnimViewModel(activity);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC73672Svk<Boolean> needShowDiskManagerGuideView() {
        return this.LIZ.needShowDiskManagerGuideView();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean onAntiCrawlerEvent(String str) {
        return this.LIZ.onAntiCrawlerEvent(str);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final AbstractC73638SvC<BaseResponse> setPrivateSettingItem(String str, int i) {
        return this.LIZ.setPrivateSettingItem("download_prompt", 1);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean shouldDoCaptcha(Exception exc) {
        return this.LIZ.shouldDoCaptcha(exc);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final boolean shouldUseRecyclerPartialUpdate() {
        return this.LIZ.shouldUseRecyclerPartialUpdate();
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void showCaptchaDialog(FragmentManager fragmentManager, C38333F2r c38333F2r, InterfaceC57518Mhm interfaceC57518Mhm) {
        this.LIZ.showCaptchaDialog(fragmentManager, c38333F2r, interfaceC57518Mhm);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startDiskManagerActivity(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ.startDiskManagerActivity(context);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startDownloadControlSettingActivity(Activity activity, int i) {
        o.LJIIIZ(activity, "activity");
        this.LIZ.startDownloadControlSettingActivity(activity, i);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, Bundle bundle) {
        this.LIZ.startHeaderDetailActivity(activity, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z) {
        this.LIZ.startHeaderDetailActivity(activity, view, user, true);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2) {
        this.LIZ.startHeaderDetailActivity(activity, view, user, false, false);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void startHeaderDetailActivity(Activity activity, View preView, String str, User user) {
        o.LJIIIZ(preView, "preView");
        o.LJIIIZ(user, "user");
        this.LIZ.startHeaderDetailActivity(activity, preView, str, user);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void watchFromProfile(Context context, User user, boolean z, InterfaceC57288Me4 interfaceC57288Me4) {
        this.LIZ.watchFromProfile(context, user, false, null);
    }

    @Override // com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService
    public final void watchFromProfile(Context context, User user, boolean z, InterfaceC57288Me4 interfaceC57288Me4, SlimRoom slimRoom) {
        this.LIZ.watchFromProfile(context, user, false, interfaceC57288Me4, slimRoom);
    }
}
