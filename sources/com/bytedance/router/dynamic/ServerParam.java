package com.bytedance.router.dynamic;

import android.text.TextUtils;
import com.bytedance.router.util.Logger;

/* loaded from: classes7.dex */
public class ServerParam {
    public int mAid;
    public String mChannel;
    public String mDeviceId;

    public boolean isAvailable() {
        if (this.mAid <= 0) {
            Logger.e("aid <= 0, ServerParam is unavailable!!!");
            return false;
        }
        if (TextUtils.isEmpty(this.mDeviceId)) {
            Logger.e("device id is empty, ServerParam is unavailable!!!");
            return false;
        }
        return true;
    }

    public int getAid() {
        return this.mAid;
    }

    public String getChannel() {
        return this.mChannel;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public ServerParam(int i, String str, String str2) {
        this.mAid = i;
        this.mDeviceId = str;
        this.mChannel = str2;
        if (i <= 0) {
            Logger.e("aid must > 0, it can request server!!!");
        }
        if (TextUtils.isEmpty(this.mDeviceId)) {
            Logger.e("deviceId must be nut null, it can request server!!!");
        }
        if (this.mChannel == null) {
            this.mChannel = "";
        }
    }
}
