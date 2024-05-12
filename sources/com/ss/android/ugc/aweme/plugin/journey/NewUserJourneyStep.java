package com.ss.android.ugc.aweme.plugin.journey;

import X.InterfaceC65349Pkn;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.JourneyConsistentContentAndAdChoicesStruct;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AgeGateModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.ss.android.ugc.aweme.compliance.api.phl.model.PrivacyHighlightsForTeens;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NewUserJourneyStep {

    @InterfaceC65349Pkn("ab_expose_vid")
    public final String abExposeVid;

    @InterfaceC65349Pkn("ad_subscription_age_gate_page")
    public final AgeGateModel adAgeGatePage;

    @InterfaceC65349Pkn("ad_free_trial_payload")
    public final AdFreeTrialPageInfo adFreeTrialPageInfo;

    @InterfaceC65349Pkn("consistent_content_and_ad_choice_page")
    public final JourneyConsistentContentAndAdChoicesStruct consistentContentAndAdChoices;

    @InterfaceC65349Pkn("page_id")
    public final int id;

    @InterfaceC65349Pkn("new_user_content_language_page")
    public final JourneyContentLanguageWrapper newUserContentLanguagePage;

    @InterfaceC65349Pkn("new_user_interest_page")
    public final NewUserInterestPageStruct newUserInterestPage;

    @InterfaceC65349Pkn("page_type")
    public final String pageType;

    @InterfaceC65349Pkn("pick_your_plan_payload")
    public final PickYourAdPlanPage pickYourAdPlanPage;

    @InterfaceC65349Pkn("privacy_highlights_teens")
    public final PrivacyHighlightsForTeens privacyHighlightsForTeensInfo;

    @InterfaceC65349Pkn("topic_interest")
    public final List<TopicInterestCategoryStruct> topicInterestList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewUserJourneyStep)) {
            return false;
        }
        NewUserJourneyStep newUserJourneyStep = (NewUserJourneyStep) obj;
        return this.id == newUserJourneyStep.id && o.LJ(this.newUserInterestPage, newUserJourneyStep.newUserInterestPage) && o.LJ(this.newUserContentLanguagePage, newUserJourneyStep.newUserContentLanguagePage) && o.LJ(this.topicInterestList, newUserJourneyStep.topicInterestList) && o.LJ(this.privacyHighlightsForTeensInfo, newUserJourneyStep.privacyHighlightsForTeensInfo) && o.LJ(this.abExposeVid, newUserJourneyStep.abExposeVid) && o.LJ(this.pageType, newUserJourneyStep.pageType) && o.LJ(this.adAgeGatePage, newUserJourneyStep.adAgeGatePage) && o.LJ(this.pickYourAdPlanPage, newUserJourneyStep.pickYourAdPlanPage) && o.LJ(this.adFreeTrialPageInfo, newUserJourneyStep.adFreeTrialPageInfo) && o.LJ(this.consistentContentAndAdChoices, newUserJourneyStep.consistentContentAndAdChoices);
    }

    public final int hashCode() {
        int i = this.id * 31;
        NewUserInterestPageStruct newUserInterestPageStruct = this.newUserInterestPage;
        int hashCode = (i + (newUserInterestPageStruct == null ? 0 : newUserInterestPageStruct.hashCode())) * 31;
        JourneyContentLanguageWrapper journeyContentLanguageWrapper = this.newUserContentLanguagePage;
        int hashCode2 = (hashCode + (journeyContentLanguageWrapper == null ? 0 : journeyContentLanguageWrapper.hashCode())) * 31;
        List<TopicInterestCategoryStruct> list = this.topicInterestList;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        PrivacyHighlightsForTeens privacyHighlightsForTeens = this.privacyHighlightsForTeensInfo;
        int hashCode4 = (hashCode3 + (privacyHighlightsForTeens == null ? 0 : privacyHighlightsForTeens.hashCode())) * 31;
        String str = this.abExposeVid;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pageType;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AgeGateModel ageGateModel = this.adAgeGatePage;
        int hashCode7 = (hashCode6 + (ageGateModel == null ? 0 : ageGateModel.hashCode())) * 31;
        PickYourAdPlanPage pickYourAdPlanPage = this.pickYourAdPlanPage;
        int hashCode8 = (hashCode7 + (pickYourAdPlanPage == null ? 0 : pickYourAdPlanPage.hashCode())) * 31;
        AdFreeTrialPageInfo adFreeTrialPageInfo = this.adFreeTrialPageInfo;
        int hashCode9 = (hashCode8 + (adFreeTrialPageInfo == null ? 0 : adFreeTrialPageInfo.hashCode())) * 31;
        JourneyConsistentContentAndAdChoicesStruct journeyConsistentContentAndAdChoicesStruct = this.consistentContentAndAdChoices;
        return hashCode9 + (journeyConsistentContentAndAdChoicesStruct != null ? journeyConsistentContentAndAdChoicesStruct.hashCode() : 0);
    }

    public final String toString() {
        return "NewUserJourneyStep(id=" + this.id + ", newUserInterestPage=" + this.newUserInterestPage + ", newUserContentLanguagePage=" + this.newUserContentLanguagePage + ", topicInterestList=" + this.topicInterestList + ", privacyHighlightsForTeensInfo=" + this.privacyHighlightsForTeensInfo + ", abExposeVid=" + this.abExposeVid + ", pageType=" + this.pageType + ", adAgeGatePage=" + this.adAgeGatePage + ", pickYourAdPlanPage=" + this.pickYourAdPlanPage + ", adFreeTrialPageInfo=" + this.adFreeTrialPageInfo + ", consistentContentAndAdChoices=" + this.consistentContentAndAdChoices + ')';
    }

    public NewUserJourneyStep(int i, NewUserInterestPageStruct newUserInterestPageStruct, JourneyContentLanguageWrapper journeyContentLanguageWrapper, List<TopicInterestCategoryStruct> list, PrivacyHighlightsForTeens privacyHighlightsForTeens, String str, String str2, AgeGateModel ageGateModel, PickYourAdPlanPage pickYourAdPlanPage, AdFreeTrialPageInfo adFreeTrialPageInfo, JourneyConsistentContentAndAdChoicesStruct journeyConsistentContentAndAdChoicesStruct) {
        this.id = i;
        this.newUserInterestPage = newUserInterestPageStruct;
        this.newUserContentLanguagePage = journeyContentLanguageWrapper;
        this.topicInterestList = list;
        this.privacyHighlightsForTeensInfo = privacyHighlightsForTeens;
        this.abExposeVid = str;
        this.pageType = str2;
        this.adAgeGatePage = ageGateModel;
        this.pickYourAdPlanPage = pickYourAdPlanPage;
        this.adFreeTrialPageInfo = adFreeTrialPageInfo;
        this.consistentContentAndAdChoices = journeyConsistentContentAndAdChoicesStruct;
    }

    public /* synthetic */ NewUserJourneyStep(int i, NewUserInterestPageStruct newUserInterestPageStruct, JourneyContentLanguageWrapper journeyContentLanguageWrapper, List list, PrivacyHighlightsForTeens privacyHighlightsForTeens, String str, String str2, AgeGateModel ageGateModel, PickYourAdPlanPage pickYourAdPlanPage, AdFreeTrialPageInfo adFreeTrialPageInfo, JourneyConsistentContentAndAdChoicesStruct journeyConsistentContentAndAdChoicesStruct, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : newUserInterestPageStruct, (i2 & 4) != 0 ? null : journeyContentLanguageWrapper, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : privacyHighlightsForTeens, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : ageGateModel, (i2 & 256) != 0 ? null : pickYourAdPlanPage, (i2 & 512) != 0 ? null : adFreeTrialPageInfo, (i2 & 1024) == 0 ? journeyConsistentContentAndAdChoicesStruct : null);
    }
}
