package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SearchAidSurveyUploadData extends F9E {

    @InterfaceC65349Pkn("scene_type")
    public final int sceneType;

    @InterfaceC65349Pkn("out_key")
    public final String searchId;

    @InterfaceC65349Pkn("survey_config_id")
    public final String surveyConfigId;

    @InterfaceC65349Pkn("value_data")
    public final List<ValueData> valueData;

    public SearchAidSurveyUploadData() {
        this(0, null, null, null, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.sceneType), this.surveyConfigId, this.searchId, this.valueData};
    }

    public SearchAidSurveyUploadData(int i, String surveyConfigId, String searchId, List<ValueData> valueData) {
        o.LJIIIZ(surveyConfigId, "surveyConfigId");
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(valueData, "valueData");
        this.sceneType = i;
        this.surveyConfigId = surveyConfigId;
        this.searchId = searchId;
        this.valueData = valueData;
    }

    public SearchAidSurveyUploadData(int i, String str, String str2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? C61878OQg.INSTANCE : list);
    }
}
