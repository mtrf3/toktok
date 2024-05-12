package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class SearchSurveyConfig implements Serializable {

    @InterfaceC65349Pkn("enabled")
    public boolean enabled;

    @InterfaceC65349Pkn("survey_id")
    public String surveyId;

    @InterfaceC65349Pkn("show_delay")
    public long showDelay = 5;

    @InterfaceC65349Pkn("result_delay")
    public long submitResultDelay = 2;

    @InterfaceC65349Pkn("show_duration")
    public long showDuration = 5;

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final long getShowDelay() {
        return this.showDelay;
    }

    public final long getShowDuration() {
        return this.showDuration;
    }

    public final long getSubmitResultDelay() {
        return this.submitResultDelay;
    }

    public final String getSurveyId() {
        return this.surveyId;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setShowDelay(long j) {
        this.showDelay = j;
    }

    public final void setShowDuration(long j) {
        this.showDuration = j;
    }

    public final void setSubmitResultDelay(long j) {
        this.submitResultDelay = j;
    }

    public final void setSurveyId(String str) {
        this.surveyId = str;
    }
}
