package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BindStatus {

    @InterfaceC65349Pkn("bind_status")
    public final BindStatusCode bindStatus;

    @InterfaceC65349Pkn("error_message")
    public final String errorMessage;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindStatus)) {
            return false;
        }
        BindStatus bindStatus = (BindStatus) obj;
        return this.bindStatus == bindStatus.bindStatus && o.LJ(this.errorMessage, bindStatus.errorMessage);
    }

    public final int hashCode() {
        BindStatusCode bindStatusCode = this.bindStatus;
        int hashCode = (bindStatusCode == null ? 0 : bindStatusCode.hashCode()) * 31;
        String str = this.errorMessage;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BindStatus(bindStatus=");
        LIZ.append(this.bindStatus);
        LIZ.append(", errorMessage=");
        return q.LIZIZ(LIZ, this.errorMessage, ')', LIZ);
    }

    public BindStatus(BindStatusCode bindStatusCode, String str) {
        this.bindStatus = bindStatusCode;
        this.errorMessage = str;
    }
}
