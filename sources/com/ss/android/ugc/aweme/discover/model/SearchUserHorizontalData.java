package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class SearchUserHorizontalData implements Serializable {

    @InterfaceC65349Pkn("backtrace")
    public String backtrace;

    @InterfaceC65349Pkn("common_data")
    public SearchHorCommonData commonData;

    public final String getBacktrace() {
        return this.backtrace;
    }

    public final SearchHorCommonData getCommonData() {
        return this.commonData;
    }

    public final void setBacktrace(String str) {
        this.backtrace = str;
    }

    public final void setCommonData(SearchHorCommonData searchHorCommonData) {
        this.commonData = searchHorCommonData;
    }
}
