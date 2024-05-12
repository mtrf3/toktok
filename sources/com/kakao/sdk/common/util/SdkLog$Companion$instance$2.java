package com.kakao.sdk.common.util;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;

/* loaded from: classes12.dex */
public final class SdkLog$Companion$instance$2 extends AbstractC65781Prl implements InterfaceC65784Pro<SdkLog> {
    public static final SdkLog$Companion$instance$2 INSTANCE = new SdkLog$Companion$instance$2();

    public SdkLog$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final SdkLog invoke() {
        return new SdkLog(false, 1, null);
    }
}
