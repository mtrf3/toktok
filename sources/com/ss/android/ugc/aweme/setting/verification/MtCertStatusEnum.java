package com.ss.android.ugc.aweme.setting.verification;

import X.V0N;

/* loaded from: classes7.dex */
public enum MtCertStatusEnum {
    CS_EMPTY,
    CS_CERTED,
    CS_CERTING,
    CS_DENIED;

    public static MtCertStatusEnum valueOf(String str) {
        return (MtCertStatusEnum) V0N.LJJJ(MtCertStatusEnum.class, str);
    }
}
