package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.custom;

import X.E92;
import X.EDP;
import X.EnumC36074EDu;
import X.InterfaceC35773E2f;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.api.ICustomChecker;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC35773E2f(mainKey = "tiktok_live_ecommerce_tts_shop_center_demo")
/* loaded from: classes7.dex */
public final class DemoOrderCenterChecker implements ICustomChecker {
    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.api.ICustomChecker
    public final void LIZ(E92 info) {
        o.LJIIIZ(info, "info");
        EDP edp = new EDP("OrderCenter");
        edp.LIZIZ("test", EnumC36074EDu.WRONG_TYPE, false);
        ((List) info.LJFF.getValue()).add(edp.LIZ());
    }
}
