package com.ss.android.ugc.aweme.services.filter;

import com.ss.android.ugc.aweme.filter.FilterBean;

/* loaded from: classes8.dex */
public interface IFilterService {
    FilterBean getFilter(int i);

    String getFilterEnName(int i);

    void refreshData();
}
