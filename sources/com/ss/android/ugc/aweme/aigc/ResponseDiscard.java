package com.ss.android.ugc.aweme.aigc;

import X.AbstractC36908Ee8;
import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ResponseDiscard extends AbstractC36908Ee8 {

    @InterfaceC65349Pkn("discard_result")
    public final int discardResult;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("status_code")
    public final int status_code;

    @InterfaceC65349Pkn("status_msg")
    public final String status_msg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseDiscard)) {
            return false;
        }
        ResponseDiscard responseDiscard = (ResponseDiscard) obj;
        return this.status_code == responseDiscard.status_code && o.LJ(this.status_msg, responseDiscard.status_msg) && this.discardResult == responseDiscard.discardResult;
    }

    public final int hashCode() {
        int i = this.status_code * 31;
        String str = this.status_msg;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.discardResult;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResponseDiscard(status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", status_msg=");
        LIZ.append(this.status_msg);
        LIZ.append(", discardResult=");
        return b0.LIZJ(LIZ, this.discardResult, ')', LIZ);
    }

    public ResponseDiscard(int i, String str, int i2) {
        this.status_code = i;
        this.status_msg = str;
        this.discardResult = i2;
    }

    public /* synthetic */ ResponseDiscard(int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? null : str, i2);
    }
}
