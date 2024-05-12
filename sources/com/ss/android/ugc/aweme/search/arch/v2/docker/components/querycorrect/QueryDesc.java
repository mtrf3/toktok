package com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect;

import X.C15890jp;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class QueryDesc {

    @InterfaceC65349Pkn("clickable")
    public final boolean clickable;

    @InterfaceC65349Pkn("event_param")
    public final Map<String, String> eventParam;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryDesc)) {
            return false;
        }
        QueryDesc queryDesc = (QueryDesc) obj;
        return o.LJ(this.type, queryDesc.type) && o.LJ(this.text, queryDesc.text) && this.clickable == queryDesc.clickable && o.LJ(this.eventParam, queryDesc.eventParam);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.text, this.type.hashCode() * 31, 31);
        boolean z = this.clickable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LJ + i) * 31;
        Map<String, String> map = this.eventParam;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return i2 + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QueryDesc(type=");
        LIZ.append(this.type);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", clickable=");
        LIZ.append(this.clickable);
        LIZ.append(", eventParam=");
        return C15890jp.LIZ(LIZ, this.eventParam, ')', LIZ);
    }

    public QueryDesc(String type, String text, boolean z, Map<String, String> map) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(text, "text");
        this.type = type;
        this.text = text;
        this.clickable = z;
        this.eventParam = map;
    }

    public /* synthetic */ QueryDesc(String str, String str2, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : map);
    }
}
