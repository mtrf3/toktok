package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class UgChannelPopup {

    @InterfaceC65349Pkn("button_text")
    public String buttonText;

    @InterfaceC65349Pkn("campaign_list")
    public List<String> campaignList = new ArrayList();

    @InterfaceC65349Pkn("campaign_name")
    public String campaignName;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("h5_link")
    public String h5Link;

    @InterfaceC65349Pkn("image_style")
    public Integer imageStyle;

    @InterfaceC65349Pkn("link_schema")
    public String linkSchema;

    @InterfaceC65349Pkn("resource_url")
    public UrlModel resourceUrl;

    @InterfaceC65349Pkn("show_for_all")
    public Boolean showForAll;

    @InterfaceC65349Pkn("title")
    public String title;

    public String getButtonText() {
        String str = this.buttonText;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getCampaignName() {
        String str = this.campaignName;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getContent() {
        String str = this.content;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getH5Link() {
        String str = this.h5Link;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Integer getImageStyle() {
        Integer num = this.imageStyle;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getLinkSchema() {
        String str = this.linkSchema;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public UrlModel getResourceUrl() {
        UrlModel urlModel = this.resourceUrl;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C158056If();
    }

    public Boolean getShowForAll() {
        Boolean bool = this.showForAll;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public List<String> getCampaignList() {
        return this.campaignList;
    }
}
