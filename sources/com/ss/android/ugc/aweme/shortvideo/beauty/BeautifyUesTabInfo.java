package com.ss.android.ugc.aweme.shortvideo.beauty;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BeautifyUesTabInfo extends F9E {

    @InterfaceC65349Pkn("category_diy")
    public final boolean categoryDiy;

    @InterfaceC65349Pkn("category_name")
    public final String categoryName;

    @InterfaceC65349Pkn("name_array")
    public final List<String> parentNameList;

    @InterfaceC65349Pkn("value_array")
    public final List<Integer> parentValueList;

    @InterfaceC65349Pkn("tab_name")
    public final String tabName;

    /* JADX WARN: Multi-variable type inference failed */
    public BeautifyUesTabInfo() {
        this(null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.tabName, this.categoryName, Boolean.valueOf(this.categoryDiy), this.parentNameList, this.parentValueList};
    }

    public BeautifyUesTabInfo(String tabName, String categoryName, boolean z, List<String> parentNameList, List<Integer> parentValueList) {
        o.LJIIIZ(tabName, "tabName");
        o.LJIIIZ(categoryName, "categoryName");
        o.LJIIIZ(parentNameList, "parentNameList");
        o.LJIIIZ(parentValueList, "parentValueList");
        this.tabName = tabName;
        this.categoryName = categoryName;
        this.categoryDiy = z;
        this.parentNameList = parentNameList;
        this.parentValueList = parentValueList;
    }

    public /* synthetic */ BeautifyUesTabInfo(String str, String str2, boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? false : z, (i & 8) != 0 ? new ArrayList() : list, (i & 16) != 0 ? new ArrayList() : list2);
    }
}
