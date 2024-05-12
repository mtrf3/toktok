package com.ss.android.ugc.aweme.emoji.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Emoji implements Serializable {

    @InterfaceC65349Pkn("animate_type")
    public String animateType;

    @InterfaceC65349Pkn("animate_url")
    public UrlModel animateUrl;

    @InterfaceC65349Pkn("display_name")
    public String displayName;

    @InterfaceC65349Pkn("display_name_lang")
    public HashMap<String, String> displayNameLangs;

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("joker_sticker_id")
    public String jokerId;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean mLogPb;

    @InterfaceC65349Pkn("origin_package_id")
    public long resourcesId;

    @InterfaceC65349Pkn("static_type")
    public String staticType;

    @InterfaceC65349Pkn("static_url")
    public UrlModel staticUrl;

    @InterfaceC65349Pkn("sticker_id")
    public String stickerId;

    @InterfaceC65349Pkn("sticker_type")
    public int stickerType;

    @InterfaceC65349Pkn("version")
    public String version;

    @InterfaceC65349Pkn("width")
    public int width;

    public int hashCode() {
        return String.valueOf(this.id).hashCode();
    }

    public String getAnimateType() {
        return this.animateType;
    }

    public UrlModel getAnimateUrl() {
        return this.animateUrl;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public HashMap<String, String> getDisplayNameLangs() {
        return this.displayNameLangs;
    }

    public int getHeight() {
        return this.height;
    }

    public long getId() {
        return this.id;
    }

    public String getJokerId() {
        return this.jokerId;
    }

    public LogPbBean getLogPb() {
        return this.mLogPb;
    }

    public long getResourcesId() {
        return this.resourcesId;
    }

    public String getStaticType() {
        return this.staticType;
    }

    public UrlModel getStaticUrl() {
        return this.staticUrl;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getStickerType() {
        return this.stickerType;
    }

    public String getVersion() {
        return this.version;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Emoji)) {
            return false;
        }
        Emoji emoji = (Emoji) obj;
        long j = emoji.id;
        if ((j <= 0 || j != this.id) && (emoji.getAnimateUrl() == null || getAnimateUrl() == null || !TextUtils.equals(emoji.getAnimateUrl().getUri(), this.animateUrl.getUri()))) {
            return false;
        }
        return true;
    }

    public void setAnimateType(String str) {
        this.animateType = str;
    }

    public void setAnimateUrl(UrlModel urlModel) {
        this.animateUrl = urlModel;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setDisplayNameLangs(HashMap<String, String> hashMap) {
        this.displayNameLangs = hashMap;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setJokerId(String str) {
        this.jokerId = str;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.mLogPb = logPbBean;
    }

    public void setResourcesId(long j) {
        this.resourcesId = j;
    }

    public void setStaticType(String str) {
        this.staticType = str;
    }

    public void setStaticUrl(UrlModel urlModel) {
        this.staticUrl = urlModel;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setStickerType(int i) {
        this.stickerType = i;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
