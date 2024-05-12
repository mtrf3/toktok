package com.ss.android.ugc.aweme.rss.api.models;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UpdateRssResponse {

    @InterfaceC65349Pkn("status_msg")
    public final String msg;

    @InterfaceC65349Pkn("status_code")
    public final Integer statusCode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateRssResponse)) {
            return false;
        }
        UpdateRssResponse updateRssResponse = (UpdateRssResponse) obj;
        return o.LJ(this.statusCode, updateRssResponse.statusCode) && o.LJ(this.msg, updateRssResponse.msg);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.msg;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateRssResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", msg=");
        return q.LIZIZ(LIZ, this.msg, ')', LIZ);
    }

    public UpdateRssResponse(Integer num, String str) {
        this.statusCode = num;
        this.msg = str;
    }
}
