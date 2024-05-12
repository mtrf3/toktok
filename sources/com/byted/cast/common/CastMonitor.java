package com.byted.cast.common;

import X.C16880lQ;
import X.InterfaceC64016PAm;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.api.IAppCommonDataListener;
import com.byted.cast.common.api.IMonitor;
import com.byted.cast.common.auth.AuthConstants;
import com.byted.cast.common.auth.license.AuthManager;
import com.byted.cast.common.ble.BleUtils;
import com.byted.cast.common.discovery.NsdUtils;
import com.byted.cast.common.utils.DLNAOptionUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class CastMonitor {
    public static String WifiP2PType = "";
    public static volatile CastMonitor sInst;
    public IAppCommonDataListener appCommonDataListener;
    public Context context;
    public String deviceId;
    public ContextManager.CastContext mCastContext;
    public CastLogger mLogger;
    public String protocols;
    public String HOST_AID = "1013";
    public String sessionID = "";
    public String appKey = "";
    public String projectId = "";
    public String role = "";
    public String sourceConnectID = "";
    public String castId = "";
    public String clientId = "";
    public final Map<String, Integer> mapAirplayTag = new HashMap<String, Integer>() { // from class: com.byted.cast.common.CastMonitor.2
        {
            put("AirPlay_Server_AuthSDK", 65537);
            put("AirPlay_Server_AuthElapsed", 65537);
            put("AirPlay_Server_Url_Succ", 65537);
            put("AirPlay_Server_Url_Elapsed", 65537);
            put("AirPlay_Server_Url_Play", 65537);
            put("AirPlay_Server_Url_Stop", 65537);
            put("AirPlay_Server_Cast_Succ", 65537);
            put("AirPlay_Server_Mirror_FPS", 65537);
            put("AirPlay_Server_Mirror_BitRate", 65537);
            put("AirPlay_Server_Mirror_Width", 65537);
            put("AirPlay_Server_Mirror_Height", 65537);
            put("AirPlay_Server_Mirror_CatonCnt", 65537);
            put("AirPlay_Server_Mirror_CatonDur", 65537);
            put("AirPlay_Server_Audio_SR", 65537);
            put("AirPlay_Server_Audio_VolInit", 65537);
            put("AirPlay_Server_Audio_VolCur", 65537);
            put("AirPlay_Server_Audio_BitRate", 65537);
            put("AirPlay_Server_Audio_CatonCnt", 65537);
            put("AirPlay_Server_Audio_CatonDur", 65537);
            put("Airplay_Server_Start", 65537);
            put("Airplay_Server_Stop", 65537);
            put("Raop_Rtp_Mirror_Thread_Time_Send", 65539);
            put("Raop_Rtp_Mirror_Thread_Time_Receive", 65539);
            put("Decode_Time", 65539);
            put("Airplay_On_Audio_Stream_Data", 65539);
        }
    };
    public JSONObject categoryAirLogMonitor = null;
    public int num = 0;
    public SourceMonitorUtils mSourceMonitor = new SourceMonitorUtils(this);

    public void setSessionID(String str) {
    }

    private void endAirLog() {
        if (this.categoryAirLogMonitor != null) {
            JSONObject jSONObject = new JSONObject();
            addParametersToJSON(jSONObject, "session_id", this.sessionID);
            SDKMonitorUtils.LIZIZ("1014").LJIIJ("AirPlayMonitor", this.categoryAirLogMonitor, null, jSONObject);
            this.categoryAirLogMonitor = null;
        }
    }

    private CastMonitor getInst() {
        if (sInst == null) {
            if (!Constants.isDebugMode) {
                this.mLogger.e("Monitor", "Please use getInst with args method first.");
            } else {
                throw new IllegalArgumentException("Please use getInst with args method first.");
            }
        }
        return sInst;
    }

    public static CastMonitor getInstance() {
        if (sInst == null) {
            synchronized (CastMonitor.class) {
                if (sInst == null) {
                    sInst = new CastMonitor(null);
                }
            }
        }
        return sInst;
    }

    private void initSdkMonitor() {
        JSONObject jSONObject = new JSONObject();
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("device id:");
        LIZ.append(this.deviceId);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
        addParametersToJSON(jSONObject, "device_id", this.deviceId);
        addParametersToJSON(jSONObject, "host_aid", this.HOST_AID);
        addParametersToJSON(jSONObject, "sdk_version", "3.10.2.7.overseas-tt");
        addParametersToJSON(jSONObject, "channel", Utils.getAppName(this.context));
        addParametersToJSON(jSONObject, "app_version", Utils.getAppVersionName(this.context));
        addParametersToJSON(jSONObject, "time_stamp", String.valueOf(System.currentTimeMillis()));
        SDKMonitorUtils.LIZLLL("1014", UrlUtils.getDefaultMonitorConfigUrl());
        SDKMonitorUtils.LJ("1014", UrlUtils.getDefaultMonitorReportUrl());
        SDKMonitorUtils.LIZJ(C16880lQ.LLLLL(this.context), "1014", jSONObject, new InterfaceC64016PAm() { // from class: com.byted.cast.common.CastMonitor.1
            @Override // X.InterfaceC64016PAm
            public String getSessionId() {
                return "";
            }

            @Override // X.InterfaceC64016PAm
            public Map<String, String> getCommonParams() {
                HashMap hashMap = new HashMap();
                hashMap.put("host_aid", CastMonitor.this.HOST_AID);
                UrlUtils.setMapParams(hashMap);
                return hashMap;
            }
        });
    }

    public SourceMonitorUtils getSourceMonitor() {
        return this.mSourceMonitor;
    }

    public CastMonitor(ContextManager.CastContext castContext) {
        this.mCastContext = castContext;
        this.mLogger = ContextManager.getLogger(castContext);
    }

    private String addAppCommonDataToJSON(JSONObject jSONObject) {
        boolean z;
        String str;
        String browseId = this.mSourceMonitor.getBrowseId();
        String valueOf = String.valueOf(NsdUtils.isEnableDnssd(this.mCastContext));
        String valueOf2 = String.valueOf(NsdUtils.isEnableJmDNS(this.mCastContext));
        ContextManager.CastContext castContext = this.mCastContext;
        if (castContext != null && castContext.isBleBrowse()) {
            z = true;
        } else {
            z = false;
        }
        String valueOf3 = String.valueOf(z);
        String valueOf4 = String.valueOf(BleUtils.isBlePublish());
        String valueOf5 = String.valueOf(DLNAOptionUtils.isEnableCache(this.mCastContext));
        String valueOf6 = String.valueOf(DLNAOptionUtils.isEnableSearch(this.mCastContext));
        String valueOf7 = String.valueOf(DLNAOptionUtils.isEnableBroadcastSearch(this.mCastContext));
        String valueOf8 = String.valueOf(DLNAOptionUtils.isEnableDeviceOffline(this.mCastContext));
        String valueOf9 = String.valueOf(DLNAOptionUtils.getDlnaOfflineInterval(this.mCastContext));
        String valueOf10 = String.valueOf(DLNAOptionUtils.getBdlinkDeviceOfflineDetectInterval(this.mCastContext));
        String valueOf11 = String.valueOf(DLNAOptionUtils.isEnableBdlinkQuickQuery(this.mCastContext));
        AuthManager authManager = ContextManager.getAuthManager(this.mCastContext);
        String licenseParam = authManager.getLicenseParam(AuthConstants.LicenseParam.ID);
        String licenseParam2 = authManager.getLicenseParam(AuthConstants.LicenseParam.BUSINESS_ID);
        String licenseParam3 = authManager.getLicenseParam(AuthConstants.LicenseParam.APP_ID);
        String licenseParam4 = authManager.getLicenseParam(AuthConstants.LicenseParam.CHANNEL_ID);
        String valueOf12 = String.valueOf(DLNAOptionUtils.isEnableBdlinkDiskCache(this.mCastContext));
        String valueOf13 = String.valueOf(DLNAOptionUtils.isEnableSsdpSearch(this.mCastContext));
        String valueOf14 = String.valueOf(DLNAOptionUtils.isEnableSsdpCycleSearch(this.mCastContext));
        String valueOf15 = String.valueOf(DLNAOptionUtils.isEnableSinkSsdpServer(this.mCastContext));
        String valueOf16 = String.valueOf(DLNAOptionUtils.isEnableSourceBDLinkSSDPBroadcast(this.mCastContext));
        String valueOf17 = String.valueOf(DLNAOptionUtils.isEnableDlnaSourceCustomizedService(this.mCastContext));
        addParametersToJSON(jSONObject, "browse_id", browseId);
        addParametersToJSON(jSONObject, "enable_cache", valueOf5);
        addParametersToJSON(jSONObject, "enable_search", valueOf6);
        addParametersToJSON(jSONObject, "enable_broadcast", valueOf7);
        addParametersToJSON(jSONObject, "enable_dnssd", valueOf);
        addParametersToJSON(jSONObject, "enable_jmdns", valueOf2);
        addParametersToJSON(jSONObject, "protocols", this.protocols);
        addParametersToJSON(jSONObject, "ble_browse", valueOf3);
        addParametersToJSON(jSONObject, "ble_publish", valueOf4);
        addParametersToJSON(jSONObject, "enable_device_offline", valueOf8);
        addParametersToJSON(jSONObject, "dlna_offline_interval", valueOf9);
        addParametersToJSON(jSONObject, "bdlink_offline_interval", valueOf10);
        addParametersToJSON(jSONObject, "bdlink_enable_quick_query", valueOf11);
        addParametersToJSON(jSONObject, "wifi_p2p_cast_type", WifiP2PType);
        addParametersToJSON(jSONObject, "license_id", licenseParam);
        addParametersToJSON(jSONObject, "business_id", licenseParam2);
        addParametersToJSON(jSONObject, "license_appid", licenseParam3);
        addParametersToJSON(jSONObject, "project_id", this.projectId);
        addParametersToJSON(jSONObject, "channel_id", licenseParam4);
        addParametersToJSON(jSONObject, "bdlink_enable_disk_cache", valueOf12);
        addParametersToJSON(jSONObject, "ssdp_search", valueOf13);
        addParametersToJSON(jSONObject, "ssdp_cycle_search", valueOf14);
        addParametersToJSON(jSONObject, "sink_ssdp_server", valueOf15);
        addParametersToJSON(jSONObject, "source_ssdp_broadcast", valueOf16);
        addParametersToJSON(jSONObject, "enable_dlna_customized_service", valueOf17);
        addParametersToJSON(jSONObject, "cast_did", ContextManager.getConfigManager(this.mCastContext).getInitConfig().getOriginDeviceId());
        String str2 = NetworkMonitor.getCurrentNetworkType(Constants.sAppContext).toString();
        String str3 = "1";
        if (NetworkMonitor.isWifiProxy()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (!NetworkMonitor.isVpnInUse()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        String wifiBandWidth = NetworkMonitor.getWifiBandWidth();
        String wifiRTT = NetworkMonitor.getWifiRTT();
        String wifiLossRate = NetworkMonitor.getWifiLossRate();
        addParametersToJSON(jSONObject, "net_type", str2);
        addParametersToJSON(jSONObject, "net_proxy_status", str);
        addParametersToJSON(jSONObject, "net_vpn_status", str3);
        addParametersToJSON(jSONObject, "net_wifi_bandwidth", wifiBandWidth);
        addParametersToJSON(jSONObject, "net_wifi_rtt", wifiRTT);
        addParametersToJSON(jSONObject, "net_wifi_loss_rate", wifiLossRate);
        IAppCommonDataListener iAppCommonDataListener = this.appCommonDataListener;
        if (iAppCommonDataListener == null) {
            return jSONObject.toString();
        }
        Map<String, Object> data = iAppCommonDataListener.getData();
        if (data == null || data.size() < 1) {
            return jSONObject.toString();
        }
        for (String str4 : data.keySet()) {
            try {
                addParametersToJSON(jSONObject, str4, String.valueOf(data.get(str4)));
            } catch (Exception e) {
                this.mLogger.e("Monitor", e.toString());
            }
        }
        return jSONObject.toString();
    }

    public static CastMonitor createInstance(ContextManager.CastContext castContext) {
        if (castContext == null) {
            return getInstance();
        }
        return new CastMonitor(castContext);
    }

    private String getProtocolByEventName(String str) {
        String str2 = "BDDLNA";
        if (!str.contains("BDDLNA") && !str.contains("bddlna")) {
            str2 = "BDLink";
            if (!str.contains("BDLink") && !str.contains("bdlink")) {
                str2 = "ByteLink";
                if (!str.contains("ByteLink") && !str.contains("bytelink")) {
                    str2 = "AirPlay";
                    if (!str.contains("AirPlay") && !str.contains("airplay")) {
                        str2 = "CastProxy";
                        if (!str.contains("CastProxy") && !str.contains("castproxy")) {
                            str2 = "LeLink";
                            if (!str.contains("LeLink") && !str.contains("lelink")) {
                                if (str.contains("VASTCAST") || str.contains("v-cast")) {
                                    return "VastCast";
                                }
                                if (str.contains("BDCloud") || str.contains("bdcloud")) {
                                    return "bdcloud";
                                }
                                return "ByteCast";
                            }
                        }
                    }
                }
            }
        }
        return str2;
    }

    public void sendEvent(String str) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "event", str);
        sendByteCastSinkEvent("BDDLNA_Send_Event", jSONObject, (String) null, (String) null);
    }

    public void sendGrayConfigRequestEvent(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        addParametersToJSON(jSONObject2, "config_name", str);
        addParametersToJSON(jSONObject2, "role", this.role);
        addParametersToJSON(jSONObject2, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject, "app_key", this.appKey);
        addParametersToJSON(jSONObject, "project_id", this.projectId);
        addParametersToJSON(jSONObject, "session_id", this.sessionID);
        addParametersToJSON(jSONObject, "connect_id", (String) null);
        addParametersToJSON(jSONObject, "cast_id", this.castId);
        addParametersToJSON(jSONObject, "client_id", this.clientId);
        addParametersToJSON(jSONObject, "cast_info", (String) null);
        addParametersToJSON(jSONObject, "player_info", (String) null);
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject);
        SDKMonitorUtils.LIZIZ("1014").LJIIJ("bytecast_gray_config_request", jSONObject2, null, jSONObject);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendGrayConfigEvent:");
        LIZ.append("bytecast_gray_config_request");
        LIZ.append(", role:");
        LIZ.append(this.role);
        LIZ.append(", configName:");
        LIZ.append(str);
        LIZ.append(", data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDCloudSinkRegisterListEvent(String str) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "bdCloudServiceInfos", str);
        addParametersToJSON(jSONObject, "role", "sink");
        sendByteCastSinkEvent("BDLink_Get_Register_List", jSONObject, (String) null, (String) null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDCloudSinkRegisterListEvent: ");
        LIZ.append(str);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDLinkSinkReceiveMessageEvent(String str) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "message", str);
        addParametersToJSON(jSONObject, "role", "sink");
        sendByteCastSinkEvent("BDLink_Receive_Message", jSONObject, (String) null, (String) null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDLinkSinkReceiveMessageEvent: ");
        LIZ.append(str);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDLinkSinkRegisterListEvent(String str) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "bdLinkServiceInfos", str);
        addParametersToJSON(jSONObject, "role", "sink");
        sendByteCastSinkEvent("BDLink_Get_Register_List", jSONObject, (String) null, (String) null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDLinkSinkRegisterListEvent: ");
        LIZ.append(str);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDLinkSourceReceiveMessageEvent(String str) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "message", str);
        addParametersToJSON(jSONObject, "role", "source");
        sendByteCastSourceEvent("BDLink_Receive_Message", jSONObject, null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDLinkSourceReceiveMessageEvent: ");
        LIZ.append(str);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentByteCastGetDeviceInfoEvent(String str) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "deviceInfo", str);
        addParametersToJSON(jSONObject, "role", "source");
        sendByteCastSourceEvent("ByteCast_Get_Device_Info", jSONObject, null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentByteCastGetDeviceInfoEvent: ");
        LIZ.append(str);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentByteCastSetDeviceNameEvent(String str) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "deviceName", str);
        addParametersToJSON(jSONObject, "role", "source");
        sendByteCastSourceEvent("ByteCast_Set_Device_Name", jSONObject, null);
    }

    public void sentByteCastSinkGetDeviceInfoEvent(String str) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "deviceInfo", str);
        addParametersToJSON(jSONObject, "role", "sink");
        sendByteCastSinkEvent("ByteCast_Get_Device_Info", jSONObject, (String) null, (String) null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentByteCastSinkGetDeviceInfoEvent: ");
        LIZ.append(str);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void setAppCommonDataListener(IAppCommonDataListener iAppCommonDataListener) {
        this.appCommonDataListener = iAppCommonDataListener;
    }

    public void setProtocols(String str) {
        this.protocols = str;
    }

    private String getServiceTypeByEventName(String str, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            return str2;
        }
        if (str.contains("BDDLNA") || str.contains("bddlna") || str.contains("BDLink") || str.contains("bdlink")) {
            return "push";
        }
        if (str.contains("ByteLink") || str.contains("bytelink")) {
            return "mirror";
        }
        if (str.contains("AirPlay") || str.contains("airplay")) {
            return "push|mirror";
        }
        if (str.contains("CastProxy") || str.contains("castproxy")) {
            return "proxy";
        }
        if (str.contains("LeLink") || str.contains("lelink")) {
            return "push|mirror";
        }
        if (str.contains("VASTCAST") || str.contains("v-cast")) {
            return "proxy";
        }
        if (str.contains("BDCloud") || str.contains("bdcloud")) {
            return "push";
        }
        return "ByteCast";
    }

    private void saveAirlog(String str, String str2) {
        if (this.categoryAirLogMonitor == null) {
            this.categoryAirLogMonitor = new JSONObject();
        }
        Date localInstance = Date.getLocalInstance();
        this.num++;
        JSONObject jSONObject = this.categoryAirLogMonitor;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(localInstance.getDateString());
        LIZ.append(this.num);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(": ");
        LIZ2.append(str2);
        addParametersToJSON(jSONObject, LIZIZ, X1D.LIZIZ(LIZ2));
        int i = this.num;
        if ((i & 128) != 0) {
            this.num = i >> 8;
        }
    }

    public void sendAirLogMonitor(String str, String str2) {
        if (TextUtils.equals(str, "Airplay_On_Session_End")) {
            endAirLog();
        }
        if (this.mapAirplayTag.containsKey(str)) {
            if (this.mapAirplayTag.get(str).intValue() == 65537) {
                saveAirlog(str, str2);
                JSONObject jSONObject = new JSONObject();
                addParametersToJSON(jSONObject, "session_id", this.sessionID);
                addParametersToJSON(jSONObject, "cast_end", "sink");
                addParametersToJSON(jSONObject, "cast_protocol", "airplay");
                addParametersToJSON(jSONObject, "content", str2);
                addParametersToJSON(jSONObject, "time_stamp", String.valueOf(System.currentTimeMillis()));
                addAppCommonDataToJSON(jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                addParametersToJSON(jSONObject2, "session_id", this.sessionID);
                SDKMonitorUtils.LIZIZ("1014").LJIIJ(str, jSONObject, null, jSONObject2);
                return;
            }
            if (this.mapAirplayTag.get(str).intValue() == 65539) {
                if (new Random().nextInt(100) >= 3) {
                    return;
                }
                saveAirlog(str, str2);
                return;
            } else {
                if (this.mapAirplayTag.get(str).intValue() != 65538) {
                    return;
                }
                saveAirlog(str, str2);
                return;
            }
        }
        saveAirlog(str, str2);
    }

    public void sendSinkEvent(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        addParametersToJSON(jSONObject, "content", str2);
        addParametersToJSON(jSONObject, "role", "sink");
        addParametersToJSON(jSONObject, "service_type", getServiceTypeByEventName(str, null));
        addParametersToJSON(jSONObject, "protocol", getProtocolByEventName(str));
        addParametersToJSON(jSONObject, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject2, "app_key", this.appKey);
        addParametersToJSON(jSONObject2, "project_id", this.projectId);
        addParametersToJSON(jSONObject2, "session_id", this.sessionID);
        addParametersToJSON(jSONObject2, "connect_id", (String) null);
        addParametersToJSON(jSONObject2, "cast_id", this.castId);
        addParametersToJSON(jSONObject2, "client_id", this.clientId);
        addParametersToJSON(jSONObject2, "player_info", (String) null);
        addParametersToJSON(jSONObject2, "cast_info", (String) null);
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject2);
        SDKMonitorUtils.LIZIZ("1014").LJIIJ(str, jSONObject, null, jSONObject2);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendSinkEvent event:");
        LIZ.append(str);
        LIZ.append(", content:");
        LIZ.append(str2);
        LIZ.append(", data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sendSourceEvent(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        addParametersToJSON(jSONObject, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject, "content", str2);
        addParametersToJSON(jSONObject, "role", "source");
        addParametersToJSON(jSONObject, "service_type", getServiceTypeByEventName(str, null));
        addParametersToJSON(jSONObject, "protocol", getProtocolByEventName(str));
        addParametersToJSON(jSONObject2, "app_key", this.appKey);
        addParametersToJSON(jSONObject2, "project_id", this.projectId);
        addParametersToJSON(jSONObject2, "session_id", this.sessionID);
        addParametersToJSON(jSONObject2, "connect_id", this.sourceConnectID);
        addParametersToJSON(jSONObject2, "cast_id", this.castId);
        addParametersToJSON(jSONObject2, "client_id", this.clientId);
        addParametersToJSON(jSONObject2, "player_info", (String) null);
        addParametersToJSON(jSONObject2, "cast_info", (String) null);
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject2);
        SDKMonitorUtils.LIZIZ("1014").LJIIJ(str, jSONObject, null, jSONObject2);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendSourceEvent event:");
        LIZ.append(str);
        LIZ.append(", content:");
        LIZ.append(str2);
        LIZ.append(",data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sendSourceToMetricEvent(String str, Map<String, String> map) {
        if (map == null || map.size() < 1) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        addParametersToJSON(jSONObject, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject, "role", "source");
        addParametersToJSON(jSONObject, "service_type", getServiceTypeByEventName(str, null));
        addParametersToJSON(jSONObject, "protocol", getProtocolByEventName(str));
        addParametersToJSON(jSONObject2, "app_key", this.appKey);
        addParametersToJSON(jSONObject2, "project_id", this.projectId);
        addParametersToJSON(jSONObject2, "session_id", this.sessionID);
        addParametersToJSON(jSONObject2, "connect_id", this.sourceConnectID);
        addParametersToJSON(jSONObject2, "player_info", (String) null);
        addParametersToJSON(jSONObject2, "cast_info", (String) null);
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject2);
        for (String str2 : map.keySet()) {
            try {
                addParametersToJSON(jSONObject3, str2, String.valueOf(map.get(str2)));
            } catch (Exception e) {
                this.mLogger.e("Monitor", e.toString());
            }
        }
        SDKMonitorUtils.LIZIZ("1014").LJIIJ(str, jSONObject, jSONObject3, jSONObject2);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendSourceToMetricEvent event:");
        LIZ.append(str);
        LIZ.append(",metric:");
        LIZ.append(jSONObject3);
        LIZ.append(",data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDLinkRegisterEvent(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "content", str);
        addParametersToJSON(jSONObject, "serviceInfo", str2);
        addParametersToJSON(jSONObject, "role", "source");
        sendByteCastSourceEvent("BDLink_Register", jSONObject, null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDLinkRegisterEvent: ");
        LIZ.append(str2);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDLinkRegisterSuccessEvent(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "content", str);
        addParametersToJSON(jSONObject, "serviceInfo", str2);
        addParametersToJSON(jSONObject, "role", "source");
        sendByteCastSourceEvent("BDLink_Register_Success", jSONObject, null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDLinkRegisterSuccessEvent: ");
        LIZ.append(str2);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDLinkSinkSendMessageEvent(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "messageString", str2);
        addParametersToJSON(jSONObject, "serviceInfo", str);
        addParametersToJSON(jSONObject, "role", "sink");
        sendByteCastSinkEvent("BDLink_Send_Message", jSONObject, (String) null, (String) null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDLinkSinkSendMessageEvent: ");
        LIZ.append(str2);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDLinkSinkSendSuccessMessageEvent(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "messageString", str2);
        addParametersToJSON(jSONObject, "serviceInfo", str);
        addParametersToJSON(jSONObject, "role", "sink");
        sendByteCastSinkEvent("BDLink_Send_Message_Success", jSONObject, (String) null, (String) null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDLinkSinkSendSuccessMessageEvent: ");
        LIZ.append(str2);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDLinkSourceSendMessageEvent(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "messageString", str2);
        addParametersToJSON(jSONObject, "serviceInfo", str);
        addParametersToJSON(jSONObject, "role", "source");
        sendByteCastSourceEvent("BDLink_Send_Message", jSONObject, null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDLinkSourceSendMessageEvent: ");
        LIZ.append(str2);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDLinkSourceSendSuccessMessageEvent(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "messageString", str2);
        addParametersToJSON(jSONObject, "serviceInfo", str);
        addParametersToJSON(jSONObject, "role", "source");
        sendByteCastSourceEvent("BDLink_Send_Message_Success", jSONObject, null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDLinkSourceSendSuccessMessageEvent: ");
        LIZ.append(str2);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDLinkUnregisterEvent(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "content", str);
        addParametersToJSON(jSONObject, "serviceInfo", str2);
        addParametersToJSON(jSONObject, "role", "source");
        sendByteCastSourceEvent("BDLink_Unregister", jSONObject, null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDLinkUnregisterEvent: ");
        LIZ.append(str2);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDLinkUnregisterSuccessEvent(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "content", str);
        addParametersToJSON(jSONObject, "serviceInfo", str2);
        addParametersToJSON(jSONObject, "role", "source");
        sendByteCastSourceEvent("BDLink_Unregister_Success", jSONObject, null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDLinkUnregisterSuccessEvent: ");
        LIZ.append(str2);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sendSinkEvent(String str, Map<String, String> map) {
        sendSinkEvent(str, map, null);
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

    public void init(Context context, String str, IMonitor iMonitor) {
        this.context = context;
        if (TextUtils.isEmpty(str)) {
            this.deviceId = "12345678901";
        } else {
            this.deviceId = str;
        }
        initSdkMonitor();
    }

    public void receiveAction(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "action", str);
        addParametersToJSON(jSONObject, "header", str2);
        addParametersToJSON(jSONObject, "content", str3);
        sendByteCastSinkEvent("BDDLNA_Receive_Action", jSONObject, (String) null, (String) null);
    }

    public void receiveActionResponse(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "status_code", str);
        addParametersToJSON(jSONObject, "header", str2);
        addParametersToJSON(jSONObject, "content", str3);
        sendByteCastSourceEvent("BDDLNA_Receive_Action_Response", jSONObject, null);
    }

    public void sendAction(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "action", str);
        addParametersToJSON(jSONObject, "header", str2);
        addParametersToJSON(jSONObject, "content", str3);
        sendByteCastSourceEvent("BDDLNA_Send_Action", jSONObject, null);
    }

    public void sendByteCastAuthEvent(boolean z, String str, int i) {
        String str2;
        HashMap hashMap = new HashMap();
        if (z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        hashMap.put("init_mode", str2);
        hashMap.put("result", str);
        if (i != -1) {
            hashMap.put("err_code", String.valueOf(i));
        }
        if (TextUtils.equals(this.role, "source")) {
            sendSourceEvent("ByteCast_Auth", hashMap, "");
        } else {
            sendSinkEvent("ByteCast_Auth", hashMap);
        }
    }

    public void sendByteCastSourceEvent(String str, JSONObject jSONObject, String str2) {
        JSONObject jSONObject2 = new JSONObject();
        addParametersToJSON(jSONObject, "service_type", getServiceTypeByEventName(str, null));
        addParametersToJSON(jSONObject, "protocol", getProtocolByEventName(str));
        addParametersToJSON(jSONObject, "role", "source");
        addParametersToJSON(jSONObject, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject2, "app_key", this.appKey);
        addParametersToJSON(jSONObject2, "project_id", this.projectId);
        addParametersToJSON(jSONObject2, "session_id", this.sessionID);
        addParametersToJSON(jSONObject2, "connect_id", this.sourceConnectID);
        addParametersToJSON(jSONObject2, "cast_id", this.castId);
        addParametersToJSON(jSONObject2, "client_id", this.clientId);
        addParametersToJSON(jSONObject2, "player_info", str2);
        addParametersToJSON(jSONObject2, "cast_info", (String) null);
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject2);
        SDKMonitorUtils.LIZIZ("1014").LJIIJ(str, jSONObject, null, jSONObject2);
        if (!"BDDLNA_Send_Action".equals(str) && !"BDDLNA_Receive_Action_Response".equals(str) && !"BDDLNA_Receive_Event".equals(str)) {
            CastLogger castLogger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sendByteCastSourceEvent event:");
            LIZ.append(str);
            LIZ.append(", session_id:");
            LIZ.append(this.sessionID);
            LIZ.append(",connect_id:");
            LIZ.append(this.sourceConnectID);
            LIZ.append(", cast_id:");
            LIZ.append(this.castId);
            LIZ.append(", client_id:");
            LIZ.append(this.clientId);
            LIZ.append(",playerInfo:");
            LIZ.append(str2);
            LIZ.append(",data:");
            LIZ.append(addAppCommonDataToJSON);
            castLogger.d("Monitor", X1D.LIZIZ(LIZ));
        }
    }

    public void sendCustomEvent(String str, String str2, String[][] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        addParametersToJSON(jSONObject, "who", str2);
        for (String[] strArr2 : strArr) {
            addParametersToJSON(jSONObject, strArr2[0], strArr2[1]);
            addParametersToJSON(jSONObject2, strArr2[0], strArr2[1]);
        }
        addParametersToJSON(jSONObject, "time_stamp", String.valueOf(System.currentTimeMillis()));
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendCustomEvent event:");
        LIZ.append(str);
        LIZ.append(",data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
        SDKMonitorUtils.LIZIZ("1014").LJIIJ(str, jSONObject, jSONObject2, null);
    }

    public void sendGrayConfigResponseEvent(String str, boolean z, String str2) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        addParametersToJSON(jSONObject2, "config_name", str);
        if (z) {
            str3 = "success";
        } else {
            str3 = "failure";
        }
        addParametersToJSON(jSONObject2, "result", str3);
        addParametersToJSON(jSONObject2, "content", str2);
        addParametersToJSON(jSONObject2, "role", this.role);
        addParametersToJSON(jSONObject2, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject, "app_key", this.appKey);
        addParametersToJSON(jSONObject, "project_id", this.projectId);
        addParametersToJSON(jSONObject, "session_id", this.sessionID);
        addParametersToJSON(jSONObject, "connect_id", (String) null);
        addParametersToJSON(jSONObject, "cast_id", this.castId);
        addParametersToJSON(jSONObject, "client_id", this.clientId);
        addParametersToJSON(jSONObject, "cast_info", (String) null);
        addParametersToJSON(jSONObject, "player_info", (String) null);
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject);
        SDKMonitorUtils.LIZIZ("1014").LJIIJ("bytecast_gray_config_response", jSONObject2, null, jSONObject);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendGrayConfigEvent:");
        LIZ.append("bytecast_gray_config_response");
        LIZ.append(", role:");
        LIZ.append(this.role);
        LIZ.append(", configName:");
        LIZ.append(str);
        LIZ.append(", isSuccess:");
        LIZ.append(z);
        LIZ.append(", content:");
        LIZ.append(str2);
        LIZ.append(", data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sendSinkEvent(String str, Map<String, String> map, Map<String, String> map2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        addParametersToJSON(jSONObject, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject, "role", "sink");
        addParametersToJSON(jSONObject, "service_type", getServiceTypeByEventName(str, null));
        addParametersToJSON(jSONObject, "protocol", getProtocolByEventName(str));
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                addParametersToJSON(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        addParametersToJSON(jSONObject2, "app_key", this.appKey);
        addParametersToJSON(jSONObject2, "project_id", this.projectId);
        addParametersToJSON(jSONObject2, "session_id", this.sessionID);
        addParametersToJSON(jSONObject2, "connect_id", (String) null);
        addParametersToJSON(jSONObject2, "cast_id", this.castId);
        addParametersToJSON(jSONObject2, "client_id", this.clientId);
        addParametersToJSON(jSONObject2, "player_info", (String) null);
        addParametersToJSON(jSONObject2, "cast_info", (String) null);
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                addParametersToJSON(jSONObject2, entry2.getKey(), entry2.getValue());
            }
        }
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject2);
        SDKMonitorUtils.LIZIZ("1014").LJIIJ(str, jSONObject, null, jSONObject2);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendSinkEvent event:");
        LIZ.append(str);
        LIZ.append(", params:");
        LIZ.append(map);
        LIZ.append(", extraParams:");
        LIZ.append(map2);
        LIZ.append(",data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sendSourceEvent(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        addParametersToJSON(jSONObject, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject, "content", str2);
        addParametersToJSON(jSONObject, "role", "source");
        addParametersToJSON(jSONObject, "service_type", getServiceTypeByEventName(str, null));
        addParametersToJSON(jSONObject, "protocol", getProtocolByEventName(str));
        addParametersToJSON(jSONObject2, "app_key", this.appKey);
        addParametersToJSON(jSONObject2, "project_id", this.projectId);
        addParametersToJSON(jSONObject2, "session_id", this.sessionID);
        if (TextUtils.isEmpty(str3)) {
            str3 = this.sourceConnectID;
        }
        addParametersToJSON(jSONObject2, "connect_id", str3);
        addParametersToJSON(jSONObject2, "player_info", (String) null);
        addParametersToJSON(jSONObject2, "cast_info", (String) null);
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject2);
        SDKMonitorUtils.LIZIZ("1014").LJIIJ(str, jSONObject, null, jSONObject2);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendSourceEvent event:");
        LIZ.append(str);
        LIZ.append(", content:");
        LIZ.append(str2);
        LIZ.append(",data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDLinkRegisterFailureEvent(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "statusCode", i);
        addParametersToJSON(jSONObject, "content", str);
        addParametersToJSON(jSONObject, "serviceInfo", str2);
        addParametersToJSON(jSONObject, "role", "source");
        sendByteCastSourceEvent("BDLink_Register_Failure", jSONObject, null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDLinkRegisterFailureEvent: ");
        LIZ.append(str2);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDLinkSinkSendFailureMessageEvent(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "statusCode", i);
        addParametersToJSON(jSONObject, "messageString", str2);
        addParametersToJSON(jSONObject, "serviceInfo", str);
        addParametersToJSON(jSONObject, "role", "sink");
        sendByteCastSinkEvent("BDLink_Send_Message_Failure", jSONObject, (String) null, (String) null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDLinkSinkSendFailureMessageEvent: ");
        LIZ.append(str2);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDLinkSourceSendFailureMessageEvent(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "statusCode", i);
        addParametersToJSON(jSONObject, "messageString", str2);
        addParametersToJSON(jSONObject, "serviceInfo", str);
        addParametersToJSON(jSONObject, "role", "source");
        sendByteCastSourceEvent("BDLink_Send_Message_Failure", jSONObject, null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDLinkSourceSendFailureMessageEvent: ");
        LIZ.append(str2);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sentBDLinkUnregisterFailureEvent(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "statusCode", i);
        addParametersToJSON(jSONObject, "content", str);
        addParametersToJSON(jSONObject, "serviceInfo", str2);
        addParametersToJSON(jSONObject, "role", "source");
        sendByteCastSourceEvent("BDLink_Unregister_Failure", jSONObject, null);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sentBDLinkUnregisterFailureEvent: ");
        LIZ.append(str2);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    private void addParametersToJSON(JSONObject jSONObject, String str, int i) {
        try {
            jSONObject.put(str, i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void sendCustomEvent(String str, String str2, String str3) {
        sendCustomEvent(str, str2, str3, null);
    }

    public void sendSourceEvent(String str, Map<String, String> map, String str2) {
        sendSourceEvent(str, map, null, str2);
    }

    public void initSessionID(String str, String str2, String str3, String str4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        LIZ.append(System.currentTimeMillis());
        this.sessionID = MD5.hexdigest(X1D.LIZIZ(LIZ));
        this.appKey = str2;
        this.HOST_AID = str2;
        this.projectId = str3;
        this.role = str4;
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setSessionID :");
        LIZ2.append(this.sessionID);
        LIZ2.append(" ,AppKey: ");
        LIZ2.append(this.appKey);
        LIZ2.append(", projectId: ");
        LIZ2.append(this.projectId);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ2));
    }

    public void receiveEvent(String str, long j, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "uuid", str);
        addParametersToJSON(jSONObject, "seq", String.valueOf(j));
        addParametersToJSON(jSONObject, "name", str2);
        addParametersToJSON(jSONObject, "value", str3);
        sendByteCastSourceEvent("BDDLNA_Receive_Event", jSONObject, null);
    }

    public void sendByteCastSinkEvent(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        addParametersToJSON(jSONObject2, "content", str2);
        addParametersToJSON(jSONObject2, "service_type", getServiceTypeByEventName(str, null));
        addParametersToJSON(jSONObject2, "protocol", getProtocolByEventName(str));
        addParametersToJSON(jSONObject2, "role", "sink");
        addParametersToJSON(jSONObject2, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject, "app_key", this.appKey);
        addParametersToJSON(jSONObject, "project_id", this.projectId);
        addParametersToJSON(jSONObject, "session_id", this.sessionID);
        addParametersToJSON(jSONObject, "connect_id", str3);
        addParametersToJSON(jSONObject, "cast_id", this.castId);
        addParametersToJSON(jSONObject, "client_id", this.clientId);
        addParametersToJSON(jSONObject, "cast_info", str4);
        addParametersToJSON(jSONObject, "player_info", (String) null);
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject);
        SDKMonitorUtils.LIZIZ("1014").LJIIJ(str, jSONObject2, null, jSONObject);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendByteCastSinkEvent event:");
        LIZ.append(str);
        LIZ.append(", connectId:");
        LIZ.append(str3);
        LIZ.append(",castInfo:");
        LIZ.append(str4);
        LIZ.append(",data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sendByteCastSourceEvent(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        addParametersToJSON(jSONObject2, "content", str2);
        addParametersToJSON(jSONObject2, "service_type", getServiceTypeByEventName(str, null));
        addParametersToJSON(jSONObject2, "protocol", getProtocolByEventName(str));
        addParametersToJSON(jSONObject2, "role", "source");
        addParametersToJSON(jSONObject2, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject, "app_key", this.appKey);
        addParametersToJSON(jSONObject, "project_id", this.projectId);
        addParametersToJSON(jSONObject, "session_id", this.sessionID);
        if (TextUtils.isEmpty(str4)) {
            str4 = this.sourceConnectID;
        }
        addParametersToJSON(jSONObject, "connect_id", str4);
        addParametersToJSON(jSONObject, "cast_id", this.castId);
        addParametersToJSON(jSONObject, "client_id", this.clientId);
        addParametersToJSON(jSONObject, "player_info", str3);
        addParametersToJSON(jSONObject, "cast_info", (String) null);
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject);
        SDKMonitorUtils.LIZIZ("1014").LJIIJ(str, jSONObject2, null, jSONObject);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendByteCastSourceEvent event:");
        LIZ.append(str);
        LIZ.append(", content:");
        LIZ.append(str2);
        LIZ.append(",playerInfo:");
        LIZ.append(str3);
        LIZ.append(",data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sendCustomEvent(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        addParametersToJSON(jSONObject, "content", str3);
        addParametersToJSON(jSONObject, "role", str);
        addParametersToJSON(jSONObject, "service_type", getServiceTypeByEventName(str2, null));
        addParametersToJSON(jSONObject, "protocol", getProtocolByEventName(str2));
        addParametersToJSON(jSONObject, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject2, "app_key", this.appKey);
        addParametersToJSON(jSONObject2, "project_id", this.projectId);
        addParametersToJSON(jSONObject2, "session_id", this.sessionID);
        addParametersToJSON(jSONObject2, "connect_id", str4);
        addParametersToJSON(jSONObject2, "cast_id", this.castId);
        addParametersToJSON(jSONObject2, "client_id", this.clientId);
        addParametersToJSON(jSONObject2, "player_info", (String) null);
        addParametersToJSON(jSONObject2, "cast_info", (String) null);
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject2);
        SDKMonitorUtils.LIZIZ("1014").LJIIJ(str2, jSONObject, null, jSONObject2);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendCustomEvent event:");
        LIZ.append(str2);
        LIZ.append(", role:");
        LIZ.append(str);
        LIZ.append(", content:");
        LIZ.append(str3);
        LIZ.append(", connectID:");
        LIZ.append(str4);
        LIZ.append(",data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sendSourceEvent(String str, Map<String, String> map, Map<String, String> map2, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        addParametersToJSON(jSONObject, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject, "role", "source");
        addParametersToJSON(jSONObject, "service_type", getServiceTypeByEventName(str, null));
        addParametersToJSON(jSONObject, "protocol", getProtocolByEventName(str));
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                addParametersToJSON(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        addParametersToJSON(jSONObject2, "app_key", this.appKey);
        addParametersToJSON(jSONObject2, "project_id", this.projectId);
        addParametersToJSON(jSONObject2, "session_id", this.sessionID);
        if (TextUtils.isEmpty(str2)) {
            str2 = this.sourceConnectID;
        }
        addParametersToJSON(jSONObject2, "connect_id", str2);
        addParametersToJSON(jSONObject2, "cast_id", this.castId);
        addParametersToJSON(jSONObject2, "client_id", this.clientId);
        addParametersToJSON(jSONObject2, "player_info", (String) null);
        addParametersToJSON(jSONObject2, "cast_info", (String) null);
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                addParametersToJSON(jSONObject2, entry2.getKey(), entry2.getValue());
            }
        }
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject2);
        SDKMonitorUtils.LIZIZ("1014").LJIIJ(str, jSONObject, null, jSONObject2);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendSourceEvent event:");
        LIZ.append(str);
        LIZ.append(", params:");
        LIZ.append(map);
        LIZ.append(", extraParams:");
        LIZ.append(map2);
        LIZ.append(",data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sendByteCastSinkEvent(String str, JSONObject jSONObject, String str2, String str3) {
        JSONObject jSONObject2 = new JSONObject();
        addParametersToJSON(jSONObject, "service_type", getServiceTypeByEventName(str, null));
        addParametersToJSON(jSONObject, "protocol", getProtocolByEventName(str));
        addParametersToJSON(jSONObject, "role", "sink");
        addParametersToJSON(jSONObject, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject2, "app_key", this.appKey);
        addParametersToJSON(jSONObject2, "project_id", this.projectId);
        addParametersToJSON(jSONObject2, "session_id", this.sessionID);
        addParametersToJSON(jSONObject2, "connect_id", str2);
        addParametersToJSON(jSONObject2, "cast_id", this.castId);
        addParametersToJSON(jSONObject2, "client_id", this.clientId);
        addParametersToJSON(jSONObject2, "cast_info", str3);
        addParametersToJSON(jSONObject2, "player_info", (String) null);
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject2);
        SDKMonitorUtils.LIZIZ("1014").LJIIJ(str, jSONObject, null, jSONObject2);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendByteCastSinkEvent event:");
        LIZ.append(str);
        LIZ.append(", connectId:");
        LIZ.append(str2);
        LIZ.append(",castInfo:");
        LIZ.append(str3);
        LIZ.append(",data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sendCustomEvent(String str, String str2, String str3, String str4, String str5) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        addParametersToJSON(jSONObject, "content", str3);
        addParametersToJSON(jSONObject, "role", str);
        addParametersToJSON(jSONObject, "service_type", getServiceTypeByEventName(str2, null));
        addParametersToJSON(jSONObject, "protocol", getProtocolByEventName(str2));
        addParametersToJSON(jSONObject, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject2, "app_key", this.appKey);
        addParametersToJSON(jSONObject2, "project_id", this.projectId);
        addParametersToJSON(jSONObject2, "session_id", this.sessionID);
        addParametersToJSON(jSONObject2, "connect_id", str4);
        addParametersToJSON(jSONObject2, "player_info", (String) null);
        addParametersToJSON(jSONObject2, "cast_info", (String) null);
        addParametersToJSON(jSONObject2, "browse_id", str5);
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject2);
        SDKMonitorUtils.LIZIZ("1014").LJIIJ(str2, jSONObject, null, jSONObject2);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendCustomEvent event:");
        LIZ.append(str2);
        LIZ.append(", role:");
        LIZ.append(str);
        LIZ.append(", content:");
        LIZ.append(str3);
        LIZ.append(", connectID:");
        LIZ.append(str4);
        LIZ.append(", browse_id:");
        LIZ.append(str5);
        LIZ.append(",data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sendCustomExtraEvent(String str, String str2, String str3, String str4, String str5) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        addParametersToJSON(jSONObject, "role", str);
        addParametersToJSON(jSONObject, "service_type", getServiceTypeByEventName(str5, null));
        addParametersToJSON(jSONObject, "protocol", getProtocolByEventName(str5));
        addParametersToJSON(jSONObject, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject2, "app_key", this.appKey);
        addParametersToJSON(jSONObject2, "session_id", this.sessionID);
        addParametersToJSON(jSONObject2, "connect_id", str4);
        addParametersToJSON(jSONObject2, "player_info", (String) null);
        addParametersToJSON(jSONObject2, "cast_info", (String) null);
        addParametersToJSON(jSONObject2, "content", str3);
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject2);
        SDKMonitorUtils.LIZIZ("1014").LJIIJ(str2, jSONObject, null, jSONObject2);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendCustomExtraEvent protocol:");
        LIZ.append(getProtocolByEventName(str5));
        LIZ.append(", event:");
        LIZ.append(str2);
        LIZ.append(", role:");
        LIZ.append(str);
        LIZ.append(", content:");
        LIZ.append(str3);
        LIZ.append(", connectID:");
        LIZ.append(str4);
        LIZ.append(", data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sendRawEvent(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, String str3) {
        addParametersToJSON(jSONObject, "role", str);
        addParametersToJSON(jSONObject, "service_type", getServiceTypeByEventName(str3, null));
        addParametersToJSON(jSONObject, "protocol", getProtocolByEventName(str3));
        addParametersToJSON(jSONObject, "time_stamp", String.valueOf(System.currentTimeMillis()));
        addParametersToJSON(jSONObject3, "app_key", this.appKey);
        addParametersToJSON(jSONObject3, "session_id", this.sessionID);
        addParametersToJSON(jSONObject3, "player_info", (String) null);
        addParametersToJSON(jSONObject3, "cast_info", (String) null);
        String addAppCommonDataToJSON = addAppCommonDataToJSON(jSONObject3);
        SDKMonitorUtils.LIZIZ("1014").LJIIJ(str2, jSONObject, jSONObject2, jSONObject3);
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendRawEvent protocol:");
        LIZ.append(getProtocolByEventName(str3));
        LIZ.append(", event:");
        LIZ.append(str2);
        LIZ.append(", role:");
        LIZ.append(str);
        LIZ.append(", data:");
        LIZ.append(addAppCommonDataToJSON);
        castLogger.d("Monitor", X1D.LIZIZ(LIZ));
    }

    public void sendByteCastAuthEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        JSONObject jSONObject = new JSONObject();
        addParametersToJSON(jSONObject, "isUserToB", str2);
        addParametersToJSON(jSONObject, "result", String.valueOf(str3));
        addParametersToJSON(jSONObject, "appId", str4);
        addParametersToJSON(jSONObject, "projectId", str5);
        addParametersToJSON(jSONObject, "businessId", str6);
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(str7)) {
            addParametersToJSON(jSONObject2, "error", str7);
        }
        addParametersToJSON(jSONObject, "extra", jSONObject2.toString());
        sendCustomEvent(this.role, str, jSONObject.toString());
    }
}
