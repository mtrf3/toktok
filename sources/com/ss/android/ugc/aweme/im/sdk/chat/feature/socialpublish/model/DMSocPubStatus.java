package com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DMSocPubStatus {

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("user_id")
    public final String uid;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMSocPubStatus)) {
            return false;
        }
        DMSocPubStatus dMSocPubStatus = (DMSocPubStatus) obj;
        return o.LJ(this.status, dMSocPubStatus.status) && o.LJ(this.uid, dMSocPubStatus.uid);
    }

    public final int hashCode() {
        Integer num = this.status;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.uid;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DMSocPubStatus(status=");
        LIZ.append(this.status);
        LIZ.append(", uid=");
        return q.LIZIZ(LIZ, this.uid, ')', LIZ);
    }

    public DMSocPubStatus(Integer num, String str) {
        this.status = num;
        this.uid = str;
    }
}
