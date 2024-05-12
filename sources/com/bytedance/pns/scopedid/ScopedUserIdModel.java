package com.bytedance.pns.scopedid;

import X.C38496F8y;
import X.C47261Igj;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ScopedUserIdModel extends F9E {

    @InterfaceC65349Pkn("enabled")
    public final boolean enabled;

    @InterfaceC65349Pkn("scoped_biz_id")
    public final List<String> scopedBizIds;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopedUserIdModel() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enabled), this.scopedBizIds};
    }

    public ScopedUserIdModel(boolean z, List<String> scopedBizIds) {
        o.LJIIIZ(scopedBizIds, "scopedBizIds");
        this.enabled = z;
        this.scopedBizIds = scopedBizIds;
    }

    public /* synthetic */ ScopedUserIdModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C38496F8y.LIZ() : z, (i & 2) != 0 ? C47261Igj.LJJIJ("slardar") : list);
    }
}
