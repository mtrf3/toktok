package com.ss.android.ugc.aweme.filter.repository.internal.main;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class FilterCategoryExtra extends F9E {

    @InterfaceC65349Pkn("ab_group")
    public final String abGroup;

    /* JADX WARN: Multi-variable type inference failed */
    public FilterCategoryExtra() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FilterCategoryExtra copy$default(FilterCategoryExtra filterCategoryExtra, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = filterCategoryExtra.abGroup;
        }
        return filterCategoryExtra.copy(str);
    }

    public final FilterCategoryExtra copy(String str) {
        return new FilterCategoryExtra(str);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.abGroup};
    }

    public final String getAbGroup() {
        return this.abGroup;
    }

    public FilterCategoryExtra(String str) {
        this.abGroup = str;
    }

    public /* synthetic */ FilterCategoryExtra(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
