package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma;

import X.C61878OQg;
import X.F9E;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RomaGoofyData extends F9E {
    public List<RomaPattern> data;

    public RomaGoofyData() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RomaGoofyData copy$default(RomaGoofyData romaGoofyData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = romaGoofyData.data;
        }
        return romaGoofyData.copy(list);
    }

    public final RomaGoofyData copy(List<RomaPattern> data) {
        o.LJIIIZ(data, "data");
        return new RomaGoofyData(data);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.data};
    }

    public final List<RomaPattern> getData() {
        return this.data;
    }

    public RomaGoofyData(List<RomaPattern> data) {
        o.LJIIIZ(data, "data");
        this.data = data;
    }

    public final void setData(List<RomaPattern> list) {
        o.LJIIIZ(list, "<set-?>");
        this.data = list;
    }

    public RomaGoofyData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}
