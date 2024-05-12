package com.byted.cast.common;

import X.X1D;
import android.text.TextUtils;
import com.byted.cast.common.bean.BytecastBrowseType;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes29.dex */
public class SourceMonitorUtils {
    public String browseId = "";
    public CastMonitor mMonitor;
    public TeaEventTrack teaEventTrack;

    private void generateBrowseId() {
        String uuid = UUID.randomUUID().toString();
        this.browseId = uuid;
        TeaEventTrack teaEventTrack = this.teaEventTrack;
        if (teaEventTrack != null) {
            teaEventTrack.browseId = uuid;
        }
    }

    public String getBrowseId() {
        return this.browseId;
    }

    public SourceMonitorUtils(CastMonitor castMonitor) {
        this.mMonitor = castMonitor;
    }

    public void sendDlnaSearchSendSuccess(HashMap<String, String> hashMap) {
        HashMap hashMap2 = new HashMap();
        hashMap2.put("browse_id", this.browseId);
        this.mMonitor.sendSourceEvent("bddlna_search_send_success", hashMap, hashMap2, "");
    }

    public void trackAppendBDLinkInfoResult(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (z) {
            str = "success";
        } else {
            str = "failure";
        }
        hashMap.put("result", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("browse_id", this.browseId);
        this.mMonitor.sendSourceEvent("bytecast_append_bdlink_info_result", hashMap, hashMap2, "");
    }

    public void trackBDLinkDiskCacheCheckResult(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (z) {
            str = "success";
        } else {
            str = "failure";
        }
        hashMap.put("result", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("browse_id", this.browseId);
        this.mMonitor.sendSourceEvent("bdlink_disk_cache_check_result", hashMap, hashMap2, "");
    }

    public void trackByteCastGetMediaInfoProtocol(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("trackByteCastGetMediaInfoProtocol, protocolType: ");
        LIZ.append(str);
        Logger.d("SourceMonitorUtils", X1D.LIZIZ(LIZ));
        if (str == null) {
            str = "";
        }
        HashMap hashMap = new HashMap();
        Locale locale = Locale.ROOT;
        hashMap.put("protocol", str.toLowerCase(locale));
        hashMap.put("content", "");
        if (this.teaEventTrack != null) {
            hashMap.put("state", "start");
            this.teaEventTrack.castProtocol = str.toLowerCase(locale);
            hashMap.put("cast_protocol", str.toLowerCase(locale));
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_GET_MEDIA_INFO_PROTOCOL, hashMap);
        }
    }

    public void trackBytecastStartBrowse(BytecastBrowseType bytecastBrowseType) {
        generateBrowseId();
        HashMap hashMap = new HashMap();
        hashMap.put("event_type", bytecastBrowseType.getValue());
        hashMap.put("content", "");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("browse_id", this.browseId);
        CastMonitor castMonitor = this.mMonitor;
        if (castMonitor != null) {
            castMonitor.sendSourceEvent("bytecast_start_browse_v2", hashMap, hashMap2, "");
        }
        if (this.teaEventTrack != null) {
            hashMap2.put("state", "start");
            hashMap2.put("browse_protocol", "");
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_BROWSE, hashMap, hashMap2);
        }
    }

