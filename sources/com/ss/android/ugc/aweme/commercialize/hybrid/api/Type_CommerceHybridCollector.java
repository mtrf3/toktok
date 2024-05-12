package com.ss.android.ugc.aweme.commercialize.hybrid.api;

import X.C113554cx;
import X.OSZ;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Type_CommerceHybridCollector {
    public static final Type_CommerceHybridCollector INSTANCE = new Type_CommerceHybridCollector();
    public static final Map<String, String> TYPE_COLLECTOR = C113554cx.LJJLIIIIJ(new OSZ("SPARK", "com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridSparkLoader"), new OSZ("WEB", "com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.AdWebLoader"));

    public final Map<String, String> getTYPE_COLLECTOR() {
        return TYPE_COLLECTOR;
    }
}
