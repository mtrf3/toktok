package com.ss.android.ugc.aweme.feed.model.survey;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class FeedSurvey implements Serializable {

    @InterfaceC65349Pkn("cancel_text")
    public String cancelText;

    @InterfaceC65349Pkn("bgd_video")
    public ForceVideo forceVideo;

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("questions")
    public Question[] questions;

    @InterfaceC65349Pkn("relation_info")
    public String relationsKey;

    @InterfaceC65349Pkn("submit_text")
    public String submitText;

    @InterfaceC65349Pkn("key")
    public String surveyKey;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("triggers")
    public List<TriggerData> triggerActions;

    @InterfaceC65349Pkn("bgd_video_cover")
    public ForceVideo videoCover;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedSurvey() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedSurvey copy$default(FeedSurvey feedSurvey, String str, String str2, String str3, List list, String str4, String str5, String str6, Question[] questionArr, ForceVideo forceVideo, ForceVideo forceVideo2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedSurvey.surveyKey;
        }
        if ((i & 2) != 0) {
            str2 = feedSurvey.id;
        }
        if ((i & 4) != 0) {
            str3 = feedSurvey.relationsKey;
        }
        if ((i & 8) != 0) {
            list = feedSurvey.triggerActions;
        }
        if ((i & 16) != 0) {
            str4 = feedSurvey.title;
        }
        if ((i & 32) != 0) {
            str5 = feedSurvey.cancelText;
        }
        if ((i & 64) != 0) {
            str6 = feedSurvey.submitText;
        }
        if ((i & 128) != 0) {
            questionArr = feedSurvey.questions;
        }
        if ((i & 256) != 0) {
            forceVideo = feedSurvey.forceVideo;
        }
        if ((i & 512) != 0) {
            forceVideo2 = feedSurvey.videoCover;
        }
        return feedSurvey.copy(str, str2, str3, list, str4, str5, str6, questionArr, forceVideo, forceVideo2);
    }

    public final FeedSurvey copy(String surveyKey, String id, String str, List<TriggerData> list, String title, String cancelText, String submitText, Question[] questionArr, ForceVideo forceVideo, ForceVideo forceVideo2) {
        o.LJIIIZ(surveyKey, "surveyKey");
        o.LJIIIZ(id, "id");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(cancelText, "cancelText");
        o.LJIIIZ(submitText, "submitText");
        return new FeedSurvey(surveyKey, id, str, list, title, cancelText, submitText, questionArr, forceVideo, forceVideo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedSurvey)) {
            return false;
        }
        FeedSurvey feedSurvey = (FeedSurvey) obj;
        return o.LJ(this.surveyKey, feedSurvey.surveyKey) && o.LJ(this.id, feedSurvey.id) && o.LJ(this.relationsKey, feedSurvey.relationsKey) && o.LJ(this.triggerActions, feedSurvey.triggerActions) && o.LJ(this.title, feedSurvey.title) && o.LJ(this.cancelText, feedSurvey.cancelText) && o.LJ(this.submitText, feedSurvey.submitText) && o.LJ(this.questions, feedSurvey.questions) && o.LJ(this.forceVideo, feedSurvey.forceVideo) && o.LJ(this.videoCover, feedSurvey.videoCover);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedSurvey(surveyKey=");
        LIZ.append(this.surveyKey);
        LIZ.append(", id=");
        LIZ.append(this.id);
        LIZ.append(", relationsKey=");
        LIZ.append(this.relationsKey);
        LIZ.append(", triggerActions=");
        LIZ.append(this.triggerActions);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", cancelText=");
        LIZ.append(this.cancelText);
        LIZ.append(", submitText=");
        LIZ.append(this.submitText);
        LIZ.append(", questions=");
        LIZ.append(Arrays.toString(this.questions));
        LIZ.append(", forceVideo=");
        LIZ.append(this.forceVideo);
        LIZ.append(", videoCover=");
        LIZ.append(this.videoCover);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LJ = C79062V1e.LJ(this.id, this.surveyKey.hashCode() * 31, 31);
        String str = this.relationsKey;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        List<TriggerData> list = this.triggerActions;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.submitText, C79062V1e.LJ(this.cancelText, C79062V1e.LJ(this.title, (i2 + hashCode2) * 31, 31), 31), 31);
        Question[] questionArr = this.questions;
        if (questionArr == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = Arrays.hashCode(questionArr);
        }
        int i3 = (LJ2 + hashCode3) * 31;
        ForceVideo forceVideo = this.forceVideo;
        if (forceVideo == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = forceVideo.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        ForceVideo forceVideo2 = this.videoCover;
        if (forceVideo2 != null) {
            i = forceVideo2.hashCode();
        }
        return i4 + i;
    }

    public final String getCancelText() {
        return this.cancelText;
    }

    public final ForceVideo getForceVideo() {
        return this.forceVideo;
    }

    public final String getId() {
        return this.id;
    }

    public final Question[] getQuestions() {
        return this.questions;
    }

    public final String getRelationsKey() {
        return this.relationsKey;
    }

    public final String getSubmitText() {
        return this.submitText;
    }

    public final String getSurveyKey() {
        return this.surveyKey;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<TriggerData> getTriggerActions() {
        return this.triggerActions;
    }

    public final ForceVideo getVideoCover() {
        return this.videoCover;
    }

    public final void setCancelText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.cancelText = str;
    }

    public final void setForceVideo(ForceVideo forceVideo) {
        this.forceVideo = forceVideo;
    }

    public final void setId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.id = str;
    }

    public final void setQuestions(Question[] questionArr) {
        this.questions = questionArr;
    }

    public final void setRelationsKey(String str) {
        this.relationsKey = str;
    }

    public final void setSubmitText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.submitText = str;
    }

    public final void setSurveyKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.surveyKey = str;
    }

    public final void setTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.title = str;
    }

    public final void setTriggerActions(List<TriggerData> list) {
        this.triggerActions = list;
    }

    public final void setVideoCover(ForceVideo forceVideo) {
        this.videoCover = forceVideo;
    }

    public FeedSurvey(String surveyKey, String id, String str, List<TriggerData> list, String title, String cancelText, String submitText, Question[] questionArr, ForceVideo forceVideo, ForceVideo forceVideo2) {
        o.LJIIIZ(surveyKey, "surveyKey");
        o.LJIIIZ(id, "id");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(cancelText, "cancelText");
        o.LJIIIZ(submitText, "submitText");
        this.surveyKey = surveyKey;
        this.id = id;
        this.relationsKey = str;
        this.triggerActions = list;
        this.title = title;
        this.cancelText = cancelText;
        this.submitText = submitText;
        this.questions = questionArr;
        this.forceVideo = forceVideo;
        this.videoCover = forceVideo2;
    }

    public /* synthetic */ FeedSurvey(String str, String str2, String str3, List list, String str4, String str5, String str6, Question[] questionArr, ForceVideo forceVideo, ForceVideo forceVideo2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "", (i & 128) != 0 ? null : questionArr, (i & 256) != 0 ? null : forceVideo, (i & 512) == 0 ? forceVideo2 : null);
    }
}
