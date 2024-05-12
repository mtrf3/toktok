package com.kakao.sdk.common.util;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import java.text.SimpleDateFormat;

/* loaded from: classes12.dex */
public final class SdkLog$dateFormat$2 extends AbstractC65781Prl implements InterfaceC65784Pro<SimpleDateFormat> {
    public static final SdkLog$dateFormat$2 INSTANCE = new SdkLog$dateFormat$2();

    public SdkLog$dateFormat$2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SimpleDateFormat invoke() {
        return new SimpleDateFormat("MM-dd HH:mm:ss.SSS");
    }
}
