package com.ss.android.ugc.aweme.compliance.business.banappeal.warninginfo;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.AgsWarningInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AgsWarningInfoSet extends F9E {

    @InterfaceC65349Pkn("item_post_warning_info")
    public final AgsWarningInfo itemPostWarningInfo;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.itemPostWarningInfo};
    }

    public AgsWarningInfoSet(AgsWarningInfo itemPostWarningInfo) {
        o.LJIIIZ(itemPostWarningInfo, "itemPostWarningInfo");
        this.itemPostWarningInfo = itemPostWarningInfo;
    }
}
