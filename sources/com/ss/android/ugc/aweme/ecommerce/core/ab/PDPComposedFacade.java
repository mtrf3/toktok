package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PDPComposedFacade {

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("style")
    public final Map<String, Object> style;

    /* JADX WARN: Multi-variable type inference failed */
    public PDPComposedFacade() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPComposedFacade)) {
            return false;
        }
        PDPComposedFacade pDPComposedFacade = (PDPComposedFacade) obj;
        return o.LJ(this.id, pDPComposedFacade.id) && o.LJ(this.style, pDPComposedFacade.style);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, Object> map = this.style;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PDPComposedFacade(id=");
        LIZ.append(this.id);
        LIZ.append(", style=");
        return C15890jp.LIZ(LIZ, this.style, ')', LIZ);
    }

    public PDPComposedFacade(String str, Map<String, ? extends Object> map) {
        this.id = str;
        this.style = map;
    }

    public /* synthetic */ PDPComposedFacade(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : map);
    }
}
