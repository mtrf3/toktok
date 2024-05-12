package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class GlobalDoodleConfig implements Serializable {

    @InterfaceC65349Pkn("ab_params")
    public Map<String, String> abParams;

    @InterfaceC65349Pkn("activity_card_bg")
    public SearchActivityCardBgData activityCardBg;

    @InterfaceC65349Pkn("can_pull_refresh")
    public boolean canPullRefresh;

    @InterfaceC65349Pkn("disable_inner_flow")
    public boolean disableInnerFlow;

    @InterfaceC65349Pkn("enable_image_record")
    public Boolean enableImageRecord;

    @InterfaceC65349Pkn("feedback_survey")
    public List<FeedbackContents> feedbackSurvey;

    @InterfaceC65349Pkn("feel_good")
    public HashMap<String, Object> feelGood;

    @InterfaceC65349Pkn("forbid_search_type")
    public int forbidSearchType;

    @InterfaceC65349Pkn("has_ecom_intent")
    public Boolean hasEcomIntent;

    @InterfaceC65349Pkn("hide_results")
    public Boolean hideResults;

    @InterfaceC65349Pkn("new_source")
    public String newSource;

    @InterfaceC65349Pkn("keyword")
    public String requestKeyword;

    @InterfaceC65349Pkn("search_channel")
    public String searchChannel;

    @InterfaceC65349Pkn("search_intent")
    public SearchIntentStruct searchIntentStruct;

    @InterfaceC65349Pkn("show_video_research_tab_list")
    public Boolean showResearchFilter;

    @InterfaceC65349Pkn("show_results_source")
    public String showResultsSource;

    @InterfaceC65349Pkn("sounds_list_type")
    public int soundsListType;

    @InterfaceC65349Pkn("survey_config")
    public SearchSurveyConfig surveyConfig;

    @InterfaceC65349Pkn("tns_search_result")
    public String tnsBanType;

    @InterfaceC65349Pkn("use_scenario")
    public String useScenario;

    @InterfaceC65349Pkn("display_filter_bar")
    public int displayFilterBar = 1;

    @InterfaceC65349Pkn("disable_gold_task")
    public Boolean disableGoldTask = Boolean.FALSE;

    public final Map<String, String> getAbParams() {
        return this.abParams;
    }

    public final SearchActivityCardBgData getActivityCardBg() {
        return this.activityCardBg;
    }

    public final boolean getCanPullRefresh() {
        return this.canPullRefresh;
    }

    public final Boolean getDisableGoldTask() {
        return this.disableGoldTask;
    }

    public final boolean getDisableInnerFlow() {
        return this.disableInnerFlow;
    }

    public final int getDisplayFilterBar() {
        return this.displayFilterBar;
    }

    public final Boolean getEnableImageRecord() {
        return this.enableImageRecord;
    }

    public final List<FeedbackContents> getFeedbackSurvey() {
        return this.feedbackSurvey;
    }

    public final HashMap<String, Object> getFeelGood() {
        return this.feelGood;
    }

    public final int getForbidSearchType() {
        return this.forbidSearchType;
    }

    public final Boolean getHasEcomIntent() {
        return this.hasEcomIntent;
    }

    public final Boolean getHideResults() {
        return this.hideResults;
    }

    public final String getNewSource() {
        return this.newSource;
    }

    public final String getRequestKeyword() {
        return this.requestKeyword;
    }

    public final String getSearchChannel() {
        return this.searchChannel;
    }

    public final SearchIntentStruct getSearchIntentStruct() {
        return this.searchIntentStruct;
    }

    public final Boolean getShowResearchFilter() {
        return this.showResearchFilter;
    }

    public final String getShowResultsSource() {
        return this.showResultsSource;
    }

    public final int getSoundsListType() {
        return this.soundsListType;
    }

    public final SearchSurveyConfig getSurveyConfig() {
        return this.surveyConfig;
    }

    public final String getTnsBanType() {
        return this.tnsBanType;
    }

    public final String getUseScenario() {
        return this.useScenario;
    }

    public final void setAbParams(Map<String, String> map) {
        this.abParams = map;
    }

    public final void setActivityCardBg(SearchActivityCardBgData searchActivityCardBgData) {
        this.activityCardBg = searchActivityCardBgData;
    }

    public final void setCanPullRefresh(boolean z) {
        this.canPullRefresh = z;
    }

    public final void setDisableGoldTask(Boolean bool) {
        this.disableGoldTask = bool;
    }

    public final void setDisableInnerFlow(boolean z) {
        this.disableInnerFlow = z;
    }

    public final void setDisplayFilterBar(int i) {
        this.displayFilterBar = i;
    }

    public final void setEnableImageRecord(Boolean bool) {
        this.enableImageRecord = bool;
    }

    public final void setFeedbackSurvey(List<FeedbackContents> list) {
        this.feedbackSurvey = list;
    }

    public final void setFeelGood(HashMap<String, Object> hashMap) {
        this.feelGood = hashMap;
    }

    public final void setForbidSearchType(int i) {
        this.forbidSearchType = i;
    }

    public final void setHasEcomIntent(Boolean bool) {
        this.hasEcomIntent = bool;
    }

    public final void setHideResults(Boolean bool) {
        this.hideResults = bool;
    }

    public final void setNewSource(String str) {
        this.newSource = str;
    }

    public final void setRequestKeyword(String str) {
        this.requestKeyword = str;
    }

    public final void setSearchChannel(String str) {
        this.searchChannel = str;
    }

    public final void setSearchIntentStruct(SearchIntentStruct searchIntentStruct) {
        this.searchIntentStruct = searchIntentStruct;
    }

    public final void setShowResearchFilter(Boolean bool) {
        this.showResearchFilter = bool;
    }

    public final void setShowResultsSource(String str) {
        this.showResultsSource = str;
    }

    public final void setSoundsListType(int i) {
        this.soundsListType = i;
    }

    public final void setSurveyConfig(SearchSurveyConfig searchSurveyConfig) {
        this.surveyConfig = searchSurveyConfig;
    }

    public final void setTnsBanType(String str) {
        this.tnsBanType = str;
    }

    public final void setUseScenario(String str) {
        this.useScenario = str;
    }
}
