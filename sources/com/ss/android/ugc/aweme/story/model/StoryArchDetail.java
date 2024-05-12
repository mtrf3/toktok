package com.ss.android.ugc.aweme.story.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StoryArchDetail implements Serializable {

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("items")
    public final List<Aweme> items;

    @InterfaceC65349Pkn("statistic")
    public final StoryArchStatistic statistic;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoryArchDetail copy$default(StoryArchDetail storyArchDetail, StoryArchStatistic storyArchStatistic, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            storyArchStatistic = storyArchDetail.statistic;
        }
        if ((i & 2) != 0) {
            list = storyArchDetail.items;
        }
        if ((i & 4) != 0) {
            str = storyArchDetail.extra;
        }
        return storyArchDetail.copy(storyArchStatistic, list, str);
    }

    public final StoryArchDetail copy(StoryArchStatistic storyArchStatistic, List<? extends Aweme> list, String str) {
        return new StoryArchDetail(storyArchStatistic, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryArchDetail)) {
            return false;
        }
        StoryArchDetail storyArchDetail = (StoryArchDetail) obj;
        return o.LJ(this.statistic, storyArchDetail.statistic) && o.LJ(this.items, storyArchDetail.items) && o.LJ(this.extra, storyArchDetail.extra);
    }

    public int hashCode() {
        StoryArchStatistic storyArchStatistic = this.statistic;
        int hashCode = (storyArchStatistic == null ? 0 : storyArchStatistic.hashCode()) * 31;
        List<Aweme> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.extra;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryArchDetail(statistic=");
        LIZ.append(this.statistic);
        LIZ.append(", items=");
        LIZ.append(this.items);
        LIZ.append(", extra=");
        return q.LIZIZ(LIZ, this.extra, ')', LIZ);
    }

    public final String getExtra() {
        return this.extra;
    }

    public final List<Aweme> getItems() {
        return this.items;
    }

    public final StoryArchStatistic getStatistic() {
        return this.statistic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoryArchDetail(StoryArchStatistic storyArchStatistic, List<? extends Aweme> list, String str) {
        this.statistic = storyArchStatistic;
        this.items = list;
        this.extra = str;
    }
}
