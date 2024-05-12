package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BillCpfInfo {

    @InterfaceC65349Pkn("elems")
    public final List<CpfElem> cpfElems;

    @InterfaceC65349Pkn("rsa_pub_key")
    public final String rsaPubKey;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillCpfInfo)) {
            return false;
        }
        BillCpfInfo billCpfInfo = (BillCpfInfo) obj;
        return o.LJ(this.rsaPubKey, billCpfInfo.rsaPubKey) && o.LJ(this.cpfElems, billCpfInfo.cpfElems);
    }

    public final int hashCode() {
        String str = this.rsaPubKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CpfElem> list = this.cpfElems;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BillCpfInfo(rsaPubKey=");
        LIZ.append(this.rsaPubKey);
        LIZ.append(", cpfElems=");
        return C1NE.LIZIZ(LIZ, this.cpfElems, ')', LIZ);
    }

    public BillCpfInfo(String str, List<CpfElem> list) {
        this.rsaPubKey = str;
        this.cpfElems = list;
    }
}
