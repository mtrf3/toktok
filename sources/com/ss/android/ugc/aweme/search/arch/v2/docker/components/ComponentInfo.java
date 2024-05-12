package com.ss.android.ugc.aweme.search.arch.v2.docker.components;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ComponentInfo {

    @InterfaceC65349Pkn("biz_data")
    public final BizData bizData;

    @InterfaceC65349Pkn("components")
    public final List<ComponentInfo> components;

    @InterfaceC65349Pkn("component_type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentInfo)) {
            return false;
        }
        ComponentInfo componentInfo = (ComponentInfo) obj;
        return o.LJ(this.type, componentInfo.type) && o.LJ(this.bizData, componentInfo.bizData) && o.LJ(this.components, componentInfo.components);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        BizData bizData = this.bizData;
        int hashCode2 = (hashCode + (bizData == null ? 0 : bizData.hashCode())) * 31;
        List<ComponentInfo> list = this.components;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ComponentInfo(type=");
        LIZ.append(this.type);
        LIZ.append(", bizData=");
        LIZ.append(this.bizData);
        LIZ.append(", components=");
        return C1NE.LIZIZ(LIZ, this.components, ')', LIZ);
    }

    public ComponentInfo(String type, BizData bizData, List<ComponentInfo> list) {
        o.LJIIIZ(type, "type");
        this.type = type;
        this.bizData = bizData;
        this.components = list;
    }
}
