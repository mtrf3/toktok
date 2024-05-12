package com.ss.android.ugc.aweme.commerce;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class BaGrowthMessageInfo implements Serializable {

    @InterfaceC65349Pkn("text")
    public String bodyText;

    @InterfaceC65349Pkn("button_text")
    public String buttonText;

    @InterfaceC65349Pkn("landing_page_schema")
    public String landingPageSchema;

    @InterfaceC65349Pkn("message_id")
    public String messageId;

    @InterfaceC65349Pkn("title")
    public String title;

    public final String getBodyText() {
        return this.bodyText;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getLandingPageSchema() {
        return this.landingPageSchema;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBodyText(String str) {
        this.bodyText = str;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setLandingPageSchema(String str) {
        this.landingPageSchema = str;
    }

    public final void setMessageId(String str) {
        this.messageId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
