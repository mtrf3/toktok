package com.ss.android.ugc.aweme.relation.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecMorePairList {

    @InterfaceC65349Pkn("users")
    public final List<RecUser> relatedUserList;

    @InterfaceC65349Pkn("uid")
    public final String uid;

    /* JADX WARN: Multi-variable type inference failed */
    public RecMorePairList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecMorePairList)) {
            return false;
        }
        RecMorePairList recMorePairList = (RecMorePairList) obj;
        return o.LJ(this.uid, recMorePairList.uid) && o.LJ(this.relatedUserList, recMorePairList.relatedUserList);
    }

    public final int hashCode() {
        String str = this.uid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<RecUser> list = this.relatedUserList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecMorePairList(uid=");
        LIZ.append(this.uid);
        LIZ.append(", relatedUserList=");
        return C1NE.LIZIZ(LIZ, this.relatedUserList, ')', LIZ);
    }

    public RecMorePairList(String str, List<RecUser> list) {
        this.uid = str;
        this.relatedUserList = list;
    }

    public /* synthetic */ RecMorePairList(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
