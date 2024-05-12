package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BindStatusResponseData {

    @InterfaceC65349Pkn("bind_status_map")
    public final Map<String, BindStatus> bindStatusMap;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BindStatusResponseData copy$default(BindStatusResponseData bindStatusResponseData, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = bindStatusResponseData.bindStatusMap;
        }
        return bindStatusResponseData.copy(map);
    }

    public final BindStatusResponseData copy(Map<String, BindStatus> map) {
        return new BindStatusResponseData(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BindStatusResponseData) && o.LJ(this.bindStatusMap, ((BindStatusResponseData) obj).bindStatusMap);
    }

    public int hashCode() {
        Map<String, BindStatus> map = this.bindStatusMap;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BindStatusResponseData(bindStatusMap=");
        return C15890jp.LIZ(LIZ, this.bindStatusMap, ')', LIZ);
    }

    public final Map<String, BindStatus> getBindStatusMap() {
        return this.bindStatusMap;
    }

    public BindStatusResponseData(Map<String, BindStatus> map) {
        this.bindStatusMap = map;
    }
}
