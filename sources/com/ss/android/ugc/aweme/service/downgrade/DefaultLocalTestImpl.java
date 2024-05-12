package com.ss.android.ugc.aweme.service.downgrade;

import X.C109544Rq;
import X.C39331Fc7;
import X.C39332Fc8;
import X.C39489Fef;
import X.C78999UzT;
import X.EE1;
import X.EOT;
import X.InterfaceC250809sq;
import X.InterfaceC48694J9e;
import X.InterfaceC69003R6h;
import X.InterfaceC99713vj;
import X.LFD;
import X.UCI;
import android.app.Application;
import android.content.Context;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.test_settings.settting.IDebugSettingRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DefaultLocalTestImpl implements LocalTestApi {
    public static final C39332Fc8 Companion = new C39332Fc8();
    public static EOT defaultSpecActDebugService;

    public void addDebugLeakCheckObject(Object any, String key) {
        o.LJIIIZ(any, "any");
        o.LJIIIZ(key, "key");
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public String appendDeviceId(String str) {
        return str;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean bypassUrlForWebViewIsolation(String str) {
        return false;
    }

    public void capturePdpFps(Context context) {
    }

    public void checkApi(String str, String str2, boolean z, String str3, boolean z2, String str4) {
    }

    public boolean closeAnimation() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void copyContent(String str, Context context) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean enableBoe() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean enableBoeJsbBypass() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean enableDeeplinkIntercept() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean enableLynxSec() {
        return true;
    }

    public boolean enableNetworkCapture() {
        return false;
    }

    public boolean enablePdpAutoTranslate(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean enablePpe() {
        return false;
    }

    public boolean enableStark() {
        return false;
    }

    public boolean enableTTP() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean enableWebHttps() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean forceUpdateSlardarSetting() {
        return false;
    }

    public Aweme getAdPreviewAweme(Context context) {
        return null;
    }

    public String getAdPreviewBaseUrl() {
        return null;
    }

    public int getAdminOpsIconId() {
        return 0;
    }

    public int getAdminOpsLabelId() {
        return 0;
    }

    public int getAdminOpsThinIconId() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public String getBoeLane() {
        return "";
    }

    public List<String> getBoeWebviewHostBypassList() {
        return null;
    }

    public List<String> getBoeWebviewPathBypassList() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public long getDebugDayTimeDuration() {
        return 0L;
    }

    public Object getDebugShakeListener() {
        return null;
    }

    public void getDebugUrlMessage(Context context, String str, String str2) {
    }

    public String getDefaultRNTestHost() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public EE1 getDlpTask() {
        return null;
    }

    public Map<String, String> getDownGradeList() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public String getEcommerceBoeHost() {
        return "";
    }

    public Fragment getEcommerceDebugPanel() {
        return null;
    }

    public int getFillIconId() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public String getFrontierBoeUrl() {
        return null;
    }

    public EE1 getInitBPEAToolTask() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public EE1 getInitBoeTask() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public EE1 getInitEcMockTask() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public EE1 getInitHDTTask() {
        return null;
    }

    public EE1 getInitMockHybridAbTask() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public EE1 getInitTTWebViewTask() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public EE1 getInitWebviewJsInjectionTask() {
        return null;
    }

    public List<Object> getInterceptPdpData(List<? extends Object> list) {
        return list;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public List<String> getJsbSafeHost() {
        return null;
    }

    public String getKidsModeAllowListJsonStr(Context context) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public String getLiveBoeWsDomain() {
        return null;
    }

    public String getLynxDurlDataBaseUrl() {
        return "";
    }

    public String getMiniAppListH5Url() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public String getMockHybridABId() {
        return null;
    }

    public String getNetworkModelByLogId(String logId) {
        o.LJIIIZ(logId, "logId");
        return null;
    }

    public Class<? extends Fragment> getNewUserFragmentClassName() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public String getPPELane() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public int getPopupFollowerLimit() {
        return 0;
    }

    public String getPpeLane() {
        return "";
    }

    public Fragment getSharePanelDebugFragment() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public LFD getTabletService() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public EE1 getTracingInitializerTask() {
        return null;
    }

    public String getTtpLane() {
        return "";
    }

    public Class<? extends Fragment> getVESDKPanelFragmentClassName() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public InterfaceC48694J9e getWebViewLoadUrlInterceptorDelegate() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void handleDurlForLocaltest(SparkContext sparkContext) {
        o.LJIIIZ(sparkContext, "sparkContext");
    }

    public void handleUrl(String str, String str2, String str3) {
    }

    public boolean ignoreAuthPopupRule() {
        return false;
    }

    public void initCronyManager(Application application) {
    }

    public void initHybridDevtoolScanService() {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void initLogEasyTask() {
    }

    public void initPreciseTest() {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void initTTWebViewIfNeeded(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean injectJsGuardEnabled() {
        return true;
    }

    public boolean isEnableInterceptPdpData() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean isEnablePreciseTest(Context context) {
        return false;
    }

    public boolean isEnableRestrictiveRuleToast() {
        return false;
    }

    public boolean isEnableShowTranslateKey() {
        return false;
    }

    public boolean isEnvWindowEnabled() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean isForceData() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean isGeckoExperienceOptClose() {
        return false;
    }

    public boolean isLogEasyRequest(String str, String str2) {
        return false;
    }

    public boolean isMockPopup() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean isOpenPopupDebug() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean isPPEEnable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean isTTWebViewEnabled(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void jumpToMessageDebugActivity(Context context, C109544Rq c109544Rq) {
    }

    public void logEnterPhone(boolean z, String str, String str2, int i, String str3) {
    }

    public void logEnterSms(boolean z, int i, String str) {
    }

    public boolean lynxDebugEnable() {
        return true;
    }

    public boolean lynxDevToolDebugEnable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public String mockMccMnc() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean needForceAssociateMsisdn() {
        return false;
    }

    public void onNetworkCapture(String model) {
        o.LJIIIZ(model, "model");
    }

    public Boolean onShouldOverrideUrlLoading(WebView webView, String str) {
        return null;
    }

    public void performAdminAction(Aweme aweme, String str, Context context) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void registerDebugMessageHandler() {
    }

    public void registerTools(IDebugSettingRegistry iDebugSettingRegistry) {
    }

    public boolean saveGeckoValueWithKeva(int i) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean seclinkEnable() {
        return true;
    }

    public void sendMessageToLark(String str, String str2) {
    }

    public void setBoe(Context context, boolean z) {
    }

    public void setBoeLane(String str) {
    }

    public void setBoePathBypassList(String[] strArr) {
    }

    public void setEnableEnvWindow(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void setIsLoggedIn(boolean z) {
    }

    public void setPpe(Context context, boolean z) {
    }

    public void setPpeLane(String str) {
    }

    public void setTtpLane(String str) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public boolean shouldBulletShowDebugTagView() {
        return true;
    }

    public void showBoeToast(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void showBridgeBlockTips(C39489Fef bridgeInfo, String action) {
        o.LJIIIZ(bridgeInfo, "bridgeInfo");
        o.LJIIIZ(action, "action");
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public void showDeeplinkInterceptorRemind(String str, String str2) {
    }

    public void showEcSchemaVerifyToast(String errors, String page, int i, String str) {
        o.LJIIIZ(errors, "errors");
        o.LJIIIZ(page, "page");
    }

    public void showEcommerceDebugFloatingWindow(boolean z) {
    }

    public void showRedundancyToast(List<String> list, String str) {
    }

    public void showWarningDialog(List<String> list, List<String> list2, List<String> list3, List<String> list4, String str) {
    }

    public void startMonitorPdpFps(Context context) {
    }

    public boolean switchLanguage(Context context, String str) {
        return false;
    }

    public void toastRule(WebView webView) {
    }

    public void updateNetworkModelByLogId(String logId, String model) {
        o.LJIIIZ(logId, "logId");
        o.LJIIIZ(model, "model");
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public InterfaceC69003R6h getAccountDebugService() {
        return new C78999UzT();
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public List<String> getBoeBypassHostList() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public List<String> getBoeBypassPathList() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public InterfaceC250809sq getResFakerService() {
        return new UCI();
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public EOT getSpecActDebugService() {
        if (defaultSpecActDebugService == null) {
            defaultSpecActDebugService = new C39331Fc7();
        }
        return defaultSpecActDebugService;
    }

    public Boolean enableManualDowngrade() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Boolean getQualityProtectionSwitch() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Boolean getSearchCoinDebugSwitch() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Boolean getSearchDebugSwitch() {
        return Boolean.FALSE;
    }

    public Boolean getSearchMobVerifySwitch() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public Boolean getSearchVideoAutoplayGuideLineSwitch() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.local_test.LocalTestApi
    public InterfaceC99713vj getFakeMessageModel(String conversationId) {
        o.LJIIIZ(conversationId, "conversationId");
        return null;
    }
}
