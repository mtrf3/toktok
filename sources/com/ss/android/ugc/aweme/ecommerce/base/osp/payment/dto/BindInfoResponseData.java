package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BindInfoResponseData {

    @InterfaceC65349Pkn("bind_info_list")
    public final List<BindInfoItem> bindInfoList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BindInfoResponseData copy$default(BindInfoResponseData bindInfoResponseData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bindInfoResponseData.bindInfoList;
        }
        return bindInfoResponseData.copy(list);
    }

    public final BindInfoResponseData copy(List<BindInfoItem> list) {
        return new BindInfoResponseData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BindInfoResponseData) && o.LJ(this.bindInfoList, ((BindInfoResponseData) obj).bindInfoList);
    }

    public int hashCode() {
        List<BindInfoItem> list = this.bindInfoList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BindInfoResponseData(bindInfoList=");
        return C1NE.LIZIZ(LIZ, this.bindInfoList, ')', LIZ);
    }

    public final List<BindInfoItem> getBindInfoList() {
        return this.bindInfoList;
    }

    public BindInfoResponseData(List<BindInfoItem> list) {
        this.bindInfoList = list;
    }
}
