package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PayMiddleFailedEvent {

    @InterfaceC65349Pkn("error_code")
    public final String errorCode;

    @InterfaceC65349Pkn("error_msg")
    public final String errorMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public PayMiddleFailedEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayMiddleFailedEvent)) {
            return false;
        }
        PayMiddleFailedEvent payMiddleFailedEvent = (PayMiddleFailedEvent) obj;
        return o.LJ(this.errorCode, payMiddleFailedEvent.errorCode) && o.LJ(this.errorMessage, payMiddleFailedEvent.errorMessage);
    }

    public final int hashCode() {
        String str = this.errorCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorMessage;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PayMiddleFailedEvent(errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", errorMessage=");
        return q.LIZIZ(LIZ, this.errorMessage, ')', LIZ);
    }

    public PayMiddleFailedEvent(String str, String str2) {
        this.errorCode = str;
        this.errorMessage = str2;
    }

    public /* synthetic */ PayMiddleFailedEvent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
