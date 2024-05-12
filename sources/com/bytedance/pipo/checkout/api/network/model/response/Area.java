package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class Area {

    @InterfaceC65349Pkn("geoname_id")
    public final Integer geonameId;

    @InterfaceC65349Pkn("name")
    public final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public Area() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Area copy$default(Area area, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = area.name;
        }
        if ((i & 2) != 0) {
            num = area.geonameId;
        }
        return area.copy(str, num);
    }

    public final Area copy(String str, Integer num) {
        return new Area(str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Area)) {
            return false;
        }
        Area area = (Area) obj;
        return o.LJ(this.name, area.name) && o.LJ(this.geonameId, area.geonameId);
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.geonameId;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Area(name=");
        LIZ.append((Object) this.name);
        LIZ.append(", geonameId=");
        LIZ.append(this.geonameId);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Integer getGeonameId() {
        return this.geonameId;
    }

    public final String getName() {
        return this.name;
    }

    public Area(String str, Integer num) {
        this.name = str;
        this.geonameId = num;
    }

    public /* synthetic */ Area(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
