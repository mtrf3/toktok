package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public class SearchPullFeedbackStruct {

    @InterfaceC65349Pkn("feedback_options")
    public SearchPullFeedbackOptions feedbackOptions;

    @InterfaceC65349Pkn("is_open_feedback")
    public Boolean isOpenFeedback = Boolean.FALSE;

    @InterfaceC65349Pkn("freq_per_query")
    public Integer freqPerQuery = 2;

    @InterfaceC65349Pkn("freq_per_day")
    public Integer freqPerDay = 1000;

    public SearchPullFeedbackOptions getFeedbackOptions() {
        SearchPullFeedbackOptions searchPullFeedbackOptions = this.feedbackOptions;
        if (searchPullFeedbackOptions != null) {
            return searchPullFeedbackOptions;
        }
        throw new C158056If();
    }

    public Integer getFreqPerDay() {
        Integer num = this.freqPerDay;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getFreqPerQuery() {
        Integer num = this.freqPerQuery;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Boolean getIsOpenFeedback() {
        Boolean bool = this.isOpenFeedback;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }
}
