package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;

/* loaded from: classes15.dex */
public class RecordInteractExtra {

    @InterfaceC65349Pkn("clickable_open_url")
    public String clickableOpenUrl;

    @InterfaceC65349Pkn("clickable_web_url")
    public String clickableWebUrl;

    @InterfaceC65349Pkn("interaction_type")
    public int interactionType;

    @InterfaceC65349Pkn("interaction_icon")
    public String popIcon;

    @InterfaceC65349Pkn("interaction_text")
    public String popText;

    @InterfaceC65349Pkn("interaction_url")
    public String schemeUrl;

    @InterfaceC65349Pkn("sticker_id")
    public String stickerId;

    public ExtraParams toExtraParams() {
        ExtraParams extraParams = new ExtraParams();
        extraParams.setInteractionIcon(this.popIcon);
        extraParams.setInteractionText(this.popText);
        extraParams.setInteractionType(this.interactionType);
        extraParams.setInteractionUrl(this.schemeUrl);
        extraParams.setClickableOpenUrl(this.clickableOpenUrl);
        extraParams.setClickableWebUrl(this.clickableWebUrl);
        return extraParams;
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

    public String getPopIcon() {
        return this.popIcon;
    }

    public String getPopText() {
        return this.popText;
    }

    public String getSchemeUrl() {
        return this.schemeUrl;
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

    public void setPopIcon(String str) {
        this.popIcon = str;
    }

    public void setPopText(String str) {
        this.popText = str;
    }

    public void setSchemeUrl(String str) {
        this.schemeUrl = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void formatFromExtraParams(ExtraParams extraParams, String str) {
        if (extraParams != null) {
            this.stickerId = str;
            this.interactionType = extraParams.getInteractionType();
            this.popIcon = extraParams.getInteractionIcon();
            this.popText = extraParams.getInteractionText();
            this.schemeUrl = extraParams.getInteractionUrl();
            this.clickableOpenUrl = extraParams.getClickableOpenUrl();
            this.clickableWebUrl = extraParams.getClickableWebUrl();
        }
    }
}
