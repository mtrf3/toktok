package com.ss.android.ugc.aweme.im.sdk.search.data;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecentContactData {

    @InterfaceC65349Pkn("contact_list")
    public final List<SingleRecentContactData> contactList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecentContactData) && o.LJ(this.contactList, ((RecentContactData) obj).contactList);
    }

    public final int hashCode() {
        List<SingleRecentContactData> list = this.contactList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecentContactData(contactList=");
        return C1NE.LIZIZ(LIZ, this.contactList, ')', LIZ);
    }

    public RecentContactData(List<SingleRecentContactData> list) {
        this.contactList = list;
    }
}
