package com.bytedance.pns.scopedid;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IdPairList {

    @InterfaceC65349Pkn("list")
    public final List<IdPair> list;

    @InterfaceC65349Pkn("user_id_suffix")
    public final String userIdSuffix;

    /* JADX WARN: Multi-variable type inference failed */
    public IdPairList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdPairList copy$default(IdPairList idPairList, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = idPairList.list;
        }
        if ((i & 2) != 0) {
            str = idPairList.userIdSuffix;
        }
        return idPairList.copy(list, str);
    }

    public final IdPairList copy(List<IdPair> list, String userIdSuffix) {
        o.LJIIIZ(userIdSuffix, "userIdSuffix");
        return new IdPairList(list, userIdSuffix);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdPairList)) {
            return false;
        }
        IdPairList idPairList = (IdPairList) obj;
        return o.LJ(this.list, idPairList.list) && o.LJ(this.userIdSuffix, idPairList.userIdSuffix);
    }

    public int hashCode() {
        List<IdPair> list = this.list;
        return this.userIdSuffix.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IdPairList(list=");
        LIZ.append(this.list);
        LIZ.append(", userIdSuffix=");
        return q.LIZIZ(LIZ, this.userIdSuffix, ')', LIZ);
    }

    public final List<IdPair> getList() {
        return this.list;
    }

    public final String getUserIdSuffix() {
        return this.userIdSuffix;
    }

    public IdPairList(List<IdPair> list, String userIdSuffix) {
        o.LJIIIZ(userIdSuffix, "userIdSuffix");
        this.list = list;
        this.userIdSuffix = userIdSuffix;
    }

    public /* synthetic */ IdPairList(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? "" : str);
    }
}
