package com.ss.android.ugc.aweme.compliance.common.enums;

import X.PYI;
import X.V0N;

/* loaded from: classes12.dex */
public enum ConfigTypeEnum {
    API_DENY("api:deny"),
    API_ALLOW("api:allow"),
    PARAM_REMOVE("param:remove"),
    PARAM_ALLOW("param:allow"),
    PARAM_REPLACE("param:replace");

    public static final PYI Companion = new PYI();
    public final String type;

    public static ConfigTypeEnum valueOf(String str) {
        return (ConfigTypeEnum) V0N.LJJJ(ConfigTypeEnum.class, str);
    }

    public final String getType() {
        return this.type;
    }

    ConfigTypeEnum(String str) {
        this.type = str;
    }
}
