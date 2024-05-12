package com.ss.android.ugc.aweme.feed.model.commercialize.adexperience;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class CommerceAceSurveyInfo implements Serializable {

    @InterfaceC65349Pkn("brand_name")
    public final String brandName;

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("options")
    public final List<AceSurveyOption> options;

    @InterfaceC65349Pkn("schema_url")
    public final String schema;

    @InterfaceC65349Pkn("send_notice_time")
    public final int sendNoticeTime;

    @InterfaceC65349Pkn("bg_url")
    public final String surveyBgCover;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("style_type")
    public final Integer styleType = -1;

    @InterfaceC65349Pkn("user_convert")
    public final AceSurveyUserConvert userConvert = new AceSurveyUserConvert();

    @InterfaceC65349Pkn("gecko_channel")
    public final ArrayList<String> geckoChannel = new ArrayList<>();

    public final String getBrandName() {
        return this.brandName;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final ArrayList<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final List<AceSurveyOption> getOptions() {
        return this.options;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getSendNoticeTime() {
        return this.sendNoticeTime;
    }

    public final Integer getStyleType() {
        return this.styleType;
    }

    public final String getSurveyBgCover() {
        return this.surveyBgCover;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final AceSurveyUserConvert getUserConvert() {
        return this.userConvert;
    }
}
