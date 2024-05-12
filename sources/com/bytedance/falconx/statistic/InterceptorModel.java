package com.bytedance.falconx.statistic;

import X.C0EM;
import X.InterfaceC65349Pkn;
import android.os.SystemClock;

/* loaded from: classes11.dex */
public class InterceptorModel {

    @InterfaceC65349Pkn("ac")
    public String ac;

    @InterfaceC65349Pkn("access_key")
    public String accessKey;

    @InterfaceC65349Pkn("channel")
    public String channel;

    @InterfaceC65349Pkn("err_code")
    public String errCode;

    @InterfaceC65349Pkn("err_msg")
    public String errMsg;
    public boolean isCombo;

    @InterfaceC65349Pkn("log_id")
    public String logId;

    @InterfaceC65349Pkn("mime_type")
    public String mimeType;

    @InterfaceC65349Pkn("offline_duration")
    public Long offlineDuration;

    @InterfaceC65349Pkn("offline_rule")
    public String offlineRule;

    @InterfaceC65349Pkn("offline_status")
    public Integer offlineStatus;

    @InterfaceC65349Pkn("online_duration")
    public Long onlineDuration;

    @InterfaceC65349Pkn("page_url")
    public String pageUrl;

    @InterfaceC65349Pkn("pkg_version")
    public Long pkgVersion;

    @InterfaceC65349Pkn("res_root_dir")
    public String resRootDir;
    public Long startTime = Long.valueOf(SystemClock.uptimeMillis());

    @InterfaceC65349Pkn("resource_url")
    public String url;

    public long getVersion() {
        Long l = this.pkgVersion;
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public void loadFinish(boolean z) {
        if (z) {
            this.offlineDuration = C0EM.LIZIZ(this.startTime, SystemClock.uptimeMillis());
            this.offlineStatus = 1;
            return;
        }
        this.offlineStatus = 0;
    }

    public void setErrorCode(String str) {
        this.errCode = str;
    }

    public void setErrorMsg(String str) {
        this.errMsg = str;
    }
}
