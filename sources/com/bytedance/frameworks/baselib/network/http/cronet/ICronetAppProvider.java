package com.bytedance.frameworks.baselib.network.http.cronet;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public interface ICronetAppProvider {
    void doLoadLibrary(String str);

    String getAbClient();

    String getAbFeature();

    String getAbFlag();

    String getAbVersion();

    String getAbi();

    String getAppId();

    String getAppInitialRegionInfo();

    String getAppName();

    String getBypassBOEJSON();

    String getCarrierRegion();

    String getChannel();

    String getCityName();

    Map<String[], Pair<byte[], byte[]>> getClientOpaqueData();

    String getCronetSoPath();

    String getDPI();

    String getDeviceBrand();

    String getDeviceId();

    String getDeviceModel();

    String getDevicePlatform();

    String getDeviceType();

    String getGetDomainDefaultJSON();

    Map<String, String> getGetDomainDependHostMap();

    String getHttpDnsRequestFlags();

    String getIId();

    String getIsDropFirstTnc();

    String getLanguage();

    String getManifestVersionCode();

    String getNetAccessType();

    String getNetworkOperator();

    String getOSApi();

    String getOSVersion();

    ArrayList<byte[]> getOpaqueData();

    String getOpenUdid();

    int getProcessFlag();

    Map<String, Pair<Integer, Integer>> getQuicHint();

    String getRegion();

    String getResolution();

    String getRticket();

    String getSdkAppId();

    String getSdkVersion();

    String getSimOperator();

    String getSsmix();

    String getStoreIdc();

    String getStoreIdcRuleJSON();

    String getSysRegion();

    String getTNCRequestFlags();

    Map<String, String> getTNCRequestHeader();

    Map<String, String> getTNCRequestQuery();

    String getUUID();

    String getUpdateVersionCode();

    String getUserId();

    String getVersionCode();

    String getVersionName();

    int getWifiFrequency();

    int getWifiRssi();

    void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, Exception exc);

    boolean isBOEProxyEnabled();

    boolean isEnableBrotli();

    boolean isEnableHttp2();

    boolean isEnableQuic();

    boolean needCustomLoadLibrary();

    Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map);

    void onClientIPChanged(String str);

    void onColdStartFinish();

    void onCronetBootSucceed();

    void onDropReasonChanged(boolean z, List<Integer> list);

    void onEffectiveConnectionTypeChanged(int i);

    void onMultiNetworkStateChanged(int i, int i2);

    void onNetworkQualityLevelChanged(int i);

    void onNetworkQualityRttAndThroughputNotified(int i, int i2, int i3);

    void onPacketLossComputed(int i, double d, double d2, double d3, double d4);

    void onPublicIPsChanged(List<String> list, List<String> list2);

    void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3);

    void onServerConfigABTestChanged(String str);

    void onServerConfigEtagChanged(String str);

    void onServerConfigUpdated(String str);

    void onStoreIdcChanged(String str, String str2, String str3, String str4, String str5);

    void onTNCUpdateFailed(ArrayList<String> arrayList, String str);

    void onTTDnsResolveResult(String str, String str2, int i, int i2, int i3, List<String> list, String str3);

    void onTTNetDetectInfoChanged(String str);

    void onUserSpecifyingNetworkEnabled(boolean z);

    void sendAppMonitorEvent(String str, String str2);
}
