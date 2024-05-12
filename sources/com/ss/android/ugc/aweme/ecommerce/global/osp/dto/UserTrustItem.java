package com.ss.android.ugc.aweme.ecommerce.global.osp.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserTrustItem {

    @InterfaceC65349Pkn("chunks")
    public final List<UserTrustItemDescriptionChunk> description;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public UserTrustItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserTrustItem)) {
            return false;
        }
        UserTrustItem userTrustItem = (UserTrustItem) obj;
        return o.LJ(this.title, userTrustItem.title) && o.LJ(this.description, userTrustItem.description);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<UserTrustItemDescriptionChunk> list = this.description;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserTrustItem(title=");
        LIZ.append(this.title);
        LIZ.append(", description=");
        return C1NE.LIZIZ(LIZ, this.description, ')', LIZ);
    }

    public UserTrustItem(String str, List<UserTrustItemDescriptionChunk> list) {
        this.title = str;
        this.description = list;
    }

    public /* synthetic */ UserTrustItem(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
