package com.ss.android.ugc.tiktok.tpsc.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LogPbBean {

    @InterfaceC65349Pkn("impr_id")
    public String imprId;

    /* JADX WARN: Multi-variable type inference failed */
    public LogPbBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LogPbBean copy$default(LogPbBean logPbBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logPbBean.imprId;
        }
        return logPbBean.copy(str);
    }

    public final LogPbBean copy(String str) {
        return new LogPbBean(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogPbBean) && o.LJ(this.imprId, ((LogPbBean) obj).imprId);
    }

    public int hashCode() {
        String str = this.imprId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogPbBean(imprId=");
        return q.LIZIZ(LIZ, this.imprId, ')', LIZ);
    }

    public final String getImprId() {
        return this.imprId;
    }

    public LogPbBean(String str) {
        this.imprId = str;
    }

    public final void setImprId(String str) {
        this.imprId = str;
    }

    public /* synthetic */ LogPbBean(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
