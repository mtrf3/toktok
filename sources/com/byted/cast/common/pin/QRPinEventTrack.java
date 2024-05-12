package com.byted.cast.common.pin;

import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Monitor;
import java.util.HashMap;

/* loaded from: classes29.dex */
public class QRPinEventTrack {
    public static void trackGenerateLinkInfoFailure(String str, String str2, String str3) {
        Monitor.sendSinkEvent("bytecast_generate_link_info_failure", new HashMap<String, String>(str, str2, str3) { // from class: com.byted.cast.common.pin.QRPinEventTrack.2
            public final /* synthetic */ String val$buildType;
            public final /* synthetic */ String val$errCode;
            public final /* synthetic */ String val$errMsg;

            {
                this.val$buildType = str;
                this.val$errMsg = str2;
                this.val$errCode = str3;
                put("build_type", str);
                put("err_msg", str2);
                put("err_code", str3);
            }
        });
    }

    public static void trackParseLinkInfo(ContextManager.CastContext castContext, String str, String str2, String str3) {
        ContextManager.getMonitor(castContext).sendSourceEvent("bytecast_parse_link_info", new HashMap<String, String>(str, str2, str3) { // from class: com.byted.cast.common.pin.QRPinEventTrack.3
            public final /* synthetic */ String val$buildType;
            public final /* synthetic */ String val$content;
            public final /* synthetic */ String val$state;

            {
                this.val$content = str;
                this.val$buildType = str2;
                this.val$state = str3;
                put("content", str);
                put("build_type", str2);
                put("state", str3);
            }
        }, (String) null);
    }

    public static void trackGenerateLinkInfo(String str, String str2, String str3, String str4, String str5) {
        Monitor.sendSinkEvent("bytecast_generate_link_info", new HashMap<String, String>(str, str2, str3, str4, str5) { // from class: com.byted.cast.common.pin.QRPinEventTrack.1
            public final /* synthetic */ String val$buildTime;
            public final /* synthetic */ String val$buildType;
            public final /* synthetic */ String val$content;
            public final /* synthetic */ String val$qrcode_type;
            public final /* synthetic */ String val$state;

            {
                this.val$content = str;
                this.val$state = str2;
                this.val$buildType = str3;
                this.val$buildTime = str4;
                this.val$qrcode_type = str5;
                put("content", str);
                put("state", str2);
                put("build_type", str3);
                put("build_time", str4);
                put("qrcode_type", str5);
            }
        });
    }

    public static void trackParseLinkInfoFailure(ContextManager.CastContext castContext, String str, String str2, String str3, String str4) {
        ContextManager.getMonitor(castContext).sendSourceEvent("bytecast_parse_link_info_failure", new HashMap<String, String>(str, str2, str3, str4) { // from class: com.byted.cast.common.pin.QRPinEventTrack.4
            public final /* synthetic */ String val$buildType;
            public final /* synthetic */ String val$content;
            public final /* synthetic */ String val$errCode;
            public final /* synthetic */ String val$errMsg;

            {
                this.val$content = str;
                this.val$buildType = str2;
                this.val$errMsg = str3;
                this.val$errCode = str4;
                put("content", str);
                put("build_type", str2);
                put("err_msg", str3);
                put("err_code", str4);
            }
        }, (String) null);
    }
}
