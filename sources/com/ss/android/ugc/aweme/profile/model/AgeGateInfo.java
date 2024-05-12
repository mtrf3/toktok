package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes16.dex */
public final class AgeGateInfo implements Serializable {

    @InterfaceC65349Pkn("age_gate_image_url")
    public final String ageGateImageUrl;

    @InterfaceC65349Pkn("age_input_placeholder")
    public final String ageGateInputPlaceHolder;

    @InterfaceC65349Pkn("age_indicator_type")
    public final Integer ageIndicatorType;

    @InterfaceC65349Pkn("confirmation_type")
    public final Integer confirmationType;

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("default_date")
    public final String defaultDate;

    @InterfaceC65349Pkn("age_gate_header")
    public final String header;

    @InterfaceC65349Pkn("age_gate_content_hyperlinks")
    public final List<AgeGateHyperlink> hyperlinks;

    @InterfaceC65349Pkn("lower_bound_date")
    public final String lowerBoundDate;

    @InterfaceC65349Pkn("age_gate_buttons")
    public List<AgeGateNavButton> navButtons;

    @InterfaceC65349Pkn("age_action_text")
    public final String nextButtonText;

    @InterfaceC65349Pkn("option_list")
    public final List<AgeGateOption> optionList;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("upper_bound_date")
    public final String upperBoundDate;

    public final String getAgeGateImageUrl() {
        return this.ageGateImageUrl;
    }

    public final String getAgeGateInputPlaceHolder() {
        return this.ageGateInputPlaceHolder;
    }

    public final Integer getAgeIndicatorType() {
        return this.ageIndicatorType;
    }

    public final Integer getConfirmationType() {
        return this.confirmationType;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getDefaultDate() {
        return this.defaultDate;
    }

    public final String getHeader() {
        return this.header;
    }

    public final List<AgeGateHyperlink> getHyperlinks() {
        return this.hyperlinks;
    }

    public final String getLowerBoundDate() {
        return this.lowerBoundDate;
    }

    public final List<AgeGateNavButton> getNavButtons() {
        return this.navButtons;
    }

    public final String getNextButtonText() {
        return this.nextButtonText;
    }

    public final List<AgeGateOption> getOptionList() {
        return this.optionList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUpperBoundDate() {
        return this.upperBoundDate;
    }

    public final void setNavButtons(List<AgeGateNavButton> list) {
        this.navButtons = list;
    }
}
