package com.ss.android.ugc.aweme.autocut.sdk.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NLEModelResponseExtra {

    @InterfaceC65349Pkn("log_id")
    public final String logId;

    /* JADX WARN: Multi-variable type inference failed */
    public NLEModelResponseExtra() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NLEModelResponseExtra) && o.LJ(this.logId, ((NLEModelResponseExtra) obj).logId);
    }

    public final int hashCode() {
        String str = this.logId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NLEModelResponseExtra(logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public NLEModelResponseExtra(String str) {
        this.logId = str;
    }

    public /* synthetic */ NLEModelResponseExtra(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
