package com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.config;

import X.InterfaceC65349Pkn;
import com.bytedance.ies.abmock.SettingsManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchUserFeedbackSettings {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes9.dex */
    public static final class Feedback implements Serializable {
        public static final int $stable = 8;

        @InterfaceC65349Pkn("search_type")
        public String searchType = "";

        @InterfaceC65349Pkn("schema")
        public String schema = "";

        @InterfaceC65349Pkn("schemaParams")
        public final Map<String, String> schemaParams = new LinkedHashMap();

        public final String getSchema() {
            return this.schema;
        }

        public final Map<String, String> getSchemaParams() {
            return this.schemaParams;
        }

        public final String getSearchType() {
            return this.searchType;
        }

        public final void setSchema(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.schema = str;
        }

        public final void setSearchType(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.searchType = str;
        }
    }

    /* loaded from: classes9.dex */
    public static final class FeedbackList implements Serializable {
        public static final int $stable = 8;

        @InterfaceC65349Pkn("feedback_list")
        public List<Feedback> feedbackList = new ArrayList();

        @InterfaceC65349Pkn("satisfaction_survey_schema")
        public String satisfactionSurveySchema;

        public final List<Feedback> getFeedbackList() {
            return this.feedbackList;
        }

        public final String getSatisfactionSurveySchema() {
            return this.satisfactionSurveySchema;
        }

        public final void setFeedbackList(List<Feedback> list) {
            o.LJIIIZ(list, "<set-?>");
            this.feedbackList = list;
        }

        public final void setSatisfactionSurveySchema(String str) {
            this.satisfactionSurveySchema = str;
        }
    }

    public static final Feedback LIZ(String pageName) {
        List<Feedback> feedbackList;
        o.LJIIIZ(pageName, "pageName");
        FeedbackList feedbackList2 = (FeedbackList) SettingsManager.LIZLLL().LJIIIIZZ("search_user_feedback", FeedbackList.class, null);
        if (feedbackList2 != null && (feedbackList = feedbackList2.getFeedbackList()) != null) {
            for (Feedback feedback : feedbackList) {
                if (o.LJ(feedback.getSearchType(), pageName)) {
                    return feedback;
                }
            }
        }
        return null;
    }
}
