package com.byted.cast.common;

import X.X1D;
import android.text.TextUtils;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.api.IAppCommonDataListener;
import com.byted.cast.common.api.IMonitor;
import com.byted.cast.common.auth.AuthConstants;
import com.byted.cast.common.auth.license.AuthManager;
import com.byted.cast.common.ble.BleUtils;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.discovery.NsdUtils;
import com.byted.cast.common.sink.SinkModule;
import com.byted.cast.common.utils.DLNAOptionUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class TeaEventTrack {
    public static String BYTECASTSDK_DEBUG_BDDLNA_BROWSE = "bytecastsdk_debug_bddlna_browse";
    public static String BYTECASTSDK_DEBUG_BDDLNA_PLAY_COMMAND = "bytecastsdk_debug_bddlna_play_command";
    public static String BYTECASTSDK_INDICATOR_AUTH = "bytecastsdk_indicator_auth";
    public static String BYTECASTSDK_INDICATOR_BDDLNA_PLAY = "bytecastsdk_indicator_bddlna_play";
    public static String BYTECASTSDK_INDICATOR_BDLINK_PLAY = "bytecastsdk_indicator_bdlink_play";
    public static String BYTECASTSDK_INDICATOR_BDLINK_SEND_MESSAGE = "bytecastsdk_indicator_bdlink_send_message";
    public static String BYTECASTSDK_INDICATOR_BDLINK_START_SERVER = "bytecastsdk_indicator_bdlink_start_server";
    public static String BYTECASTSDK_INDICATOR_BROWSE = "bytecastsdk_indicator_browse";
    public static String BYTECASTSDK_INDICATOR_BROWSE_PROTOCOL = "bytecastsdk_indicator_browse_protocol";
    public static String BYTECASTSDK_INDICATOR_CONNECT_PROTOCOL = "bytecastsdk_indicator_connect_protocol";
    public static String BYTECASTSDK_INDICATOR_DRAMA = "bytecastsdk_indicator_drama";
    public static String BYTECASTSDK_INDICATOR_GET_DEVICE_INFO = "bytecastsdk_indicator_get_device_info";
    public static String BYTECASTSDK_INDICATOR_GET_MEDIA_INFO_PROTOCOL = "bytecastsdk_indicator_get_media_info_protocol";
    public static String BYTECASTSDK_INDICATOR_GRAY_CONFIG = "bytecastsdk_indicator_gray_config";
    public static String BYTECASTSDK_INDICATOR_LELINK_PLAY = "bytecastsdk_indicator_lelink_play";
    public static String BYTECASTSDK_INDICATOR_MDNS_DISCOVERY = "bytecastsdk_indicator_mdns_discovery";
    public static String BYTECASTSDK_INDICATOR_MDNS_GET_DEVICE_INFO = "bytecastsdk_indicator_mdns_get_device_info";
    public static String BYTECASTSDK_INDICATOR_MDNS_REGISTER = "bytecastsdk_indicator_mdns_register";
    public static String BYTECASTSDK_INDICATOR_MDNS_RESOLVE = "bytecastsdk_indicator_mdns_resolve";
    public static String BYTECASTSDK_INDICATOR_MDNS_SERVICE_FOUND = "bytecastsdk_indicator_mdns_service_found";
    public static String BYTECASTSDK_INDICATOR_MDNS_STOP_DISCOVERY = "bytecastsdk_indicator_mdns_stop_discovery";
    public static String BYTECASTSDK_INDICATOR_MDNS_UNREGISTER = "bytecastsdk_indicator_mdns_unregister";
    public static String BYTECASTSDK_INDICATOR_MIRROR_PROTOCOL = "bytecastsdk_indicator_mirror_protocol";
    public static String BYTECASTSDK_INDICATOR_PLAY_PROTOCOL = "bytecastsdk_indicator_play_protocol";
    public static String BYTECASTSDK_INDICATOR_PUSH_PROTOCOL = "bytecastsdk_indicator_push_protocol";
    public static String BYTECASTSDK_INDICATOR_RECEIVER_CAST = "bytecastsdk_indicator_receiver_cast";
    public static String BYTECASTSDK_INDICATOR_RECEIVER_PLAY = "bytecastsdk_indicator_receiver_play";
    public static String BYTECASTSDK_INDICATOR_RECEIVER_PUSH = "bytecastsdk_indicator_receiver_push";
    public static String BYTECASTSDK_INDICATOR_START_SERVER = "bytecastsdk_indicator_start_server";
    public static volatile TeaEventTrack sInstance;
    public IAppCommonDataListener appCommonDataListener;
    public final ContextManager.CastContext mCastContext;
    public DeviceTrackInfo mDeviceTrackInfo;
    public final CastLogger mLogger;
    public String mSourceDeviceTrackInfoListStr;
    public String projectId = "";
    public Boolean isSource = Boolean.TRUE;
    public String sessionID = "";
    public String browseId = "";
    public String connectId = "";
    public String castUrl = "";
    public String castProtocol = "";
    public final SourceMonitorUtils sourceMonitorUtils = new SourceMonitorUtils(this);

    /* loaded from: classes29.dex */
    public static class DeviceTrackInfo {
        public String deviceBrand;
        public String deviceModel;
        public String deviceName;
        public String did;
        public String os;
        public String userId;
    }

    public static TeaEventTrack getInstance() {
        if (sInstance == null) {
            synchronized (TeaEventTrack.class) {
                if (sInstance == null) {
                    sInstance = new TeaEventTrack(null);
                }
            }
        }
        return sInstance;
    }

    public SourceMonitorUtils getSourceMonitorUtils() {
        return this.sourceMonitorUtils;
    }

    public TeaEventTrack(ContextManager.CastContext castContext) {
        this.mLogger = ContextManager.getLogger(castContext);
        this.mCastContext = castContext;
    }

    public static TeaEventTrack createInstance(ContextManager.CastContext castContext) {
        if (castContext == null) {
            return getInstance();
        }
        return new TeaEventTrack(castContext);
    }

    private void fillSinkGeneralField(JSONObject jSONObject) {
        String licenseParam;
        String licenseParam2;
        String licenseParam3;
        Object obj;
        Object obj2;
        Map<String, Object> data;
        AuthManager authManager = ContextManager.getAuthManager(this.mCastContext);
        Config initConfig = ContextManager.getConfigManager(this.mCastContext).getInitConfig();
        try {
            IAppCommonDataListener iAppCommonDataListener = this.appCommonDataListener;
            if (iAppCommonDataListener != null && (data = iAppCommonDataListener.getData()) != null) {
                for (Map.Entry<String, Object> entry : data.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("bct_session_id", this.sessionID);
            AuthConstants.LicenseParam licenseParam4 = AuthConstants.LicenseParam.ID;
            String str = "";
            if (authManager.getLicenseParam(licenseParam4) == null) {
                licenseParam = "";
            } else {
                licenseParam = authManager.getLicenseParam(licenseParam4);
            }
            jSONObject.put("license_id", licenseParam);
            AuthConstants.LicenseParam licenseParam5 = AuthConstants.LicenseParam.BUSINESS_ID;
            if (authManager.getLicenseParam(licenseParam5) == null) {
                licenseParam2 = "";
            } else {
                licenseParam2 = authManager.getLicenseParam(licenseParam5);
            }
            jSONObject.put("business_id", licenseParam2);
            if (authManager.getLicenseParam(AuthConstants.LicenseParam.APP_ID) == null) {
                licenseParam3 = "";
            } else {
                licenseParam3 = authManager.getLicenseParam(licenseParam5);
            }
            jSONObject.put("license_appid", licenseParam3);
            jSONObject.put("project_id", this.projectId);
            jSONObject.put("role", "sink");
            jSONObject.put("bct_sdk_version", "3.10.2.7.overseas-tt");
            String str2 = "1";
            if (PreferenceUtils.isByteUserToB()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_user_tob", obj);
            jSONObject.put("params_for_bytecast", "bytecastsdk");
            if (TextUtils.isEmpty(jSONObject.optString("connect_id"))) {
                jSONObject.put("connect_id", this.connectId);
            }
            if (TextUtils.isEmpty(jSONObject.optString("cast_protocol"))) {
                jSONObject.put("cast_protocol", this.castProtocol);
            }
            String optString = jSONObject.optString("cast_protocol");
            Locale locale = Locale.ROOT;
            jSONObject.put("cast_protocol", optString.toLowerCase(locale));
            if (!TextUtils.isEmpty(jSONObject.optString("protocol"))) {
                jSONObject.put("protocol", jSONObject.optString("protocol").toLowerCase(locale));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(System.currentTimeMillis());
            jSONObject.put("bct_time_stamp", X1D.LIZIZ(LIZ));
            if (initConfig.getLocalProtocols() != null) {
                str = initConfig.getLocalProtocols();
            }
            jSONObject.put("protocols_priority", str);
            jSONObject.put("package_name", Constants.sAppContext.getPackageName());
            jSONObject.put("sink_ssdp_server", String.valueOf(DLNAOptionUtils.isEnableSinkSsdpServer(this.mCastContext)));
            jSONObject.put("enable_dlna_customized_service", String.valueOf(DLNAOptionUtils.isEnableDlnaSinkCustomizedService(this.mCastContext)));
            jSONObject.put("enable_dlna_low_performance_mode", String.valueOf(DLNAOptionUtils.isOpenDlnaLowPerformanceMode()));
            jSONObject.put("net_type", NetworkMonitor.getCurrentNetworkType(Constants.sAppContext).toString());
            if (NetworkMonitor.isWifiProxy()) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("net_proxy_status", obj2);
            if (!NetworkMonitor.isVpnInUse()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("net_vpn_status", str2);
            jSONObject.put("net_wifi_bandwidth", NetworkMonitor.getWifiBandWidth());
            jSONObject.put("net_wifi_rtt", NetworkMonitor.getWifiRTT());
            jSONObject.put("net_wifi_loss_rate", NetworkMonitor.getWifiLossRate());
            jSONObject.put("source_device_info_list", this.mSourceDeviceTrackInfoListStr);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    private void fillSourceGeneralField(JSONObject jSONObject) {
        String licenseParam;
        String licenseParam2;
        String licenseParam3;
        Object obj;
        String localProtocols;
        boolean z;
        Object obj2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Map<String, Object> data;
        Config initConfig = ContextManager.getConfigManager(this.mCastContext).getInitConfig();
        AuthManager authManager = ContextManager.getAuthManager(this.mCastContext);
        try {
            IAppCommonDataListener iAppCommonDataListener = this.appCommonDataListener;
            if (iAppCommonDataListener != null && (data = iAppCommonDataListener.getData()) != null) {
                for (Map.Entry<String, Object> entry : data.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("bct_session_id", this.sessionID);
            AuthConstants.LicenseParam licenseParam4 = AuthConstants.LicenseParam.ID;
            String str6 = "";
            if (authManager.getLicenseParam(licenseParam4) == null) {
                licenseParam = "";
            } else {
                licenseParam = authManager.getLicenseParam(licenseParam4);
            }
            jSONObject.put("license_id", licenseParam);
            AuthConstants.LicenseParam licenseParam5 = AuthConstants.LicenseParam.BUSINESS_ID;
            if (authManager.getLicenseParam(licenseParam5) == null) {
                licenseParam2 = "";
            } else {
                licenseParam2 = authManager.getLicenseParam(licenseParam5);
            }
            jSONObject.put("business_id", licenseParam2);
            AuthConstants.LicenseParam licenseParam6 = AuthConstants.LicenseParam.APP_ID;
            if (authManager.getLicenseParam(licenseParam6) == null) {
                licenseParam3 = "";
            } else {
                licenseParam3 = authManager.getLicenseParam(licenseParam6);
            }
            jSONObject.put("license_appid", licenseParam3);
            jSONObject.put("project_id", this.projectId);
            jSONObject.put("role", "source");
            jSONObject.put("bct_sdk_version", "3.10.2.7.overseas-tt");
            String str7 = "1";
            if (PreferenceUtils.isByteUserToB()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_user_tob", obj);
            jSONObject.put("params_for_bytecast", "bytecastsdk");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(System.currentTimeMillis());
            jSONObject.put("bct_time_stamp", X1D.LIZIZ(LIZ));
            if (initConfig.getLocalProtocols() == null) {
                localProtocols = "";
            } else {
                localProtocols = initConfig.getLocalProtocols();
            }
            jSONObject.put("protocols_priority", localProtocols);
            jSONObject.put("browse_id", this.browseId);
            jSONObject.put("package_name", Constants.sAppContext.getPackageName());
            if (TextUtils.isEmpty(jSONObject.optString("cast_url"))) {
                jSONObject.put("cast_url", this.castUrl);
            }
            if (TextUtils.isEmpty(jSONObject.optString("connect_id"))) {
                jSONObject.put("connect_id", this.connectId);
            }
            if (TextUtils.isEmpty(jSONObject.optString("cast_protocol"))) {
                jSONObject.put("cast_protocol", this.castProtocol);
            }
            String optString = jSONObject.optString("cast_protocol");
            Locale locale = Locale.ROOT;
            jSONObject.put("cast_protocol", optString.toLowerCase(locale));
            jSONObject.put("enable_dnssd", String.valueOf(NsdUtils.isEnableDnssd(this.mCastContext)));
            jSONObject.put("enable_jmdns", String.valueOf(NsdUtils.isEnableJmDNS(this.mCastContext)));
            ContextManager.CastContext castContext = this.mCastContext;
            if (castContext != null && castContext.isBleBrowse()) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("ble_browse", String.valueOf(z));
            jSONObject.put("ble_publish", String.valueOf(BleUtils.isBlePublish()));
            jSONObject.put("enable_cache", String.valueOf(DLNAOptionUtils.isEnableCache(this.mCastContext)));
            jSONObject.put("enable_broadcast", String.valueOf(DLNAOptionUtils.isEnableBroadcastSearch(this.mCastContext)));
            jSONObject.put("enable_device_offline", String.valueOf(DLNAOptionUtils.isEnableDeviceOffline(this.mCastContext)));
            jSONObject.put("dlna_offline_interval", String.valueOf(DLNAOptionUtils.getDlnaOfflineInterval(this.mCastContext)));
            jSONObject.put("bdlink_offline_interval", String.valueOf(DLNAOptionUtils.getBdlinkDeviceOfflineDetectInterval(this.mCastContext)));
            jSONObject.put("bdlink_enable_quick_query", String.valueOf(DLNAOptionUtils.isEnableBdlinkQuickQuery(this.mCastContext)));
            jSONObject.put("bdlink_enable_disk_cache", String.valueOf(DLNAOptionUtils.isEnableBdlinkDiskCache(this.mCastContext)));
            jSONObject.put("ssdp_search", String.valueOf(DLNAOptionUtils.isEnableSsdpSearch(this.mCastContext)));
            jSONObject.put("ssdp_cycle_search", String.valueOf(DLNAOptionUtils.isEnableSsdpCycleSearch(this.mCastContext)));
            jSONObject.put("source_ssdp_broadcast", String.valueOf(DLNAOptionUtils.isEnableSourceBDLinkSSDPBroadcast(this.mCastContext)));
            jSONObject.put("enable_dlna_customized_service", String.valueOf(DLNAOptionUtils.isEnableDlnaSourceCustomizedService(this.mCastContext)));
            jSONObject.put("net_type", NetworkMonitor.getCurrentNetworkType(Constants.sAppContext).toString());
            if (NetworkMonitor.isWifiProxy()) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("net_proxy_status", obj2);
            if (!NetworkMonitor.isVpnInUse()) {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("net_vpn_status", str7);
            jSONObject.put("net_wifi_bandwidth", NetworkMonitor.getWifiBandWidth());
            jSONObject.put("net_wifi_rtt", NetworkMonitor.getWifiRTT());
            jSONObject.put("net_wifi_loss_rate", NetworkMonitor.getWifiLossRate());
            if (!TextUtils.isEmpty(jSONObject.optString("protocol"))) {
                jSONObject.put("protocol", jSONObject.optString("protocol").toLowerCase(locale));
            }
            DeviceTrackInfo deviceTrackInfo = this.mDeviceTrackInfo;
            if (deviceTrackInfo == null) {
                str = "";
            } else {
                str = deviceTrackInfo.did;
            }
            jSONObject.put("sink_did", str);
            DeviceTrackInfo deviceTrackInfo2 = this.mDeviceTrackInfo;
            if (deviceTrackInfo2 == null) {
                str2 = "";
            } else {
                str2 = deviceTrackInfo2.userId;
            }
            jSONObject.put("sink_user_id", str2);
            DeviceTrackInfo deviceTrackInfo3 = this.mDeviceTrackInfo;
            if (deviceTrackInfo3 == null) {
                str3 = "";
            } else {
                str3 = deviceTrackInfo3.os;
            }
            jSONObject.put("sink_os", str3);
            DeviceTrackInfo deviceTrackInfo4 = this.mDeviceTrackInfo;
            if (deviceTrackInfo4 == null) {
                str4 = "";
            } else {
                str4 = deviceTrackInfo4.deviceModel;
            }
            jSONObject.put("sink_device_model", str4);
            DeviceTrackInfo deviceTrackInfo5 = this.mDeviceTrackInfo;
            if (deviceTrackInfo5 == null) {
                str5 = "";
            } else {
                str5 = deviceTrackInfo5.deviceBrand;
            }
            jSONObject.put("sink_device_brand", str5);
            DeviceTrackInfo deviceTrackInfo6 = this.mDeviceTrackInfo;
            if (deviceTrackInfo6 != null) {
                str6 = deviceTrackInfo6.deviceName;
            }
            jSONObject.put("sink_device_name", str6);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void initSessionID(String str) {
        Config initConfig = ContextManager.getConfigManager(this.mCastContext).getInitConfig();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(initConfig.getDeviceId());
        LIZ.append(initConfig.getAppId());
        LIZ.append(System.currentTimeMillis());
        this.sessionID = MD5.hexdigest(X1D.LIZIZ(LIZ));
        this.projectId = str;
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setSessionID :");
        LIZ2.append(this.sessionID);
        LIZ2.append(" projectId: ");
        LIZ2.append(this.projectId);
        castLogger.d("TeaEventTrack", X1D.LIZIZ(LIZ2));
    }

    public void setAppCommonDataListener(IAppCommonDataListener iAppCommonDataListener) {
        this.appCommonDataListener = iAppCommonDataListener;
    }

    public void setDeviceTrackInfo(DeviceTrackInfo deviceTrackInfo) {
        this.mDeviceTrackInfo = deviceTrackInfo;
    }

    public void setSourceDeviceTrackInfoListStr(String str) {
        this.mSourceDeviceTrackInfoListStr = str;
    }

    public void trackMdnsServiceFound(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        trackSourceEvent(BYTECASTSDK_INDICATOR_MDNS_SERVICE_FOUND, hashMap);
    }

    private void notifyEvent(String str, JSONObject jSONObject) {
        boolean z;
        IMonitor monitor = ContextManager.getConfigManager(this.mCastContext).getInitConfig().getMonitor();
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TeaEventTrack -> iMonitor is null: ");
        if (monitor == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        castLogger.d("TeaEventTrack", X1D.LIZIZ(LIZ));
        if (monitor != null) {
            monitor.onAppLogEvent(str, jSONObject);
        }
    }

    public void trackDlnaBrowse(String str, HashMap<String, String> hashMap) {
        HashMap hashMap2 = new HashMap();
        hashMap2.put("state", str);
        hashMap2.put("browse_protocol", "");
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        trackSourceEvent(BYTECASTSDK_DEBUG_BDDLNA_BROWSE, hashMap2);
    }

    public final void trackSinkEvent(String str, Map<String, String>... mapArr) {
        if (mapArr == null) {
            this.mLogger.e("TeaEventTrack", "trackSinkEvent ->  params is null");
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map<String, String> map : mapArr) {
            if (map != null) {
                hashMap.putAll(map);
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            trackSinkEvent(str, jSONObject);
        } catch (Exception e) {
            this.mLogger.e("TeaEventTrack", "trackSinkEvent -> " + e.getMessage());
        }
    }

    public void trackSinkReceiverCast(Boolean bool, int i) {
        HashMap hashMap = new HashMap();
        if (bool.booleanValue()) {
            hashMap.put("cast_type", "push");
        } else {
            hashMap.put("cast_type", "mirror");
        }
        hashMap.put("protocol", SinkModule.getProtocolNameByID(i).toLowerCase(Locale.ROOT));
        trackSinkEvent(BYTECASTSDK_INDICATOR_RECEIVER_CAST, hashMap);
    }

    public void trackSinkReceiverPlay(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("protocol", SinkModule.getProtocolNameByID(i).toLowerCase(Locale.ROOT));
        hashMap.put("state", str);
        trackSinkEvent(BYTECASTSDK_INDICATOR_RECEIVER_PLAY, hashMap);
    }

    public void trackSinkReceiverPush(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("protocol", str.toLowerCase(Locale.ROOT));
        hashMap.put("connect_id", str2);
        trackSinkEvent(BYTECASTSDK_INDICATOR_RECEIVER_PUSH, hashMap);
    }

    public void trackSinkStartServer(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("protocol", str.toLowerCase(Locale.ROOT));
        hashMap.put("state", str2);
        trackSinkEvent(BYTECASTSDK_INDICATOR_START_SERVER, hashMap);
    }

    public final void trackSourceEvent(String str, Map<String, String>... mapArr) {
        if (mapArr == null) {
            this.mLogger.e("TeaEventTrack", "trackSourceEvent ->  params is null");
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map<String, String> map : mapArr) {
            if (map != null) {
                hashMap.putAll(map);
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            trackSourceEvent(str, jSONObject);
        } catch (Exception e) {
            this.mLogger.e("TeaEventTrack", "trackSourceEvent -> " + e.getMessage());
        }
    }

    public void trackSourceGetDeviceInfoEvent(String str, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        if (map != null) {
            hashMap.putAll(map);
        }
        trackSourceEvent(BYTECASTSDK_INDICATOR_GET_DEVICE_INFO, hashMap);
    }

    public void trackSourceMirrorEvent(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("protocol", str.toLowerCase(Locale.ROOT));
        hashMap.put("state", str2);
        trackSourceEvent(BYTECASTSDK_INDICATOR_MIRROR_PROTOCOL, hashMap);
    }

    public void trackSinkEvent(String str, JSONObject jSONObject) {
        fillSinkGeneralField(jSONObject);
        notifyEvent(str, jSONObject);
    }

    public void trackSourceEvent(String str, JSONObject jSONObject) {
        fillSourceGeneralField(jSONObject);
        notifyEvent(str, jSONObject);
    }

    private void addParametersToJSON(JSONObject jSONObject, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void trackGrayConfigEvent(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("configName :");
        LIZ.append(str2);
        LIZ.append(",content:");
        LIZ.append(str3);
        addParametersToJSON(jSONObject, "content", X1D.LIZIZ(LIZ));
        addParametersToJSON(jSONObject, "state", str);
        try {
            if (this.isSource.booleanValue()) {
                trackSourceEvent(BYTECASTSDK_INDICATOR_GRAY_CONFIG, jSONObject);
            } else {
                trackSinkEvent(BYTECASTSDK_INDICATOR_GRAY_CONFIG, jSONObject);
            }
        } catch (RuntimeException e) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("trackGrayConfigEvent -> ");
            LIZ2.append(e.getMessage());
            castLogger.e("TeaEventTrack", X1D.LIZIZ(LIZ2));
        }
    }

    public void trackBDLinkSourceSendMessageEvent(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "message", str3);
        addParametersToJSON(jSONObject, "state", str);
        addParametersToJSON(jSONObject, "err_msg", str4);
        addParametersToJSON(jSONObject, "serviceInfo", str2);
        try {
            trackSourceEvent(BYTECASTSDK_INDICATOR_BDLINK_SEND_MESSAGE, jSONObject);
        } catch (RuntimeException e) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("trackBDLinkSourceSendMessageEvent -> ");
            LIZ.append(e.getMessage());
            castLogger.e("TeaEventTrack", X1D.LIZIZ(LIZ));
        }
    }

    public void trackMdnsDiscovery(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str3)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        hashMap.put("err_code", str3);
        hashMap.put("err_msg", str4);
        hashMap.put("type", str2);
        trackSourceEvent(BYTECASTSDK_INDICATOR_MDNS_DISCOVERY, hashMap);
    }

    public void trackMdnsGetDeviceInfo(String str, boolean z, long j, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        hashMap.put("is_same_ip", String.valueOf(z));
        hashMap.put("rtt", String.valueOf(j));
        hashMap.put("is_use_attr_ip", String.valueOf(z2));
        trackSourceEvent(BYTECASTSDK_INDICATOR_MDNS_GET_DEVICE_INFO, hashMap);
    }

    public void trackMdnsRegisterEvent(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str3)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        hashMap.put("err_code", str3);
        hashMap.put("err_msg", str4);
        hashMap.put("type", str2);
        trackSinkEvent(BYTECASTSDK_INDICATOR_MDNS_REGISTER, hashMap);
    }

    public void trackMdnsStopDiscovery(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str3)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        hashMap.put("err_code", str3);
        hashMap.put("err_msg", str4);
        hashMap.put("type", str2);
        trackSourceEvent(BYTECASTSDK_INDICATOR_MDNS_STOP_DISCOVERY, hashMap);
    }

    public void trackMdnsUnregisterEvent(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str3)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        hashMap.put("err_code", str3);
        hashMap.put("err_msg", str4);
        hashMap.put("type", str2);
        trackSinkEvent(BYTECASTSDK_INDICATOR_MDNS_UNREGISTER, hashMap);
    }

    public void trackMdnsResolve(String str, String str2, String str3, String str4, boolean z) {
        if (TextUtils.isEmpty(str3)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        hashMap.put("err_code", str3);
        hashMap.put("err_msg", str4);
        hashMap.put("type", str2);
        hashMap.put("mdns_is_retry", String.valueOf(z));
        trackSourceEvent(BYTECASTSDK_INDICATOR_MDNS_RESOLVE, hashMap);
    }
}
