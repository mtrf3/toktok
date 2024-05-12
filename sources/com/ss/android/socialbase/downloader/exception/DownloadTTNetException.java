package com.ss.android.socialbase.downloader.exception;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class DownloadTTNetException extends BaseException {
    public String remoteIp;

    public void parseRemoteIp() {
        String str = this.remoteIp;
        if ((str == null || "0:".equals(str)) && !TextUtils.isEmpty(getRequestLog())) {
            try {
                String optString = JSONObjectProtectorUtils.getJSONObject(new JSONObject(getRequestLog()), "socket").optString("remote");
                if (!TextUtils.isEmpty(optString)) {
                    this.remoteIp = optString;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public String getRequestLog() {
        return getExtraInfo();
    }

    public String getRemoteIp() {
        return this.remoteIp;
    }

    public void setRemoteIp(String str) {
        this.remoteIp = str;
    }

    public DownloadTTNetException setRequestLog(String str) {
        setExtraInfo(str);
        return this;
    }

    public DownloadTTNetException(int i, String str) {
        super(i, str);
    }

    public DownloadTTNetException(int i, Throwable th) {
        super(i, th);
    }
}
