package com.ss.android.ugc.aweme.inbox.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SkylightBizParams implements Serializable {

    @InterfaceC65349Pkn("parameter")
    public final String param;

    @InterfaceC65349Pkn("biz_type")
    public final Integer type;

    /* JADX WARN: Multi-variable type inference failed */
    public SkylightBizParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SkylightBizParams copy$default(SkylightBizParams skylightBizParams, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = skylightBizParams.type;
        }
        if ((i & 2) != 0) {
            str = skylightBizParams.param;
        }
        return skylightBizParams.copy(num, str);
    }

    public final SkylightBizParams copy(Integer num, String str) {
        return new SkylightBizParams(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylightBizParams)) {
            return false;
        }
        SkylightBizParams skylightBizParams = (SkylightBizParams) obj;
        return o.LJ(this.type, skylightBizParams.type) && o.LJ(this.param, skylightBizParams.param);
    }

    public int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.param;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkylightBizParams(type=");
        LIZ.append(this.type);
        LIZ.append(", param=");
        return q.LIZIZ(LIZ, this.param, ')', LIZ);
    }

    public final String getParam() {
        return this.param;
    }

    public final Integer getType() {
        return this.type;
    }

    public SkylightBizParams(Integer num, String str) {
        this.type = num;
        this.param = str;
    }

    public /* synthetic */ SkylightBizParams(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
