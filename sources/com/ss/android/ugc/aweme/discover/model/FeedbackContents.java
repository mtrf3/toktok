package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public final class FeedbackContents implements Serializable {

    @InterfaceC65349Pkn("feedback_type")
    public String feedbackType;

    @InterfaceC65349Pkn("multiple_choices")
    public List<FeedbackMultipleChoice> multipleChoices;

    public final String getFeedbackType() {
        return this.feedbackType;
    }

    public final List<FeedbackMultipleChoice> getMultipleChoices() {
        return this.multipleChoices;
    }

    public final void setFeedbackType(String str) {
        this.feedbackType = str;
    }

    public final void setMultipleChoices(List<FeedbackMultipleChoice> list) {
        this.multipleChoices = list;
    }
}
