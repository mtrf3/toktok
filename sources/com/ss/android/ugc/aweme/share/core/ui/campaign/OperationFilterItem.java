package com.ss.android.ugc.aweme.share.core.ui.campaign;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes11.dex */
public final class OperationFilterItem extends F9E {

    @InterfaceC65349Pkn("display_tag_id")
    public final String displayTagId;

    @InterfaceC65349Pkn("display_tag_name")
    public final String displayTagName;

    @InterfaceC65349Pkn("filter")
    public final String filter;

    @InterfaceC65349Pkn("force_in")
    public final List<String> forceInList;

    @InterfaceC65349Pkn("not_in")
    public final List<String> notInList;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.filter, this.displayTagName, this.displayTagId, this.notInList, this.forceInList};
    }

    public OperationFilterItem(String str, String str2, String str3, List<String> list, List<String> list2) {
        this.filter = str;
        this.displayTagName = str2;
        this.displayTagId = str3;
        this.notInList = list;
        this.forceInList = list2;
    }
}
