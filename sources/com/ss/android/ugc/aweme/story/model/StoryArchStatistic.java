package com.ss.android.ugc.aweme.story.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class StoryArchStatistic extends F9E implements Serializable {

    @InterfaceC65349Pkn("total")
    public final long total;

    public static /* synthetic */ StoryArchStatistic copy$default(StoryArchStatistic storyArchStatistic, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = storyArchStatistic.total;
        }
        return storyArchStatistic.copy(j);
    }

    public final StoryArchStatistic copy(long j) {
        return new StoryArchStatistic(j);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.total)};
    }

    public final long getTotal() {
        return this.total;
    }

    public StoryArchStatistic(long j) {
        this.total = j;
    }
}
