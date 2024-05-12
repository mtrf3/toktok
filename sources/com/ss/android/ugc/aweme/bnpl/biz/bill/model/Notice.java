package com.ss.android.ugc.aweme.bnpl.biz.bill.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class Notice {

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notice)) {
            return false;
        }
        Notice notice = (Notice) obj;
        return o.LJ(this.type, notice.type) && o.LJ(this.title, notice.title) && o.LJ(this.description, notice.description);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Notice(type=");
        LIZ.append(this.type);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public Notice(String type, String str, String str2) {
        o.LJIIIZ(type, "type");
        this.type = type;
        this.title = str;
        this.description = str2;
    }

    public /* synthetic */ Notice(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