    public void trackBytecastStopBrowse(BytecastBrowseType bytecastBrowseType) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_type", bytecastBrowseType.getValue());
        hashMap.put("content", "");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("browse_id", this.browseId);
        CastMonitor castMonitor = this.mMonitor;
        if (castMonitor != null) {
            castMonitor.sendSourceEvent("bytecast_stop_browse_v2", hashMap, hashMap2, "");
        }
    }

    public void trackNsdBrowseSuccessEvent(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("nsd_type", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("browse_id", this.browseId);
        this.mMonitor.sendSourceEvent("nsd_service_browse_success", hashMap, hashMap2, "");
    }

    public void trackStartBrowseProtocolEvent(String str) {
        if (str == null) {
            str = "";
        }
        HashMap hashMap = new HashMap();
        Locale locale = Locale.ROOT;
        hashMap.put("protocol", str.toLowerCase(locale));
        hashMap.put("content", "");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("browse_id", this.browseId);
        CastMonitor castMonitor = this.mMonitor;
        if (castMonitor != null) {
            castMonitor.sendSourceEvent("bytecast_start_browse_protocol_v2", hashMap, hashMap2, "");
        }
        if (this.teaEventTrack != null) {
            hashMap2.put("state", "start");
            this.teaEventTrack.castProtocol = str.toLowerCase(locale);
            hashMap2.put("browse_protocol", "");
            hashMap2.put("cast_protocol", str.toLowerCase(locale));
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_BROWSE_PROTOCOL, hashMap, hashMap2);
        }
    }

    public void trackStopBrowseProtocolEvent(String str) {
        if (str == null) {
            str = "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("protocol", str.toLowerCase(Locale.ROOT));
        hashMap.put("content", "");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("browse_id", this.browseId);
        this.mMonitor.sendSourceEvent("bytecast_stop_browse_protocol_v2", hashMap, hashMap2, "");
    }

    public SourceMonitorUtils(TeaEventTrack teaEventTrack) {
        this.teaEventTrack = teaEventTrack;
    }

    public void trackByteCastGetMediaInfoResultProtocol(String str, boolean z) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("trackByteCastGetMediaInfoResultProtocol, protocolType: ");
        LIZ.append(str);
        LIZ.append(", result: ");
        LIZ.append(z);
        Logger.d("SourceMonitorUtils", X1D.LIZIZ(LIZ));
        if (str == null) {
            str = "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("protocol", str.toLowerCase(Locale.ROOT));
        hashMap.put("content", "");
        if (this.teaEventTrack != null) {
            if (z) {
                str2 = "success";
            } else {
                str2 = "failure";
            }
            hashMap.put("state", str2);
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_GET_MEDIA_INFO_PROTOCOL, hashMap);
        }
    }

    public void trackByteCastPlaySuccessProtocol(String str, String str2) {
        if (str == null) {
            str = "";
        }
        HashMap hashMap = new HashMap();
        Locale locale = Locale.ROOT;
        hashMap.put("protocol", str.toLowerCase(locale));
        hashMap.put("content", "");
        CastMonitor castMonitor = this.mMonitor;
        if (castMonitor != null) {
            castMonitor.sendSourceEvent("bytecast_play_success_protocol_v2", hashMap, str2);
        }
        if (this.teaEventTrack != null) {
            hashMap.put("state", "success");
            this.teaEventTrack.castProtocol = str.toLowerCase(locale);
            hashMap.put("cast_protocol", str.toLowerCase(locale));
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_PLAY_PROTOCOL, hashMap);
        }
    }

    public void trackChromeCastPlayFailureEvent(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("content", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str2);
        this.mMonitor.sendSourceEvent("chromecast_play_failure", hashMap, hashMap2, "");
    }

    public void trackNormalOrAbnormalRemoveDevice(String str, boolean z) {
        if (str == null) {
            str = "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("protocol", str.toLowerCase(Locale.ROOT));
        if (z) {
            this.mMonitor.sendSourceEvent("normal_offline", hashMap, "");
        } else {
            this.mMonitor.sendSourceEvent("abnormal_offline", hashMap, "");
        }
    }

    public void trackSsdpBrowseEvent(String str, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("browse_id", this.browseId);
        this.mMonitor.sendSourceEvent(str, map, hashMap, "");
    }

    public void trackVideoDuration(String str, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("protocol", str.toLowerCase(Locale.ROOT));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("duration", String.valueOf(j));
        this.mMonitor.sendSourceEvent("bytecast_video_duration", hashMap, hashMap2, "");
    }

    public void sendDlnaBrowseError(int i, String str, HashMap<String, String> hashMap) {
        HashMap hashMap2 = new HashMap();
        hashMap2.put("error_code", String.valueOf(i));
        hashMap2.put("error_desc", str);
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("browse_id", this.browseId);
        this.mMonitor.sendSourceEvent("bddlna_browse_error", hashMap2, hashMap3, "");
    }

    public void trackBDDLNAPlayFailureEvent(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("content", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str2);
        this.mMonitor.sendSourceEvent("BDDLNA_Play_Failure", hashMap, hashMap2, str3);
    }

    public void trackBDLinkPlayEvent(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("content", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str2);
        CastMonitor castMonitor = this.mMonitor;
        if (castMonitor != null) {
            castMonitor.sendSourceEvent("BDLink_Play", hashMap, hashMap2, str3);
        }
        if (this.teaEventTrack != null) {
            hashMap.put("state", "start");
            TeaEventTrack teaEventTrack = this.teaEventTrack;
            teaEventTrack.castUrl = str2;
            teaEventTrack.castProtocol = "BDLink";
            hashMap.put("cast_url", str2);
            hashMap.put("cast_protocol", "BDLink");
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_BDLINK_PLAY, hashMap, hashMap2);
        }
    }

    public void trackBDLinkPlayFailureEvent(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("content", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str2);
        this.mMonitor.sendSourceEvent("BDLink_Play_Failure", hashMap, hashMap2, str3);
    }

    public void trackBrowseEvent(String str, String str2, String str3) {
        this.mMonitor.sendCustomEvent(str, str2, str3, null, this.browseId);
    }

    public void trackByteCastPlayProtocol(String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        HashMap hashMap = new HashMap();
        Locale locale = Locale.ROOT;
        hashMap.put("protocol", str.toLowerCase(locale));
        hashMap.put("content", "");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str2);
        CastMonitor castMonitor = this.mMonitor;
        if (castMonitor != null) {
            castMonitor.sendSourceEvent("bytecast_play_protocol_v2", hashMap, hashMap2, str3);
        }
        if (this.teaEventTrack != null) {
            hashMap.put("state", "start");
            TeaEventTrack teaEventTrack = this.teaEventTrack;
            teaEventTrack.castUrl = str2;
            teaEventTrack.castProtocol = str.toLowerCase(locale);
            hashMap.put("cast_protocol", str.toLowerCase(locale));
            hashMap.put("cast_url", str2);
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_PLAY_PROTOCOL, hashMap, hashMap2);
        }
    }

    public void trackByteCastStartDramaProtocol(String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        HashMap hashMap = new HashMap();
        Locale locale = Locale.ROOT;
        hashMap.put("protocol", str.toLowerCase(locale));
        hashMap.put("content", str3);
        hashMap.put("action", str2);
        if (this.teaEventTrack != null) {
            hashMap.put("state", "start");
            this.teaEventTrack.castProtocol = str.toLowerCase(locale);
            hashMap.put("cast_protocol", str.toLowerCase(locale));
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_DRAMA, hashMap);
        }
    }

    public void trackDlnaBrowseAllResultEvent(String str, int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("browse_id", this.browseId);
        hashMap.put("device_count_before_filter", String.valueOf(i));
        hashMap.put("device_count_after_filter", String.valueOf(i2));
        hashMap.put("device_list_before_filter", str);
        this.mMonitor.sendSourceEvent("bddlna_browse_result_all", null, hashMap, "");
    }

    public void trackLelinkPlayEvent(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("content", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str2);
        CastMonitor castMonitor = this.mMonitor;
        if (castMonitor != null) {
            castMonitor.sendSourceEvent("LeLink_Play", hashMap, hashMap2, str3);
        }
        TeaEventTrack teaEventTrack = this.teaEventTrack;
        if (teaEventTrack != null) {
            teaEventTrack.castUrl = str2;
            teaEventTrack.castProtocol = "LeLink";
            hashMap2.put("cast_url", str2);
            hashMap2.put("cast_protocol", "LeLink");
            hashMap2.remove("url");
            hashMap.put("state", "start");
            hashMap2.put("connect_id", str3);
            hashMap2.put("cast_protocol", "LeLink");
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_LELINK_PLAY, hashMap, hashMap2);
        }
    }

    public void trackLelinkPlayFailureEvent(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("content", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str2);
        CastMonitor castMonitor = this.mMonitor;
        if (castMonitor != null) {
            castMonitor.sendSourceEvent("LeLink_Play_Failure", hashMap, hashMap2, str3);
        }
        if (this.teaEventTrack != null) {
            hashMap.put("state", "failure");
            hashMap.put("err_msg", str);
            hashMap2.put("connect_id", str3);
            hashMap2.put("cast_protocol", "LeLink");
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_LELINK_PLAY, hashMap, hashMap2);
        }
    }

    public void trackSsdpErrorEvent(String str, int i, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", String.valueOf(i));
        hashMap.put("error_message", str2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("browse_id", this.browseId);
        this.mMonitor.sendSourceEvent(str, hashMap, hashMap2, "");
    }

    public void trackBDDLNACmdPlayFailureInfo(int i, String str, String str2, HashMap<String, String> hashMap) {
        HashMap hashMap2 = new HashMap();
        hashMap2.put("error_code", String.valueOf(i));
        hashMap2.put("error_message", str);
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        CastMonitor castMonitor = this.mMonitor;
        if (castMonitor != null) {
            castMonitor.sendSourceEvent("bddlna_cmd_play_failure_info", hashMap2, str2);
        }
        if (this.teaEventTrack != null) {
            HashMap hashMap3 = new HashMap();
            TeaEventTrack teaEventTrack = this.teaEventTrack;
            teaEventTrack.castProtocol = "BDDLNA";
            teaEventTrack.connectId = str2;
            hashMap3.put("state", "failure");
            hashMap3.put("err_code", String.valueOf(i));
            hashMap3.put("err_msg", str);
            hashMap3.put("err_path", "");
            hashMap3.put("connect_id", str2);
            hashMap3.put("cast_protocol", "BDDLNA");
            if (hashMap != null) {
                hashMap3.putAll(hashMap);
            }
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_DEBUG_BDDLNA_PLAY_COMMAND, hashMap3);
        }
    }

    public void trackBDDLNACmdUriFailureInfo(int i, String str, String str2, HashMap<String, String> hashMap) {
        HashMap hashMap2 = new HashMap();
        hashMap2.put("error_code", String.valueOf(i));
        hashMap2.put("error_message", str);
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        CastMonitor castMonitor = this.mMonitor;
        if (castMonitor != null) {
            castMonitor.sendSourceEvent("bddlna_cmd_uri_failure_info", hashMap2, str2);
        }
        TeaEventTrack teaEventTrack = this.teaEventTrack;
        if (teaEventTrack != null) {
            teaEventTrack.castProtocol = "BDDLNA";
            teaEventTrack.connectId = str2;
            HashMap hashMap3 = new HashMap();
            hashMap3.put("state", "failure");
            hashMap3.put("err_code", String.valueOf(i));
            hashMap3.put("err_msg", str);
            hashMap3.put("connect_id", str2);
            hashMap3.put("cast_protocol", "BDDLNA");
            if (hashMap != null) {
                hashMap3.putAll(hashMap);
            }
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_BDDLNA_PLAY, hashMap3);
        }
    }

    public void trackBDDLNAParseUrlFailureInfo(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str2);
        hashMap2.put("http_connection_error_message", str3);
        hashMap2.put("http_request_error_message", str4);
        this.mMonitor.sendSourceEvent("bddlna_parse_url_failure_info", hashMap, hashMap2, "");
    }

    public void trackBDDLNAPlayEvent(String str, String str2, String str3, HashMap<String, String> hashMap) {
        HashMap hashMap2 = new HashMap();
        hashMap2.put("content", str);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("url", str2);
        CastMonitor castMonitor = this.mMonitor;
        if (castMonitor != null) {
            castMonitor.sendSourceEvent("BDDLNA_Play", hashMap2, hashMap3, str3);
        }
        if (this.teaEventTrack != null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("state", "start");
            hashMap4.putAll(hashMap);
            TeaEventTrack teaEventTrack = this.teaEventTrack;
            teaEventTrack.castUrl = str2;
            teaEventTrack.connectId = str3;
            teaEventTrack.castProtocol = "BDDLNA";
            hashMap4.put("cast_url", str2);
            hashMap4.put("cast_protocol", "BDDLNA");
            hashMap4.put("connect_id", str3);
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_BDDLNA_PLAY, hashMap4, null);
        }
    }

    public void trackByteCastPlayFailureProtocol(String str, int i, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("protocol", str.toLowerCase(Locale.ROOT));
        hashMap.put("content", "");
        hashMap.put("err_msg", str2);
        hashMap.put("err_code", String.valueOf(i));
        if (this.teaEventTrack != null) {
            hashMap.put("state", "failure");
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_PLAY_PROTOCOL, hashMap);
        }
    }

    public void trackBrowseResultProtocolEvent(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        if (str == null) {
            str = "";
        }
        HashMap hashMap = new HashMap();
        Locale locale = Locale.ROOT;
        hashMap.put("protocol", str.toLowerCase(locale));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("browse_id", this.browseId);
        hashMap2.put("content", str2);
        hashMap2.put("device_name", str3);
        hashMap2.put("manufacture", str4);
        CastMonitor castMonitor = this.mMonitor;
        if (castMonitor != null) {
            castMonitor.sendSourceEvent("bytecast_browse_result_protocol_v2", hashMap, hashMap2, "");
        }
        if (this.teaEventTrack != null) {
            if (TextUtils.isEmpty(str3)) {
                str5 = "failure";
            } else {
                str5 = "success";
            }
            hashMap2.put("state", str5);
            this.teaEventTrack.castProtocol = str.toLowerCase(locale);
            hashMap2.put("browse_protocol", "");
            hashMap2.put("cast_protocol", str.toLowerCase(locale));
            hashMap2.put("support_play", String.valueOf(z));
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_BROWSE_PROTOCOL, hashMap, hashMap2);
        }
    }

    public void trackByteCastConnectProtocol(String str, String str2, String str3, int i, String str4) {
        if (str == null) {
            str = "";
        }
        HashMap hashMap = new HashMap();
        Locale locale = Locale.ROOT;
        hashMap.put("protocol", str.toLowerCase(locale));
        hashMap.put("content", "");
        hashMap.put("cast_id", str3);
        if (i != 0) {
            hashMap.put("err_code", String.valueOf(i));
            hashMap.put("err_msg", str4);
        }
        if (this.teaEventTrack != null) {
            hashMap.put("state", str2);
            this.teaEventTrack.castProtocol = str.toLowerCase(locale);
            hashMap.put("cast_protocol", str.toLowerCase(locale));
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_CONNECT_PROTOCOL, hashMap);
        }
    }

    public void trackBytecastBrowseResult(BytecastBrowseType bytecastBrowseType, boolean z, String str, String str2, String str3, boolean z2) {
        Object obj;
        HashMap hashMap = new HashMap();
        hashMap.put("event_type", bytecastBrowseType.getValue());
        String str4 = "success";
        if (z) {
            obj = "success";
        } else {
            obj = "failure";
        }
        hashMap.put("result", obj);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("browse_id", this.browseId);
        hashMap2.put("content", str);
        hashMap2.put("device_name", str2);
        hashMap2.put("manufacture", str3);
        CastMonitor castMonitor = this.mMonitor;
        if (castMonitor != null) {
            castMonitor.sendSourceEvent("bytecast_browse_result_v2", hashMap, hashMap2, "");
        }
        if (this.teaEventTrack != null) {
            hashMap.remove("result");
            if (!z) {
                str4 = "failure";
            }
            hashMap2.put("state", str4);
            hashMap2.put("browse_protocol", "");
            hashMap2.put("support_play", String.valueOf(z2));
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_BROWSE, hashMap, hashMap2);
        }
    }

    public void trackByteCastPushProtocol(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        if (str == null) {
            str = "";
        }
        HashMap hashMap = new HashMap();
        Locale locale = Locale.ROOT;
        hashMap.put("protocol", str.toLowerCase(locale));
        hashMap.put("content", str3);
        hashMap.put("connect_id", str5);
        hashMap.put("url", str4);
        if (i != 0) {
            hashMap.put("err_code", String.valueOf(i));
            hashMap.put("err_msg", str6);
        }
        if (this.teaEventTrack != null) {
            hashMap.put("state", str2);
            this.teaEventTrack.castProtocol = str.toLowerCase(locale);
            hashMap.put("cast_protocol", str.toLowerCase(locale));
            this.teaEventTrack.trackSourceEvent(TeaEventTrack.BYTECASTSDK_INDICATOR_PUSH_PROTOCOL, hashMap);
        }
    }
}
