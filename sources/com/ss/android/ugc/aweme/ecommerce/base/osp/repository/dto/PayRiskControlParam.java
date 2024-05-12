package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PayRiskControlParam {

    @InterfaceC65349Pkn("browser_language")
    public final String browserLanguage;

    @InterfaceC65349Pkn("browser_name")
    public final String browserName;

    @InterfaceC65349Pkn("browser_online")
    public final String browserOnline;

    @InterfaceC65349Pkn("browser_platform")
    public final String browserPlatform;

    @InterfaceC65349Pkn("browser_version")
    public final String browserVersion;

    @InterfaceC65349Pkn("captcha_check_result")
    public final String captchaCheckResult;

    @InterfaceC65349Pkn("card_number_paste")
    public final String cardNumberPaste;

    @InterfaceC65349Pkn("check_sign_res")
    public final String checkSignRes;

    @InterfaceC65349Pkn("cookie_enabled")
    public final String cookieEnabled;

    @InterfaceC65349Pkn("custom_check_sign")
    public final String customCheckSign;

    @InterfaceC65349Pkn("device_fingerprint_id")
    public final String deviceFingerprintId;

    @InterfaceC65349Pkn("fp")
    public final String fp;

    @InterfaceC65349Pkn("gp_device_fingerprint_id")
    public final String gpDeviceFingerprintId;

    @InterfaceC65349Pkn("group_id")
    public final String groupId;

    @InterfaceC65349Pkn("referer")
    public final String referer;

    @InterfaceC65349Pkn("screen_height")
    public final String screenHeight;

    @InterfaceC65349Pkn("screen_width")
    public final String screenWidth;

    @InterfaceC65349Pkn("target")
    public final String target;

    @InterfaceC65349Pkn("terminal_country")
    public final String terminalCountry;

    @InterfaceC65349Pkn("video_id")
    public final String videoId;

    @InterfaceC65349Pkn("voice_id")
    public final String voiceId;

    /* JADX WARN: Multi-variable type inference failed */
    public PayRiskControlParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2097151, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayRiskControlParam)) {
            return false;
        }
        PayRiskControlParam payRiskControlParam = (PayRiskControlParam) obj;
        return o.LJ(this.videoId, payRiskControlParam.videoId) && o.LJ(this.voiceId, payRiskControlParam.voiceId) && o.LJ(this.browserLanguage, payRiskControlParam.browserLanguage) && o.LJ(this.browserName, payRiskControlParam.browserName) && o.LJ(this.browserOnline, payRiskControlParam.browserOnline) && o.LJ(this.browserPlatform, payRiskControlParam.browserPlatform) && o.LJ(this.browserVersion, payRiskControlParam.browserVersion) && o.LJ(this.captchaCheckResult, payRiskControlParam.captchaCheckResult) && o.LJ(this.checkSignRes, payRiskControlParam.checkSignRes) && o.LJ(this.cookieEnabled, payRiskControlParam.cookieEnabled) && o.LJ(this.customCheckSign, payRiskControlParam.customCheckSign) && o.LJ(this.deviceFingerprintId, payRiskControlParam.deviceFingerprintId) && o.LJ(this.gpDeviceFingerprintId, payRiskControlParam.gpDeviceFingerprintId) && o.LJ(this.fp, payRiskControlParam.fp) && o.LJ(this.groupId, payRiskControlParam.groupId) && o.LJ(this.referer, payRiskControlParam.referer) && o.LJ(this.screenHeight, payRiskControlParam.screenHeight) && o.LJ(this.screenWidth, payRiskControlParam.screenWidth) && o.LJ(this.target, payRiskControlParam.target) && o.LJ(this.terminalCountry, payRiskControlParam.terminalCountry) && o.LJ(this.cardNumberPaste, payRiskControlParam.cardNumberPaste);
    }

    public final int hashCode() {
        String str = this.videoId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.voiceId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.browserLanguage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.browserName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.browserOnline;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.browserPlatform;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.browserVersion;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.captchaCheckResult;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.checkSignRes;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cookieEnabled;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.customCheckSign;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.deviceFingerprintId;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.gpDeviceFingerprintId;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.fp;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.groupId;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.referer;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.screenHeight;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.screenWidth;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.target;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.terminalCountry;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.cardNumberPaste;
        return hashCode20 + (str21 != null ? str21.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PayRiskControlParam(videoId=");
        sb.append(this.videoId);
        sb.append(", voiceId=");
        sb.append(this.voiceId);
        sb.append(", browserLanguage=");
        sb.append(this.browserLanguage);
        sb.append(", browserName=");
        sb.append(this.browserName);
        sb.append(", browserOnline=");
        sb.append(this.browserOnline);
        sb.append(", browserPlatform=");
        sb.append(this.browserPlatform);
        sb.append(", browserVersion=");
        sb.append(this.browserVersion);
        sb.append(", captchaCheckResult=");
        sb.append(this.captchaCheckResult);
        sb.append(", checkSignRes=");
        sb.append(this.checkSignRes);
        sb.append(", cookieEnabled=");
        sb.append(this.cookieEnabled);
        sb.append(", customCheckSign=");
        sb.append(this.customCheckSign);
        sb.append(", deviceFingerprintId=");
        sb.append(this.deviceFingerprintId);
        sb.append(", gpDeviceFingerprintId=");
        sb.append(this.gpDeviceFingerprintId);
        sb.append(", fp=");
        sb.append(this.fp);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", referer=");
        sb.append(this.referer);
        sb.append(", screenHeight=");
        sb.append(this.screenHeight);
        sb.append(", screenWidth=");
        sb.append(this.screenWidth);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", terminalCountry=");
        sb.append(this.terminalCountry);
        sb.append(", cardNumberPaste=");
        return C07670Rv.LIZIZ(sb, this.cardNumberPaste, ')');
    }

    public PayRiskControlParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21) {
        this.videoId = str;
        this.voiceId = str2;
        this.browserLanguage = str3;
        this.browserName = str4;
        this.browserOnline = str5;
        this.browserPlatform = str6;
        this.browserVersion = str7;
        this.captchaCheckResult = str8;
        this.checkSignRes = str9;
        this.cookieEnabled = str10;
        this.customCheckSign = str11;
        this.deviceFingerprintId = str12;
        this.gpDeviceFingerprintId = str13;
        this.fp = str14;
        this.groupId = str15;
        this.referer = str16;
        this.screenHeight = str17;
        this.screenWidth = str18;
        this.target = str19;
        this.terminalCountry = str20;
        this.cardNumberPaste = str21;
    }

    public /* synthetic */ PayRiskControlParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (32768 & i) != 0 ? null : str16, (65536 & i) != 0 ? null : str17, (131072 & i) != 0 ? null : str18, (262144 & i) != 0 ? null : str19, (524288 & i) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21);
    }
}
