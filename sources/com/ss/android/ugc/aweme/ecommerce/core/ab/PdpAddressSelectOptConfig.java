package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpAddressSelectOptConfig {

    @InterfaceC65349Pkn("enable_autofill")
    public final Boolean enableAutoFill;

    @InterfaceC65349Pkn("enable_auto_focus")
    public final Boolean enableAutoFocus;

    @InterfaceC65349Pkn("enable_search_address")
    public final Boolean enableSearchAddress;

    @InterfaceC65349Pkn("template")
    public final Integer template;

    /* JADX WARN: Multi-variable type inference failed */
    public PdpAddressSelectOptConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpAddressSelectOptConfig)) {
            return false;
        }
        PdpAddressSelectOptConfig pdpAddressSelectOptConfig = (PdpAddressSelectOptConfig) obj;
        return o.LJ(this.enableAutoFill, pdpAddressSelectOptConfig.enableAutoFill) && o.LJ(this.template, pdpAddressSelectOptConfig.template) && o.LJ(this.enableSearchAddress, pdpAddressSelectOptConfig.enableSearchAddress) && o.LJ(this.enableAutoFocus, pdpAddressSelectOptConfig.enableAutoFocus);
    }

    public final int hashCode() {
        Boolean bool = this.enableAutoFill;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.template;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.enableSearchAddress;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enableAutoFocus;
        return hashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpAddressSelectOptConfig(enableAutoFill=");
        LIZ.append(this.enableAutoFill);
        LIZ.append(", template=");
        LIZ.append(this.template);
        LIZ.append(", enableSearchAddress=");
        LIZ.append(this.enableSearchAddress);
        LIZ.append(", enableAutoFocus=");
        return C78920UyC.LIZIZ(LIZ, this.enableAutoFocus, ')', LIZ);
    }

    public PdpAddressSelectOptConfig(Boolean bool, Integer num, Boolean bool2, Boolean bool3) {
        this.enableAutoFill = bool;
        this.template = num;
        this.enableSearchAddress = bool2;
        this.enableAutoFocus = bool3;
    }

    public /* synthetic */ PdpAddressSelectOptConfig(Boolean bool, Integer num, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3);
    }
}
