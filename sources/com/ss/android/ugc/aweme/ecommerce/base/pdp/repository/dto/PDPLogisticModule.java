package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C15890jp;
import X.C27148Al6;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PDPLogisticModule implements Parcelable {
    public static final Parcelable.Creator<PDPLogisticModule> CREATOR = new C27148Al6();

    @InterfaceC65349Pkn("meta")
    public final PDPLogisticMeta meta;

    @InterfaceC65349Pkn("module_id")
    public final String moduleId;

    @InterfaceC65349Pkn("module_title")
    public final String moduleTitle;

    @InterfaceC65349Pkn("return_policy_module")
    public final PDPReturnPolicyModule pdpReturnPolicyModule;

    @InterfaceC65349Pkn("shipping_module")
    public final PDPShippingModule pdpShippingModule;

    @InterfaceC65349Pkn("shipping_service_module")
    public final PDPShippingServiceModule pdpShippingServiceModule;

    @InterfaceC65349Pkn("shipping_module_map")
    public final Map<String, PDPShippingModule> shippingModuleMap;

    /* JADX WARN: Multi-variable type inference failed */
    public PDPLogisticModule() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPLogisticModule)) {
            return false;
        }
        PDPLogisticModule pDPLogisticModule = (PDPLogisticModule) obj;
        return o.LJ(this.moduleId, pDPLogisticModule.moduleId) && o.LJ(this.meta, pDPLogisticModule.meta) && o.LJ(this.moduleTitle, pDPLogisticModule.moduleTitle) && o.LJ(this.pdpShippingModule, pDPLogisticModule.pdpShippingModule) && o.LJ(this.pdpShippingServiceModule, pDPLogisticModule.pdpShippingServiceModule) && o.LJ(this.pdpReturnPolicyModule, pDPLogisticModule.pdpReturnPolicyModule) && o.LJ(this.shippingModuleMap, pDPLogisticModule.shippingModuleMap);
    }

    public final int hashCode() {
        String str = this.moduleId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PDPLogisticMeta pDPLogisticMeta = this.meta;
        int hashCode2 = (hashCode + (pDPLogisticMeta == null ? 0 : pDPLogisticMeta.hashCode())) * 31;
        String str2 = this.moduleTitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PDPShippingModule pDPShippingModule = this.pdpShippingModule;
        int hashCode4 = (hashCode3 + (pDPShippingModule == null ? 0 : pDPShippingModule.hashCode())) * 31;
        PDPShippingServiceModule pDPShippingServiceModule = this.pdpShippingServiceModule;
        int hashCode5 = (hashCode4 + (pDPShippingServiceModule == null ? 0 : pDPShippingServiceModule.hashCode())) * 31;
        PDPReturnPolicyModule pDPReturnPolicyModule = this.pdpReturnPolicyModule;
        int hashCode6 = (hashCode5 + (pDPReturnPolicyModule == null ? 0 : pDPReturnPolicyModule.hashCode())) * 31;
        Map<String, PDPShippingModule> map = this.shippingModuleMap;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.moduleId);
        PDPLogisticMeta pDPLogisticMeta = this.meta;
        if (pDPLogisticMeta == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pDPLogisticMeta.writeToParcel(out, i);
        }
        out.writeString(this.moduleTitle);
        PDPShippingModule pDPShippingModule = this.pdpShippingModule;
        if (pDPShippingModule == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pDPShippingModule.writeToParcel(out, i);
        }
        PDPShippingServiceModule pDPShippingServiceModule = this.pdpShippingServiceModule;
        if (pDPShippingServiceModule == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pDPShippingServiceModule.writeToParcel(out, i);
        }
        PDPReturnPolicyModule pDPReturnPolicyModule = this.pdpReturnPolicyModule;
        if (pDPReturnPolicyModule == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pDPReturnPolicyModule.writeToParcel(out, i);
        }
        Map<String, PDPShippingModule> map = this.shippingModuleMap;
        if (map == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map.size());
        for (Map.Entry<String, PDPShippingModule> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            entry.getValue().writeToParcel(out, i);
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PDPLogisticModule(moduleId=");
        LIZ.append(this.moduleId);
        LIZ.append(", meta=");
        LIZ.append(this.meta);
        LIZ.append(", moduleTitle=");
        LIZ.append(this.moduleTitle);
        LIZ.append(", pdpShippingModule=");
        LIZ.append(this.pdpShippingModule);
        LIZ.append(", pdpShippingServiceModule=");
        LIZ.append(this.pdpShippingServiceModule);
        LIZ.append(", pdpReturnPolicyModule=");
        LIZ.append(this.pdpReturnPolicyModule);
        LIZ.append(", shippingModuleMap=");
        return C15890jp.LIZ(LIZ, this.shippingModuleMap, ')', LIZ);
    }

    public PDPLogisticModule(String str, PDPLogisticMeta pDPLogisticMeta, String str2, PDPShippingModule pDPShippingModule, PDPShippingServiceModule pDPShippingServiceModule, PDPReturnPolicyModule pDPReturnPolicyModule, Map<String, PDPShippingModule> map) {
        this.moduleId = str;
        this.meta = pDPLogisticMeta;
        this.moduleTitle = str2;
        this.pdpShippingModule = pDPShippingModule;
        this.pdpShippingServiceModule = pDPShippingServiceModule;
        this.pdpReturnPolicyModule = pDPReturnPolicyModule;
        this.shippingModuleMap = map;
    }

    public /* synthetic */ PDPLogisticModule(String str, PDPLogisticMeta pDPLogisticMeta, String str2, PDPShippingModule pDPShippingModule, PDPShippingServiceModule pDPShippingServiceModule, PDPReturnPolicyModule pDPReturnPolicyModule, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : pDPLogisticMeta, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : pDPShippingModule, (i & 16) != 0 ? null : pDPShippingServiceModule, (i & 32) != 0 ? null : pDPReturnPolicyModule, (i & 64) == 0 ? map : null);
    }
}
