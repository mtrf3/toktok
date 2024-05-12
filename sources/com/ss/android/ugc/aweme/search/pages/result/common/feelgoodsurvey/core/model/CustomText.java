package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CustomText {

    @InterfaceC65349Pkn("event_tracker_answer")
    public final List<String> eventTrackerAnswer;

    @InterfaceC65349Pkn("event_tracker_question")
    public final String eventTrackerQuestion;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomText)) {
            return false;
        }
        CustomText customText = (CustomText) obj;
        return o.LJ(this.eventTrackerQuestion, customText.eventTrackerQuestion) && o.LJ(this.eventTrackerAnswer, customText.eventTrackerAnswer);
    }

    public final int hashCode() {
        String str = this.eventTrackerQuestion;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.eventTrackerAnswer;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomText(eventTrackerQuestion=");
        LIZ.append(this.eventTrackerQuestion);
        LIZ.append(", eventTrackerAnswer=");
        return C1NE.LIZIZ(LIZ, this.eventTrackerAnswer, ')', LIZ);
    }

    public CustomText(String str, List<String> list) {
        this.eventTrackerQuestion = str;
        this.eventTrackerAnswer = list;
    }
}
