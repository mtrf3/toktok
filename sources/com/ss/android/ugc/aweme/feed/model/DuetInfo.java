package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DuetInfo implements Serializable {

    @InterfaceC65349Pkn("original_item_duetted_count")
    public long originalItemDuetCount;

    @InterfaceC65349Pkn("original_item_id")
    public String originalItemId = "";

    public final long getOriginalItemDuetCount() {
        return this.originalItemDuetCount;
    }

    public final String getOriginalItemId() {
        return this.originalItemId;
    }

    public final void setOriginalItemDuetCount(long j) {
        this.originalItemDuetCount = j;
    }

    public final void setOriginalItemId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.originalItemId = str;
    }
}
