package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PromoteEventData implements Serializable {

    @InterfaceC65349Pkn("ev_type")
    public String evType;

    @InterfaceC65349Pkn("list")
    public List<PromoteEventModel> list;

    /* JADX WARN: Multi-variable type inference failed */
    public PromoteEventData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String getEvType() {
        return this.evType;
    }

    public final List<PromoteEventModel> getList() {
        return this.list;
    }

    public final void setEvType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.evType = str;
    }

    public final void setList(List<PromoteEventModel> list) {
        this.list = list;
    }

    public PromoteEventData(String evType, List<PromoteEventModel> list) {
        o.LJIIIZ(evType, "evType");
        this.evType = evType;
        this.list = list;
    }

    public /* synthetic */ PromoteEventData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "batch" : str, (i & 2) != 0 ? null : list);
    }
}
