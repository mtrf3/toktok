package com.ss.android.ugc.aweme.dsp.common.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.simkit.model.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public abstract class BaseDspFeedResponse extends BaseResponse {

    @InterfaceC65349Pkn("count")
    public int count;

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("dsp_list_v2")
    public List<DspStruct> dspList = C61878OQg.INSTANCE;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    public final int getCount() {
        return this.count;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final List<DspStruct> getDspList() {
        return this.dspList;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setDspList(List<DspStruct> list) {
        o.LJIIIZ(list, "<set-?>");
        this.dspList = list;
    }

    public final void setHasMore(int i) {
        this.hasMore = i;
    }
}
