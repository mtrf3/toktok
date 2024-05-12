package com.orbu.core.adapter;

import X.C79062V1e;
import X.X1D;
import android.content.Context;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class TTKOrbuContext {
    public final Context applicationContext;
    public final String deviceId;
    public final JSONObject extraInfo;
    public final String region;
    public final String userAction;
    public final String userId;

    public static /* synthetic */ TTKOrbuContext copy$default(TTKOrbuContext tTKOrbuContext, String str, String str2, String str3, String str4, Context context, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tTKOrbuContext.region;
        }
        if ((i & 2) != 0) {
            str2 = tTKOrbuContext.userId;
        }
        if ((i & 4) != 0) {
            str3 = tTKOrbuContext.deviceId;
        }
        if ((i & 8) != 0) {
            str4 = tTKOrbuContext.userAction;
        }
        if ((i & 16) != 0) {
            context = tTKOrbuContext.applicationContext;
        }
        if ((i & 32) != 0) {
            jSONObject = tTKOrbuContext.extraInfo;
        }
        return tTKOrbuContext.copy(str, str2, str3, str4, context, jSONObject);
    }

    public final TTKOrbuContext copy(String region, String str, String str2, String userAction, Context applicationContext, JSONObject extraInfo) {
        o.LJIIIZ(region, "region");
        o.LJIIIZ(userAction, "userAction");
        o.LJIIIZ(applicationContext, "applicationContext");
        o.LJIIIZ(extraInfo, "extraInfo");
        return new TTKOrbuContext(region, str, str2, userAction, applicationContext, extraInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTKOrbuContext)) {
            return false;
        }
        TTKOrbuContext tTKOrbuContext = (TTKOrbuContext) obj;
        return o.LJ(this.region, tTKOrbuContext.region) && o.LJ(this.userId, tTKOrbuContext.userId) && o.LJ(this.deviceId, tTKOrbuContext.deviceId) && o.LJ(this.userAction, tTKOrbuContext.userAction) && o.LJ(this.applicationContext, tTKOrbuContext.applicationContext) && o.LJ(this.extraInfo, tTKOrbuContext.extraInfo);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTKOrbuContext(region=");
        LIZ.append(this.region);
        LIZ.append(", userId=");
        LIZ.append(this.userId);
        LIZ.append(", deviceId=");
        LIZ.append(this.deviceId);
        LIZ.append(", userAction=");
        LIZ.append(this.userAction);
        LIZ.append(", applicationContext=");
        LIZ.append(this.applicationContext);
        LIZ.append(", extraInfo=");
        LIZ.append(this.extraInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.region.hashCode() * 31;
        String str = this.userId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.deviceId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.extraInfo.hashCode() + ((this.applicationContext.hashCode() + C79062V1e.LJ(this.userAction, (i2 + i) * 31, 31)) * 31);
    }

    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final JSONObject getExtraInfo() {
        return this.extraInfo;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getUserAction() {
        return this.userAction;
    }

    public final String getUserId() {
        return this.userId;
    }

    public TTKOrbuContext(String region, String str, String str2, String userAction, Context applicationContext, JSONObject extraInfo) {
        o.LJIIIZ(region, "region");
        o.LJIIIZ(userAction, "userAction");
        o.LJIIIZ(applicationContext, "applicationContext");
        o.LJIIIZ(extraInfo, "extraInfo");
        this.region = region;
        this.userId = str;
        this.deviceId = str2;
        this.userAction = userAction;
        this.applicationContext = applicationContext;
        this.extraInfo = extraInfo;
    }
}
