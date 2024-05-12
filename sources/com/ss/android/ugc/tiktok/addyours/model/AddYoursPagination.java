package com.ss.android.ugc.tiktok.addyours.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursPagination {

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("load_type")
    public final Integer loadType;

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursPagination() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursPagination)) {
            return false;
        }
        AddYoursPagination addYoursPagination = (AddYoursPagination) obj;
        return o.LJ(this.cursor, addYoursPagination.cursor) && o.LJ(this.loadType, addYoursPagination.loadType);
    }

    public final int hashCode() {
        Long l = this.cursor;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.loadType;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursPagination(cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", loadType=");
        return s0.LIZJ(LIZ, this.loadType, ')', LIZ);
    }

    public AddYoursPagination(Long l, Integer num) {
        this.cursor = l;
        this.loadType = num;
    }

    public /* synthetic */ AddYoursPagination(Long l, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : num);
    }
}
