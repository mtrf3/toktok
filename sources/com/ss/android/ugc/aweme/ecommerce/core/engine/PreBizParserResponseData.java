package com.ss.android.ugc.aweme.ecommerce.core.engine;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PreBizParserResponseData {

    @InterfaceC65349Pkn("page_biz_list")
    public final List<BizParserInfo> page_biz_list;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreBizParserResponseData) && o.LJ(this.page_biz_list, ((PreBizParserResponseData) obj).page_biz_list);
    }

    public final int hashCode() {
        List<BizParserInfo> list = this.page_biz_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreBizParserResponseData(page_biz_list=");
        return C1NE.LIZIZ(LIZ, this.page_biz_list, ')', LIZ);
    }

    public PreBizParserResponseData(List<BizParserInfo> list) {
        this.page_biz_list = list;
    }
}
