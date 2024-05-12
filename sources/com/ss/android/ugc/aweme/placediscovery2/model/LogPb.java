package com.ss.android.ugc.aweme.placediscovery2.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LogPb implements Serializable {

    @InterfaceC65349Pkn("impr_id")
    public final String imprId;

    /* JADX WARN: Multi-variable type inference failed */
    public LogPb() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LogPb copy$default(LogPb logPb, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logPb.imprId;
        }
        return logPb.copy(str);
    }

    public final LogPb copy(String str) {
        return new LogPb(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogPb) && o.LJ(this.imprId, ((LogPb) obj).imprId);
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
        LIZ.append("LogPb(imprId=");
        return q.LIZIZ(LIZ, this.imprId, ')', LIZ);
    }

    public final String getImprId() {
        return this.imprId;
    }

    public LogPb(String str) {
        this.imprId = str;
    }

    public /* synthetic */ LogPb(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
