package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public class UgProfileActivityButton {

    @InterfaceC65349Pkn("h5_link")
    public String h5Link;

    @InterfaceC65349Pkn("activity_id")
    public String id;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("resource_url")
    public UrlModel resourceUrl;

    @InterfaceC65349Pkn("show_scenery")
    public Integer showScenery;

    @InterfaceC65349Pkn("tab_bubble_text")
    public String tabBubbleText;

    @InterfaceC65349Pkn("time_limit")
    public Integer timeLimit;

    public String getId() {
        String str = this.id;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Integer getShowScenery() {
        Integer num = this.showScenery;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getTabBubbleText() {
        String str = this.tabBubbleText;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Integer getTimeLimit() {
        Integer num = this.timeLimit;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getH5Link() {
        return this.h5Link;
    }

    public UrlModel getResourceUrl() {
        return this.resourceUrl;
    }

    public void setId(String str) {
        this.id = str;
    }
}
