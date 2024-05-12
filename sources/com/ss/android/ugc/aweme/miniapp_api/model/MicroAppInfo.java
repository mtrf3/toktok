package com.ss.android.ugc.aweme.miniapp_api.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class MicroAppInfo implements Serializable {

    @InterfaceC65349Pkn("app_id")
    public String appId;

    @InterfaceC65349Pkn("description")
    public String desc;

    @InterfaceC65349Pkn("icon")
    public String icon;

    @InterfaceC65349Pkn("card")
    public MiniAppCard miniAppCard;

    @InterfaceC65349Pkn("app_name")
    public String name;

    @InterfaceC65349Pkn("orientation")
    public int orientation;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("state")
    public int state;

    @InterfaceC65349Pkn("summary")
    public String summary;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("web_url")
    public String webUrl;

    public boolean isApp() {
        int i = this.type;
        if (i == 1 || i == 3) {
            return true;
        }
        return false;
    }

    public boolean isGame() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public String getSchema() {
        return this.schema;
    }

    public int getState() {
        return this.state;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setState(int i) {
        this.state = i;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
