package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RomaPatternListResponse extends RomaResponse {

    @InterfaceC65349Pkn("patternList")
    public List<RomaPattern> list = C61878OQg.INSTANCE;

    public final List<RomaPattern> getList() {
        return this.list;
    }

    public final void setList(List<RomaPattern> list) {
        o.LJIIIZ(list, "<set-?>");
        this.list = list;
    }
}
