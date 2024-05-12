package com.ss.android.ugc.aweme.poi;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PoiSubTag implements Serializable {

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("priority")
    public int priority;

    @InterfaceC65349Pkn("type")
    public Integer type;

    /* JADX WARN: Multi-variable type inference failed */
    public PoiSubTag() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PoiSubTag copy$default(PoiSubTag poiSubTag, String str, Integer num, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = poiSubTag.name;
        }
        if ((i2 & 2) != 0) {
            num = poiSubTag.type;
        }
        if ((i2 & 4) != 0) {
            i = poiSubTag.priority;
        }
        return poiSubTag.copy(str, num, i);
    }

    public final PoiSubTag copy(String str, Integer num, int i) {
        return new PoiSubTag(str, num, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiSubTag)) {
            return false;
        }
        PoiSubTag poiSubTag = (PoiSubTag) obj;
        return o.LJ(this.name, poiSubTag.name) && o.LJ(this.type, poiSubTag.type) && this.priority == poiSubTag.priority;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        return ((hashCode + (num != null ? num.hashCode() : 0)) * 31) + this.priority;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiSubTag(name=");
        LIZ.append(this.name);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", priority=");
        return b0.LIZJ(LIZ, this.priority, ')', LIZ);
    }

    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final Integer getType() {
        return this.type;
    }

    public PoiSubTag(String str, Integer num, int i) {
        this.name = str;
        this.type = num;
        this.priority = i;
    }

    public /* synthetic */ PoiSubTag(String str, Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? 0 : i);
    }
}
