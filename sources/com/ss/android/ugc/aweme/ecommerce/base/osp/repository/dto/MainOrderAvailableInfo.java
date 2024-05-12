package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MainOrderAvailableInfo {

    @InterfaceC65349Pkn("available_status")
    public final Integer availableStatus;

    @InterfaceC65349Pkn("tips_text")
    public final String tipsText;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainOrderAvailableInfo)) {
            return false;
        }
        MainOrderAvailableInfo mainOrderAvailableInfo = (MainOrderAvailableInfo) obj;
        return o.LJ(this.availableStatus, mainOrderAvailableInfo.availableStatus) && o.LJ(this.tipsText, mainOrderAvailableInfo.tipsText);
    }

    public final int hashCode() {
        Integer num = this.availableStatus;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.tipsText;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MainOrderAvailableInfo(availableStatus=");
        LIZ.append(this.availableStatus);
        LIZ.append(", tipsText=");
        return q.LIZIZ(LIZ, this.tipsText, ')', LIZ);
    }

    public MainOrderAvailableInfo(Integer num, String str) {
        this.availableStatus = num;
        this.tipsText = str;
    }
}
