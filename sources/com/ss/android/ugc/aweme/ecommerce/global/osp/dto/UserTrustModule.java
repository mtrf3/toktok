package com.ss.android.ugc.aweme.ecommerce.global.osp.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserTrustModule {

    @InterfaceC65349Pkn("items")
    public final List<UserTrustItem> userTrustItems;

    /* JADX WARN: Multi-variable type inference failed */
    public UserTrustModule() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserTrustModule) && o.LJ(this.userTrustItems, ((UserTrustModule) obj).userTrustItems);
    }

    public final int hashCode() {
        List<UserTrustItem> list = this.userTrustItems;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserTrustModule(userTrustItems=");
        return C1NE.LIZIZ(LIZ, this.userTrustItems, ')', LIZ);
    }

    public UserTrustModule(List<UserTrustItem> list) {
        this.userTrustItems = list;
    }

    public /* synthetic */ UserTrustModule(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
