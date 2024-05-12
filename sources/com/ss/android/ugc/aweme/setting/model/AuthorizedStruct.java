package com.ss.android.ugc.aweme.setting.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes5.dex */
public final class AuthorizedStruct implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("access_msg")
    public final String accessMsg;

    @InterfaceC65349Pkn("removal_alert")
    public final String alert;

    @InterfaceC65349Pkn("authorized_time_text")
    public final String authorizedTimeText;

    @InterfaceC65349Pkn("client_key")
    public final String clientKey;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("icon")
    public final String icon;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("client_permission_url")
    public final String permissionUrl;

    @InterfaceC65349Pkn("removal_popup_content")
    public final String removalPopupContent;

    @InterfaceC65349Pkn("removal_popup_title")
    public final String removalPopupTitle;

    @InterfaceC65349Pkn("scope_names")
    public final List<String> scopeNames;

    @InterfaceC65349Pkn("status")
    public final String status;

    public final String getAccessMsg() {
        return this.accessMsg;
    }

    public final String getAlert() {
        return this.alert;
    }

    public final String getAuthorizedTimeText() {
        return this.authorizedTimeText;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPermissionUrl() {
        return this.permissionUrl;
    }

    public final String getRemovalPopupContent() {
        return this.removalPopupContent;
    }

    public final String getRemovalPopupTitle() {
        return this.removalPopupTitle;
    }

    public final List<String> getScopeNames() {
        return this.scopeNames;
    }

    public final String getStatus() {
        return this.status;
    }
}
