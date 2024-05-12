package com.ss.android.ugc.aweme.bnpl.network.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class StepUrlConfigs extends F9E implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("customer_service")
    public final String customerService;

    public static /* synthetic */ StepUrlConfigs copy$default(StepUrlConfigs stepUrlConfigs, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stepUrlConfigs.customerService;
        }
        return stepUrlConfigs.copy(str);
    }

    public final StepUrlConfigs copy(String customerService) {
        o.LJIIIZ(customerService, "customerService");
        return new StepUrlConfigs(customerService);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.customerService};
    }

    public final String getCustomerService() {
        return this.customerService;
    }

    public StepUrlConfigs(String customerService) {
        o.LJIIIZ(customerService, "customerService");
        this.customerService = customerService;
    }
}
