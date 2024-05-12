package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchAidSurveyUploadRequest extends F9E {

    @InterfaceC65349Pkn("survey_collection_data")
    public final List<SearchAidSurveyUploadData> data;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.data};
    }

    public SearchAidSurveyUploadRequest(List<SearchAidSurveyUploadData> data) {
        o.LJIIIZ(data, "data");
        this.data = data;
    }
}
