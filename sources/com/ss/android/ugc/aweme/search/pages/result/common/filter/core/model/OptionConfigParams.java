package com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.search.filter.ActivityOptionStruct;
import com.ss.android.ugc.aweme.search.filter.FilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import java.util.List;

/* loaded from: classes9.dex */
public final class OptionConfigParams {

    @InterfaceC65349Pkn("activity_option")
    public ActivityOptionStruct activityTypeOptionStruct;

    @InterfaceC65349Pkn("category_option")
    public FilterOptionStruct categoryOptionStruct;

    @InterfaceC65349Pkn("filter_option")
    public FilterOptionStruct filterOptionStruct;

    @InterfaceC65349Pkn("follower_number_option")
    public FilterOptionStruct followerNumberOptionStruct;

    @InterfaceC65349Pkn("other_preferences_option")
    public FilterOptionStruct otherPreferencesOption;

    @InterfaceC65349Pkn("profiles_types_option")
    public FilterOptionStruct profilesTypesOptionStruct;

    @InterfaceC65349Pkn("research_option_list")
    public List<ResearchFilterStruct> researchOptionList;

    @InterfaceC65349Pkn("search_type")
    public String searchType;

    @InterfaceC65349Pkn("sort_option")
    public FilterOptionStruct sortTypeOptionStruct;
}
