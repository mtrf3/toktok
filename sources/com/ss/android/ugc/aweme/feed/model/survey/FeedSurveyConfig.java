package com.ss.android.ugc.aweme.feed.model.survey;

import X.C07670Rv;
import X.C16880lQ;
import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.JBR;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class FeedSurveyConfig implements Serializable {

    @InterfaceC65349Pkn("survey_style")
    public int bgdVideo;

    @InterfaceC65349Pkn("bi_cancel_interval_time")
    public long biCanceIntervalTime;

    @InterfaceC65349Pkn("content_scope")
    public String contentScope;

    @InterfaceC65349Pkn("feed_survey_new_style_group")
    public int feedSurveyStyle;

    @InterfaceC65349Pkn("feed_trigger_threshold")
    public int feedTriggerThreshold;

    @InterfaceC65349Pkn("fixed_survey")
    public FeedSurvey fixedSurvey;

    @InterfaceC65349Pkn("flexible_survey")
    public FeedSurvey flexibleSurvey;

    @InterfaceC65349Pkn("multi_survey_type")
    public int multiSurveyType;

    @InterfaceC65349Pkn("privacy_policy_key")
    public String privacyPolicyKey;

    @InterfaceC65349Pkn("privacy_policy_text")
    public String privacyPolicyText;

    @InterfaceC65349Pkn("show_interval_time")
    public long showIntervalTime;

    @InterfaceC65349Pkn("survey_appear_end")
    public int surveyAppearEnd;

    @InterfaceC65349Pkn("survey_appear_start")
    public int surveyAppearStart;

    @InterfaceC65349Pkn("turns_group_count")
    public int turnsGroupCount;

    @InterfaceC65349Pkn("turns_group_id")
    public int turnsGroupId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FeedSurveyConfig() {
        /*
            r20 = this;
            r1 = 0
            r5 = 0
            r7 = 0
            r18 = 32767(0x7fff, float:4.5916E-41)
            r0 = r20
            r3 = r1
            r6 = r5
            r8 = r5
            r9 = r5
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r5
            r19 = r5
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig.<init>():void");
    }

    public static /* synthetic */ FeedSurveyConfig copy$default(FeedSurveyConfig feedSurveyConfig, long j, long j2, FeedSurvey feedSurvey, FeedSurvey feedSurvey2, int i, String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str3, int i9, Object obj) {
        long j3 = j;
        FeedSurvey feedSurvey3 = feedSurvey2;
        long j4 = j2;
        FeedSurvey feedSurvey4 = feedSurvey;
        int i10 = i2;
        String str4 = str2;
        int i11 = i;
        String str5 = str;
        int i12 = i6;
        int i13 = i5;
        int i14 = i3;
        int i15 = i4;
        String str6 = str3;
        int i16 = i7;
        int i17 = i8;
        if ((i9 & 1) != 0) {
            j3 = feedSurveyConfig.showIntervalTime;
        }
        if ((i9 & 2) != 0) {
            j4 = feedSurveyConfig.biCanceIntervalTime;
        }
        if ((i9 & 4) != 0) {
            feedSurvey4 = feedSurveyConfig.fixedSurvey;
        }
        if ((i9 & 8) != 0) {
            feedSurvey3 = feedSurveyConfig.flexibleSurvey;
        }
        if ((i9 & 16) != 0) {
            i11 = feedSurveyConfig.feedTriggerThreshold;
        }
        if ((i9 & 32) != 0) {
            str5 = feedSurveyConfig.privacyPolicyText;
        }
        if ((i9 & 64) != 0) {
            str4 = feedSurveyConfig.privacyPolicyKey;
        }
        if ((i9 & 128) != 0) {
            i10 = feedSurveyConfig.turnsGroupId;
        }
        if ((i9 & 256) != 0) {
            i14 = feedSurveyConfig.turnsGroupCount;
        }
        if ((i9 & 512) != 0) {
            i15 = feedSurveyConfig.surveyAppearStart;
        }
        if ((i9 & 1024) != 0) {
            i13 = feedSurveyConfig.surveyAppearEnd;
        }
        if ((i9 & 2048) != 0) {
            i12 = feedSurveyConfig.multiSurveyType;
        }
        if ((i9 & 4096) != 0) {
            i16 = feedSurveyConfig.feedSurveyStyle;
        }
        if ((i9 & FileUtils.BUFFER_SIZE) != 0) {
            i17 = feedSurveyConfig.bgdVideo;
        }
        if ((i9 & 16384) != 0) {
            str6 = feedSurveyConfig.contentScope;
        }
        String str7 = str5;
        String str8 = str4;
        return feedSurveyConfig.copy(j3, j4, feedSurvey4, feedSurvey3, i11, str7, str8, i10, i14, i15, i13, i12, i16, i17, str6);
    }

    public final FeedSurveyConfig copy(long j, long j2, FeedSurvey feedSurvey, FeedSurvey feedSurvey2, int i, String privacyPolicyText, String privacyPolicyKey, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String contentScope) {
        o.LJIIIZ(privacyPolicyText, "privacyPolicyText");
        o.LJIIIZ(privacyPolicyKey, "privacyPolicyKey");
        o.LJIIIZ(contentScope, "contentScope");
        return new FeedSurveyConfig(j, j2, feedSurvey, feedSurvey2, i, privacyPolicyText, privacyPolicyKey, i2, i3, i4, i5, i6, i7, i8, contentScope);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedSurveyConfig)) {
            return false;
        }
        FeedSurveyConfig feedSurveyConfig = (FeedSurveyConfig) obj;
        return this.showIntervalTime == feedSurveyConfig.showIntervalTime && this.biCanceIntervalTime == feedSurveyConfig.biCanceIntervalTime && o.LJ(this.fixedSurvey, feedSurveyConfig.fixedSurvey) && o.LJ(this.flexibleSurvey, feedSurveyConfig.flexibleSurvey) && this.feedTriggerThreshold == feedSurveyConfig.feedTriggerThreshold && o.LJ(this.privacyPolicyText, feedSurveyConfig.privacyPolicyText) && o.LJ(this.privacyPolicyKey, feedSurveyConfig.privacyPolicyKey) && this.turnsGroupId == feedSurveyConfig.turnsGroupId && this.turnsGroupCount == feedSurveyConfig.turnsGroupCount && this.surveyAppearStart == feedSurveyConfig.surveyAppearStart && this.surveyAppearEnd == feedSurveyConfig.surveyAppearEnd && this.multiSurveyType == feedSurveyConfig.multiSurveyType && this.feedSurveyStyle == feedSurveyConfig.feedSurveyStyle && this.bgdVideo == feedSurveyConfig.bgdVideo && o.LJ(this.contentScope, feedSurveyConfig.contentScope);
    }

    public int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.biCanceIntervalTime, C16880lQ.LLJIJIL(this.showIntervalTime) * 31, 31);
        FeedSurvey feedSurvey = this.fixedSurvey;
        int i = 0;
        if (feedSurvey == null) {
            hashCode = 0;
        } else {
            hashCode = feedSurvey.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        FeedSurvey feedSurvey2 = this.flexibleSurvey;
        if (feedSurvey2 != null) {
            i = feedSurvey2.hashCode();
        }
        return this.contentScope.hashCode() + ((((((((((((((C79062V1e.LJ(this.privacyPolicyKey, C79062V1e.LJ(this.privacyPolicyText, (((i2 + i) * 31) + this.feedTriggerThreshold) * 31, 31), 31) + this.turnsGroupId) * 31) + this.turnsGroupCount) * 31) + this.surveyAppearStart) * 31) + this.surveyAppearEnd) * 31) + this.multiSurveyType) * 31) + this.feedSurveyStyle) * 31) + this.bgdVideo) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FeedSurveyConfig(showIntervalTime=");
        sb.append(this.showIntervalTime);
        sb.append(", biCanceIntervalTime=");
        sb.append(this.biCanceIntervalTime);
        sb.append(", fixedSurvey=");
        sb.append(this.fixedSurvey);
        sb.append(", flexibleSurvey=");
        sb.append(this.flexibleSurvey);
        sb.append(", feedTriggerThreshold=");
        sb.append(this.feedTriggerThreshold);
        sb.append(", privacyPolicyText=");
        sb.append(this.privacyPolicyText);
        sb.append(", privacyPolicyKey=");
        sb.append(this.privacyPolicyKey);
        sb.append(", turnsGroupId=");
        sb.append(this.turnsGroupId);
        sb.append(", turnsGroupCount=");
        sb.append(this.turnsGroupCount);
        sb.append(", surveyAppearStart=");
        sb.append(this.surveyAppearStart);
        sb.append(", surveyAppearEnd=");
        sb.append(this.surveyAppearEnd);
        sb.append(", multiSurveyType=");
        sb.append(this.multiSurveyType);
        sb.append(", feedSurveyStyle=");
        sb.append(this.feedSurveyStyle);
        sb.append(", bgdVideo=");
        sb.append(this.bgdVideo);
        sb.append(", contentScope=");
        return C07670Rv.LIZIZ(sb, this.contentScope, ')');
    }

    public final int getBgdVideo() {
        return this.bgdVideo;
    }

    public final long getBiCanceIntervalTime() {
        return this.biCanceIntervalTime;
    }

    public final String getContentScope() {
        return this.contentScope;
    }

    public final int getFeedSurveyStyle() {
        return this.feedSurveyStyle;
    }

    public final int getFeedTriggerThreshold() {
        return this.feedTriggerThreshold;
    }

    public final FeedSurvey getFixedSurvey() {
        return this.fixedSurvey;
    }

    public final FeedSurvey getFlexibleSurvey() {
        return this.flexibleSurvey;
    }

    public final int getMultiSurveyType() {
        return this.multiSurveyType;
    }

    public final String getPrivacyPolicyKey() {
        return this.privacyPolicyKey;
    }

    public final String getPrivacyPolicyText() {
        return this.privacyPolicyText;
    }

    public final long getShowIntervalTime() {
        return this.showIntervalTime;
    }

    public final int getSurveyAppearEnd() {
        return this.surveyAppearEnd;
    }

    public final int getSurveyAppearStart() {
        return this.surveyAppearStart;
    }

    public final int getTurnsGroupCount() {
        return this.turnsGroupCount;
    }

    public final int getTurnsGroupId() {
        return this.turnsGroupId;
    }

    public final void setBgdVideo(int i) {
        this.bgdVideo = i;
    }

    public final void setBiCanceIntervalTime(long j) {
        this.biCanceIntervalTime = j;
    }

    public final void setContentScope(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.contentScope = str;
    }

    public final void setFeedSurveyStyle(int i) {
        this.feedSurveyStyle = i;
    }

    public final void setFeedTriggerThreshold(int i) {
        this.feedTriggerThreshold = i;
    }

    public final void setFixedSurvey(FeedSurvey feedSurvey) {
        this.fixedSurvey = feedSurvey;
    }

    public final void setFlexibleSurvey(FeedSurvey feedSurvey) {
        this.flexibleSurvey = feedSurvey;
    }

    public final void setMultiSurveyType(int i) {
        this.multiSurveyType = i;
    }

    public final void setPrivacyPolicyKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.privacyPolicyKey = str;
    }

    public final void setPrivacyPolicyText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.privacyPolicyText = str;
    }

    public final void setShowIntervalTime(long j) {
        this.showIntervalTime = j;
    }

    public final void setSurveyAppearEnd(int i) {
        this.surveyAppearEnd = i;
    }

    public final void setSurveyAppearStart(int i) {
        this.surveyAppearStart = i;
    }

    public final void setTurnsGroupCount(int i) {
        this.turnsGroupCount = i;
    }

    public final void setTurnsGroupId(int i) {
        this.turnsGroupId = i;
    }

    public FeedSurveyConfig(long j, long j2, FeedSurvey feedSurvey, FeedSurvey feedSurvey2, int i, String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str3) {
        HH1.LIZ(str, "privacyPolicyText", str2, "privacyPolicyKey", str3, "contentScope");
        this.showIntervalTime = j;
        this.biCanceIntervalTime = j2;
        this.fixedSurvey = feedSurvey;
        this.flexibleSurvey = feedSurvey2;
        this.feedTriggerThreshold = i;
        this.privacyPolicyText = str;
        this.privacyPolicyKey = str2;
        this.turnsGroupId = i2;
        this.turnsGroupCount = i3;
        this.surveyAppearStart = i4;
        this.surveyAppearEnd = i5;
        this.multiSurveyType = i6;
        this.feedSurveyStyle = i7;
        this.bgdVideo = i8;
        this.contentScope = str3;
    }

    public /* synthetic */ FeedSurveyConfig(long j, long j2, FeedSurvey feedSurvey, FeedSurvey feedSurvey2, int i, String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str3, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 604800L : j, (i9 & 2) != 0 ? 0L : j2, (i9 & 4) != 0 ? null : feedSurvey, (i9 & 8) == 0 ? feedSurvey2 : null, (i9 & 16) != 0 ? 0 : i, (i9 & 32) != 0 ? "" : str, (i9 & 64) != 0 ? "" : str2, (i9 & 128) != 0 ? 0 : i2, (i9 & 256) != 0 ? 0 : i3, (i9 & 512) != 0 ? 0 : i4, (i9 & 1024) != 0 ? 0 : i5, (i9 & 2048) != 0 ? 1 : i6, (i9 & 4096) != 0 ? 0 : i7, (i9 & FileUtils.BUFFER_SIZE) != 0 ? 0 : i8, (i9 & 16384) == 0 ? str3 : "");
    }
}
