package com.ss.android.ugc.aweme.ecommerce.core.da;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class HeaderBannerDaInfo extends F9E {
    public static final /* synthetic */ int LJLIL = 0;

    @InterfaceC65349Pkn("rights_cnt")
    public final int rightsCnt;

    @InterfaceC65349Pkn("rights_content")
    public final String rightsContent;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.rightsCnt), this.rightsContent};
    }

    public HeaderBannerDaInfo(int i, String rightsContent) {
        o.LJIIIZ(rightsContent, "rightsContent");
        this.rightsCnt = i;
        this.rightsContent = rightsContent;
    }
}
