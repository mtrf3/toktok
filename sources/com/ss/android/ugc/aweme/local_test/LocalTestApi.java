package com.ss.android.ugc.aweme.local_test;

import X.C109544Rq;
import X.C39489Fef;
import X.EE1;
import X.EOT;
import X.InterfaceC250809sq;
import X.InterfaceC48694J9e;
import X.InterfaceC69003R6h;
import X.InterfaceC99713vj;
import X.LFD;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.List;

/* loaded from: classes7.dex */
public interface LocalTestApi {
    String appendDeviceId(String str);

    boolean bypassUrlForWebViewIsolation(String str);

    void copyContent(String str, Context context);

    boolean enableBoe();

    boolean enableBoeJsbBypass();

    boolean enableDeeplinkIntercept();

    boolean enableLynxSec();

    boolean enablePpe();

    boolean enableWebHttps();

    boolean forceUpdateSlardarSetting();

    InterfaceC69003R6h getAccountDebugService();

    List<String> getBoeBypassHostList();

    List<String> getBoeBypassPathList();

    String getBoeLane();

    long getDebugDayTimeDuration();

    EE1 getDlpTask();

    String getEcommerceBoeHost();

    InterfaceC99713vj getFakeMessageModel(String str);

    String getFrontierBoeUrl();

    EE1 getInitBoeTask();

    EE1 getInitEcMockTask();

    EE1 getInitHDTTask();

    EE1 getInitTTWebViewTask();

    EE1 getInitWebviewJsInjectionTask();

    List<String> getJsbSafeHost();

    String getLiveBoeWsDomain();

    String getMockHybridABId();

    String getPPELane();

    int getPopupFollowerLimit();

    Boolean getQualityProtectionSwitch();

    InterfaceC250809sq getResFakerService();

    Boolean getSearchCoinDebugSwitch();

    Boolean getSearchDebugSwitch();

    Boolean getSearchVideoAutoplayGuideLineSwitch();

    EOT getSpecActDebugService();

    LFD getTabletService();

    EE1 getTracingInitializerTask();

    InterfaceC48694J9e getWebViewLoadUrlInterceptorDelegate();

    void handleDurlForLocaltest(SparkContext sparkContext);

    void initLogEasyTask();

    void initTTWebViewIfNeeded(Context context);

    boolean injectJsGuardEnabled();

    boolean isEnablePreciseTest(Context context);

    boolean isForceData();

    boolean isGeckoExperienceOptClose();

    boolean isOpenPopupDebug();

    boolean isPPEEnable();

    boolean isTTWebViewEnabled(Context context);

    void jumpToMessageDebugActivity(Context context, C109544Rq c109544Rq);

    String mockMccMnc();

    boolean needForceAssociateMsisdn();

    void registerDebugMessageHandler();

    boolean seclinkEnable();

    void setIsLoggedIn(boolean z);

    boolean shouldBulletShowDebugTagView();

    void showBridgeBlockTips(C39489Fef c39489Fef, String str);

    void showDeeplinkInterceptorRemind(String str, String str2);
}
