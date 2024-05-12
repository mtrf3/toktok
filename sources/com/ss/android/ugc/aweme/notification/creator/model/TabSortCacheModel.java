package com.ss.android.ugc.aweme.notification.creator.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public final class TabSortCacheModel extends F9E {

    @InterfaceC65349Pkn("sort_id")
    public int sortType;

    @InterfaceC65349Pkn("tab_id")
    public int tabId;

    public static /* synthetic */ TabSortCacheModel copy$default(TabSortCacheModel tabSortCacheModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = tabSortCacheModel.tabId;
        }
        if ((i3 & 2) != 0) {
            i2 = tabSortCacheModel.sortType;
        }
        return tabSortCacheModel.copy(i, i2);
    }

    public final TabSortCacheModel copy(int i, int i2) {
        return new TabSortCacheModel(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.tabId), Integer.valueOf(this.sortType)};
    }

    public TabSortCacheModel(int i, int i2) {
        this.tabId = i;
        this.sortType = i2;
    }
}
