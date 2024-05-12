package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PromoteEventCategories implements Serializable {

    @InterfaceC65349Pkn("app_id")
    public String appId;

    @InterfaceC65349Pkn("app_version")
    public String appVersion;

    @InterfaceC65349Pkn("enter_from")
    public String enterFrom;

    @InterfaceC65349Pkn("os")
    public String os;

    @InterfaceC65349Pkn("pageModule")
    public String pageModule;

    @InterfaceC65349Pkn("promote_by")
    public String promoteBy;

    @InterfaceC65349Pkn("store_country")
    public String storeCountry;

    /* JADX WARN: Multi-variable type inference failed */
    public PromoteEventCategories() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getPageModule() {
        return this.pageModule;
    }

    public final String getPromoteBy() {
        return this.promoteBy;
    }

    public final String getStoreCountry() {
        return this.storeCountry;
    }

    public final void setAppId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.appId = str;
    }

    public final void setAppVersion(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setEnterFrom(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.enterFrom = str;
    }

    public final void setOs(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.os = str;
    }

    public final void setPageModule(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.pageModule = str;
    }

    public final void setPromoteBy(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.promoteBy = str;
    }

    public final void setStoreCountry(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.storeCountry = str;
    }

    public PromoteEventCategories(String enterFrom, String promoteBy, String storeCountry, String appId, String appVersion, String os, String pageModule) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(promoteBy, "promoteBy");
        o.LJIIIZ(storeCountry, "storeCountry");
        o.LJIIIZ(appId, "appId");
        o.LJIIIZ(appVersion, "appVersion");
        o.LJIIIZ(os, "os");
        o.LJIIIZ(pageModule, "pageModule");
        this.enterFrom = enterFrom;
        this.promoteBy = promoteBy;
        this.storeCountry = storeCountry;
        this.appId = appId;
        this.appVersion = appVersion;
        this.os = os;
        this.pageModule = pageModule;
    }

    public /* synthetic */ PromoteEventCategories(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? CardStruct.IStatusCode.DEFAULT : str6, (i & 64) == 0 ? str7 : "");
    }
}
