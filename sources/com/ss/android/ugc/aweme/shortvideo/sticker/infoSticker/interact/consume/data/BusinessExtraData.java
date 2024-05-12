package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import X.C2060386t;
import X.InterfaceC65349Pkn;

/* loaded from: classes4.dex */
public class BusinessExtraData {

    @InterfaceC65349Pkn("clickable_open_url")
    public String clickableOpenUrl;

    @InterfaceC65349Pkn("clickable_web_url")
    public String clickableWebUrl;

    @InterfaceC65349Pkn("interaction_type")
    public int interactionType;

    @InterfaceC65349Pkn("interaction_url")
    public String interactionUrl;

    @InterfaceC65349Pkn("interaction_icon")
    public String popIcon;

    @InterfaceC65349Pkn("interaction_text")
    public String popText;

    @InterfaceC65349Pkn("sticker_id")
    public String stickerId;

    public String getSchemaUrlOpenFirst() {
        if (!C2060386t.LIZ(this.clickableOpenUrl)) {
            return this.clickableOpenUrl;
        }
        if (!C2060386t.LIZ(this.clickableWebUrl)) {
            return this.clickableWebUrl;
        }
        return this.interactionUrl;
    }

    public String getSchemaUrlWebFirst() {
        if (!C2060386t.LIZ(this.clickableWebUrl)) {
            return this.clickableWebUrl;
        }
        if (!C2060386t.LIZ(this.clickableOpenUrl)) {
            return this.clickableOpenUrl;
        }
        return this.interactionUrl;
    }

    public String getClickableOpenUrl() {
        return this.clickableOpenUrl;
    }

    public String getClickableWebUrl() {
        return this.clickableWebUrl;
    }

    public int getInteractionType() {
        return this.interactionType;
    }

    public String getInteractionUrl() {
        return this.interactionUrl;
    }

    public String getPopIcon() {
        return this.popIcon;
    }

    public String getPopText() {
        return this.popText;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public void setClickableOpenUrl(String str) {
        this.clickableOpenUrl = str;
    }

    public void setClickableWebUrl(String str) {
        this.clickableWebUrl = str;
    }

    public void setInteractionType(int i) {
        this.interactionType = i;
    }

    public void setInteractionUrl(String str) {
        this.interactionUrl = str;
    }

    public void setPopIcon(String str) {
        this.popIcon = str;
    }

    public void setPopText(String str) {
        this.popText = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }
}
