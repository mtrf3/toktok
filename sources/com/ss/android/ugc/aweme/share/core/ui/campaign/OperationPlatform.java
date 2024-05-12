package com.ss.android.ugc.aweme.share.core.ui.campaign;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public final class OperationPlatform extends F9E {

    @InterfaceC65349Pkn("platform_id")
    public final String platformId;

    @InterfaceC65349Pkn("platform_name")
    public final String platformName;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.platformId, this.platformName};
    }

    public OperationPlatform(String str, String str2) {
        this.platformId = str;
        this.platformName = str2;
    }
}
