package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PromoteEventCommon implements Serializable {

    @InterfaceC65349Pkn("app_id")
    public String appId;

    @InterfaceC65349Pkn("app_version")
    public String appVersion;

    @InterfaceC65349Pkn("bid")
    public String bid;

    @InterfaceC65349Pkn("domain")
    public String domain;

    @InterfaceC65349Pkn("env")
    public String env;

    @InterfaceC65349Pkn("os")
    public String os;

    @InterfaceC65349Pkn("sdk_name")
    public String sdkName;

    @InterfaceC65349Pkn("session_id")
    public String sessionId;

    @InterfaceC65349Pkn("user_id")
    public String userId;

    /* JADX WARN: Multi-variable type inference failed */
    public PromoteEventCommon() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getBid() {
        return this.bid;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getEnv() {
        return this.env;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getSdkName() {
        return this.sdkName;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setAppId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.appId = str;
    }

    public final void setAppVersion(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setBid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.bid = str;
    }

    public final void setDomain(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.domain = str;
    }

    public final void setEnv(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.env = str;
    }

    public final void setOs(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.os = str;
    }

    public final void setSdkName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.sdkName = str;
    }

    public final void setSessionId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.sessionId = str;
    }

    public final void setUserId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.userId = str;
    }

    public PromoteEventCommon(String bid, String domain, String sdkName, String env, String sessionId, String appId, String appVersion, String os, String userId) {
        o.LJIIIZ(bid, "bid");
        o.LJIIIZ(domain, "domain");
        o.LJIIIZ(sdkName, "sdkName");
        o.LJIIIZ(env, "env");
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(appId, "appId");
        o.LJIIIZ(appVersion, "appVersion");
        o.LJIIIZ(os, "os");
        o.LJIIIZ(userId, "userId");
        this.bid = bid;
        this.domain = domain;
        this.sdkName = sdkName;
        this.env = env;
        this.sessionId = sessionId;
        this.appId = appId;
        this.appVersion = appVersion;
        this.os = os;
        this.userId = userId;
    }

    public /* synthetic */ PromoteEventCommon(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "tiktok_promote_lynx" : str, (i & 2) != 0 ? "www.tiktok.com" : str2, (i & 4) != 0 ? "SDK_SLARDAR_WEB" : str3, (i & 8) != 0 ? "production" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? CardStruct.IStatusCode.DEFAULT : str8, (i & 256) == 0 ? str9 : "");
    }
}
