package com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoSug {
    public boolean LIZ;
    public String LIZIZ;

    @InterfaceC65349Pkn("query")
    public final String query;

    @InterfaceC65349Pkn("sug_type")
    public final Integer sugType;

    /* JADX WARN: Multi-variable type inference failed */
    public TakoSug() {
        this(null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoSug)) {
            return false;
        }
        TakoSug takoSug = (TakoSug) obj;
        return o.LJ(this.query, takoSug.query) && o.LJ(this.sugType, takoSug.sugType) && this.LIZ == takoSug.LIZ && o.LJ(this.LIZIZ, takoSug.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.query;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.sugType;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        boolean z = this.LIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LIZIZ.hashCode() + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TakoSug(query=");
        LIZ.append(this.query);
        LIZ.append(", sugType=");
        LIZ.append(this.sugType);
        LIZ.append(", fromEnterPageQuery=");
        LIZ.append(this.LIZ);
        LIZ.append(", queryMessageId=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public TakoSug(String str, Integer num, boolean z, String queryMessageId) {
        o.LJIIIZ(queryMessageId, "queryMessageId");
        this.query = str;
        this.sugType = num;
        this.LIZ = z;
        this.LIZIZ = queryMessageId;
    }

    public /* synthetic */ TakoSug(String str, Integer num, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str2);
    }
}
