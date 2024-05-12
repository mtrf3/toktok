package com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MallV3Cache {

    @InterfaceC65349Pkn("data")
    public final Map<String, Object> data;

    @InterfaceC65349Pkn("log_id")
    public final String logId;

    /* JADX WARN: Multi-variable type inference failed */
    public MallV3Cache() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MallV3Cache copy$default(MallV3Cache mallV3Cache, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = mallV3Cache.data;
        }
        if ((i & 2) != 0) {
            str = mallV3Cache.logId;
        }
        return mallV3Cache.copy(map, str);
    }

    public final MallV3Cache copy(Map<String, ? extends Object> map, String str) {
        return new MallV3Cache(map, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallV3Cache)) {
            return false;
        }
        MallV3Cache mallV3Cache = (MallV3Cache) obj;
        return o.LJ(this.data, mallV3Cache.data) && o.LJ(this.logId, mallV3Cache.logId);
    }

    public int hashCode() {
        Map<String, Object> map = this.data;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.logId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallV3Cache(data=");
        LIZ.append(this.data);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final String getLogId() {
        return this.logId;
    }

    public MallV3Cache(Map<String, ? extends Object> map, String str) {
        this.data = map;
        this.logId = str;
    }

    public /* synthetic */ MallV3Cache(Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : str);
    }
}
