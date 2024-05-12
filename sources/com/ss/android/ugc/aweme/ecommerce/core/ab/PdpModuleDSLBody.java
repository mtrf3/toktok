package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PdpModuleDSLBody {

    @InterfaceC65349Pkn("ecom_engine_refactor")
    public final Boolean enable;

    @InterfaceC65349Pkn("module_list")
    public final ArrayList<PDPComposedFacade> moduleFacadeList;

    /* JADX WARN: Multi-variable type inference failed */
    public PdpModuleDSLBody() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpModuleDSLBody)) {
            return false;
        }
        PdpModuleDSLBody pdpModuleDSLBody = (PdpModuleDSLBody) obj;
        return o.LJ(this.moduleFacadeList, pdpModuleDSLBody.moduleFacadeList) && o.LJ(this.enable, pdpModuleDSLBody.enable);
    }

    public final int hashCode() {
        ArrayList<PDPComposedFacade> arrayList = this.moduleFacadeList;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        Boolean bool = this.enable;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpModuleDSLBody(moduleFacadeList=");
        LIZ.append(this.moduleFacadeList);
        LIZ.append(", enable=");
        return C78920UyC.LIZIZ(LIZ, this.enable, ')', LIZ);
    }

    public PdpModuleDSLBody(ArrayList<PDPComposedFacade> arrayList, Boolean bool) {
        this.moduleFacadeList = arrayList;
        this.enable = bool;
    }

    public /* synthetic */ PdpModuleDSLBody(ArrayList arrayList, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : bool);
    }
}
