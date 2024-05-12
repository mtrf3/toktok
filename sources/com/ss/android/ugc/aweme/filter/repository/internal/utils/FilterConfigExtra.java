package com.ss.android.ugc.aweme.filter.repository.internal.utils;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class FilterConfigExtra extends F9E {

    @InterfaceC65349Pkn("filterconfig")
    public String filterconfig;

    /* JADX WARN: Multi-variable type inference failed */
    public FilterConfigExtra() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FilterConfigExtra copy$default(FilterConfigExtra filterConfigExtra, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = filterConfigExtra.filterconfig;
        }
        return filterConfigExtra.copy(str);
    }

    public final FilterConfigExtra copy(String str) {
        return new FilterConfigExtra(str);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.filterconfig};
    }

    public final String getFilterconfig() {
        return this.filterconfig;
    }

    public FilterConfigExtra(String str) {
        this.filterconfig = str;
    }

    public final void setFilterconfig(String str) {
        this.filterconfig = str;
    }

    public /* synthetic */ FilterConfigExtra(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
