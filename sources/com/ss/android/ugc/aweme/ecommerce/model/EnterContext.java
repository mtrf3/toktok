package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EnterContext implements Serializable {

    @InterfaceC65349Pkn("enter_source_id")
    public final String enterSourceId;

    @InterfaceC65349Pkn("req_type")
    public final Integer reqType;

    public static /* synthetic */ EnterContext copy$default(EnterContext enterContext, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = enterContext.reqType;
        }
        if ((i & 2) != 0) {
            str = enterContext.enterSourceId;
        }
        return enterContext.copy(num, str);
    }

    public final EnterContext copy(Integer num, String str) {
        return new EnterContext(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterContext)) {
            return false;
        }
        EnterContext enterContext = (EnterContext) obj;
        return o.LJ(this.reqType, enterContext.reqType) && o.LJ(this.enterSourceId, enterContext.enterSourceId);
    }

    public int hashCode() {
        Integer num = this.reqType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.enterSourceId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EnterContext(reqType=");
        LIZ.append(this.reqType);
        LIZ.append(", enterSourceId=");
        return q.LIZIZ(LIZ, this.enterSourceId, ')', LIZ);
    }

    public final String getEnterSourceId() {
        return this.enterSourceId;
    }

    public final Integer getReqType() {
        return this.reqType;
    }

    public EnterContext(Integer num, String str) {
        this.reqType = num;
        this.enterSourceId = str;
    }
}
