package com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class FamiliarRelation implements Serializable {

    @InterfaceC65349Pkn("created_time_list")
    public List<Long> createdTimes;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("next_cursor")
    public int nextCursor;

    @InterfaceC65349Pkn("relation_type")
    public int relationType;

    @InterfaceC65349Pkn("sec_user_ids")
    public List<String> secUserIds;

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public final List<String> getSecUserIds() {
        List<String> list = this.secUserIds;
        if (list != null) {
            return list;
        }
        return C61878OQg.INSTANCE;
    }

    public final List<Long> getCreatedTimes() {
        return this.createdTimes;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final int getNextCursor() {
        return this.nextCursor;
    }

    public final int getRelationType() {
        return this.relationType;
    }

    public final void setCreatedTimes(List<Long> list) {
        this.createdTimes = list;
    }

    public final void setHasMore(int i) {
        this.hasMore = i;
    }

    public final void setNextCursor(int i) {
        this.nextCursor = i;
    }

    public final void setRelationType(int i) {
        this.relationType = i;
    }

    public final void setSecUserIds(List<String> list) {
        this.secUserIds = list;
    }
}
