package com.ss.android.ugc.aweme.discover.model;

import X.C61878OQg;
import X.F9E;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DiscoverSectionList extends F9E implements Serializable {
    public final int cursor;
    public final boolean hasMore;
    public boolean isCache;
    public final List<DiscoverSectionItem> sections;

    public DiscoverSectionList() {
        this(null, 0, false, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiscoverSectionList copy$default(DiscoverSectionList discoverSectionList, List list, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = discoverSectionList.sections;
        }
        if ((i2 & 2) != 0) {
            i = discoverSectionList.cursor;
        }
        if ((i2 & 4) != 0) {
            z = discoverSectionList.hasMore;
        }
        if ((i2 & 8) != 0) {
            z2 = discoverSectionList.isCache;
        }
        return discoverSectionList.copy(list, i, z, z2);
    }

    public final DiscoverSectionList copy(List<? extends DiscoverSectionItem> sections, int i, boolean z, boolean z2) {
        o.LJIIIZ(sections, "sections");
        return new DiscoverSectionList(sections, i, z, z2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.sections, Integer.valueOf(this.cursor), Boolean.valueOf(this.hasMore), Boolean.valueOf(this.isCache)};
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<DiscoverSectionItem> getSections() {
        return this.sections;
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public final void setCache(boolean z) {
        this.isCache = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiscoverSectionList(List<? extends DiscoverSectionItem> sections, int i, boolean z, boolean z2) {
        o.LJIIIZ(sections, "sections");
        this.sections = sections;
        this.cursor = i;
        this.hasMore = z;
        this.isCache = z2;
    }

    public DiscoverSectionList(List list, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C61878OQg.INSTANCE : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2);
    }
}
