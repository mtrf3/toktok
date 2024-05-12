package com.ss.android.ugc.aweme.account.login.twostep;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class RecommendDevice implements Serializable {

    @InterfaceC65349Pkn("AppId")
    public final Integer appId;

    @InterfaceC65349Pkn("AppName")
    public final String appName;

    @InterfaceC65349Pkn("CreateTime")
    public final String createTime;

    @InterfaceC65349Pkn("DeviceName")
    public final String deviceName;

    @InterfaceC65349Pkn("DeviceType")
    public final Integer deviceType;

    @InterfaceC65349Pkn("Did")
    public final Long did;

    @InterfaceC65349Pkn("HasRisk")
    public final Boolean hasRisk;

    @InterfaceC65349Pkn("Ip")
    public final String ip;

    @InterfaceC65349Pkn("IsLocalDevice")
    public final Boolean isLocalDevice;

    @InterfaceC65349Pkn("LastUseTime")
    public final String lastUseTime;

    @InterfaceC65349Pkn("LastUseTimestamp")
    public final Long lastUseTimestamp;

    @InterfaceC65349Pkn("Location")
    public final String location;

    @InterfaceC65349Pkn("LoginStatus")
    public final Boolean loginStatus;

    @InterfaceC65349Pkn("LoginType")
    public final String loginType;

    @InterfaceC65349Pkn("Os")
    public final String os;

    @InterfaceC65349Pkn("RiskLevel")
    public final Integer riskLevel;

    @InterfaceC65349Pkn("StrDid")
    public final String strDid;

    public static /* synthetic */ RecommendDevice copy$default(RecommendDevice recommendDevice, Long l, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, Long l2, Integer num, String str7, Integer num2, Boolean bool2, Integer num3, String str8, Boolean bool3, String str9, int i, Object obj) {
        Long l3 = l;
        String str10 = str;
        Boolean bool4 = bool;
        String str11 = str4;
        String str12 = str2;
        String str13 = str3;
        Integer num4 = num;
        Long l4 = l2;
        String str14 = str5;
        String str15 = str6;
        Boolean bool5 = bool2;
        String str16 = str7;
        Integer num5 = num3;
        Integer num6 = num2;
        String str17 = str9;
        String str18 = str8;
        Boolean bool6 = bool3;
        if ((i & 1) != 0) {
            l3 = recommendDevice.did;
        }
        if ((i & 2) != 0) {
            str10 = recommendDevice.strDid;
        }
        if ((i & 4) != 0) {
            str12 = recommendDevice.createTime;
        }
        if ((i & 8) != 0) {
            str13 = recommendDevice.lastUseTime;
        }
        if ((i & 16) != 0) {
            str11 = recommendDevice.deviceName;
        }
        if ((i & 32) != 0) {
            bool4 = recommendDevice.loginStatus;
        }
        if ((i & 64) != 0) {
            str14 = recommendDevice.os;
        }
        if ((i & 128) != 0) {
            str15 = recommendDevice.loginType;
        }
        if ((i & 256) != 0) {
            l4 = recommendDevice.lastUseTimestamp;
        }
        if ((i & 512) != 0) {
            num4 = recommendDevice.appId;
        }
        if ((i & 1024) != 0) {
            str16 = recommendDevice.appName;
        }
        if ((i & 2048) != 0) {
            num6 = recommendDevice.deviceType;
        }
        if ((i & 4096) != 0) {
            bool5 = recommendDevice.hasRisk;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            num5 = recommendDevice.riskLevel;
        }
        if ((i & 16384) != 0) {
            str18 = recommendDevice.location;
        }
        if ((32768 & i) != 0) {
            bool6 = recommendDevice.isLocalDevice;
        }
        if ((i & 65536) != 0) {
            str17 = recommendDevice.ip;
        }
        String str19 = str11;
        return recommendDevice.copy(l3, str10, str12, str13, str19, bool4, str14, str15, l4, num4, str16, num6, bool5, num5, str18, bool6, str17);
    }

    public final RecommendDevice copy(Long l, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, Long l2, Integer num, String str7, Integer num2, Boolean bool2, Integer num3, String str8, Boolean bool3, String str9) {
        return new RecommendDevice(l, str, str2, str3, str4, bool, str5, str6, l2, num, str7, num2, bool2, num3, str8, bool3, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendDevice)) {
            return false;
        }
        RecommendDevice recommendDevice = (RecommendDevice) obj;
        return o.LJ(this.did, recommendDevice.did) && o.LJ(this.strDid, recommendDevice.strDid) && o.LJ(this.createTime, recommendDevice.createTime) && o.LJ(this.lastUseTime, recommendDevice.lastUseTime) && o.LJ(this.deviceName, recommendDevice.deviceName) && o.LJ(this.loginStatus, recommendDevice.loginStatus) && o.LJ(this.os, recommendDevice.os) && o.LJ(this.loginType, recommendDevice.loginType) && o.LJ(this.lastUseTimestamp, recommendDevice.lastUseTimestamp) && o.LJ(this.appId, recommendDevice.appId) && o.LJ(this.appName, recommendDevice.appName) && o.LJ(this.deviceType, recommendDevice.deviceType) && o.LJ(this.hasRisk, recommendDevice.hasRisk) && o.LJ(this.riskLevel, recommendDevice.riskLevel) && o.LJ(this.location, recommendDevice.location) && o.LJ(this.isLocalDevice, recommendDevice.isLocalDevice) && o.LJ(this.ip, recommendDevice.ip);
    }

    public int hashCode() {
        Long l = this.did;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.strDid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.createTime;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastUseTime;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.loginStatus;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.os;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.loginType;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l2 = this.lastUseTimestamp;
        int hashCode9 = (hashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.appId;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.appName;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.deviceType;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.hasRisk;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.riskLevel;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str8 = this.location;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool3 = this.isLocalDevice;
        int hashCode16 = (hashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str9 = this.ip;
        return hashCode16 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RecommendDevice(did=");
        sb.append(this.did);
        sb.append(", strDid=");
        sb.append(this.strDid);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", lastUseTime=");
        sb.append(this.lastUseTime);
        sb.append(", deviceName=");
        sb.append(this.deviceName);
        sb.append(", loginStatus=");
        sb.append(this.loginStatus);
        sb.append(", os=");
        sb.append(this.os);
        sb.append(", loginType=");
        sb.append(this.loginType);
        sb.append(", lastUseTimestamp=");
        sb.append(this.lastUseTimestamp);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", appName=");
        sb.append(this.appName);
        sb.append(", deviceType=");
        sb.append(this.deviceType);
        sb.append(", hasRisk=");
        sb.append(this.hasRisk);
        sb.append(", riskLevel=");
        sb.append(this.riskLevel);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", isLocalDevice=");
        sb.append(this.isLocalDevice);
        sb.append(", ip=");
        return C07670Rv.LIZIZ(sb, this.ip, ')');
    }

    public final Integer getAppId() {
        return this.appId;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final Integer getDeviceType() {
        return this.deviceType;
    }

    public final Long getDid() {
        return this.did;
    }

    public final Boolean getHasRisk() {
        return this.hasRisk;
    }

    public final String getIp() {
        return this.ip;
    }

    public final String getLastUseTime() {
        return this.lastUseTime;
    }

    public final Long getLastUseTimestamp() {
        return this.lastUseTimestamp;
    }

    public final String getLocation() {
        return this.location;
    }

    public final Boolean getLoginStatus() {
        return this.loginStatus;
    }

    public final String getLoginType() {
        return this.loginType;
    }

    public final String getOs() {
        return this.os;
    }

    public final Integer getRiskLevel() {
        return this.riskLevel;
    }

    public final String getStrDid() {
        return this.strDid;
    }

    public final Boolean isLocalDevice() {
        return this.isLocalDevice;
    }

    public RecommendDevice(Long l, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, Long l2, Integer num, String str7, Integer num2, Boolean bool2, Integer num3, String str8, Boolean bool3, String str9) {
        this.did = l;
        this.strDid = str;
        this.createTime = str2;
        this.lastUseTime = str3;
        this.deviceName = str4;
        this.loginStatus = bool;
        this.os = str5;
        this.loginType = str6;
        this.lastUseTimestamp = l2;
        this.appId = num;
        this.appName = str7;
        this.deviceType = num2;
        this.hasRisk = bool2;
        this.riskLevel = num3;
        this.location = str8;
        this.isLocalDevice = bool3;
        this.ip = str9;
    }
}
