package com.ss.android.ugc.aweme.search.ecommerce.usercard;

import android.view.View;
import com.ss.android.ugc.aweme.discover.model.SearchUser;

/* loaded from: classes9.dex */
public interface ISearchShowcaseEntranceView {
    void bindData(SearchUser searchUser);

    View getView();

    void trackVisible();
}
