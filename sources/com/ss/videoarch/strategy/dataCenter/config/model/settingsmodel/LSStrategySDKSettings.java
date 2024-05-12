package com.ss.videoarch.strategy.dataCenter.config.model.settingsmodel;

import X.C79346VCc;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.ss.videoarch.strategy.strategy.networkStrategy.SettingsManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class LSStrategySDKSettings {
    public int mEnableIPV6Probe;
    public int mEnableUDPProbe;
    public int mEnableUploadStrategyMonitorLog;
    public JSONObject mPitayaABSettingsJSON;
    public JSONArray mUDPProbeInfos;
    public final int DEFAULT_TIME_OUT = 5000;
    public int mUDPProbePort = LiveCenterDelayLoadSetting.DEFAULT;
    public int mDomainTTL = 300000;
    public int mEnableCollectTime = -1;
    public int mEnableDeviceFeatureData = -1;
    public long mDeviceFeatureEffectiveTime = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
    public int mEnableBandWidthAvg = -1;
    public long mDelayTimeForFirstDns = 10000;
    public int mRecommendSettingsRequestInterval = 1;
    public int mNodeLocalDnsRequestInterval = 1;
    public int mNodeHttpDnsRequestInterval = 1;
    public int mEnableSimulateLocalDNSFail = -1;
    public long mSimulateLocalDNSTimeout = 5000;
    public int mEnableDomainType = 2;
    public long mLocalDnsTimeOut = 5000;
    public int mEnableStaticConfigDecision = -1;
    public int mEnableStartPlayBuffer = 1;
    public int mEnableNetConnectionTypeStrategy = 1;
    public String mTransParamsDefaultBandWidth = "";
    public String mUDPProbeHostName = "";
    public int mEnableUpdateCharToLiveIO = -1;
    public int mUpdateCharToLiveIOTimer = -1;
    public int mDataBundleCount = 10;
    public int mEnableHttpDns = -1;
    public int mEnableUseIpv6 = -1;
    public int mForbidUseIpv6InWiFi = -1;
    public int mForbidUseIpv6InWWAN = -1;
    public int mEnableDnsOptimizer = -1;
    public int mSendHttpDnsByLocalDnsTimeout = -1;
    public int mRequiredIpv6IpCount = -1;
    public int mRequiredIpv4IpCount = -1;
    public int mRequiredHttpIpCount = -1;
    public int mRequiredLocalIpCount = -1;
    public int mEnableStaticConfigDecison = -1;
    public int mEnableListenerThread = 1;
    public int mEnableRefresh = 1;
    public int mEnableTransParams = -1;
    public int mEnableUsePTY = -1;
    public int mEnableInitPtyByStrategy = -1;
    public int mEnableNodePersistence = -1;
    public int mEnableRegisterPtyFeatureCenter = -1;
    public String mPitayaABSettingsParams = "";
    public double mRunPtyPackageWaitTime = -1.0d;
    public int mUDPProbeInterval = 30;
    public int mEnableUseNewOptRecordStruct = -1;
    public int mBasePostRequestInterval = 300;
    public int mEnablePreferParsingPushNode = -1;
    public int mEnablePreferParsingPullNode = -1;
    public int mPreferParsingPushNodeByPushDaysIn7Days = 8;
    public int mPreferParsingPullNodeByPushDaysIn7Days = -1;
    public int mEnableNativeStrategyCenter = -1;
    public int mEnableSetConfigToLiveIO = -1;
    public int mEnableIpRace = -1;
    public int mEnableSetSDKParams = -1;
    public int mUseH2QByDefault = -1;

    public LSStrategySDKSettings() {
    }

    public LSStrategySDKSettings(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null) {
            return;
        }
        SettingsManager.getInstance().getStrategySDKSettings(C79346VCc.LIZLLL().LJIIJ.toString(), this);
        C79346VCc.LIZLLL().LJJIFFI = this.mBasePostRequestInterval;
        if (C79346VCc.LIZLLL().LJIIL.LIZ.has("PitayaABSettingsParams") && (optJSONObject = C79346VCc.LIZLLL().LJIIL.LIZ.optJSONObject("PitayaABSettingsParams")) != null && optJSONObject.has("pitaya_ab_settings")) {
            this.mPitayaABSettingsJSON = optJSONObject.optJSONObject("pitaya_ab_settings");
        }
        if (C79346VCc.LIZLLL().LJIIL.LIZ.has("UdpProbeConfig")) {
            this.mUDPProbeInfos = C79346VCc.LIZLLL().LJIIL.LIZ.optJSONArray("UdpProbeConfig");
        }
    }

    public <T> T getValue(String str, T t) {
        if (t == null || !C79346VCc.LIZLLL().LJIIL.LIZ.has(str)) {
            return t;
        }
        if (t.getClass() == Integer.class) {
            return (T) Integer.valueOf(C79346VCc.LIZLLL().LJIIL.LIZ.optInt(str));
        }
        if (t.getClass() == Long.class) {
            return (T) Long.valueOf(C79346VCc.LIZLLL().LJIIL.LIZ.optLong(str));
        }
        if (t.getClass() == String.class) {
            return (T) C79346VCc.LIZLLL().LJIIL.LIZ.optString(str);
        }
        if (t.getClass() == JSONObject.class) {
            return (T) C79346VCc.LIZLLL().LJIIL.LIZ.optJSONObject(str);
        }
        if (t.getClass() != Double.class) {
            return t;
        }
        return (T) Double.valueOf(C79346VCc.LIZLLL().LJIIL.LIZ.optDouble(str));
    }
}
