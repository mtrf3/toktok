package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDescBlock;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PaymentGuarantee {

    @InterfaceC65349Pkn("block_list")
    public final List<UserRightDescBlock> blockList;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentGuarantee)) {
            return false;
        }
        PaymentGuarantee paymentGuarantee = (PaymentGuarantee) obj;
        return o.LJ(this.title, paymentGuarantee.title) && o.LJ(this.blockList, paymentGuarantee.blockList);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<UserRightDescBlock> list = this.blockList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentGuarantee(title=");
        LIZ.append(this.title);
        LIZ.append(", blockList=");
        return C1NE.LIZIZ(LIZ, this.blockList, ')', LIZ);
    }

    public PaymentGuarantee(String str, List<UserRightDescBlock> list) {
        this.title = str;
        this.blockList = list;
    }
}
