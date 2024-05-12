package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RefreshModuleOption {

    @InterfaceC65349Pkn("need_payment_module")
    public final Boolean needPaymentModule;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RefreshModuleOption) && o.LJ(this.needPaymentModule, ((RefreshModuleOption) obj).needPaymentModule);
    }

    public final int hashCode() {
        Boolean bool = this.needPaymentModule;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RefreshModuleOption(needPaymentModule=");
        return C78920UyC.LIZIZ(LIZ, this.needPaymentModule, ')', LIZ);
    }

    public RefreshModuleOption(Boolean bool) {
        this.needPaymentModule = bool;
    }
}
